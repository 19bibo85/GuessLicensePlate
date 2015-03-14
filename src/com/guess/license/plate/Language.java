package com.guess.license.plate;

import com.actionbarsherlock.app.SherlockPreferenceActivity;

import android.content.Context;
import android.preference.DialogPreference;
import android.preference.Preference;

public class Language {

	public static void SetLanguage(com.guess.license.plate.Activity language, Context context) {
		switch (language) {
		case SPLASH:
			SetSplashLanguage(context);
			break;
		case MAIN:
			SetMainLanguage(context);
			break;
		case START:
			SetStartLanguage(context);
			break;
		case BEST_SCORE:
			SetBestScoreLanguage(context);
			break;
		case SCORE:
			SetScoreLanguage(context);
			break;
		case STATS:
			SetStatsLanguage(context);
			break;
		case STATS_LIST:
			SetStatsListLanguage(context);
			break;
		case ABOUT:
			SetAboutLanguage(context);
			break;
		default:
			break;

		}
	}
	
	// Setting the language localised for each view in SpalshAcitivity
	private static void SetSplashLanguage(Context context) {
		final int SIZE = 1;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.SPLASH, context, language, SIZE);
			if(strArr != null)
			{
				SplashActivity.Loading.setText(strArr[0]+"...");
			}
		}
	}

	// Setting the language localised for each view in MainAcitivity
	private static void SetMainLanguage(Context context) {
		final int SIZE = 4;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.MAIN, context, language, SIZE);
			if(strArr != null)
			{
				MainActivity.Start.setText(strArr[0]);
				MainActivity.BestScore.setText(strArr[1]);
				MainActivity.List.setText(strArr[2]);
				MainActivity.Setting.setText(strArr[3]);
			}
		}
	}
		
	// Setting the language localised for each view in StartAcitivity
	private static void SetStartLanguage(Context context) {
		final int SIZE = 7;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.START, context, language, SIZE);
			if(strArr != null)
			{
				StartActivity.Easy.setText(strArr[0]);
				StartActivity.Medium.setText(strArr[1]);
				StartActivity.Hard.setText(strArr[2]);
				StartActivity.AllPlates.setText(strArr[3]);
				StartActivity.NoFault.setText(strArr[4]);
				StartActivity.TimeLimit.setText(strArr[5]);
				StartActivity.NoTimeLimit.setText(strArr[6]);
			}
		}
	}

	// Setting the language localised for each view in BestScoreAcitivity
	private static void SetBestScoreLanguage(Context context) {
		final int SIZE = 8;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.BEST_SCORE, context, language, SIZE);
			if(strArr != null)
			{
				BestScoreActivity.BestScore.setText(strArr[0]);
				BestScoreActivity.Easy.setText(strArr[1]);
				BestScoreActivity.Medium.setText(strArr[2]);
				BestScoreActivity.Hard.setText(strArr[3]);
				BestScoreActivity.AllPlates.setText(strArr[4]);
				BestScoreActivity.NoFault.setText(strArr[5]);
				//BestScoreActivity.Back.setText(strArr[6]);
				BestScoreActivity.Stats.setText(strArr[7]);
			}
		}
	}
	
	public static void SetSettingLanguage(Context context, SherlockPreferenceActivity preference) {
		final int SIZE = 6;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {			
			String language = prefs[0];			
			// Getting all titles for the language selected
			String[] strTitle = GetStringArray(com.guess.license.plate.Activity.SETTING_TITLE, context, language, SIZE);
			// Getting all the summaries for the language selected
			String[] strSummary = GetStringArray(com.guess.license.plate.Activity.SETTING_SUMMARY, context, language, SIZE);
			// Check there are title and summaries and their lenght is equal to 6
			if(strTitle != null && strTitle.length == SIZE && strSummary != null && strSummary.length == SIZE){							
				SetTitleAndSummary(preference, strTitle, strSummary, Preferences.LANGUAGE, context, language);
				SetTitleAndSummary(preference, strTitle, strSummary, Preferences.THEME, context, language);
				SetTitleAndSummary(preference, strTitle, strSummary, Preferences.RANGE, context, language);
				SetTitleAndSummary(preference, strTitle, strSummary, Preferences.UPDATE, context, language);
				SetTitleAndSummary(preference, strTitle, strSummary, Preferences.SOUND, context, language);
				SetTitleAndSummary(preference, strTitle, strSummary, Preferences.CLEAR, context, language);
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void SetTitleAndSummary(SherlockPreferenceActivity preference, String[] strTitle, String[] strSummary, Preferences type, Context context, String language){
		final int SIZE = 3;
		Preference connectionPref = null;
		String sumSel = null;
		String selPref = null;
		
		switch(type)
		{
			case LANGUAGE:
				connectionPref = preference.findPreference(type.toString());
				connectionPref.setTitle(strTitle[0]);
				selPref = SharedPreference.GetSharedPreferenceString(context)[0];
				sumSel = GetPreferenceLocalized(type, context, selPref, language);				
				connectionPref.setSummary(strSummary[0].concat(sumSel == null ? selPref : sumSel));
				break;
			case THEME:
				connectionPref = preference.findPreference(type.toString());
				connectionPref.setTitle(strTitle[1]);
				selPref = SharedPreference.GetSharedPreferenceString(context)[1];
				sumSel = GetPreferenceLocalized(type, context, selPref, language);
				connectionPref.setSummary(strSummary[1].concat(sumSel == null ? selPref : sumSel));
				break;
			case RANGE:
				connectionPref = preference.findPreference(type.toString());
				connectionPref.setTitle(strTitle[2]);
				selPref = SharedPreference.GetSharedPreferenceString(context)[2];
				sumSel = GetPreferenceLocalized(type, context, selPref, language);
				connectionPref.setSummary(strSummary[2].concat(sumSel == null ? selPref : sumSel));
				break;
			case UPDATE:
				connectionPref = preference.findPreference(type.toString());
				connectionPref.setTitle(strTitle[3]);
				selPref = SharedPreference.GetSharedPreferenceBool(context)[0]+"";
				sumSel = GetPreferenceLocalized(type, context, selPref, language);
				connectionPref.setSummary(strSummary[3].concat(sumSel == null ? selPref : sumSel));
				break;
			case SOUND:
				connectionPref = preference.findPreference(type.toString());
				connectionPref.setTitle(strTitle[4]);
				selPref = SharedPreference.GetSharedPreferenceBool(context)[1]+"";
				sumSel = GetPreferenceLocalized(type, context, selPref, language);
				connectionPref.setSummary(strSummary[4].concat(sumSel == null ? selPref : sumSel));
				break;
			case CLEAR:
				DialogPreference dialogPref = (DialogPreference) preference.findPreference(type.toString());
				dialogPref.setTitle(strTitle[5]);
				dialogPref.setSummary(strSummary[5]);
				String[] strClear = GetStringArray(com.guess.license.plate.Activity.SETTING_CLEAR_MESSAGE, context, language, SIZE);				
				if(strClear != null){	
					dialogPref.setDialogMessage(strClear[0]);
					dialogPref.setPositiveButtonText(strClear[1]);
					dialogPref.setNegativeButtonText(strClear[2]);
				}
				break;
		}		
	}
	
	private static String GetPreferenceLocalized(Preferences preference, Context context, String sumSel, String language){
		String localized = null;
		String[] vals = null;
		String[] disp = null;
		int pos = -1;
		
		switch(preference)
		{
			case LANGUAGE:
				vals = context.getResources().getStringArray(R.array.setting_language_val);
				disp = context.getResources().getStringArray(R.array.setting_language);
				pos = FindPosition(vals, sumSel);
				break;
			case THEME:
				vals = context.getResources().getStringArray(R.array.setting_theme_val);				
				disp = context.getResources().getStringArray(Utility.GetResId("setting_theme_".concat(language), context, R.array.class));
				pos = FindPosition(vals, sumSel);
				break;
			case RANGE:
				vals = context.getResources().getStringArray(R.array.setting_range_val);				
				disp = context.getResources().getStringArray(Utility.GetResId("setting_range_".concat(language), context, R.array.class));
				pos = FindPosition(vals, sumSel);
				break;
			case UPDATE:
				vals = context.getResources().getStringArray(R.array.setting_update_val);				
				disp = context.getResources().getStringArray(Utility.GetResId("setting_update_".concat(language), context, R.array.class));
				pos = FindPosition(vals, sumSel);
				break;
			case SOUND:
				vals = context.getResources().getStringArray(R.array.setting_sound_val);				
				disp = context.getResources().getStringArray(Utility.GetResId("setting_sound_".concat(language), context, R.array.class));
				pos = FindPosition(vals, sumSel);
				break;
			default:
				break;	
		}
		
		if(pos != -1 && disp != null && vals != null && disp.length == vals.length)
			localized =  disp[pos];
		
		return localized;
	}
	
	public static String GetStatsLocalized(Context context, int statsType, String language, String value){
		String localized = null;
		String[] vals = null;
		String[] disp = null;
		int pos = -1;
		
		switch(statsType){
			case 1:
				vals = context.getResources().getStringArray(R.array.setting_language_val);
				disp = context.getResources().getStringArray(R.array.setting_language);
				pos = FindPosition(vals, value);
				break;
			case 2:
				vals = context.getResources().getStringArray(R.array.setting_theme_val);
				disp = context.getResources().getStringArray(Utility.GetResId("setting_theme_".concat(language), context, R.array.class));
				pos = FindPosition(vals, value);
				break;
			case 3:
				vals = context.getResources().getStringArray(R.array.setting_range_val);
				disp = context.getResources().getStringArray(Utility.GetResId("setting_range_".concat(language), context, R.array.class));
				pos = FindPosition(vals, value);
				break;
			default:
				break;
		}
		
		if(pos != -1 && disp != null && vals != null && disp.length == vals.length)
			localized =  disp[pos];
		
		return localized;
	}
	
	private static int FindPosition(String[] array, String value){
		boolean isEqual = false;
		int result = -1;
		for(int i=0; i < array.length && !isEqual; i++){
			if(array[i].equals(value)){
				isEqual = true;
				result = i;
			}
		}		
		return result;
	}

	// Setting the language localised for each view in ScoreAcitivity
	private static void SetScoreLanguage(Context context) {
		final int SIZE = 7;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.SCORE, context, language, SIZE);
			if(strArr != null)
			{
				ScoreActivity.GameOver.setText(strArr[0]);
				ScoreActivity.CorrectAnswer.setText(strArr[1]);
				ScoreActivity.WrongAnswer.setText(strArr[2]);
				ScoreActivity.Point.setText(strArr[3]);
				ScoreActivity.Rate.setText(strArr[4]);
				ScoreActivity.Back.setText(strArr[5]);
				ScoreActivity.Review.setText(strArr[6]);
			}
		}
	}

	// Setting the language localised for each view in StatsActivity
	private static void SetStatsLanguage(Context context) {
		final int SIZE = 19;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.STATS, context, language, SIZE);
			if(strArr != null)
			{
				StatisticsActivity.Stats.setText(strArr[0]);
				StatisticsActivity.LabAllPlates.setText(strArr[1]);
				StatisticsActivity.LabEuPlates.setText(strArr[2]);
				StatisticsActivity.LabROTWPlates.setText(strArr[3]);
				StatisticsActivity.LabCorrAns.setText(strArr[4]);
				StatisticsActivity.LabWrgAns.setText(strArr[5]);
				StatisticsActivity.LabMostPlate.setText(strArr[6]);				
				StatisticsActivity.LabLeastPlate.setText(strArr[7]);
				StatisticsActivity.LabMostEuPlate.setText(strArr[8]);
				StatisticsActivity.LabLeastEuPlate.setText(strArr[9]);
				StatisticsActivity.LabMostROTWPlate.setText(strArr[10]);
				StatisticsActivity.LabLeastROTWPlate.setText(strArr[11]);
				StatisticsActivity.LabMostLang.setText(strArr[12]);
				StatisticsActivity.LabLeastLang.setText(strArr[13]);
				StatisticsActivity.LabMostTheme.setText(strArr[14]);
				StatisticsActivity.LabLeastTheme.setText(strArr[15]);
				StatisticsActivity.LabMostRange.setText(strArr[16]);
				StatisticsActivity.LabLeastRange.setText(strArr[17]);
				StatisticsActivity.Back.setText(strArr[18]);
			}
		}
	}

	// Setting the language localised for each view in StatsLanguageActivity
	private static void SetStatsListLanguage(Context context) {
		final int SIZE = 3;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.STATS_LIST, context, language, SIZE);
			if(strArr != null)
			{
				MainStatisticsActivity.GameGeneralName =  strArr[0];
				MainStatisticsActivity.GameTimeName = strArr[1];
				MainStatisticsActivity.GameNoTimeName = strArr[2];
			}
		}
	}
	
	public static void SetAboutLanguage(Context context){
		final int SIZE = 5;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.ABOUT, context, language, SIZE);
			if(strArr != null){
				AboutActivity.LabVersion.setText(strArr[0]);
				//AboutActivity.LabBuild.setText(strArr[1]);
				AboutActivity.LabDeveloper.setText(strArr[2]);
				AboutActivity.LabAcknowledge.setText(strArr[3]);
				AboutActivity.Back.setText(strArr[4]);
			}
		}
	}

	public static String GetServerErrorLanguage(ServerError serverError, Context context) {
		final int SIZE = 8;
		String result = null;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			String[] strArr = GetStringArray(com.guess.license.plate.Activity.SPLASH_ERROR_MESSAGE, context, language, SIZE);
			if(strArr != null)
			{
				switch(serverError){
					case NO_ERROR:
						result = strArr[0];
						break;
					case GENERAL:
						result = strArr[1];
						break;
					case CONNECTION:
						result = strArr[2];
						break;
					case PROTOCOL:
						result = strArr[3];
						break;
					case STREAM:
						result = strArr[4];
						break;
					case OBJECT_NOT_FOUND:
						result = strArr[5];
						break;
					case NEW_BUILD:
						result = strArr[6];
						break;
					case OLD_BUILD:
						result = strArr[7];
						break;
					default:
						break;
				}
			}
		}
		return result;
	}
	
	public static String[] GetSplashAlertLanguage(Context context) {
		final int SIZE = 3;
		String[] result = null;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			result = GetStringArray(com.guess.license.plate.Activity.SPLASH_ALERT_MESSAGE, context, language, SIZE);
		}
		
		return result;
	}
	
	// Setting the language localised for each view in MainAcitivity
	public static String[] SetMainListLanguage(Context context) {
		String[] strArr = null;
		final int SIZE = 6;
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {
			String language = prefs[0];
			strArr = GetStringArray(com.guess.license.plate.Activity.MAIN_LIST, context, language, SIZE);
		}
		return strArr;
	}
	
	// This method returns an array with all the string for the activity and language selected
	public static String[] GetStringArray(com.guess.license.plate.Activity activity, Context context, String language, int size){
		String arrName = null;
		
		switch(activity){
			case SPLASH:
				arrName = "splash_".concat(language);
				break;
			case SPLASH_ERROR_MESSAGE:				
				arrName = "server_error_".concat(language);
				break;
			case SPLASH_ALERT_MESSAGE:				
				arrName = "splash_alert_message_".concat(language);
				break;
			case MAIN:				
				arrName = "main_".concat(language);
				break;
			case START:				
				arrName = "start_".concat(language);
				break;
			case BEST_SCORE:
				arrName = "best_score_".concat(language);
				break;
			case MAIN_LIST:
				arrName = "main_list_".concat(language);
				break;
			case SETTING_TITLE:
				arrName = "setting_title_".concat(language);
				break;
			case SETTING_SUMMARY:
				arrName = "setting_summary_".concat(language);
				break;
			case SETTING_CLEAR_MESSAGE:
				arrName = "clear_message_".concat(language);
				break;
			case SCORE:
				arrName = "score_".concat(language);				
				break;
			case STATS_LIST:				
				arrName = "main_statistics_".concat(language);
				break;
			case STATS:
				arrName = "statistics_".concat(language);
				break;
			case ABOUT:
				arrName = "about_".concat(language);
			default:
				break;
		}
		
		String[] strArray = null;
		
		if(size != 0 && arrName != null){
			strArray = context.getResources().getStringArray(Utility.GetResId(arrName, context, R.array.class));
			strArray = strArray.length != size ? null : strArray;
		}
		
		return strArray;
	}
}