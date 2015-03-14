package com.guess.license.plate;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.inmobi.monetization.IMBanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

/**
 * This is the main class of the project.
 * Loads the layout and then it sets Start, Best Score, List and Setting buttons.
 * 
 * @author Alberto Tosi Brandi
 * 
 */
public class MainActivity extends SherlockActivity {
	public static ScrollView ScrollView;
	public static Button Start;
	public static Button BestScore;
	public static Button List;
	public static Button Setting;
	private static String ThemeSelected;
	private static String LanguageSelected;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		try{						
			// Load layout
			super.onCreate(savedInstanceState);			
			setContentView(R.layout.main);
			//Log.i(Logs.MAIN, "Main layout has been loaded.");
			
			// Set action bar
			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
			Utility.SetActionBar(actionBar, this.getBaseContext());			
			
			//Log.i(Logs.MAIN, "Action bar has been set up.");
				
			ScrollView = (ScrollView) findViewById(R.id.scroll_view);
			
			// Start
			Start = (Button) findViewById(R.id.start);
			Start.setTypeface(Utility.GetFont(this));
			Start.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					startActivity();
					//Log.i(Logs.MAIN, "Start activity has been called.");
				}
			});
			//Log.i(Logs.MAIN, "Start button has been added.");
			
			// Best Scores
			BestScore = (Button) findViewById(R.id.best_score);
			BestScore.setTypeface(Utility.GetFont(this));
			BestScore.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					// Getting the best scores
					executeAsyncTask(com.guess.license.plate.Activity.BEST_SCORE);
					//Log.i(Logs.MAIN, "Best scores activity has been called.");
				}
			});
			//Log.i(Logs.MAIN, "Best scores button has been added.");
			
			// List
			List = (Button) findViewById(R.id.list);
			List.setTypeface(Utility.GetFont(this));
			List.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					listActivity();
					//Log.i(Logs.MAIN, "List activity has been called.");
				}
			});
			//Log.i(Logs.MAIN, "List button has been added.");
			
			// Setting
			Setting = (Button) findViewById(R.id.setting);
			Setting.setTypeface(Utility.GetFont(this));
			Setting.setOnClickListener(new View.OnClickListener() {
	
				public void onClick(View v) {
					settingActivity();
					//Log.i(Logs.MAIN, "Setting activity has been called.");
				}
			});
			//Log.i(Logs.MAIN, "Setting button has been added.");
			
			Title.SetTitle(com.guess.license.plate.Activity.MAIN, actionBar, this.getBaseContext());
			//Log.i(Logs.MAIN, "Title theme has been set up.");			
			Language.SetLanguage(com.guess.license.plate.Activity.MAIN, this.getBaseContext());
			//Log.i(Logs.MAIN, "Language has been set up.");
			Theme.SetTheme(com.guess.license.plate.Activity.MAIN, this.getBaseContext());
			//Log.i(Logs.MAIN, "Theme has been set up.");
			
			// Set the theme and the language
			String[] sharedPreference = SharedPreference.GetSharedPreferenceString(this.getBaseContext());
			if(sharedPreference.length == 3)
			{
				LanguageSelected = sharedPreference[0];
				ThemeSelected = sharedPreference[1];
			}
			
			// Add new ad
			IMBanner banner = (IMBanner) findViewById(R.id.adView);
			banner.loadBanner();    
		
		}catch(Exception e){
			//Log.e(Logs.MAIN, e.getMessage());
		}
	}
	
	@Override
	public void onRestart(){
		super.onRestart();
	}
	
	@Override
	public void onResume(){
		super.onResume();		
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.MAIN);
		
		// Set the theme and the language
		String[] sharedPreference = SharedPreference.GetSharedPreferenceString(this.getBaseContext());
		if(sharedPreference.length == 3)
		{
			if(LanguageSelected != sharedPreference[0])
			{
				LanguageSelected = sharedPreference[0];				
				Language.SetLanguage(com.guess.license.plate.Activity.MAIN, this.getBaseContext());
				//Log.i(Logs.MAIN, "Language has been set up.");				
			}
			
			if(ThemeSelected != sharedPreference[1])
			{
				ThemeSelected = sharedPreference[1];
				Intent intent = this.getIntent();
				intent.putExtra("NoTransition", true);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		        this.startActivity(intent);
			}
		}
		
		//if (adView != null) {
		//	adView.resume();
		//}
	}
	
	@Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
        //Log.i(Logs.MAIN, "Option menu has been create.");
        return super.onCreateOptionsMenu(menu);
    }
	
	@Override
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
        // Take appropriate action for each action item click		
		if(item.getItemId() == R.id.action_settings){
			settingActivity();
			//Log.i(Logs.MAIN, "Setting icon has been tapped.");
			return true;
		}else if(item.getItemId() == R.id.action_about){
			executeAsyncTask(com.guess.license.plate.Activity.ABOUT);			
			//Log.i(Logs.MAIN, "About icon has been tapped.");
			return true;
		}else{
			return super.onOptionsItemSelected(item);
		}
    }
		
	private void executeAsyncTask(com.guess.license.plate.Activity activity){
		NewDatabaseHelper databaseHelper = Utility.GetDataBaseHelper(this.getBaseContext());		
		switch(activity){
			case BEST_SCORE:
				new Score(MainActivity.this).execute(databaseHelper);
				break;
			case ABOUT:
				new AboutAsyncTask(MainActivity.this).execute(databaseHelper);
				break;
			default:
				break;
		}
	}
	
	/**
	 * Note this method calls the Start activity.
	 */
	private void startActivity() {
		Intent intent = new Intent(this, StartActivity.class);
		intent.putExtra("Transition", true);
		startActivity(intent);	
	 }
	
	/**
	 * Note this method calls the BestScore activity.
	 */
	@SuppressWarnings("unchecked")
	public void bestScoreActivity(Object obj) {
		if(obj instanceof ArrayList<?>){
			Intent intent = new Intent(this, BestScoreActivity.class);
			intent.putStringArrayListExtra("BestScore", (ArrayList<String>) obj);
			startActivity(intent);
		}		
	}
	
	/**
	 * Note this method calls the ListPlate activity.
	 */
	private void listActivity() {
		Intent intent = new Intent(this, MainListActivity.class);
		intent.putExtra("Transition", true);
		startActivity(intent);		
	}
	
	/**
	 * Note this method calls the Setting activity.
	 */
	private void settingActivity() {
		Intent intent = new Intent(this, SettingFragment.class);
		intent.putExtra("Transition", true);
		startActivity(intent);		
	}
	
	@SuppressWarnings("unchecked")
	public void aboutActivity(Object obj) {
		if(obj instanceof ArrayList<?>){
			Intent intent = new Intent(this, AboutActivity.class);
			intent.putStringArrayListExtra("About", (ArrayList<String>) obj);
			startActivity(intent);
		}
	}
}