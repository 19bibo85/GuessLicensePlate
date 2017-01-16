package com.guess.license.plate.Activity;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Adapter.StatsAdapter;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Model.PlateBase;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Stats;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;
import com.guess.license.plate.Task.StatisticsAsyncTask;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainStatisticsActivity extends SherlockActivity {
	public static String GameGeneralName;
	public static String GameTimeName;
	public static String GameNoTimeName;	
	
	private final String GAME_GENERAL_IMGID = "sta_001";
	private final String GAME_TIME_IMGID = "sta_001";
	private final String GAME_NO_TIME_IMGID = "sta_001";
	
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);
        
        // Setting the title window
        com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this.getBaseContext());
        Title.SetTitle(Component.STATS_LIST, actionBar, this.getBaseContext());
                
        // Setting the language
        Language.SetLanguage(Component.STATS_LIST, this.getBaseContext());
        
        // Adding the object to the list to display
        ArrayList<PlateBase> statsList = new ArrayList<PlateBase>();
        statsList.add(new PlateBase(Stats.GENERAL.getModeId(), GameGeneralName, null , GAME_GENERAL_IMGID));
        statsList.add(new PlateBase(Stats.GAME_TIME.getModeId(),GameTimeName, null, GAME_TIME_IMGID));
        statsList.add(new PlateBase(Stats.GAME_NO_TIME.getModeId(), GameNoTimeName, null, GAME_NO_TIME_IMGID));
        
		// Getting the view from the list and attaching the strings in the list continents
        final ListView statsListView = (ListView) findViewById(R.id.StatsListView);
        statsListView.setAdapter(new StatsAdapter(this, this.getBaseContext(), statsList));
        statsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
        	  final PlateBase item = (PlateBase) parent.getItemAtPosition(position);
        	  int itemID = item != null ? item.getId() : -1;
        	  DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(getBaseContext());
        	  new StatisticsAsyncTask(getBaseContext(), MainStatisticsActivity.this, itemID).execute(databaseHelper);
          	}
        });
   }
   
   
   @Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.STATS_LIST);
   }
   
   
   @SuppressWarnings("unchecked")
   public void statsActivity(Object obj){
	   if(obj instanceof ArrayList<?>){
		   Intent intent = new Intent(this, StatisticsActivity.class);
		   intent.putStringArrayListExtra("MainStatistic", (ArrayList<String>) obj);
		   startActivity(intent);
		   overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
	   }
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