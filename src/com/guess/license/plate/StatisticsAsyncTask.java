package com.guess.license.plate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

public class StatisticsAsyncTask extends AsyncTask<NewDatabaseHelper, Void, Object>{
	private Context context = null;
	private MainStatisticsActivity mainStatisticActivity = null;
	private OptionDialogPreference dialogPreference = null;
	private int modeID = -1;
	private GameLayout gameLayout = null;
	private String imgID = null;
	private int answer = -1;
	
	private final int DEFAULT_NUMERIC = 0;
	private String defaultString;
	
	public StatisticsAsyncTask(Context context, GameLayout gameLayout, String imgID, int answer){
		this.context = context;
		this.gameLayout = gameLayout;
		this.imgID = imgID;
		this.answer = answer;
	}
	
	public StatisticsAsyncTask(Context context, MainStatisticsActivity mainStatisticActivity, int modeID){
		this.context = context;
		this.mainStatisticActivity = mainStatisticActivity;
		this.modeID = modeID;
		this.defaultString = NoResultLocalized(context);
	}
	
	public StatisticsAsyncTask(OptionDialogPreference dialogPreference){
		this.dialogPreference = dialogPreference;
	}
	
	@Override
	protected Object doInBackground(NewDatabaseHelper... databaseHelper) {
		Object result = null;
		//Log.e("SCORE", mainStatisticActivity+" - "+ context + " - "+databaseHelper+" - "+modeID);
		if(gameLayout != null && imgID != null && answer != -1){
			result = addRow(context, databaseHelper[0], imgID, answer);
		}else if(mainStatisticActivity != null && context != null && databaseHelper != null && modeID != -1){			
			result = queryMainStatistic(context, databaseHelper[0], modeID);
		}else if(dialogPreference != null){
			result = deleteAll(databaseHelper[0]);
		}
		return result;
	}
	
	@Override
	protected void onPostExecute(Object result) {
		super.onPostExecute(result);
		if(gameLayout != null){
			gameLayout.setNumRowAdd(result);
		}else if(mainStatisticActivity != null){
			mainStatisticActivity.statsActivity(result);
		} else if(dialogPreference != null){
			dialogPreference.setNumRowStaDel(result);
		}
	}
	
	private long addRow(Context context, NewDatabaseHelper databaseHelper, String imgID, int answer){
		// Open the db, gets the score for the mode selected
		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		//Log.e("STATS", "Entrato");
		values.put("imgID", imgID);
		values.put("answer", answer);
		values.put("gameMode", StartActivity.GameModeVal.getId());
		
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {				
			values.put("language", prefs[0]);
			values.put("theme", prefs[1]);
			values.put("range", prefs[2]);
		}
		
		long numRowIns = db.insert("statistics", null, values);
		db.close();
		//Log.e("STATS", numRowIns+"");
		return numRowIns;
	}
	
