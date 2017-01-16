package com.guess.license.plate.Repository;

import com.guess.license.plate.release.R;

import android.content.Context;

public class Title {
	
	public static void SetTitle(Component activity, com.actionbarsherlock.app.ActionBar actionBar, Context context)
	{
		switch (activity) {
		case MAIN:
			SetMainTitle(actionBar, context);
			break;
		case START:
			SetStartTitle(actionBar, context);
			break;
		case BEST_SCORE:
			SetBestScoreTitle(actionBar, context);
			break;
		case SETTING:
			SetSettingTitle(actionBar, context);
			break;
		case SCORE:
			SetScoreTitle(actionBar, context);
			break;
		case MAIN_LIST:
			SetMainListTitle(actionBar, context);
			break;
		case PLATE_LIST:
			SetPlateListTitle(actionBar, context);
			break;
		case REVIEW_LIST:
			SetReviewListTitle(actionBar, context);
			break;
		case STATS:
			SetStatsTitle(actionBar, context);
			break;
		case STATS_LIST:
			SetStatsListTitle(actionBar, context);
			break;
		case GAME:
			SetGameLayoutTitle(actionBar, context);
		case ABOUT:
			SetAboutTitle(actionBar, context);
		default:
			break;

		}		
	}
	
	// Setting the theme colour and the localised test for the title bar in MainActivity
	private static void SetMainTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);		
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String theme = prefs[1];
			if(theme.equals("Theme 1")){
				actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_blue));
			} else if(theme.equals("Theme 2")){
				actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_black));
			} else if(theme.equals("Theme 3")){
				actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_grey));
			} else if(theme.equals("Theme 4")){
				actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_orange));					
			} else if(theme.equals("Theme 5")){
				actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_purple));
			}
		}
	}
	
	// Setting the theme colour and the localised test for the title bar in StartActivity
	private static void SetStartTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in BestScoreActivity
	private static void SetBestScoreTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);	
	}
	
	// Setting the theme colour and the localised test for the title bar in SettingActivity
	private static void SetSettingTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in ScoreActivity
	private static void SetScoreTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in MainListActivity
	private static void SetMainListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in ListPlateActivity
	private static void SetPlateListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in ReviewActivity
	private static void SetReviewListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in StatisticsActivity
	private static void SetStatsTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in MainStatisticsActivity
	private static void SetStatsListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	// Setting the theme colour and the localised test for the title bar in GameLayout
	private static void SetGameLayoutTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
	
	private static void SetAboutTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context){
		// Calling the the setting of the main title 
		// since the text doesn't change and the colour is the same
		SetMainTitle(actionBar, context);
	}
}
