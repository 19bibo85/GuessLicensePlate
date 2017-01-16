package com.guess.license.plate.Repository;

import com.guess.license.plate.release.R;
import com.guess.license.plate.Activity.AboutActivity;
import com.guess.license.plate.Activity.BestScoreActivity;
import com.guess.license.plate.Activity.GameActivity;
import com.guess.license.plate.Activity.MainActivity;
import com.guess.license.plate.Activity.ScoreActivity;
import com.guess.license.plate.Activity.StartActivity;
import com.guess.license.plate.Activity.StatisticsActivity;

import android.content.Context;

public class Theme {
	
	private static int SIZE = 2;
	
	public static void SetTheme(Component activity, Context context)
	{
		switch (activity) {
		case MAIN:
			SetMainTheme(context);
			break;
		case START:
			SetStartTheme(context);
			break;
		case BEST_SCORE:
			SetBestScoreTheme(context);
			break;
		case SETTING:
			SetSettingTheme(context);
			break;
		case SCORE:
			SetScoreTheme(context);
			break;
		case STATS:
			SetStatsTheme(context);
			break;
		case GAME:
			SetGameLayoutTheme(context);
			break;
		case ABOUT:
			SetAboutTheme(context);
			break;
		default:
			break;

		}		
	}
	
	private static int[] SetTheme(Context context){
		int[] appThemeColor = new int[]{0,0};
		
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String theme = prefs[1];			
			
			if(theme.equals("Theme 1")){
				appThemeColor[0] = R.drawable.background_001;
				appThemeColor[1] = R.drawable.button_blue;			
			} else if(theme.equals("Theme 2")){
				appThemeColor[0] = R.drawable.background_002;
				appThemeColor[1] = R.drawable.button_black;
			} else if(theme.equals("Theme 3")){
				appThemeColor[0] = R.drawable.background_003;
				appThemeColor[1] = R.drawable.button_grey;
			} else if(theme.equals("Theme 4")){
				appThemeColor[0] = R.drawable.background_004;
				appThemeColor[1] = R.drawable.button_orange;
			} else if(theme.equals("Theme 5")){
				appThemeColor[0] = R.drawable.background_005;
				appThemeColor[1] = R.drawable.button_purple;
			}
		}
		
		return appThemeColor;
	}
	
	// Setting the theme colour for each button and background in MainActivity
	private static void SetMainTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){
			MainActivity.ScrollView.setBackgroundResource(appThemeColor[0]);
			MainActivity.Start.setBackgroundResource(appThemeColor[1]);
			MainActivity.BestScore.setBackgroundResource(appThemeColor[1]);
			MainActivity.List.setBackgroundResource(appThemeColor[1]);
			MainActivity.Setting.setBackgroundResource(appThemeColor[1]);
		}
	}
	
	// Setting the theme colour for each button and background in StartActivity
	private static void SetStartTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){			
			StartActivity.ScrollView.setBackgroundResource(appThemeColor[0]);
			StartActivity.Easy.setBackgroundResource(appThemeColor[1]);
			StartActivity.Medium.setBackgroundResource(appThemeColor[1]);
			StartActivity.Hard.setBackgroundResource(appThemeColor[1]);
			StartActivity.AllPlates.setBackgroundResource(appThemeColor[1]);
			StartActivity.NoFault.setBackgroundResource(appThemeColor[1]);
		}
	}
	
	// Setting the theme colour for each button and background in BestScoreActivity
	private static void SetBestScoreTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){			
			BestScoreActivity.ScrollView.setBackgroundResource(appThemeColor[0]);
			//BestScoreActivity.Back.setBackgroundResource(appThemeColor[1]);
			BestScoreActivity.Stats.setBackgroundResource(appThemeColor[1]);
		}
	}
	
	// Setting the theme colour for each button and background in SettingActivity
	private static void SetSettingTheme(Context context){}
	
	// Setting the theme colour for each button and background in ScoreActivity
	private static void SetScoreTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){			
			ScoreActivity.ScrollView.setBackgroundResource(appThemeColor[0]);
			ScoreActivity.Back.setBackgroundResource(appThemeColor[1]);
			ScoreActivity.Review.setBackgroundResource(appThemeColor[1]);
		}
	}
	
	// Setting the theme colour for each button and background in BestScoreActivity
	private static void SetStatsTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){
			StatisticsActivity.Back.setBackgroundResource(appThemeColor[1]);
		}
	}

	// Setting the theme colour for each button and background in GameLayout
	private static void SetGameLayoutTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){			
			GameActivity.ScrollView.setBackgroundResource(appThemeColor[0]);
			GameActivity.Button1.setBackgroundResource(appThemeColor[1]);
			GameActivity.Button2.setBackgroundResource(appThemeColor[1]);
			GameActivity.Button3.setBackgroundResource(appThemeColor[1]);
			GameActivity.Button4.setBackgroundResource(appThemeColor[1]);
		}
	}
	
	private static void SetAboutTheme(Context context){
		int[] appThemeColor = SetTheme(context);
		if(appThemeColor.length == SIZE){
			AboutActivity.Back.setBackgroundResource(appThemeColor[1]);
		}
	}
}
