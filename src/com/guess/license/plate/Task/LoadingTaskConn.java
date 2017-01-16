package com.guess.license.plate.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.guess.license.plate.release.R;
import com.guess.license.plate.Activity.SplashActivity;
import com.guess.license.plate.Database.Database;
import com.guess.license.plate.Database.InitialData;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Network.ServerError;
import com.guess.license.plate.Network.ThreadSafeHttpClientFactory;
import com.guess.license.plate.Network.WebConf;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Preferences;
import com.guess.license.plate.Repository.SharedPreference;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.Window;
import android.widget.Toast;

public class LoadingTaskConn extends AsyncTask<DatabaseHelper, Integer, ServerError>{
	
	private final Context context;
	private final SplashActivity activity;
       
    private ProgressDialog loadingDialog;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;
    
    private final int TIMER = 4000;
		 
    /**
     * A Loading task that will load some resources that are necessary for the app to start
     * @param progressBar - the progress bar you want to update while the task is in progress
     * @param finishedListener - the listener that will be told when this task is finished
     */
    public LoadingTaskConn(Context context, SplashActivity activity){
       	this.context = context;
    	this.activity = activity;
    	
    	// Progress Dialog
    	this.loadingDialog = new ProgressDialog(activity, android.R.style.Theme_Translucent);
    	this.loadingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	this.loadingDialog.setCancelable(false);
    	if(!this.loadingDialog.isShowing()){
            this.loadingDialog.show();
        }
    	this.loadingDialog.setContentView(R.layout.custom_progress_dialog);
    }
   
