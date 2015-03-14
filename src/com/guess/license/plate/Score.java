package com.guess.license.plate;

import java.util.ArrayList;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

public class Score extends AsyncTask<NewDatabaseHelper, Void, Object>{
	private MainActivity mainActivity = null;
	private GameActivity gameActivity = null;
	private OptionDialogPreference dialogPreference = null;
	private SQLiteDatabase db;
	
	public Score(MainActivity mainActivity){
		this.mainActivity = mainActivity;
	}
	
	public Score(GameActivity gameActivity){
		this.gameActivity = gameActivity;
	}
	
	public Score(OptionDialogPreference dialogPreference){
		this.dialogPreference = dialogPreference;
	}
	
	@Override
	protected Object doInBackground(NewDatabaseHelper... databaseHelper) {
		Object result = null;
		
		if(mainActivity != null){
			result = queryBestScores(databaseHelper[0]);			
		} else if (gameActivity != null){
			result = queryScore(databaseHelper[0]);
		} else if(dialogPreference != null){
			result = deleteAllScores(databaseHelper[0]);
		}
		
		return result;
	}	
	
	@Override
	protected void onPostExecute(Object result) {
		super.onPostExecute(result);
		if(mainActivity != null){
			mainActivity.bestScoreActivity(result);
		} else if (gameActivity != null){
			gameActivity.scoreActivity(result);
		} else if(dialogPreference != null){
			dialogPreference.setNumRowScoDel(result);
		}
	}	
	
	public ArrayList<String> queryScore(NewDatabaseHelper databaseHelper){
		ArrayList<String> obj = new ArrayList<String>();
		final int DEFAULT_VALUE = 0;
		final int COR_ANS_FACTOR = 3;
		final int WRG_ANS_FACTOR = 2;
		
		// Getting correct and wrong answer of the last game
		int corAns = GameActivity.NumberCorrectAnswer;
		int wrgAns = GameActivity.NumberWrongAnswer;
		obj.add(Integer.toString(corAns));
		obj.add(Integer.toString(wrgAns));
		
		// Calculating the score
		int score = (corAns * COR_ANS_FACTOR) - (wrgAns * WRG_ANS_FACTOR);
		obj.add(Integer.toString(score));
				
		// Calculating the rate
		long value = (corAns + wrgAns) != 0 ? Math.round(((double)corAns / (double)(corAns + wrgAns)) * 100) : DEFAULT_VALUE;
		String rate = Long.toString(value).concat("%");
		obj.add(rate);
				
		// Open the db, gets the score for the mode selected
		db = databaseHelper.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put("gameMode", StartActivity.GameModeVal.getId());
		values.put("value", score);
		values.put("rate", value);
		
		String [] columns = {"value"}; // Columns
		String whereClause = "GameMode = ?"; // Where
		String [] whereArgs = {Integer.toString(StartActivity.GameModeVal.getId())}; // Arg				
		Cursor cursor = db.query("score", columns, whereClause, whereArgs, null, null, null); // Get the cursor				
		int count = cursor.getCount();
		
		if(count == 0 && score > 0){
			db.insert("score", null, values);
			db.close();
			obj.add("NEW");
			return obj;
		}				
									
		int scoreDB = DEFAULT_VALUE;
		while (cursor.moveToNext()) {
			scoreDB = cursor.isNull(0) ? DEFAULT_VALUE : cursor.getInt(0);
		}
		
		// Check if the score in db is higher than the last score
		if(scoreDB >= score){			
			db.close();
			obj.add("OLD");
			return obj;			
		}			
		
		// Update the score in db
		db.update("score", values, whereClause, whereArgs);
		db.close();
		obj.add("NEW");
		
		return obj;
	}
	
	private ArrayList<String> queryBestScores(NewDatabaseHelper databaseHelper){
		final int SIZE = 10;
		final String SCORE_DEFAULT = "0";
		final String RATE_DEFAULT = "0";
		
		String[] arrayObj = new String[SIZE];
		arrayObj = Utility.FillDefaultVals(com.guess.license.plate.Activity.BEST_SCORE, arrayObj, SCORE_DEFAULT, RATE_DEFAULT);
		ArrayList<String> obj = Utility.CopyArrayToList(arrayObj);
		
		// Open the db, gets the score for all the game mode
		db = databaseHelper.getWritableDatabase();
		
		String [] columns = {"gameMode", "value", "rate"}; // Columns
		Cursor cursor = db.query("score", columns, null, null, null, null, null); // Get the cursor
		
		int count = cursor.getCount();		
		if(count > 0){			
			while (cursor.moveToNext()) {
				int gameMode = cursor.isNull(0) ? -1 : cursor.getInt(0);
				String score = cursor.isNull(1) ? SCORE_DEFAULT : Integer.toString(cursor.getInt(1));
				String rate = cursor.isNull(2) ? RATE_DEFAULT : Integer.toString((int)cursor.getDouble(2));//new DecimalFormat("000", new DecimalFormatSymbols(Locale.ENGLISH)).format(cursor.getDouble(2)).toString();
			
				int rateIndx = (gameMode * 2) + 1;
				if(rateIndx <= SIZE){
					int scoreIndx = rateIndx - 1;					
					arrayObj[scoreIndx] = score;
					arrayObj[rateIndx] = rate;
				}
			}
		}
		
		obj.clear();
		obj = Utility.CopyArrayToList(arrayObj);
		
		return obj;
	}
	
	private int deleteAllScores(NewDatabaseHelper databaseHelper){
		// Open the db, gets the score for all the game mode
		db = databaseHelper.getWritableDatabase();		
		int numRows = db.delete("Score", null, null);
		return numRows;
	}
}