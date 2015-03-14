package com.guess.license.plate;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class StatisticsActivity extends SherlockActivity {
	public static ScrollView ScrollView;
	public static TextView Stats;
	public static TextView LabAllPlates;
	public static TextView AllPlates;
	public static TextView LabEuPlates;
	public static TextView EuPlates;
	public static TextView LabROTWPlates;
	public static TextView ROTWPlates;
	public static TextView LabCorrAns;
	public static TextView CorrAns;
	public static TextView LabWrgAns;
	public static TextView WrgAns;
	public static TextView LabMostPlate;
	public static TextView MostPlate;
	public static TextView LabLeastPlate;
	public static TextView LeastPlate;
	public static TextView LabMostEuPlate;
	public static TextView MostEuPlate;
	public static TextView LabLeastEuPlate;
	public static TextView LeastEuPlate;
	public static TextView LabMostROTWPlate;
	public static TextView MostROTWPlate;
	public static TextView LabLeastROTWPlate;
	public static TextView LeastROTWPlate;
	public static TextView LabMostLang;
	public static TextView MostLang;
	public static TextView LabLeastLang;
	public static TextView LeastLang;
	public static TextView LabMostTheme;
	public static TextView MostTheme;
	public static TextView LabLeastTheme;
	public static TextView LeastTheme;
	public static TextView LabMostRange;
	public static TextView MostRange;
	public static TextView LabLeastRange;
	public static TextView LeastRange;	
	public static Button Back;
	
	private static final String DEFAULT_STRING = "0";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.statistics);
		
		com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this.getBaseContext());
		
		ScrollView = (ScrollView) findViewById(R.id.scroll_view);
		Stats = (TextView) findViewById(R.id.stats);
		Stats.setTypeface(Utility.GetFont(this));
				
		// Total number of plates (ALL_PLATES)
		LabAllPlates = (TextView) findViewById(R.id.lab_all_plates);
		AllPlates = (TextView) findViewById(R.id.all_plates);
		LabAllPlates.setTypeface(Utility.GetFont(this));
		AllPlates.setTypeface(Utility.GetFont(this));
				
		// European plates (EUROPEAN_PLATES)
		LabEuPlates = (TextView) findViewById(R.id.lab_eu_plates);
		EuPlates = (TextView) findViewById(R.id.eu_plates);
		LabEuPlates.setTypeface(Utility.GetFont(this));
		EuPlates.setTypeface(Utility.GetFont(this));
				
		// Rest of the world plates (ROTW_PLATES)
		LabROTWPlates = (TextView) findViewById(R.id.lab_rotw_plates);
		ROTWPlates = (TextView) findViewById(R.id.rotw_plates);
		LabROTWPlates.setTypeface(Utility.GetFont(this));
		ROTWPlates.setTypeface(Utility.GetFont(this));
		
		// Total correct answer (CORR_ANS)
		LabCorrAns = (TextView) findViewById(R.id.lab_corr_ans);
		CorrAns = (TextView) findViewById(R.id.corr_ans);
		LabCorrAns.setTypeface(Utility.GetFont(this));
		CorrAns.setTypeface(Utility.GetFont(this));
		
		// Total wrong answer (WRG_ANS)
		LabWrgAns = (TextView) findViewById(R.id.lab_wrg_ans);
		WrgAns = (TextView) findViewById(R.id.wrg_ans);
		LabWrgAns.setTypeface(Utility.GetFont(this));
		WrgAns.setTypeface(Utility.GetFont(this));
		
		// The most plate generated (MOST_PLATE)
		LabMostPlate = (TextView) findViewById(R.id.lab_most_plate);
		MostPlate = (TextView) findViewById(R.id.most_plate);
		LabMostPlate.setTypeface(Utility.GetFont(this));
		MostPlate.setTypeface(Utility.GetFont(this));
		
		// The least plate generated (LEAST_PLATE)
		LabLeastPlate = (TextView) findViewById(R.id.lab_least_plate);
		LeastPlate = (TextView) findViewById(R.id.least_plate);
		LabLeastPlate.setTypeface(Utility.GetFont(this));
		LeastPlate.setTypeface(Utility.GetFont(this));
		
		// The most European plate generated (MOST_EU_PLATE)
		LabMostEuPlate = (TextView) findViewById(R.id.lab_most_eu_plate);
		MostEuPlate = (TextView) findViewById(R.id.most_eu_plate);
		LabMostEuPlate.setTypeface(Utility.GetFont(this));
		MostEuPlate.setTypeface(Utility.GetFont(this));
		
		// The least European plate generated (LEAST_EU_PLATE)
		LabLeastEuPlate = (TextView) findViewById(R.id.lab_least_eu_plate);
		LeastEuPlate = (TextView) findViewById(R.id.least_eu_plate);
		LabLeastEuPlate.setTypeface(Utility.GetFont(this));
		LeastEuPlate.setTypeface(Utility.GetFont(this));
		
		// The most Rest of the world plate generated (MOST_ROTW_PLATE)
		LabMostROTWPlate = (TextView) findViewById(R.id.lab_most_rotw_plate);
		MostROTWPlate = (TextView) findViewById(R.id.most_rotw_plate);
		LabMostROTWPlate.setTypeface(Utility.GetFont(this));
		MostROTWPlate.setTypeface(Utility.GetFont(this));
		
		// Least Rest of the world plate generated (LEAST_ROTW_PLATE)
		LabLeastROTWPlate = (TextView) findViewById(R.id.lab_least_rotw_plate);
		LeastROTWPlate = (TextView) findViewById(R.id.least_rotw_plate);
		LabLeastROTWPlate.setTypeface(Utility.GetFont(this));
		LeastROTWPlate.setTypeface(Utility.GetFont(this));
		
		// The most language chosen (MOST_LANG)
		LabMostLang = (TextView) findViewById(R.id.lab_most_lang);
		MostLang = (TextView) findViewById(R.id.most_lang);
		LabMostLang.setTypeface(Utility.GetFont(this));
		MostLang.setTypeface(Utility.GetFont(this));
		
		// The least language chosen (LEAST_LANG)
		LabLeastLang = (TextView) findViewById(R.id.lab_least_lang);
		LeastLang = (TextView) findViewById(R.id.least_lang);
		LabLeastLang.setTypeface(Utility.GetFont(this));
		LeastLang.setTypeface(Utility.GetFont(this));
		
		// The most theme chosen (MOST_THEME)
		LabMostTheme = (TextView) findViewById(R.id.lab_most_theme);
		MostTheme = (TextView) findViewById(R.id.most_theme);
		LabMostTheme.setTypeface(Utility.GetFont(this));
		MostTheme.setTypeface(Utility.GetFont(this));
		
		// The least theme chosen (LEAST_THEME)
		LabLeastTheme = (TextView) findViewById(R.id.lab_least_theme);
		LeastTheme = (TextView) findViewById(R.id.least_theme);
		LabLeastTheme.setTypeface(Utility.GetFont(this));
		LeastTheme.setTypeface(Utility.GetFont(this));
		
		// The most range chosen (MOST_RANGE)
		LabMostRange = (TextView) findViewById(R.id.lab_most_range);
		MostRange = (TextView) findViewById(R.id.most_range);
		LabMostRange.setTypeface(Utility.GetFont(this));
		MostRange.setTypeface(Utility.GetFont(this));
		
		// The least range chosen (LEAST_RANGE)
		LabLeastRange = (TextView) findViewById(R.id.lab_least_range);
		LeastRange = (TextView) findViewById(R.id.least_range);
		LabLeastRange.setTypeface(Utility.GetFont(this));
		LeastRange.setTypeface(Utility.GetFont(this));
		
		Back = (Button) findViewById(R.id.back);
		Back.setTypeface(Utility.GetFont(this));
		
		// Handling on Click
		Back.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});
		
		Title.SetTitle(com.guess.license.plate.Activity.STATS, actionBar, this.getBaseContext());
		Language.SetLanguage(com.guess.license.plate.Activity.STATS, this.getBaseContext());
		Theme.SetTheme(com.guess.license.plate.Activity.STATS, this.getBaseContext());
	}
	
	@Override
	public void onResume(){
		super.onResume();
		// Retrieving data and set the text for the views
		retrieveDataAndSetText();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.STATS);
		
	}
	
	@Override
	protected void onPause(){
		super.onPause();	
		// Save the preference
		//Log.e("BEST_SCORE", "Editing Preferences");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Editor edit = sharedPref.edit();
		edit.putString("AllPlates", AllPlates.getText().toString());
		edit.putString("EuPlates", EuPlates.getText().toString());
		edit.putString("ROTWPlates", ROTWPlates.getText().toString());
		edit.putString("CorrAns", CorrAns.getText().toString());
		edit.putString("WrgAns", WrgAns.getText().toString());
		edit.putString("MostPlate", MostPlate.getText().toString());
		edit.putString("LeastPlate", LeastPlate.getText().toString());
		edit.putString("MostROTWPlate", MostROTWPlate.getText().toString());
		edit.putString("LeastROTWPlate", LeastROTWPlate.getText().toString());
		edit.putString("MostLang", MostLang.getText().toString());
		edit.putString("LeastLang", LeastLang.getText().toString());
		edit.putString("MostTheme", MostTheme.getText().toString());
		edit.putString("LeastTheme", LeastTheme.getText().toString());
		edit.putString("MostRange", MostRange.getText().toString());
		edit.putString("LeastRange", LeastRange.getText().toString());
		edit.commit();
		//Log.e("BEST_SCORE", "Preferences finished to edit");
	}
	
	private void retrieveDataAndSetText(){
		//Log.e("STATS", "Retrieving information got from Preferences");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		StatisticsActivity.AllPlates.setText(sharedPref.getString("AllPlates", DEFAULT_STRING));
		StatisticsActivity.EuPlates.setText(sharedPref.getString("EuPlates", DEFAULT_STRING));
		StatisticsActivity.ROTWPlates.setText(sharedPref.getString("ROTWPlates", DEFAULT_STRING));
		StatisticsActivity.CorrAns.setText(sharedPref.getString("CorrAns", DEFAULT_STRING));
		StatisticsActivity.WrgAns.setText(sharedPref.getString("WrgAns", DEFAULT_STRING));
		StatisticsActivity.MostPlate.setText(sharedPref.getString("MostPlate", DEFAULT_STRING));
		StatisticsActivity.LeastPlate.setText(sharedPref.getString("LeastPlate", DEFAULT_STRING));
		StatisticsActivity.MostEuPlate.setText(sharedPref.getString("MostEuPlate", DEFAULT_STRING));
		StatisticsActivity.LeastEuPlate.setText(sharedPref.getString("LeastEuPlate", DEFAULT_STRING));
		StatisticsActivity.MostROTWPlate.setText(sharedPref.getString("MostROTWPlate", DEFAULT_STRING));
		StatisticsActivity.LeastROTWPlate.setText(sharedPref.getString("LeastROTWPlate", DEFAULT_STRING));
		StatisticsActivity.MostLang.setText(sharedPref.getString("MostLang", DEFAULT_STRING));
		StatisticsActivity.LeastLang.setText(sharedPref.getString("LeastLang", DEFAULT_STRING));
		StatisticsActivity.MostTheme.setText(sharedPref.getString("MostTheme", DEFAULT_STRING));
		StatisticsActivity.LeastTheme.setText(sharedPref.getString("LeastTheme", DEFAULT_STRING));
		StatisticsActivity.MostRange.setText(sharedPref.getString("MostRange", DEFAULT_STRING));
		StatisticsActivity.LeastRange.setText(sharedPref.getString("LeastRange", DEFAULT_STRING));		
		//Log.e("STATS", "Views set with information got from Preferences");
		
		if(getIntent() != null){	
			ArrayList<String> obj = getIntent().getStringArrayListExtra("MainStatistic");		
			final int NUM_INFO_DISPLAYED = 17;
			if(obj != null && obj.size() == NUM_INFO_DISPLAYED){
				//Log.e("STATS", "Retrieving information got from DB");
				StatisticsActivity.AllPlates.setText(obj.get(0));
				StatisticsActivity.EuPlates.setText(obj.get(1));
				StatisticsActivity.ROTWPlates.setText(obj.get(2));
				StatisticsActivity.CorrAns.setText(obj.get(3));
				StatisticsActivity.WrgAns.setText(obj.get(4));
				StatisticsActivity.MostPlate.setText(obj.get(5));	
				StatisticsActivity.LeastPlate.setText(obj.get(6));
				StatisticsActivity.MostEuPlate.setText(obj.get(7));
				StatisticsActivity.LeastEuPlate.setText(obj.get(8));	
				StatisticsActivity.MostROTWPlate.setText(obj.get(9));
				StatisticsActivity.LeastROTWPlate.setText(obj.get(10));
				StatisticsActivity.MostLang.setText(obj.get(11));	
				StatisticsActivity.LeastLang.setText(obj.get(12));
				StatisticsActivity.MostTheme.setText(obj.get(13));
				StatisticsActivity.LeastTheme.setText(obj.get(14));
				StatisticsActivity.MostRange.setText(obj.get(15));
				StatisticsActivity.LeastRange.setText(obj.get(16));	
				//Log.e("STATS", "Views set with information got from DB");
			}
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