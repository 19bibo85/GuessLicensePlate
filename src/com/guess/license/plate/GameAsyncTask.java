package com.guess.license.plate;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

public class GameAsyncTask extends AsyncTask<NewDatabaseHelper, Void, Object>{
	private Context context = null;	
	private StartActivity startActivity = null;
	
	private final String NAME_DEFAULT = "ABKHAZIA";
	private final int DIFFICULTY_DEFAULT = 0;
	private final String LANGUAGE_DEFAULT = "ABKHAZIA";
	private final String COUNTRY_DEFAULT = "Europe";
	private final String IMGID_DEFAULT = "eu_abk_001";
	
	public GameAsyncTask(Context context, StartActivity startActivity){
		this.context = context;
		this.startActivity = startActivity;
	}
	
	@Override
	protected Object doInBackground(NewDatabaseHelper... databaseHelper) {
		Object result = null;
		
		if(databaseHelper != null)
			result = queryGame(databaseHelper[0]);
		
		return result;
	}
	
	@Override
	protected void onPostExecute(Object result) {
		super.onPostExecute(result);
		if(startActivity != null){
			startActivity.gameActivity(result);
		}
	}
	
	public ArrayList<Plate> queryGame(NewDatabaseHelper databaseHelper){
		ArrayList<Plate> plateList = new ArrayList<Plate>();
		
		if(context != null){
			// Getting the range selected
			String[] prefs = SharedPreference.GetSharedPreferenceString(context);
			String cntSel = prefs.length == SharedPreference.STRING_SIZE ? prefs[2] : "Europe";
			// Setting the clause for the query
			String where = !cntSel.equals("All") ? 
												" WHERE Country = '" + cntSel + "'"
												:
												" WHERE Country = 'Europe' OR Country = 'ROTW'";
			where += " AND Plate.Version <> 0 AND Language.Version <> 0 ORDER BY Country, Name ASC";
			
			String query = Utility.GetPlates(context, where);
			SQLiteDatabase db = databaseHelper.getReadableDatabase();
			
			Cursor cursor = db.rawQuery(query, null);
			int count = cursor.getCount();
			
			if(count > 0){
			
				while (cursor.moveToNext()) {
					String name;
					int difficulty;
					String language;
					String country;
					String imgID;
					Plate plate;
		
					if (cursor.isNull(0))
						name = NAME_DEFAULT;
					else
						name = cursor.getString(0);
		
					if (cursor.isNull(1))
						difficulty = DIFFICULTY_DEFAULT;
					else
						difficulty = cursor.getInt(1);
		
					if (cursor.isNull(2))
						language = LANGUAGE_DEFAULT;
					else
						language = cursor.getString(2);
		
					if (cursor.isNull(3))
						country = COUNTRY_DEFAULT;
					else
						country = cursor.getString(3);
					
					if (cursor.isNull(4))
						imgID = IMGID_DEFAULT;
					else
						imgID = cursor.getString(4);
					
					
					plate = new Plate();
					plate.setName(name);
					plate.setDifficulty(difficulty);
					plate.setLanguage(language);
					plate.setCountry(country);
					plate.setImgID(imgID);
					plateList.add(plate);
				}
			}
			
			//Log.e("GAME", plateList.size()+"");
			
			db.close();			
		}
		
		return plateList;
	}
}