	// Main query to show the list of strings in statistics
	private ArrayList<String> queryMainStatistic(Context context, NewDatabaseHelper databaseHelper, int modeID){
		final String TABLE = "statistics";
		final String[] LIMITS ={"0", "2", "3", "4"};
		final String COR_ANS = "1";
		final String WRG_ANS = "0";
		String where = null;
		String[] condition = null;
		String[] wrgCondition = null;
		
		final int SIZE = 17;
		String[] info = new String[SIZE];		
		info = Utility.FillDefaultVals(com.guess.license.plate.Activity.STATS, info, Integer.toString(DEFAULT_NUMERIC), defaultString);
		ArrayList<String> obj = Utility.CopyArrayToList(info);
		
		switch(modeID){
			case 0:
				where = "gameMode >= ? and answer = ?";
				condition = new String[]{LIMITS[0], COR_ANS};
				wrgCondition = new String[]{LIMITS[0], WRG_ANS};
				break;
			case 1:
				where = "gameMode >= ? and gameMode <= ? and answer = ?";
				condition = new String[]{LIMITS[0],LIMITS[1], COR_ANS};
				wrgCondition = new String[]{LIMITS[0],LIMITS[1], WRG_ANS};
				break;
			case 2:
				where = "gameMode >= ? and gameMode <= ? and answer = ?";
				condition = new String[]{LIMITS[2],LIMITS[3], COR_ANS};
				wrgCondition = new String[]{LIMITS[2],LIMITS[3], WRG_ANS};
				break;
			default:
				break;
		}
		
		SQLiteDatabase db = databaseHelper.getReadableDatabase();
		
		if(db != null){
			Cursor cursor = db.query(TABLE, null, where, condition, null, null, null);
			int count = cursor.getCount();
					
			if(count > 0)
			{						
				// Total number of plates (ALL_PLATES)
				info[0] = Integer.toString(count);
				
				// European plates (EUROPEAN_PLATES)
				cursor = db.query(TABLE, null, where + " and imgID like 'eu_%'", condition, null, null, null);
				count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
				info[1] = Integer.toString(count);
			
				// Rest of the world plates (ROTW_PLATES)
				cursor = db.query(TABLE, null, where + " and imgID like 'us_%'", condition, null, null, null);
				count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
				info[2] = Integer.toString(count);
				
				// Total correct answer (CORR_ANS)
				//cursor = db.query(TABLE, null, where + " and answer = ?", addCondition(condition, "1"), null, null, null);
				//count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
				//info[3] = Integer.toString(count);
				info[3] = info[0];
						
				// Total wrong answer (WRG_ANS)
				//cursor = db.query(TABLE, null, where + " and answer = ?", addCondition(condition, "0"), null, null, null);
				cursor = db.query(TABLE, null, where, wrgCondition, null, null, null);
				count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
				info[4] = Integer.toString(count);
				
				// The most 5 plate generated (MOST_PLATE)
				info[5] = formatString(getStringList(context, db, 0, where, condition, true), defaultString);
							
				// The least 5 plate generated (LEAST_PLATE)
				info[6] = formatString(getStringList(context, db, 0, where, condition, false), defaultString);
			
				// The most 5 European plate generated (MOST_EU_PLATE)			
				info[7] = formatString(getStringList(context, db, 0, where + " and imgID like 'eu_%'", condition, true), defaultString);
			
				// The least 5 European plate generated (LEAST_EU_PLATE)
				info[8] = formatString(getStringList(context, db, 0, where + " and imgID like 'eu_%'", condition, false), defaultString);
							
				// The most 5 Rest of the world plate generated (MOST_ROTW_PLATE)
				info[9] = formatString(getStringList(context, db, 0, where + " and imgID like 'us_%'", condition, true), defaultString);
				
				// The least 5 European plate generated (LEAST_ROTW_PLATE)
				info[10] = formatString(getStringList(context, db, 0, where + " and imgID like 'us_%'", condition, false), defaultString);
	
				// The most 3 language chosen (MOST_LANG)
				info[11] = formatString(getStringList(context, db, 1, where, condition, true), defaultString);
				
				// The most 3 language chosen (LEAST_LANG)
				info[12] = formatString(getStringList(context, db, 1, where, condition, false), defaultString);
				
				// The most 3 theme chosen (MOST_THEME)
				info[13] = formatString(getStringList(context, db, 2, where, condition, true), defaultString);
				
				// The least 3 theme chosen (LEAST_THEME)
				info[14] = formatString(getStringList(context, db, 2, where, condition, false), defaultString);
				
				// The most 1 range chosen (MOST_RANGE)
				info[15] = formatString(getStringList(context, db, 3, where, condition, true), defaultString);
				
				// The least 1 range chosen (LEAST_RANGE)
				info[16] = formatString(getStringList(context, db, 3, where, condition, false), defaultString);
			}
			
			obj.clear();
			obj = Utility.CopyArrayToList(info);
			
			db.close();
		}
		
		return obj;
	}
	
	// Adding a new filter condition to the query
	private String[] addCondition(String[] condition, String value){
		int newSize = condition.length + 1;
		String[] newCondition = new String[newSize];
		System.arraycopy(condition, 0, newCondition, 0, (newSize - 1));
		newCondition[(newSize - 1)] = value;
		return newCondition;
	}

