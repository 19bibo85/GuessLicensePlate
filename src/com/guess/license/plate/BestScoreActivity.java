package com.guess.license.plate;

import java.util.ArrayList;
import com.actionbarsherlock.app.SherlockActivity;
import com.inmobi.monetization.IMBanner;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class BestScoreActivity extends SherlockActivity {
	public static ScrollView ScrollView;
	public static TextView BestScore;
	public static TextView Easy; 
	public static TextView ScoreEasy;
	public static TextView RateEasy;
	public static TextView Medium;
	public static TextView ScoreMedium;
	public static TextView RateMedium;
	public static TextView Hard;
	public static TextView ScoreHard;
	public static TextView RateHard;
	public static TextView AllPlates;
	public static TextView ScoreAllPlates;
	public static TextView RateAllPlates;
	public static TextView NoFault;
	public static TextView ScoreNoFault;
	public static TextView RateNoFault;
	public static Button Back;
	public static Button Stats;
	
	final String SCORE_DEFAULT = "0";
	final String RATE_DEFAULT = "0";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.best_score);
		
		com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this.getBaseContext());
        
		// Getting the views
		ScrollView = (ScrollView) findViewById(R.id.scroll_view);
		BestScore = (TextView) findViewById(R.id.best_score);
		BestScore.setTypeface(Utility.GetFont(this));
		
		Easy = (TextView) findViewById(R.id.easy);
		ScoreEasy = (TextView) findViewById(R.id.score_easy);		
		RateEasy = (TextView) findViewById(R.id.rate_easy);
		ScoreEasy.setText(SCORE_DEFAULT);
		RateEasy.setText(RATE_DEFAULT.concat("%"));
		Easy.setTypeface(Utility.GetFont(this));
		ScoreEasy.setTypeface(Utility.GetFont(this));
		RateEasy.setTypeface(Utility.GetFont(this));
		
		Medium = (TextView) findViewById(R.id.medium);
		ScoreMedium = (TextView) findViewById(R.id.score_medium);
		RateMedium = (TextView) findViewById(R.id.rate_medium);
		ScoreMedium.setText(SCORE_DEFAULT);
		RateMedium.setText(RATE_DEFAULT.concat("%"));
		Medium.setTypeface(Utility.GetFont(this));
		ScoreMedium.setTypeface(Utility.GetFont(this));
		RateMedium.setTypeface(Utility.GetFont(this));
		
		Hard = (TextView) findViewById(R.id.hard);
		ScoreHard = (TextView) findViewById(R.id.score_hard);
		RateHard = (TextView) findViewById(R.id.rate_hard);
		ScoreHard.setText(SCORE_DEFAULT);
		RateHard.setText(RATE_DEFAULT.concat("%"));
		Hard.setTypeface(Utility.GetFont(this));
		ScoreHard.setTypeface(Utility.GetFont(this));
		RateHard.setTypeface(Utility.GetFont(this));
		
		AllPlates = (TextView) findViewById(R.id.all_plates);
		ScoreAllPlates = (TextView) findViewById(R.id.score_all_plates);
		RateAllPlates = (TextView) findViewById(R.id.rate_all_plates);
		ScoreAllPlates.setText(SCORE_DEFAULT);
		RateAllPlates.setText(RATE_DEFAULT.concat("%"));
		AllPlates.setTypeface(Utility.GetFont(this));
		ScoreAllPlates.setTypeface(Utility.GetFont(this));
		RateAllPlates.setTypeface(Utility.GetFont(this));
		
		NoFault = (TextView) findViewById(R.id.no_fault);
		ScoreNoFault = (TextView) findViewById(R.id.score_no_fault);
		RateNoFault = (TextView) findViewById(R.id.rate_no_fault);
		ScoreNoFault.setText(SCORE_DEFAULT);
		RateNoFault.setText(RATE_DEFAULT.concat("%"));
		NoFault.setTypeface(Utility.GetFont(this));
		ScoreNoFault.setTypeface(Utility.GetFont(this));
		RateNoFault.setTypeface(Utility.GetFont(this));
		
		//Back = (Button) findViewById(R.id.back);
		Stats = (Button) findViewById(R.id.stats);
		Stats.setTypeface(Utility.GetFont(this));
		
		// Handling on Click
		/*Back.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});*/
		
		Stats.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				statsActivity();
			}
		});
		
		Title.SetTitle(com.guess.license.plate.Activity.BEST_SCORE, actionBar, this.getBaseContext());
		Language.SetLanguage(com.guess.license.plate.Activity.BEST_SCORE, this.getBaseContext());
		Theme.SetTheme(com.guess.license.plate.Activity.BEST_SCORE, this.getBaseContext());
		
		// Add new ad
		IMBanner banner = (IMBanner) findViewById(R.id.adView);
		banner.loadBanner();
	}
	
	@Override
	public void onResume(){
		super.onResume();
		// Retrieving data and set the text for the views
		retrieveDataAndSetText();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.BEST_SCORE);
	}
	
	@Override
	protected void onPause(){
		super.onPause();	
		// Save the preference
		//Log.e("BEST_SCORE", "Editing Preferences");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Editor edit = sharedPref.edit();
		edit.putString("ScoreEasy", ScoreEasy.getText().toString());
		edit.putString("RateEasy", RateEasy.getText().toString());
		edit.putString("ScoreMedium", ScoreMedium.getText().toString());
		edit.putString("RateMedium", RateMedium.getText().toString());
		edit.putString("ScoreHard", ScoreHard.getText().toString());
		edit.putString("RateHard", RateHard.getText().toString());
		edit.putString("ScoreAllPlates", ScoreAllPlates.getText().toString());
		edit.putString("RateAllPlates", RateAllPlates.getText().toString());
		edit.putString("ScoreNoFault", ScoreNoFault.getText().toString());
		edit.putString("RateNoFault", RateNoFault.getText().toString());
		edit.commit();
		//Log.e("BEST_SCORE", "Preferences finished to edit");
	}
	
	private void retrieveDataAndSetText(){
		//Log.e("BEST_SCORE", "Retrieving information got from Preferences");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		ScoreEasy.setText(sharedPref.getString("ScoreEasy", SCORE_DEFAULT));
		RateEasy.setText(sharedPref.getString("RateEasy", RATE_DEFAULT.concat("%")));
		ScoreMedium.setText(sharedPref.getString("ScoreMedium", SCORE_DEFAULT));
		RateMedium.setText(sharedPref.getString("RateMedium", RATE_DEFAULT.concat("%")));
		ScoreHard.setText(sharedPref.getString("ScoreHard", SCORE_DEFAULT));
		RateHard.setText(sharedPref.getString("RateHard", RATE_DEFAULT.concat("%")));
		ScoreAllPlates.setText(sharedPref.getString("ScoreAllPlates", SCORE_DEFAULT));
		RateAllPlates.setText(sharedPref.getString("RateAllPlates", RATE_DEFAULT.concat("%")));
		ScoreNoFault.setText(sharedPref.getString("ScoreNoFault", SCORE_DEFAULT));
		RateNoFault.setText(sharedPref.getString("RateNoFault", RATE_DEFAULT.concat("%")));		
		//Log.e("BEST_SCORE", "Views set with information got from Preferences");
		
		if(getIntent() != null){	
			ArrayList<String> obj = getIntent().getStringArrayListExtra("BestScore");		
			final int NUM_INFO_DISPLAYED = 10;
			if(obj != null && obj.size() == NUM_INFO_DISPLAYED){
				//Log.e("BEST_SCORE", "Retrieving information got from DB");
				ScoreEasy.setText(obj.get(0));
				RateEasy.setText(obj.get(1).concat("%"));
				ScoreMedium.setText(obj.get(2));
				RateMedium.setText(obj.get(3).concat("%"));
				ScoreHard.setText(obj.get(4));
				RateHard.setText(obj.get(5).concat("%"));
				ScoreAllPlates.setText(obj.get(6));
				RateAllPlates.setText(obj.get(7).concat("%"));
				ScoreNoFault.setText(obj.get(8));
				RateNoFault.setText(obj.get(9).concat("%"));
				//Log.e("BEST_SCORE", "Views set with information got from DB");
			}
		}
	}
	
	private void statsActivity() {
		Intent intent = new Intent(this, MainStatisticsActivity.class);
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
}