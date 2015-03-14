package com.guess.license.plate;

import java.util.Locale;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.DialogPreference;
import android.util.AttributeSet;

public class OptionDialogPreference extends DialogPreference {
	private int numRowScoDel = -1;
	private int numRowStaDel = -1;
	
	public OptionDialogPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {    	
        super.onDialogClosed(positiveResult);
        this.setPersistent(false);
        
        if(positiveResult){        	
	        // Setting all the default setting values
	        SharedPreferences sharePreference = this.getSharedPreferences();
        	Editor editor = sharePreference.edit();
	        editor.putString(Preferences.LANGUAGE.toString(), Locale.getDefault().getLanguage());
	        editor.putString(Preferences.THEME.toString(), "Theme 1");
	        editor.putString(Preferences.RANGE.toString(), "Europe");
	        editor.putBoolean(Preferences.UPDATE.toString(), true);
	        editor.putBoolean(Preferences.SOUND.toString(), false);
	        editor.commit();
	        	    	
	        NewDatabaseHelper databaseHelper = SplashActivity.databaseHelper;
			if(databaseHelper == null)
			{
				//Log.e("SETTING", "Entrato");
				databaseHelper = new NewDatabaseHelper(this.getContext());
			}
	        
			// Delete Score from DB
			new Score(this).execute(databaseHelper);
			//if(numRowScoDel != -1)
				//Log.e("SCORE", "The number of row deleted are: " + numRowScoDel);
			
			// Delete Stats from DB			
			new StatisticsAsyncTask(this).execute(databaseHelper);
			//if(numRowStaDel != -1)
				//Log.e("STATS", "The number of row deleted are: " + numRowStaDel);
        }
    }
    
    public void setNumRowScoDel(Object del){
    	numRowScoDel = (Integer)del;
    }
    
    public int getNumRowScoDel(){
    	return numRowScoDel;
    }
    
    public void setNumRowStaDel(Object del){
    	numRowStaDel = (Integer)del;
    }
    
    public int getNumRowStaDel(){
    	return numRowStaDel;
    }
}
