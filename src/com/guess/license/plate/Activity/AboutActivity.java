package com.guess.license.plate.Activity;

import java.util.ArrayList;
import java.util.Locale;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Logs;
import com.guess.license.plate.Repository.SharedPreference;
import com.guess.license.plate.Repository.Theme;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;


/**
 * @author Alberto Tosi Brandi
 * 
 * This class handle the About activity
 *
 */
public class AboutActivity extends SherlockActivity{
	public static ScrollView ScrollView;
	public static ImageView Logo;
	public static TextView LabVersion;
	public static TextView LabBuild;
	public static TextView LabDeveloper;
	public static TextView LabAcknowledge;
	public static TextView Version;
	public static TextView Developer;
	public static TextView Acknowledge;
	public static Button Back;
	
	final String VERSION_DEFAULT = "0";
	final String DEVELOPER_DEFAULT = "Alberto Tosi Brandi";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {		
		try{
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.about);
		
		com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		Utility.SetActionBar(actionBar, this.getBaseContext());
		
		ScrollView = (ScrollView) findViewById(R.id.scroll_view);
		
		Logo = (ImageView) findViewById(R.id.logo);
		Utility.ScaleSizeForTable(this.getBaseContext(), Logo);
					
		LabVersion = (TextView) findViewById(R.id.lab_version);
		LabVersion.setTypeface(Utility.GetFont(this));
		LabDeveloper = (TextView) findViewById(R.id.lab_developer);
		LabDeveloper.setTypeface(Utility.GetFont(this));
		LabAcknowledge = (TextView) findViewById(R.id.lab_acknowledge);
		LabAcknowledge.setTypeface(Utility.GetFont(this));
		
		Version = (TextView) findViewById(R.id.version);	
		Version.setTypeface(Utility.GetFont(this));
		Developer = (TextView) findViewById(R.id.developer);
		Developer.setTypeface(Utility.GetFont(this));
		Acknowledge = (TextView) findViewById(R.id.acknowledge);
		Acknowledge.setTypeface(Utility.GetFont(this));
		
		// Get the acknowledge
		String acknowledge = acknowledgeLocalized(this.getBaseContext());
		Acknowledge.setText(acknowledge);
		
		Back = (Button) findViewById(R.id.back);
		Back.setTypeface(Utility.GetFont(this));
		Back.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				mainActivity();
			}
		});	
		
		// Localize title, language and theme
		Title.SetTitle(Component.ABOUT, actionBar, this.getBaseContext()); 
		Language.SetLanguage(Component.ABOUT, this.getBaseContext());
		Theme.SetTheme(Component.ABOUT, this.getBaseContext());
		
		} catch (Exception e) {
			Log.e(Logs.ABOUT, e.getMessage());
		}
	}
	
	
	@Override	
	public void onResume(){
		super.onResume();
		// Retrieving data and set the text for the views
		retrieveDataAndSetText();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.ABOUT);
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		// Save preference
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Editor edit = sharedPref.edit();
		edit.putString("Version", Version.getText().toString());
		edit.putString("Developer", Developer.getText().toString());
		edit.commit();
	}
	
	
	/**
	 * Retrieve preference saved 
	 */
	private void retrieveDataAndSetText(){
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Version.setText(sharedPref.getString("Version", VERSION_DEFAULT));
		Developer.setText(sharedPref.getString("Developer", DEVELOPER_DEFAULT));
		
		if(getIntent() != null){	
			ArrayList<String> obj = getIntent().getStringArrayListExtra("About");		
			final int NUM_INFO_DISPLAYED = 3;
			if(obj != null && obj.size() == NUM_INFO_DISPLAYED){
				Version.setText(obj.get(0)+ "." +obj.get(1));
				Developer.setText(obj.get(2));		
			}
		}
	}

	
	/**
	 * 
	 * Localize acknowledgement
	 * 
	 * @param context Context
	 * @return localized acknowledgement
	 */
	private String acknowledgeLocalized(Context context){
		String result = null;
		if(context != null){
			String[] pref = SharedPreference.GetSharedPreferenceString(context);
			String lang = pref.length == SharedPreference.STRING_SIZE ? pref[0] : Locale.getDefault().getLanguage();
			String xmlStr = "acknowledgements_".concat(lang);
			result = context.getResources().getString(Utility.GetResId(xmlStr, context, R.string.class));		
		}
		return result;
	}	
	
	
	/**
	 * Destroy main activity
	 */
	private void mainActivity() {
		finish();
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