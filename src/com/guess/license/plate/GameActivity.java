package com.guess.license.plate;

import com.actionbarsherlock.app.SherlockActivity;
import com.inmobi.monetization.IMBanner;

import java.util.ArrayList;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;

/**
 * This class, depending on the mode chosen, loads the layout and sets the
 * license plate's image and the four buttons with the possible answers.
 * 
 * @author Alberto Tosi Brandi
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
			////Log.i(Logs.GAME, "Start layout has been loaded.");
			
			// Action Bar
			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
			Utility.SetActionBar(actionBar, this.getBaseContext());
			////Log.i(Logs.MAIN, "Action bar has been set up.");
			
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
			////Log.i(Logs.GAME, "Query clause for the list of plates has been set up: "+ where);
			
			// Based on the query up clause get the plates and then filter it on difficulty 
			OrgPlateList = GameUtility.CopyDbToList(OrgPlateList, this.getBaseContext(), where);
						
			//OrgPlateList = retrievePlateList();			
			
			if(OrgPlateList != null){
				
				OrgPlateList = GameUtility.GetPlateOnDifficulty();
				////Log.i(Logs.GAME, "List of plate has been created");
				
				// Create a clone of previous list			
				CloPlateList = (ArrayList<Plate>) OrgPlateList.clone();	
				
				// Instance of a new review list
				ReviewList = new ArrayList<Review>();			
				NumberCorrectAnswer = 0;
				NumberWrongAnswer = 0;
				////Log.i(Logs.GAME, "Clone list, review List and answers correct and wrong have been create");
						
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
				////Log.i(Logs.GAME, "Views have been set up.");
			
				// Setting the values for the views
				GameUtility.SetDataGame(this, imageView);
				////Log.i(Logs.GAME, "View data have been set up.");
							
				// Setting the layout
				new GameLayout(this, imageView, this.getApplicationContext());
				////Log.i(Logs.GAME, "Layout game has been set up.");
				
				// Title		
				Title.SetTitle(com.guess.license.plate.Activity.GAME, actionBar, this.getBaseContext());
				////Log.i(Logs.GAME, "Title theme has been set up.");
				
				// Add new ad
				IMBanner banner = (IMBanner) findViewById(R.id.adView);
				banner.loadBanner();
			}
			
		}catch(Exception e){
			////Log.e(Logs.GAME, e.getMessage());
		}		
	}
	
	@Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.GAME);
	}
	
	@Override
    public void onPause() {
		super.onPause();
		if(countDownTimer != null) countDownTimer.cancel();
		finish();		
    }

	/**
	 * Note this method sets the variables depending on the mode of the game.
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
						NewDatabaseHelper databaseHelper = Utility.GetDataBaseHelper(getBaseContext());						
						new Score(activity).execute(databaseHelper);
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
	}

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