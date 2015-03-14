package com.guess.license.plate;

import com.actionbarsherlock.app.SherlockActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

public class ReviewActivity extends SherlockActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
        
        // Action Bar
        com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this.getBaseContext());
        
        ArrayList<Review> reviewList = GameActivity.ReviewList;
        
        final ListView reviewListView = (ListView) findViewById(R.id.ReviewListView);
        reviewListView.setAdapter(new ReviewAdapter(this, this.getBaseContext(), reviewList));
        
		Title.SetTitle(com.guess.license.plate.Activity.REVIEW_LIST, actionBar, this.getBaseContext());
   }
    
    @Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(getBaseContext());
		Utility.SetTransition(this.getBaseContext(), this, com.guess.license.plate.Activity.REVIEW_LIST);
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