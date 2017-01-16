package com.guess.license.plate.Activity;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.GameMode;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Logs;
import com.guess.license.plate.Repository.Theme;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;

import android.os.Bundle;
import android.util.Log;
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
			
			// Action Bar
			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        Utility.SetActionBar(actionBar, this.getBaseContext());
	
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
					DatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new DatabaseHelper(getBaseContext());
					
					gameActivity1();
				}
			});
			
			// Medium
			Medium = (Button) findViewById(R.id.medium);
			Medium.setTypeface(Utility.GetFont(this));
			Medium.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.MEDIUM;
					DatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new DatabaseHelper(getBaseContext());
					
					gameActivity1();
				}
			});
			
			// Hard
			Hard = (Button) findViewById(R.id.hard);
			Hard.setTypeface(Utility.GetFont(this));
			Hard.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.HARD;
					DatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new DatabaseHelper(getBaseContext());
					
					gameActivity1();
				}
			});
	
			// All Plates
			AllPlates = (Button) findViewById(R.id.all_plates);
			AllPlates.setTypeface(Utility.GetFont(this));
			AllPlates.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.ALL_PLATES;
					gameActivity1();
				}
			});
	
			// No Fault
			NoFault = (Button) findViewById(R.id.no_fault);
			NoFault.setTypeface(Utility.GetFont(this));
			NoFault.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					GameModeVal = GameMode.NO_FAULT;
					gameActivity1();
				}
			});
			
			// Title, language and theme
			Title.SetTitle(Component.MAIN, actionBar, this.getBaseContext());
			Language.SetLanguage(Component.START, this.getBaseContext());
			Theme.SetTheme(Component.START, this.getBaseContext());			
			
		}catch(Exception e){
			Log.e(Logs.START, e.getMessage());
		}
	}
	
	
	@Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.START);
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
			startActivity(intent);			
		}
	}
}