package com.guess.license.plate.Activity;

import java.util.ArrayList;
import java.util.Locale;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Logs;
import com.guess.license.plate.Repository.SharedPreference;
import com.guess.license.plate.Repository.Theme;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class ScoreActivity extends SherlockActivity {
	public static ScrollView ScrollView;
	public static TextView GameOver;
	public static TextView CorrectAnswer;
	public static TextView PointCorrectAnswer;
	public static TextView WrongAnswer;
	public static TextView PointWrongAnswer;
	public static TextView Point;
	public static TextView Rate;
	public static TextView NumberCorrectAnswer;
	public static TextView NumberWrongAnswer;
	public static TextView PointValue;
	public static TextView RateValue;
	public static Button Back;
	public static Button Review;
	
	final int DEFAULT_VALUE = 0;

	public void onCreate(Bundle savedInstanceState) {
		try{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.score);
			
			// Action Bar
			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        Utility.SetActionBar(actionBar, this.getBaseContext());
	        
			ScrollView = (ScrollView) findViewById(R.id.scroll_view);
			
			// Game Over
			GameOver = (TextView) findViewById(R.id.game_over);
			GameOver.setTypeface(Utility.GetFont(this));
			
			// Correct and Wrong answer
			CorrectAnswer = (TextView) findViewById(R.id.correct_answer);
			WrongAnswer = (TextView) findViewById(R.id.wrong_answer);
			CorrectAnswer.setTypeface(Utility.GetFont(this));
			WrongAnswer.setTypeface(Utility.GetFont(this));
			
			// Point and Rate
			Point = (TextView) findViewById(R.id.point);
			Rate = (TextView) findViewById(R.id.rate);
			Point.setTypeface(Utility.GetFont(this));
			Rate.setTypeface(Utility.GetFont(this));
			
			// Number correct and wrong answer
			NumberCorrectAnswer = (TextView) findViewById(R.id.number_correct_answer);
			PointCorrectAnswer = (TextView) findViewById(R.id.point_correct_answer);
			NumberWrongAnswer = (TextView) findViewById(R.id.number_wrong_answer);
			PointWrongAnswer = (TextView) findViewById(R.id.point_wrong_answer);
			NumberCorrectAnswer.setTypeface(Utility.GetFont(this));
			PointCorrectAnswer.setTypeface(Utility.GetFont(this));
			NumberWrongAnswer.setTypeface(Utility.GetFont(this));
			PointWrongAnswer.setTypeface(Utility.GetFont(this));
			
			// Score and rate
			PointValue = (TextView) findViewById(R.id.point_value);
			RateValue = (TextView) findViewById(R.id.rate_value);
			PointValue.setTypeface(Utility.GetFont(this));
			RateValue.setTypeface(Utility.GetFont(this));
						
			// Back and review
			Back = (Button) findViewById(R.id.back);
			Back.setTypeface(Utility.GetFont(this));
			Review = (Button) findViewById(R.id.review);
			Review.setTypeface(Utility.GetFont(this));
			
			// Back
			Back.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					startActivity();
				}
			});
			
			// Review
			Review.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					reviewActivity();
				}
			});
			
			// Title, language and theme
			Title.SetTitle(Component.SCORE, actionBar, this.getBaseContext());
			Language.SetLanguage(Component.SCORE, this.getBaseContext());
			Theme.SetTheme(Component.SCORE, this.getBaseContext());
			
		}catch(Exception e){
			Log.e(Logs.SCORE, e.getMessage());
		}
	}
	
	
	@Override
	public void onResume(){
		super.onResume();
		// Retrieving data and set the text for the views
		retrieveDataAndSetText();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.SCORE);		
	}
	
	
	@Override
	protected void onPause(){
		super.onPause();	
		// Save the preference
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Editor edit = sharedPref.edit();
		edit.putString("NumberCorrectAnswer", NumberCorrectAnswer.getText().toString());
		edit.putString("NumberWrongAnswer", NumberWrongAnswer.getText().toString());
		edit.putString("PointValue", PointValue.getText().toString());
		edit.putString("RateValue", RateValue.getText().toString());
		edit.commit();
	}
	
	
	private void retrieveDataAndSetText(){
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		NumberCorrectAnswer.setText(sharedPref.getString("NumberCorrectAnswer", Integer.toString(DEFAULT_VALUE)));
		NumberWrongAnswer.setText(sharedPref.getString("NumberWrongAnswer", Integer.toString(DEFAULT_VALUE)));
		PointValue.setText(sharedPref.getString("PointValue", Integer.toString(DEFAULT_VALUE)));
		RateValue.setText(sharedPref.getString("RateValue", Integer.toString(DEFAULT_VALUE).concat("%")));
		
		if(getIntent() != null){
			ArrayList<String> obj = getIntent().getStringArrayListExtra("Score");		
			final int NUM_INFO_DISPLAYED = 5;
			if(obj != null && obj.size() == NUM_INFO_DISPLAYED){
				NumberCorrectAnswer.setText(obj.get(0));
				NumberWrongAnswer.setText(obj.get(1));
				PointValue.setText(obj.get(2));
				RateValue.setText(obj.get(3));
				String isNew = obj.get(4);
				if(isNew.equals("NEW"))
					showNewRecord();
			}
		}
	}
	
	
	private void showNewRecord()
	{
		// Set the audio in case is a new record
		Utility.SetAudio(this.getBaseContext(), SharedPreference.GetSharedPreferenceBool(this.getBaseContext())[1], 1);
		
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.toast,
		                               (ViewGroup) findViewById(R.id.toast_layout));

		TextView text = (TextView) layout.findViewById(R.id.text);
		text.setTypeface(Utility.GetFont(this));
		text.setText(NewRecordLocalized(this.getBaseContext()));

		Toast toast = new Toast(getApplicationContext());
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(layout);
		toast.show();
	}
	
	
	private String NewRecordLocalized(Context context){
		String result = "New Record";
		if(context != null){
			String[] pref = SharedPreference.GetSharedPreferenceString(context);
			String lang = pref.length == SharedPreference.STRING_SIZE ? pref[0] : Locale.getDefault().getLanguage();
			String xmlStr = "score_record_".concat(lang);
			result = context.getResources().getString(Utility.GetResId(xmlStr, context, R.string.class));		
		}
		return result;
	}
	
	
	/**
	 * Note this method calls the Start activity.
	 */
	private void startActivity() {
		//Intent intent = new Intent(this, StartActivity.class);
		//intent.putExtra("Transition", false);
		//startActivity(intent);
		finish();
	}
	
	
	/**
	 * Note this method calls the Score activity.
	 */
	public void reviewActivity() {
		Intent intent = new Intent(this, ReviewActivity.class);
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