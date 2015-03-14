package com.guess.license.plate;

import com.actionbarsherlock.app.SherlockActivity;
import java.util.ArrayList;
import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainListActivity extends SherlockActivity {
	
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        
        com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this.getBaseContext());
        
        ArrayList<Plate> plateList = new ArrayList<Plate>();
		
		// Getting from the database all the continents
        NewDatabaseHelper databaseHelper = SplashActivity.databaseHelper;
		if(databaseHelper == null) 
			databaseHelper = new NewDatabaseHelper(this.getBaseContext());
		SQLiteDatabase db = databaseHelper.getReadableDatabase();
		
		String[] prefs = SharedPreference.GetSharedPreferenceString(this.getBaseContext());
		if (prefs.length == SharedPreference.STRING_SIZE) {
					
			String queryCountry = prefs[2];
			String whereCond = 
					!queryCountry.equals("All") ? 
					" WHERE Country = '" + queryCountry +"'":
					" WHERE Country = 'Europe' OR Country = 'ROTW'";		
			whereCond = whereCond + " AND Plate.Version <> 0 GROUP BY Continent";		
			
			String query = "SELECT Continent FROM Plate "+ whereCond;
			
			// Getting the
			Cursor cursor = db.rawQuery(query, null);
			int count = cursor.getCount();		
			if(count > 0){			
				while (cursor.moveToNext()) {
					String name;
					Plate plate;
					
					if (cursor.isNull(0))
						name = "Europe";
					else
						name = cursor.getString(0);
					
					plate = new Plate();
					plate.setName(name);
					plate.setLanguage(setLanguage(this.getBaseContext(),name));
					plate.setImgID(setImgID(name));
					plateList.add(plate);
				}						
			}
			
			// Getting the view from the list and attaching the strings in the list continents
	        final ListView plateListView = (ListView) findViewById(R.id.PlateListView);
	        plateListView.setAdapter(new ListPlateAdapter(this, this.getBaseContext(), plateList, R.layout.stats_custom));
	        
	        plateListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
	          @Override
	          public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
	        	  final Plate item = (Plate) parent.getItemAtPosition(position);
	        	  listActivity(item);            
	          }
	        });
	        
	        // Set the title style
	        Title.SetTitle(com.guess.license.plate.Activity.REVIEW_LIST, actionBar, this.getBaseContext());
		}
   }
   
   @Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.MAIN_LIST);
	}
    
   private void listActivity(Plate item){
		Intent intent = new Intent(this, ListPlateActivity.class);
		intent.putExtra("Key", item.getName());
		startActivity(intent);
	}
   
   private String setImgID(String continent){
	   String imgID = "co_eur_001";
	   final int LAST_CHAR = 3;
	   if(!TextUtils.isEmpty(continent) && LAST_CHAR <= continent.length()){
		   imgID = "co_"+continent.substring(0, LAST_CHAR).toLowerCase(Locale.getDefault())+"_001";
		   //Log.e("SCORE", imgID+"");
	   }   
	   return imgID;
   }
   
   private String setLanguage(Context context, String continent){
	   String result = "Europe";	   
	   final int SIZE = 6;
	   String[] localized = Language.SetMainListLanguage(context);
	   if(localized != null && localized.length == SIZE){
		   if(continent.equals("Europe")){
			   result = localized[0];
		   }else if(continent.equals("North America")){
			   result = localized[1];
		   }else if(continent.equals("South America")){
			   result = localized[2];
		   }else if(continent.equals("Asia")){
			   result = localized[3];
		   }else if(continent.equals("Africa")){
			   result = localized[4];
		   }else if(continent.equals("Australia")){
			   result = localized[5];
		   }
	   }	   
	   return result;   
   }
   
   @Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
	    switch (item.getItemId()) {
	    case android.R.id.home:
	        finish();
	        return true;
	    default: return super.onOptionsItemSelected(item);  
	    }
	}
}