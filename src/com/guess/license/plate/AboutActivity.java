package com.guess.license.plate;

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

public class AboutActivity extends SherlockActivity{
	public static ScrollView ScrollView;
	public static ImageView Logo;
	public static TextView LabVersion;
	public static TextView LabBuild;
	public static TextView LabDeveloper;
	public static TextView LabAcknowledge;
	public static TextView Version;
	//public static TextView Build;
	public static TextView Developer;
	public static TextView Acknowledge;
	public static Button Back;
	
	final String VERSION_DEFAULT = "0";
	//final String NUMBER_DEFAULT = "0";
	final String DEVELOPER_DEFAULT = "Alberto Tosi Brandi";	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {		
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
		//LabBuild = (TextView) findViewById(R.id.lab_build);
		//LabBuild.setTypeface(Utility.GetFont(this));
		LabDeveloper = (TextView) findViewById(R.id.lab_developer);
		LabDeveloper.setTypeface(Utility.GetFont(this));
		LabAcknowledge = (TextView) findViewById(R.id.lab_acknowledge);
		LabAcknowledge.setTypeface(Utility.GetFont(this));
		
		Version = (TextView) findViewById(R.id.version);	
		Version.setTypeface(Utility.GetFont(this));
		//Build = (TextView) findViewById(R.id.build);
		//Build.setTypeface(Utility.GetFont(this));
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
		
		Title.SetTitle(com.guess.license.plate.Activity.ABOUT, actionBar, this.getBaseContext()); 
		Language.SetLanguage(com.guess.license.plate.Activity.ABOUT, this.getBaseContext());
		Theme.SetTheme(com.guess.license.plate.Activity.ABOUT, this.getBaseContext());
	}
	
	@Override
	public void onResume(){
		super.onResume();
		// Retrieving data and set the text for the views
		retrieveDataAndSetText();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.ABOUT);
	}
	
	@Override
	protected void onPause(){
		super.onPause();	
		// Save the preference
		Log.e("ABOUT", "Editing Preferences");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Editor edit = sharedPref.edit();
		edit.putString("Version", Version.getText().toString());
		//edit.putString("Build", Build.getText().toString());
		edit.putString("Developer", Developer.getText().toString());
		edit.commit();
		Log.e("ABOUT", "Preferences finished to edit");
	}
	
	private void retrieveDataAndSetText(){
		Log.e("ABOUT", "Retrieving information got from Preferences");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences (getBaseContext());
		Version.setText(sharedPref.getString("Version", VERSION_DEFAULT));
		//Build.setText(sharedPref.getString("Build", NUMBER_DEFAULT));
		Developer.setText(sharedPref.getString("Developer", DEVELOPER_DEFAULT));		
		Log.e("ABOUT", "Views set with information got from Preferences");
		
		if(getIntent() != null){	
			ArrayList<String> obj = getIntent().getStringArrayListExtra("About");		
			final int NUM_INFO_DISPLAYED = 3;
			if(obj != null && obj.size() == NUM_INFO_DISPLAYED){
				Log.e("ABOUT", "Retrieving information got from DB");
				Version.setText(obj.get(0)+ "." +obj.get(1));
				//Build.setText(obj.get(1));
				Developer.setText(obj.get(2));		
				Log.e("ABOUT", "Views set with information got from DB");
			}
		}
	}

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
	
	private void mainActivity() {
		//Intent intent = new Intent(this, MainActivity.class);
		//startActivity(intent);
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