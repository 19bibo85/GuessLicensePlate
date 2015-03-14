package com.guess.license.plate;

import com.actionbarsherlock.app.SherlockActivity;

import android.content.Intent;
import android.os.Bundle;

public class SettingActivity extends SherlockActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this.getBaseContext());
		
		// Display the fragment as the main content.
        //getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingFragment()).commit();
        settingFragment();
	}
	
	private void settingFragment() {
		Intent intent = new Intent(this, SettingFragment.class);
		startActivity(intent);
		overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
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