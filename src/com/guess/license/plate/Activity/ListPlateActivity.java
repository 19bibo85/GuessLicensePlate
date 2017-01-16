package com.guess.license.plate.Activity;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Adapter.ListPlateAdapter;
import com.guess.license.plate.Model.Plate;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.GameUtility;
import com.guess.license.plate.Repository.Logs;
import com.guess.license.plate.Repository.Title;
import com.guess.license.plate.Repository.Utility;

import java.util.ArrayList;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;


/**
 * @author Alberto Tosi Brandi
 * 
 * This class handle the plate list
 *
 */
public class ListPlateActivity extends SherlockActivity {

    public void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.list);

			com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
			actionBar.setDisplayHomeAsUpEnabled(true);
			Utility.SetActionBar(actionBar, this.getBaseContext());

			ArrayList<Plate> plateList = new ArrayList<Plate>();

			// Getting the continent from the value clicked in the previous list
			String continent = getIntent().getExtras().getString("Key");

			// Setting the condition for the where clause
			String where = " WHERE Continent = '" + continent + "'";
			where = where + " AND Plate.Version <> 0 AND Language.Version <> 0 ORDER BY Country, Name ASC";

			// Copy the list of the plate from the db that respect the condition
			// above
			plateList = GameUtility.CopyDbToList(plateList, this.getBaseContext(), where);

			// Getting the view an setting the adapter on it
			final ListView plateListView = (ListView) findViewById(R.id.PlateListView);
			plateListView
					.setAdapter(new ListPlateAdapter(this, this.getBaseContext(), plateList, R.layout.list_custom));

			// Set the title style
			Title.SetTitle(Component.PLATE_LIST, actionBar, this.getBaseContext());

		} catch (Exception e) {
			Log.e(Logs.PLATE_LIST, e.getMessage());
		}
   }
    
    @Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, Component.PLATE_LIST);
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