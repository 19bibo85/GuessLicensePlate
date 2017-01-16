package com.guess.license.plate.Fragment;

import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Preferences;
import com.guess.license.plate.Repository.SharedPreference;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;

public class SettingFragment extends SherlockPreferenceActivity implements OnSharedPreferenceChangeListener{
	
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Setting the action bar and the template 
		com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		Utility.SetActionBar(actionBar, this.getBaseContext());
				
        addPreferencesFromResource(R.xml.preferences);
		
        // Setting the language and the action bar color
        Language.SetSettingLanguage(this.getBaseContext(), this);
    	Title.SetTitle(Component.SETTING, actionBar, this.getBaseContext());

    	// Based on the language selected setting the list of themes and ranges
		String language = SharedPreference.GetSharedPreferenceString(this.getBaseContext())[0];
		setEntries(language, Preferences.THEME);
		setEntries(language, Preferences.RANGE);
    }
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void onResume() {
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.SETTING);
	    getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
	}

	
	@SuppressWarnings("deprecation")
	@Override
	public void onPause() {
		super.onPause();
	    getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);	    
	}
	
	
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
	
		if (key.equals(Preferences.LANGUAGE.toString())) {
			// In case the language is changed setting the list of themes and ranges 
			String language = sharedPreferences.getString(key, "en");
			setEntries(language, Preferences.THEME);
			setEntries(language, Preferences.RANGE);
			
			// Setting the language of setting main activity
			Language.SetSettingLanguage(this.getBaseContext(), this);
		} else if (key.equals(Preferences.THEME.toString())) {			
        	// Setting the summary for the Theme
        	setSummary(sharedPreferences, Preferences.THEME);
        	restartSettingActivity();        	        	
        } else if (key.equals(Preferences.RANGE.toString())) {
        	// Setting the summary for the Range
        	setSummary(sharedPreferences, Preferences.RANGE);
        } else if (key.equals(Preferences.UPDATE.toString())) {
        	// Setting the summary for Update
        	setSummary(sharedPreferences, Preferences.UPDATE);
        } else if (key.equals(Preferences.SOUND.toString())) {
        	// Setting the summary for Sound
        	setSummary(sharedPreferences, Preferences.SOUND);
        }
    }
	
	
	private void restartSettingActivity(){
		Intent intent = this.getIntent();
		intent.putExtra("NoTransition", true);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        this.startActivity(intent);
	}
	
	
	@SuppressWarnings("deprecation")
	private void setEntries(String language, Preferences name){
		String arrName = null;
		String key = null;
		
		switch(name)
		{
			case THEME:
				arrName = "setting_theme_".concat(language);
				key = "pref_theme";
				break;
			case RANGE:
				arrName = "setting_range_".concat(language);
				key = "pref_range";
				break;
		default:
			break;
		}
		
		if(arrName != null && key != null){
			String[] results = this.getBaseContext().getResources().getStringArray(Utility.GetResId(arrName, this.getBaseContext(), R.array.class));
			ListPreference lpt = (ListPreference)findPreference(key);
			lpt.setEntries(results);
		}
	}

	
	private void setSummary(SharedPreferences sharedPreferences, Preferences key){
		final int SIZE = 6;
		String language = sharedPreferences.getString(Preferences.LANGUAGE.toString(), "en");
		String[] strTitle = Language.GetStringArray(Component.SETTING_TITLE, this.getBaseContext(), language, SIZE);
		String[] strSummary = Language.GetStringArray(Component.SETTING_SUMMARY, this.getBaseContext(), language, SIZE);
		Language.SetTitleAndSummary(this, strTitle, strSummary, key, this.getBaseContext(), language);
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
