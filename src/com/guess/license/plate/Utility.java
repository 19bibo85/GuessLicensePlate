package com.guess.license.plate;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ImageView;

public class Utility {

	// Return the plate list with condition selected
	public static String GetPlates(Context context, String where){
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);		
		String query = null;
		if(prefs.length > 0)
		{		
			query = "SELECT Name, Difficulty, "+ prefs[0] + ", Country, Plate.ImgID, Continent"
					+ " FROM Plate INNER JOIN Language ON Plate.ImgID = Language.ImgID"
					+ where;		
		}
		return query;
	}
	
	// Set the action bar features
	public static void SetActionBar(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		if(actionBar != null){
			actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_blue));
			actionBar.setDisplayShowTitleEnabled(false);
			actionBar.setDisplayUseLogoEnabled(true);
			actionBar.setLogo(context.getResources().getDrawable(R.drawable.logo));
		}
	}
	
	public static void SetActionBar(SherlockActivity activity, Context context){
		if(activity != null){
			com.actionbarsherlock.app.ActionBar actionBar = activity.getSupportActionBar();
			actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_blue));
			actionBar.setDisplayShowTitleEnabled(false);
			actionBar.setDisplayUseLogoEnabled(true);
			actionBar.setLogo(context.getResources().getDrawable(R.drawable.logo));
		}
	}
	
	// Note this method gets the relative integer value from the imageID of the plate selected
	public static int GetResId(String variableName, Context context, Class<?> c) {
	    try {
	    	Field idField = c.getDeclaredField(variableName);	        
	        int i = idField.getInt(idField);
	        return i;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return -1;
	    }
	}
	
	// Fill an array with default values
	public static String[] FillDefaultVals(com.guess.license.plate.Activity activity, String[] info, String defaultVal1, String defaultVal2){
		if(info != null && info.length > 0){
			switch(activity)
			{
				case STATS:
					for(int i=0; i < info.length; i++){
						info[i] = i >= 0 && i <= 4 ? defaultVal1 : defaultVal2;
					}
					break;
				case BEST_SCORE:
					for(int i=0; i < info.length; i++){
						if(i%2 == 0)
							info[i] = defaultVal1;
						else
							info[i] = defaultVal2;
					}
					break;
				default:
					break;				
			}
				
		}		
		return info;
	}
	
	// Copy array values to list
	public static ArrayList<String> CopyArrayToList(String[] info){
		ArrayList<String> obj = new ArrayList<String>();
		if(info != null && info.length > 0){
			for(int i=0; i < info.length; i++){
				obj.add(info[i]);
			}
		}
		return obj;
	}
	
	// Get font from resource
	public static Typeface GetFont(SherlockActivity activity){
		final String FONT_PATH = "font/handwritten.ttf";
		final AssetManager assets = activity.getResources().getAssets();
		final Typeface font = Typeface.createFromAsset(assets, FONT_PATH);
		return font;
	}

	private static MediaPlayer answer = null;
	
	// Set the audio based on the event
	public static void SetAudio(Context context, boolean isActive, int audioEvent) {
		
		if (answer != null && isActive) {
			int audioID = -1;
			switch (audioEvent) {
			case 0:
				audioID = R.raw.shwink;
				break;
			case 1:
				audioID = R.raw.applause;
				break;
			}

			if (audioID != -1) {
				try {
					answer.reset();
					AssetFileDescriptor afd = context.getResources().openRawResourceFd(audioID);
					if (afd == null) return;
					answer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
					afd.close();
					answer.prepare();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (answer.isPlaying())
					answer.seekTo(0);
				else
					answer.start();
			}
		}
	}
	
	private static void CreateAudio(Context context){
		if(answer == null)
			answer = MediaPlayer.create(context, R.raw.shwink);
	}
	
	public static void InitializeAudio(Context context)
	{
		CreateAudio(context);
		GameUtility.CreateAudio(context);
	}
	
	// Return the database helper
	public static NewDatabaseHelper GetDataBaseHelper(Context context){
		NewDatabaseHelper databaseHelper = SplashActivity.databaseHelper;
		if(databaseHelper == null) 
			databaseHelper = new NewDatabaseHelper(context);
		return databaseHelper;
	}

	// Set the transition
	public static void SetTransition(Context context, SherlockActivity act, com.guess.license.plate.Activity actDest){
		SetAudio(context, SharedPreference.GetSharedPreferenceBool(context)[1], 0);
		Intent intent = act.getIntent();
		
		if(intent != null){			
			if(intent.getExtras() != null)
			{
				boolean isEntering;
				ArrayList<String> isEnteringObj;
				String isEnteringStr;
				
				switch(actDest){
					case SPLASH:
						break;
					case MAIN:
						Object isUpdating = intent.getExtras().get("NoTransition");						
						if(isUpdating == null || (isUpdating != null && !(Boolean)isUpdating))
						{
							isEntering = (Boolean) intent.getExtras().get("Transition");
							if(isEntering)
								act.overridePendingTransition(R.layout.fadein,R.layout.fadeout);
							else
								act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						}
						// Clean the intent
						CleanIntent(intent);
						return;					
					case START:
						isEntering = (Boolean) intent.getExtras().get("Transition");
						if(isEntering) 
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case BEST_SCORE:
						isEnteringObj = intent.getStringArrayListExtra("BestScore");
						if(isEnteringObj != null)
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case SETTING:
						break;
					case SETTING_TITLE:
						break;
					case SETTING_SUMMARY:
						break;
					case SETTING_CLEAR_MESSAGE:
						break;
					case SCORE:
						isEnteringObj = intent.getStringArrayListExtra("Score");
						if(isEnteringObj != null)
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case MAIN_LIST:
						isEntering = (Boolean) intent.getExtras().get("Transition");
						if(isEntering) 
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case REVIEW_LIST:
						isEntering = (Boolean) intent.getExtras().get("Transition");
						if(isEntering) 
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case PLATE_LIST:
						isEnteringStr = (String)intent.getExtras().get("Key");
						if(isEnteringStr != null)
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case STATS:
						isEnteringObj = intent.getStringArrayListExtra("MainStatistic");
						if(isEnteringObj != null)
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case STATS_LIST:
						isEntering = (Boolean) intent.getExtras().get("Transition");
						if(isEntering) 
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case GAME:
						isEntering = (Boolean) intent.getExtras().get("Transition");
						if(isEntering) 
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
					case ABOUT:
						isEnteringObj = intent.getStringArrayListExtra("About");
						if(isEnteringObj != null)
							act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
						else
							act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						// Clean the intent
						CleanIntent(intent);
						return;
				default:
					break;
				}					
			}
		}		
		act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
	}
	
	// Set the transaction
	public static void SetTransition(Context context, SherlockPreferenceActivity act, com.guess.license.plate.Activity actDest){
		SetAudio(context, SharedPreference.GetSharedPreferenceBool(context)[1], 0);
		Intent intent = act.getIntent();
		if(intent != null){
			if(intent.getExtras() != null)
			{
				boolean isEntering;
				switch(actDest){				
					case SETTING:
						Object isUpdating = intent.getExtras().get("NoTransition");						
						if(isUpdating == null || (isUpdating != null && !(Boolean)isUpdating))
						{						
							isEntering = (Boolean) intent.getExtras().get("Transition");
							if(isEntering)
								act.overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
							else
								act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
						}
						// Clean the intent
						CleanIntent(intent);
						return;
					default:
						break;	
				}
			}
		}
		act.overridePendingTransition(R.anim.animation_enter_back, R.anim.animation_leave_back);
	}

	private static void CleanIntent(Intent intent){
		// Clean the intent
		intent.putExtra("Transition", false);
		intent.putExtra("NoTransition", false);
		intent.putStringArrayListExtra("Score", null);
		intent.putStringArrayListExtra("BestScore", null);
		intent.putStringArrayListExtra("MainStatistic", null);
		intent.putStringArrayListExtra("Key", null);
		intent.putStringArrayListExtra("About", null);
	}

	// In case the is a tablet layout doubly the size of the image for 600 or triply for 720
	@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
	public static void ScaleSizeForTable(Context ctx, ImageView image){
		float scale = 1.0f;
				
		Configuration config = ctx.getResources().getConfiguration();
		if (config.smallestScreenWidthDp >= 600)
		{		
        	scale = 1.3f;        
        	image.setScaleX(scale);
        	image.setScaleY(scale);
		}
	}
}
