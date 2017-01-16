package com.guess.license.plate.Activity;

import com.guess.license.plate.release.R;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Repository.Component;
import com.guess.license.plate.Repository.Language;
import com.guess.license.plate.Repository.Utility;
import com.guess.license.plate.Task.LoadingTaskConn;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity{
	public static ImageView logo;
	public static TextView Loading;
	public static DatabaseHelper databaseHelper;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	try{
	        super.onCreate(savedInstanceState);
	        
	        // Setting the layout and getting the view
	        setContentView(R.layout.splashscreen);
	        
	        // Logo
	        logo = (ImageView) findViewById(R.id.logo);
	        Utility.ScaleSizeForTable(this.getBaseContext(), logo);
	        
	        // Loading
	        Loading = (TextView) findViewById(R.id.loading);	        
	        Language.SetLanguage(Component.SPLASH, this.getBaseContext());
	        	        
			// Setting a new instance of Database
	        databaseHelper = new DatabaseHelper(getBaseContext());
	        new LoadingTaskConn(this.getApplicationContext(), this).execute(databaseHelper);
	        
    	}catch(Exception ex){
    		// In case something went wrong while inserting initial data into db show message
    		showAlertMessage();
    	}
    } 
    
    
    private void showAlertMessage(){
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	String[] strings = Language.GetSplashAlertLanguage(this.getBaseContext());
    	if(strings != null && strings.length == 3){
    		builder
    		.setTitle(strings[0])
    		.setMessage(strings[1])    		
    		.setPositiveButton(strings[2], new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                   finish();
                }
            });
    		
    		AlertDialog dialog = builder.create();
    		dialog.show();
    	}
    }
 
    
    // This is the callback for when your async task has finished
    public void onTaskFinished() {
    	Utility.InitializeAudio(getBaseContext());
    	Intent intent = new Intent(SplashActivity.this, MainActivity.class);
    	intent.putExtra("Transition", true);
        startActivity(intent);        
        finish();        
    }
}
