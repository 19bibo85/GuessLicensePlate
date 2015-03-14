package com.guess.license.plate;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.inmobi.monetization.IMBanner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;

/**
 * This class is called when a user wants to start a new game. It implements
 * three game mode. In the first the user has to guess, after choose the
 * level(Easy, Medium, Hard), much more license plate as possible within 60
 * seconds. In the second he scans all of the license plate in-game. In the last
 * one he starts to guess all the license plate, but the game will end at the
 * first fault.
 * 
 * @author Alberto Tosi Brandi
 * 
 */
public class StartActivity extends SherlockActivity {
	public static GameMode GameModeVal;
	public static ScrollView ScrollView;
	public static TextView TimeLimit;
	public static TextView NoTimeLimit;
	public static Button Easy;
	public static Button Medium;
	public static Button Hard;
	public static Button AllPlates;
	public static Button NoFault;

	public void onCreate(Bundle savedInstanceState) {
		try{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.start);
			//Log.i(Logs.START, "Start layout has been loaded.");
			
			// Action Bar
			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        Utility.SetActionBar(actionBar, this.getBaseContext());
	        //Log.i(Logs.START, "Action bar has been set up.");
	
			ScrollView = (ScrollView) findViewById(R.id.scroll_view);
			TimeLimit = (TextView) findViewById(R.id.time_limit);
			NoTimeLimit = (TextView) findViewById(R.id.no_time_limit);
			TimeLimit.setTypeface(Utility.GetFont(this));
			NoTimeLimit.setTypeface(Utility.GetFont(this));
			
			// Easy
			Easy = (Button) findViewById(R.id.easy);
			Easy.setTypeface(Utility.GetFont(this));
			Easy.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.EASY;
					NewDatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new NewDatabaseHelper(getBaseContext());		
					//new GameAsyncTask(ACTIVITY.getApplicationContext(), ACTIVITY).execute(databaseHelper);
					gameActivity1();
					//Log.i(Logs.START, "Game activity in easy mode has been called.");
				}
			});
			//Log.i(Logs.START, "Easy button has been added.");
			
			// Medium
			Medium = (Button) findViewById(R.id.medium);
			Medium.setTypeface(Utility.GetFont(this));
			Medium.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.MEDIUM;
					NewDatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new NewDatabaseHelper(getBaseContext());		
					//new GameAsyncTask(ACTIVITY.getApplicationContext(), ACTIVITY).execute(databaseHelper);
					gameActivity1();
					//Log.i(Logs.START, "Game activity in medium mode has been called.");
				}
			});
			//Log.i(Logs.START, "Medium button has been added.");
			
			// Hard
			Hard = (Button) findViewById(R.id.hard);
			Hard.setTypeface(Utility.GetFont(this));
			Hard.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.HARD;
					NewDatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new NewDatabaseHelper(getBaseContext());		
					//new GameAsyncTask(ACTIVITY.getApplicationContext(), ACTIVITY).execute(databaseHelper);
					gameActivity1();
					//Log.i(Logs.START, "Game activity in hard mode has been called.");
				}
			});
			//Log.i(Logs.START, "Hard button has been added.");
	
			// All Plates
			AllPlates = (Button) findViewById(R.id.all_plates);
			AllPlates.setTypeface(Utility.GetFont(this));
			AllPlates.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.ALL_PLATES;
					NewDatabaseHelper databaseHelper = Utility.GetDataBaseHelper(getBaseContext());
					//new GameAsyncTask(ACTIVITY.getApplicationContext(), ACTIVITY).execute(databaseHelper);
					gameActivity1();
					//Log.i(Logs.START, "Game activity in all plates mode has been called.");
				}
			});
			//Log.i(Logs.START, "All plates button has been added.");
	
			// No Fault
			NoFault = (Button) findViewById(R.id.no_fault);
			NoFault.setTypeface(Utility.GetFont(this));
			NoFault.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.NO_FAULT;
					NewDatabaseHelper databaseHelper = Utility.GetDataBaseHelper(getBaseContext());
					//new GameAsyncTask(ACTIVITY.getApplicationContext(), ACTIVITY).execute(databaseHelper);
					gameActivity1();
					//Log.i(Logs.START, "Game activity in no fault mode has been called.");
				}
			});
			//Log.i(Logs.START, "No faults button has been added.");
			
			// Title, language and theme
			Title.SetTitle(com.guess.license.plate.Activity.MAIN, actionBar, this.getBaseContext());
			//Log.i(Logs.START, "Title theme has been set up.");
			Language.SetLanguage(com.guess.license.plate.Activity.START, this.getBaseContext());
			//Log.i(Logs.START, "Language has been set up.");
			Theme.SetTheme(com.guess.license.plate.Activity.START, this.getBaseContext());
			//Log.i(Logs.START, "Theme has been set up.");
			
			// Add new ad
			IMBanner banner = (IMBanner) findViewById(R.id.adView);
			banner.loadBanner();
			
		}catch(Exception e){
			//Log.e(Logs.MAIN, e.getMessage());
		}
	}
	
	@Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.START);
	}
	
	/**
	 * Note this method calls the Game activity.
	 */
	
	public void gameActivity1() {
		Intent intent = new Intent(this, GameActivity.class);
		intent.putExtra("Transition", true);
		startActivity(intent);
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
	
	
	public void gameActivity(Object obj) {
		if(obj instanceof ArrayList<?>){
			Intent intent = new Intent(this, GameActivity.class);
			//Log.e("GAME", "Arrivato1");
			//intent.putExtra("Game", (ArrayList<Plate>) obj);
			//Log.e("GAME", "Arrivato2");
			startActivity(intent);			
		}
	}
}