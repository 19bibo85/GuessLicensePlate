package com.guess.license.plate;

import java.util.Locale;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreference {
	public static final int STRING_SIZE = 3;
	public static final int BOOL_SIZE = 2;
		
	public static String[] GetSharedPreferenceString(Context context){
    	String[] prefs = new String[STRING_SIZE];
    	String[] defaultVals = {Locale.getDefault().getLanguage(), "Theme 1", "Europe"};
    	
    	SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (context);
				
    	prefs[0] = sharedPref.getString(Preferences.LANGUAGE.toString(), defaultVals[0]);
    	prefs[1] = sharedPref.getString(Preferences.THEME.toString(), defaultVals[1]);
    	prefs[2] = sharedPref.getString(Preferences.RANGE.toString(), defaultVals[2]); 	
    	
    	return prefs;
    }
	
	public static boolean[] GetSharedPreferenceBool(Context context){
		boolean[] prefs = new boolean[BOOL_SIZE];
		boolean[] defaultVals = {true, false};
		
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (context);
		prefs[0] = sharedPref.getBoolean(Preferences.UPDATE.toString(), defaultVals[0]);
		prefs[1] = sharedPref.getBoolean(Preferences.SOUND.toString(), defaultVals[1]);		
		
		return prefs;
	}
}