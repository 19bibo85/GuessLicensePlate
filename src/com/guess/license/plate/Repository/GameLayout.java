package com.guess.license.plate.Repository;

import com.guess.license.plate.release.R;
import com.guess.license.plate.Activity.GameActivity;
import com.guess.license.plate.Activity.SplashActivity;
import com.guess.license.plate.Activity.StartActivity;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Model.Review;
import com.guess.license.plate.Task.ScoreAsyncTask;
import com.guess.license.plate.Task.StatisticsAsyncTask;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GameLayout {
	
	private long numRowAdd = -1;
	
	public GameLayout(GameActivity activity, ImageView imageView, Context context) {
		
		// Theme
		Theme.SetTheme(Component.GAME, context);
		
		// Setting the button listeners
		setListener(imageView, activity, context);
	}

	private void setListener(final ImageView imageView, final GameActivity activity, final Context context) {
		
		// First Button
		GameActivity.Button1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				updateLayout(imageView, activity, GameActivity.Button1, context);
			}
		});

		// Second Button
		GameActivity.Button2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				updateLayout(imageView, activity, GameActivity.Button2, context);
			}
		});
		
		// Third Button
		GameActivity.Button3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				updateLayout(imageView, activity, GameActivity.Button3, context);
			}
		});
		
		// Fourth Button
		GameActivity.Button4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				updateLayout(imageView, activity, GameActivity.Button4, context);
			}
		});
	}
	
	private void updateLayout(final ImageView imageView, final GameActivity activity, Button button, final Context context){
		// Getting the answer choose clicking the button
		String answer = (String) button.getText();
		// Getting the correct answer
		String corrAns = GameUtility.correctPlate.getLanguage();
		
		/*******************
		 * 	WRONG ANSWER
		 *******************/
		if(!answer.equals(corrAns)){
			// Play audio
			GameUtility.SetAudio(context, SharedPreference.GetSharedPreferenceBool(context)[1], false);
			
			// Setting the theme for the button choose
			setButtonColor(button, false);
			
			// For statistics purpose set the the button non clickable
			button.setClickable(false);
			
			// Incrementing the number of wrong answer
			GameActivity.NumberWrongAnswer++;
			
			// Setting the wrong answer on review plate object
			GameUtility.review.setWrongAnswers(answer);
			
			// Adding a new row in the table Statistics and setting it on wrong answer 
			DatabaseHelper databaseHelper = SplashActivity.databaseHelper;
			if(databaseHelper == null) 
				databaseHelper = new DatabaseHelper(context);
			
			new StatisticsAsyncTask(context, GameLayout.this, GameUtility.correctPlate.getImgID(), 0).execute(databaseHelper);
			
			// In case the game mode is in NO FAULT
			if(StartActivity.GameModeVal == GameMode.NO_FAULT){
				// Setting the wrong answer on the object review
				GameUtility.review.setWrongAnswers(answer);
				
				// Adding the plate to review
				Review reviewPlate = GameUtility.review;
				GameActivity.ReviewList.add(reviewPlate);
				
				new ScoreAsyncTask(activity).execute(databaseHelper);			
			}	
			return;
		}
		
		/*******************
		 * 	CORRECT ANSWER
		 *******************/
		// Play audio
		GameUtility.SetAudio(context, SharedPreference.GetSharedPreferenceBool(context)[1], true);
		
		// Change the colour of the button
		setButtonColor(button, true);
		
		// For statistics purpose set all the buttons non clickable
		GameActivity.Button1.setClickable(false);
		GameActivity.Button2.setClickable(false);
		GameActivity.Button3.setClickable(false);
		GameActivity.Button4.setClickable(false);
		
		// Starting a timer of 1 sec
		new CountDownTimer(1000, 1000) {
			
			public void onTick(long millisUntilFinished) {
				// Do nothing
			}

			public void onFinish() {
				try {
					// Adding the plate to review
					Review reviewPlate = GameUtility.review;
					GameActivity.ReviewList.add(reviewPlate);
					
					// Incrementing the number of correct answer
				 	GameActivity.NumberCorrectAnswer++;
				 	
				 	// Adding a new row in the table Statistics and setting it on correct answer 
				 	DatabaseHelper databaseHelper = SplashActivity.databaseHelper;
					if(databaseHelper == null) 
						databaseHelper = new DatabaseHelper(context);
					new StatisticsAsyncTask(context, GameLayout.this, GameUtility.correctPlate.getImgID(), 1).execute(databaseHelper);
					
					// In case there are no plate to process anymore show the score
					if(GameActivity.CloPlateList.size() == 0){
						new ScoreAsyncTask(activity).execute(databaseHelper);
						return;
					}
					
				 	// Setting the layout of the game
					GameUtility.SetDataGame(activity, imageView);
					
					// Generate a new layout
					new GameLayout(activity, imageView, context);
				
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	// This method changes the colour of the button based on the answer, green if it's correct red in the other case
	private void setButtonColor(Button button, boolean isCorrect){		
		int drawable = isCorrect ? R.drawable.button_green : R.drawable.button_red;
		button.setBackgroundResource(drawable);		
	}
	
	public void setNumRowAdd(Object add){
    	numRowAdd = (Long)add;
    }
    
    public long getNumRowAdd(){
    	return numRowAdd;
    }
}