	// Get the list of string for the query passed
	private List<String> getStringList(Context context, SQLiteDatabase db, int queryType, String where, String[] condition, boolean isMax){
		String query = null;
		String order = isMax ? "DESC" : "ASC";
		List<String> res = null;
		
		String[] pref = SharedPreference.GetSharedPreferenceString(context);
		String lang = pref.length == SharedPreference.STRING_SIZE ? pref[0] : Locale.getDefault().getLanguage();
		
		switch(queryType)
		{
			case 0: // ImgID
				query = "SELECT Language."+ lang +", numImgID as newPlate " +
						"FROM(SELECT ImgID, COUNT(*) as numImgID " +
						"FROM Statistics WHERE "+ where +" GROUP BY ImgID) as NewTable " +
						"INNER JOIN Plate on Plate.ImgID = NewTable.ImgID " + 
						"INNER JOIN Language on Language.ImgID = Plate.ImgID ORDER BY numImgID "+ order +" LIMIT 5";
				break;
			case 1: // Language
				query = "SELECT NewTable.Language, numLang as newLang " +
						"FROM(SELECT Language, COUNT(*) as numLang " +
						"FROM Statistics WHERE "+ where +" GROUP BY Language) as NewTable ORDER BY numLang "+ order + " LIMIT 3";				
				break;
			case 2: // Theme				
				query = "SELECT NewTable.Theme, numTheme as newTheme " +
						"FROM(SELECT Theme, COUNT(*) as numTheme " +
						"FROM Statistics WHERE "+ where +" GROUP BY Theme) as NewTable ORDER BY numTheme "+ order + " LIMIT 3";
				break;
			case 3: // Range
				query = "SELECT NewTable.Range, numRange as newRange " +
						"FROM(SELECT Range, COUNT(*) as numRange " +
						"FROM Statistics WHERE "+ where +" GROUP BY Range) as NewTable ORDER BY numRange "+ order + " LIMIT 1";
				break;
			default:
				break;
		}
		
		// Concatenation of the name and number
		if(query != null){
			Cursor cursor = db.rawQuery(query, condition);
			if(cursor != null && cursor.getCount() > 0){
				res = new ArrayList<String>();
				while (cursor.moveToNext()) {
					String conc = null;
					if (!cursor.isNull(0))
						conc = queryType != 0 ? Language.GetStatsLocalized(context, queryType, lang, cursor.getString(0)) : cursor.getString(0);
					if (!cursor.isNull(1))
					{
						conc += " (" + cursor.getString(1) + ")";
						res.add(conc);
					}
				}
			}
		}
		
		return res;
	}
	
	// Format the string or the list of strings to print
	private String formatString(List<String> nameList, String defaultString){
		String result = defaultString;
		if(nameList != null && nameList.size() > 0){
			String strConc = "";
			for(int i=0; i < nameList.size(); i++){
				strConc += nameList.size() != 1 ? 
												i != (nameList.size() - 1)
																		?																		
																		+(i+1) + " - " + nameList.get(i)+ "\n"
																		:
																		+(i+1) + " - " + nameList.get(i)
												: 
												+(i+1) + " - " + nameList.get(i);
			}
			result = strConc;
		}
		
		return result;
	}

	// Deleting all the plates from the db
	private int deleteAll(NewDatabaseHelper databaseHelper){
		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		int numRows = db.delete("statistics", null, null);
		db.close();
		return numRows;
	}
	
	private String NoResultLocalized(Context context){
		String result = "No Results";
		if(context != null){
			String[] pref = SharedPreference.GetSharedPreferenceString(context);
			String lang = pref.length == SharedPreference.STRING_SIZE ? pref[0] : Locale.getDefault().getLanguage();
			String xmlStr = "stats_async_".concat(lang);
			result = context.getResources().getString(Utility.GetResId(xmlStr, context, R.string.class));		
		}
		return result;
	}
}
