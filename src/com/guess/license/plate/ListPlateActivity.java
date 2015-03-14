package com.guess.license.plate;

import com.actionbarsherlock.app.SherlockActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

public class ListPlateActivity extends SherlockActivity {

    public void onCreate(Bundle savedInstanceState) {
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
        
        // Copy the list of the plate from the db that respect the condition above
        plateList = GameUtility.CopyDbToList(plateList, this.getBaseContext(), where);
        
        //Log.e("LIST", plateList.toString());
        
        // Getting the view an setting the adapter on it
        final ListView plateListView = (ListView) findViewById(R.id.PlateListView);
        plateListView.setAdapter(new ListPlateAdapter(this, this.getBaseContext(), plateList, R.layout.list_custom));
        
        // Set the title style
        Title.SetTitle(com.guess.license.plate.Activity.PLATE_LIST, actionBar, this.getBaseContext());
   }
    
    @Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.PLATE_LIST);
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