    @Override
    protected ServerError doInBackground(DatabaseHelper... params) {
    	this.databaseHelper = params[0];    	
    	
    	// Setting the values of default
    	setDefaultValues();
    	
    	// Getting the shared preferences
		boolean[] prefs = SharedPreference.GetSharedPreferenceBool(context);	
		boolean hasToBeUpdated = prefs.length == SharedPreference.BOOL_SIZE ? prefs[0] : false;
    	
    	return hasToBeUpdated ? updateDatabase() : ServerError.NO_ERROR;
    }
    
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }
 
    @Override
    protected void onPostExecute(ServerError result) {
		super.onPostExecute(result);
		loadingDialog.dismiss();
		
		if(result != null && !result.equals(ServerError.NO_ERROR)){
		    Toast toast = Toast.makeText(context, Language.GetServerErrorLanguage(result, context), Toast.LENGTH_LONG);
		    toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
			toast.show();
		}
    
		new CountDownTimer(TIMER, 1000) {
    	
			public void onTick(long millisUntilFinished) {
				// Do nothing
			}
 
			public void onFinish() {
				activity.onTaskFinished();
			}
		}.start();		
    }
    
    private void setDefaultValues()
    {    	
    	if(databaseHelper != null){
	    	db = databaseHelper.getReadableDatabase();
	    	Cursor cursor = db.query("Plate", null, null, null, null, null, null);
			int count = cursor.getCount();
	    	
			if(count == 0){
		    	// Setting all the default setting values
		    	SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (context);
		    	Editor editor = sharedPref.edit();
		        editor.putString(Preferences.LANGUAGE.toString(), Locale.getDefault().getLanguage());
		        editor.putString(Preferences.THEME.toString(), "Theme 1");
		        editor.putString(Preferences.RANGE.toString(), "Europe");
		        editor.putBoolean(Preferences.UPDATE.toString(), true);
		        editor.putBoolean(Preferences.SOUND.toString(), false);
		        editor.commit();
		        
		        // Insert Build
		        InitialData.InsertBuild(db);
		        // Insert Plate
		        InitialData.InsertPlate(db);
		        // Insert Language
		        InitialData.InsertLang(db);
			}
			
			db.close();
    	}
    }
    
   
	
	private ServerError updateDatabase(){
		// Updating, passing the connection to the db, the DB records in the tables(build, plate and language)
		return updateDatabase(WebConf.DB_CONN, WebConf.JSON_OBJECTS, WebConf.DEFAULT_VERSION);
	}
	
    private ServerError updateDatabase(String conn, String[] objJS, int serverVersion){
    	
    	// No error as Default
    	ServerError res = ServerError.NO_ERROR;
    	
    	// Number of JSON main object that will be processed
    	int numObjJS = objJS.length;
    	
    	// In case there are no JSON object to process on the server shows an error message
    	if(numObjJS == 0){
    		return ServerError.OBJECT_NOT_FOUND;
    	}
    	
    	// Instance of List of entities
    	ArrayList<HttpEntity> objJSEntities = new ArrayList<HttpEntity>();   	
    	    	
    	// Create a number of JSON arrays equals to the number of JSON objects
    	// because each JSON object contains a JSON array
    	JSONArray[] arrayJson = new JSONArray[numObjJS];
    	
    	// Check if the objects passed have been parsed correctly, in case even one of those
    	// has not been parsed correctly the app will return an error
    	res = tryToParseJSON(conn, objJS, numObjJS, objJSEntities, arrayJson, serverVersion);
		
		return res;
    }
    
    private ServerError tryToParseJSON(String conn, String[] objJS, int numObjJS, ArrayList<HttpEntity> objJSEntities, JSONArray[] arrayJson, int serverVersion){
    	// Parsing each JSON object in a string, then create a JSONArray from the name of 
    	// the JSON object, that should be similar to the name of the DB table,
    	// and in the end put it in the array that contains the JSON arrays
    	
    	ServerError res = ServerError.NO_ERROR;
    	
    	// Processing all the JSON objects found on the server
    	for(int i = 0; i < numObjJS; i++){
    		
    		// Parsing the JSON object selected
    		ServerError entityRes = tryToGetEntity(conn, objJS[i], WebConf.EXSTENSION[0], objJSEntities);
    		
    		// In case it's not possible to get the entity of the JSON object return an error
    		if(!entityRes.equals(ServerError.NO_ERROR)){
    			return entityRes;
    		}
    		
    		//Log.e("SERVER", "Entity " + objJS[i] + " has been gotten correctly");
    		        	
        	// In case the JSON object has not been parsed correctly return an error
        	ServerError parsing = parseEntity(objJS, i, objJSEntities, arrayJson);
    		if(!parsing.equals(ServerError.NO_ERROR)){
    			return parsing;
    		}
    		
    		// Set an instance of the DB writable, needs to be updated
        	db = databaseHelper.getWritableDatabase();
    		
        	// Move the each JSON array got from the respective JSON object
    		// to the DB using the respective DB object.
    		res = moveToDB(objJS, i, arrayJson, serverVersion);
    		if(res.equals(ServerError.OLD_BUILD))
    		{    	
    			return res;
    		}
    		
    		// Closing database connection
    		db.close();
    	}
    	
    	return res;
    }
    
    private ServerError tryToGetEntity(String conn, String objJSName, String extension, ArrayList<HttpEntity> objJSEntities)
	{	    	    	
    	// Building string for URI
		String uriPath = WebConf.URI_PATH;
		String uriFile = WebConf.URI_FILE;
		String uriSeparator = WebConf.URI_SEP;
		String uri = uriPath.concat(uriFile).concat(uriSeparator);  			
		
		// Building string for Parameters
		String firstPar = WebConf.PARAMETER[0].concat(objJSName);
		String separator = WebConf.PAR_SEP;
		String secondPar = WebConf.PARAMETER[1].concat(extension);    			
		String parameters = firstPar.concat(separator).concat(secondPar);
		
		HttpClient client = ThreadSafeHttpClientFactory.INSTANCE.getThreadSafeHttpClient();
		HttpGet httpGet = new HttpGet(conn.concat(uri).concat(parameters));
		
        try {
        	
        	HttpResponse response = client.execute(httpGet);
        	
        	StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			
			if (statusCode == WebConf.STATUS_CODE) 
			{
				HttpEntity entity = response.getEntity();
				objJSEntities.add(entity);
			}
			else 
			{
				return ServerError.CONNECTION;		        
		    }
		}
        catch (ClientProtocolException ee) 
		{
        	return ServerError.PROTOCOL;
	    
		} catch (IOException ee) 
	    {
			return ServerError.STREAM;	      			      
	    }
        
        return ServerError.NO_ERROR;
	}
    
	private ServerError parseEntity(String[] objJS, int i, ArrayList<HttpEntity> objJSEntities, JSONArray[] arrayJson) {
		HttpEntity entity = objJSEntities.get(i);
		try {					
			String parStr = EntityUtils.toString(entity, HTTP.UTF_8);
			
			// Getting the JSON object for the entity parsed
			JSONObject jsonObject = new JSONObject(parStr);					
			arrayJson[i] = jsonObject.getJSONArray(objJS[i]);
			
		} catch (NumberFormatException e) {
			return ServerError.CONNECTION;
		} catch (IllegalStateException e) {
			return ServerError.CONNECTION;
		} catch (IOException e) {
			return ServerError.CONNECTION;	
		} catch (JSONException e) {
			return ServerError.CONNECTION;
		}
		
		return ServerError.NO_ERROR;
	}
	
	private ServerError moveToDB(String[] objJS, int i, JSONArray[] arrayJson, int serverVersion)
    {
    	// No error as Default
    	ServerError res = ServerError.NO_ERROR;
		// Getting the JSON Array selected
		JSONArray jsonSel = arrayJson[i];
		//Log.e("SERVER", "JSON array selected: "+ objJS[i]);  
		
		// Set the instance for the values to insert into the lite db
    	ContentValues values = new ContentValues();
		
		// Start going through the JSON Array selected
    	for (int j = 0; j < jsonSel.length(); j++) {
			try {					
				// Getting the every single JSON object of the main JSON Array selected
				JSONObject objSel = jsonSel.getJSONObject(j);					
				// Moving to the DB passing by the object
				res = setValuesToDB(objSel, objJS[i], values, serverVersion);
				if(res.equals(ServerError.OLD_BUILD))
					return res;

			} catch (JSONException e) {
				e.printStackTrace();
				return ServerError.GENERAL;		
			}
		}
    	
    	return res;
    }
	
	private ServerError setValuesToDB(JSONObject jsObj, String objJS, ContentValues values, int serverVersion) throws JSONException{
		ServerError result = ServerError.NO_ERROR;	
		String[] columns = null;
		String whereClause = null;
		String[] whereArgs = null;
		
		if(objJS.equals(WebConf.JSON_OBJECTS[0])){
			
			serverVersion = jsObj.getInt(WebConf.TAG_BUILD_VERSION);
			columns = new String[]{Database.BUILD[3]};
						
			// Settings the values to insert or update
			values.put(Database.BUILD[1], jsObj.getInt(WebConf.TAG_BUILD_NUMBER));
			values.put(Database.BUILD[2], jsObj.getString(WebConf.TAG_BUILD_NAME));
			values.put(Database.BUILD[3], serverVersion);
			values.put(Database.BUILD[4], jsObj.getString(WebConf.TAG_BUILD_DEVELOPER));
		}		
		else if(objJS.equals(WebConf.JSON_OBJECTS[1]))
		{	
			serverVersion = jsObj.getInt(WebConf.TAG_PLATE_VERSION);
			columns = new String[]{Database.PLATE[5]};
			whereClause = "imgID = ?";
			whereArgs = new String[]{jsObj.getString(WebConf.TAG_PLATE_IMG_ID)};
			
			// Settings the values to insert or update
			values.put(Database.PLATE[1], jsObj.getString(WebConf.TAG_PLATE_NAME));
			values.put(Database.PLATE[2], jsObj.getString(WebConf.TAG_PLATE_IMG_ID));
			values.put(Database.PLATE[3], jsObj.getString(WebConf.TAG_PLATE_COUNTRY));
			values.put(Database.PLATE[4], jsObj.getInt(WebConf.TAG_PLATE_DIFFICULTY));
			values.put(Database.PLATE[5], serverVersion);
			values.put(Database.PLATE[6], jsObj.getString(WebConf.TAG_PLATE_CONTINENT));
		
		}else if(objJS.equals(WebConf.JSON_OBJECTS[2])){
			serverVersion = jsObj.getInt(WebConf.TAG_LANGUAGE_VERSION);
			columns = new String[]{Database.LANG[2]};
			whereClause = "imgID = ?";
			whereArgs = new String[]{jsObj.getString(WebConf.TAG_LANGUAGE_IMG_ID)};
			
			// Settings the values to insert or update
			values.put(Database.LANG[1], jsObj.getString(WebConf.TAG_LANGUAGE_IMG_ID));
			values.put(Database.LANG[2], serverVersion);
			values.put(Database.LANG[3], jsObj.getString(WebConf.TAG_LANGUAGE_ENGLISH));
			values.put(Database.LANG[4], jsObj.getString(WebConf.TAG_LANGUAGE_ITALIAN));
			values.put(Database.LANG[5], jsObj.getString(WebConf.TAG_LANGUAGE_SPANISH));
			values.put(Database.LANG[6], jsObj.getString(WebConf.TAG_LANGUAGE_FRENCH));
			values.put(Database.LANG[7], jsObj.getString(WebConf.TAG_LANGUAGE_PORTUGUESE));
		}
		
		// Inserting or updating the values just set
		result = insOrUpDB(jsObj, objJS, columns, whereClause, whereArgs, values, serverVersion);
		
		return result;
	}

	private ServerError insOrUpDB(JSONObject jsObj, String objJS, String[] columns, String whereClause, String[] whereArgs, ContentValues values, int serverVersion) throws JSONException{
		ServerError result = ServerError.NO_ERROR;
				
		Cursor cursor = db.query(objJS, columns, whereClause, whereArgs, null, null, null);
		int count = cursor.getCount();
		
		if(count > 0){			
			// Getting the version
			int currDBVersion = 0;								
			while (cursor.moveToNext()) {
				if (cursor.isNull(0))
					currDBVersion = 0;
				else
					currDBVersion = cursor.getInt(0);
			}
			
			if(objJS.equals(WebConf.JSON_OBJECTS[0])){
				if(currDBVersion == serverVersion){
					return ServerError.OLD_BUILD;
				}
				
				db.update(objJS, values, whereClause, whereArgs);
				
			}else if(objJS.equals(WebConf.JSON_OBJECTS[1])){
				// In case the plate processed is a new version update it in the DB
				if(currDBVersion != serverVersion){
					db.update(objJS, values, whereClause, whereArgs);
				}
			}else if(objJS.equals(WebConf.JSON_OBJECTS[2])){
				// In case the language processed is a new version update it in the DB
				if(currDBVersion != serverVersion){
					db.update(objJS, values, whereClause, whereArgs);
				}
			}
		}else{
			db.insert(objJS, null, values);
		}
		
		return result;
	}
}