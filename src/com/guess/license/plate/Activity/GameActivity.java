package com.guess.license.plate.Activity;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Model.Plate;
import com.guess.license.plate.Model.Review;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.GameLayout;
import com.guess.license.plate.Repository.GameUtility;
import com.guess.license.plate.Repository.Logs;
import com.guess.license.plate.Repository.SharedPreference;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;
import com.guess.license.plate.Task.ScoreAsyncTask;

import java.util.ArrayList;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;

/**
 * @author Alberto Tosi Brandi
 * 
 * This class, depending on the mode chosen, loads the layout and sets the
 * license plate's image and the four buttons with the possible answers.
 * 
 */
public class GameActivity extends SherlockActivity {
	public static ScrollView ScrollView;
	public static ArrayList<Plate> OrgPlateList;
	public static ArrayList<Plate> CloPlateList;
	public static ArrayList<Review> ReviewList;
	public static int NumberCorrectAnswer;
	public static int NumberWrongAnswer;	
	public static TextView Progress;
	public static TextView Total;
	public static TextView Timer;
	public static Button Button1;
	public static Button Button2;
	public static Button Button3;
	public static Button Button4;	
	
	private ImageView imageView;
	private CountDownTimer countDownTimer;
	private ProgressBar progressBar;
	
	@SuppressWarnings("unchecked")
	public void onCreate(Bundle savedInstanceState)  {
		try{
			super.onCreate(savedInstanceState);
			
			// Setting the layout, depends on the game mode
			setLayoutType(this);
			
			// Action Bar
			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
			Utility.SetActionBar(actionBar, this.getBaseContext());
			
			// Instance of a new list of plate
			OrgPlateList = new ArrayList<Plate>();	
			
			// Getting the range selected
			String[] prefs = SharedPreference.GetSharedPreferenceString(this.getBaseContext());
			String country = prefs.length == SharedPreference.STRING_SIZE ? prefs[2] : "Europe";
			// Setting the clause for the query
			String where = !country.equals("All") ? 
													" WHERE Country = '" + country + "'"
													:
													" WHERE Country = 'Europe' OR Country = 'ROTW'";
			where += " AND Plate.Version <> 0 AND Language.Version <> 0 ORDER BY Country, Name ASC";
			
			// Based on the query up clause get the plates and then filter it on difficulty 
			OrgPlateList = GameUtility.CopyDbToList(OrgPlateList, this.getBaseContext(), where);
			
			if(OrgPlateList != null){
				
				OrgPlateList = GameUtility.GetPlateOnDifficulty();
				
				// Create a clone of previous list			
				CloPlateList = (ArrayList<Plate>) OrgPlateList.clone();	
				
				// Instance of a new review list
				ReviewList = new ArrayList<Review>();			
				NumberCorrectAnswer = 0;
				NumberWrongAnswer = 0;
						
				// Getting the XML views
				ScrollView = (ScrollView) findViewById(R.id.scroll_view);
				imageView = (ImageView) findViewById(R.id.image_plate);
				Button1 = (Button) findViewById(R.id.button1);
				Button1.setTypeface(Utility.GetFont(this));
				Button2 = (Button) findViewById(R.id.button2);
				Button2.setTypeface(Utility.GetFont(this));
				Button3 = (Button) findViewById(R.id.button3);
				Button3.setTypeface(Utility.GetFont(this));
				Button4 = (Button) findViewById(R.id.button4);
				Button4.setTypeface(Utility.GetFont(this));
			
				// Setting the values for the views
				GameUtility.SetDataGame(this, imageView);
							
				// Setting the layout
				new GameLayout(this, imageView, this.getApplicationContext());
				
				// Title		
				Title.SetTitle(Component.GAME, actionBar, this.getBaseContext());
			}
			
		}catch(Exception e){
			Log.e(Logs.GAME, e.getMessage());
		}		
	}
	
	@Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.GAME);
	}
	
	@Override
    public void onPause() {
		super.onPause();
		if(countDownTimer != null) countDownTimer.cancel();
		finish();		
    }

	
	/**
	 * Note this method sets the variables depending on the mode of the game.
	 * @param activity Activity
	 */
	private void setLayoutType(final GameActivity activity) {
		
		switch(StartActivity.GameModeVal){
			case EASY:
			case MEDIUM:
			case HARD:
				// Setting the layout
				setContentView(R.layout.game_001);
				
				// Getting the TextView Timer and the ProgressBar
				Timer = (TextView) findViewById(R.id.timer);
				Timer.setTypeface(Utility.GetFont(this));
				progressBar = (ProgressBar) findViewById(R.id.progressBar);
				
				// Initialising the counter 60 seconds
				countDownTimer = new CountDownTimer(60000, 1000) {
	
					public void onTick(long millisUntilFinished) {
						// Updating Timer and ProgressBar
						Timer.setText(Long.toString(millisUntilFinished / 1000));
						progressBar.setProgress((int)millisUntilFinished/1000);
					}
	
					public void onFinish() {
						// Show the score when the time is over
						DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(getBaseContext());						
						new ScoreAsyncTask(activity).execute(databaseHelper);
					}
				}.start();
				break;
			case ALL_PLATES:
			case NO_FAULT:
				// Setting the layout
				setContentView(R.layout.game_002);
				
				// Getting the TextViews Progress/Total
				Progress = (TextView) findViewById(R.id.progress);
				Total = (TextView) findViewById(R.id.total);
				Progress.setTypeface(Utility.GetFont(this));
				Total.setTypeface(Utility.GetFont(this));
				break;
			default:
				break;
		}
	}

	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			switch(StartActivity.GameModeVal){
				case EASY:
				case MEDIUM:
				case HARD:
					countDownTimer.cancel();
					break;
				default:
					break;
			}				
			finish();
			return true;
		}
		return false;
	}
	
	/*
	@SuppressWarnings("unchecked")
	private ArrayList<Plate> retrievePlateList(){
		ArrayList<Plate> orgPlateList = null;
		if(getIntent() != null){	
			Bundle bundle = getIntent().getExtras();
			if(bundle != null){
				ArrayList<Plate> obj =(ArrayList<Plate>) bundle.get("Game");
				if(obj != null){
					orgPlateList = obj;
				}
			}			
		}
		return orgPlateList;
	}*/

	/**
	 * Note this method calls the Score activity.
	 */
	@SuppressWarnings("unchecked")
	public void scoreActivity(Object obj) {
		if(obj instanceof ArrayList<?>){
			Intent intent = new Intent(this, ScoreActivity.class);
			intent.putStringArrayListExtra("Score", (ArrayList<String>) obj);
			startActivity(intent);
			finish();
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