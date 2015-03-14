package com.guess.license.plate;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Statistics {
	private static final String DEFAULT_STRING = "No result";
	private static NewDatabaseHelper databaseHelper;
	private static SQLiteDatabase db;
		
	public static void add(String imgID, int answer, Context context){
		// Open the db, gets the score for the mode selected
		databaseHelper = SplashActivity.databaseHelper;
		db = databaseHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		
		values.put("ImgID", imgID);
		values.put("Answer", answer);
		values.put("GameMode", StartActivity.GameModeVal.getId());
		
		String[] prefs = SharedPreference.GetSharedPreferenceString(context);
		if (prefs.length == SharedPreference.STRING_SIZE) {				
			values.put("Language", prefs[0]);
			values.put("Theme", prefs[1]);
			values.put("Range", prefs[2]);
		}
		
		db.insert("Statistics", null, values);
		db.close();		
	}
	
	public static void Display(int modeId, Context context){
		// Open the db, gets the score for all the game mode
		databaseHelper = SplashActivity.databaseHelper;
		db = databaseHelper.getReadableDatabase();
		
		final int DEFAULT_NUMERIC = 0;
		final String TABLE = "Statistics";
		final String[] LIMITS ={"0", "2", "3", "4"};
		String where = null;
		String[] condition = null;
		
		switch(modeId){
			case 0:
				where = "GameMode >= ?";
				condition = new String[]{LIMITS[0]};				
				break;
			case 1:
				where = "GameMode >= ? and GameMode <= ?";
				condition = new String[]{LIMITS[0],LIMITS[1]};				
				break;
			case 2:
				where = "GameMode >= ? and GameMode <= ?";
				condition = new String[]{LIMITS[2],LIMITS[3]};			
				break;
			default:
				break;
		}
		
		// Setting the default values for all the text box
		StatisticsActivity.AllPlates.setText(Integer.toString(DEFAULT_NUMERIC));
		StatisticsActivity.EuPlates.setText(Integer.toString(DEFAULT_NUMERIC));
		StatisticsActivity.ROTWPlates.setText(Integer.toString(DEFAULT_NUMERIC));
		StatisticsActivity.CorrAns.setText(Integer.toString(DEFAULT_NUMERIC));
		StatisticsActivity.WrgAns.setText(Integer.toString(DEFAULT_NUMERIC));
		StatisticsActivity.MostPlate.setText(DEFAULT_STRING);
		StatisticsActivity.LeastPlate.setText(DEFAULT_STRING);
		StatisticsActivity.MostEuPlate.setText(DEFAULT_STRING);
		StatisticsActivity.LeastEuPlate.setText(DEFAULT_STRING);
		StatisticsActivity.MostROTWPlate.setText(DEFAULT_STRING);
		StatisticsActivity.LeastROTWPlate.setText(DEFAULT_STRING);
		StatisticsActivity.MostLang.setText(DEFAULT_STRING);
		StatisticsActivity.LeastLang.setText(DEFAULT_STRING);
		StatisticsActivity.MostTheme.setText(DEFAULT_STRING);
		StatisticsActivity.LeastTheme.setText(DEFAULT_STRING);
		StatisticsActivity.MostRange.setText(DEFAULT_STRING);
		StatisticsActivity.LeastRange.setText(DEFAULT_STRING);
		
		Cursor cursor = db.query(TABLE, null, where, condition, null, null, null);
		int count = cursor.getCount();
		
		if(count > 0)
		{						
			// Total number of plates (ALL_PLATES)
			StatisticsActivity.AllPlates.setText(Integer.toString(count));
			
			// European plates (EUROPEAN_PLATES)
			cursor = db.query(TABLE, null, where + " and Range = ?", GetCondition(condition, "Europe"), null, null, null);
			count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
			StatisticsActivity.EuPlates.setText(Integer.toString(count));
			
			// Rest of the world plates (ROTW_PLATES)
			cursor = db.query(TABLE, null, where + " and Range = ?", GetCondition(condition, "ROTW"), null, null, null);
			count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
			StatisticsActivity.ROTWPlates.setText(Integer.toString(count));
			
			// Total correct answer (CORR_ANS)
			cursor = db.query(TABLE, null, where + " and Answer = ?", GetCondition(condition, "1"), null, null, null);
			count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
			StatisticsActivity.CorrAns.setText(Integer.toString(count));
			
			// Total wrong answer (WRG_ANS)
			cursor = db.query(TABLE, null, where + " and Answer = ?", GetCondition(condition, "0"), null, null, null);
			count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
			StatisticsActivity.WrgAns.setText(Integer.toString(count));
			
			// The most 5 plate generated (MOST_PLATE)
			StatisticsActivity.MostPlate.setText(GetName(GetNameList(context, 0, where, condition, true)));
						
			// The least 5 plate generated (LEAST_PLATE)
			StatisticsActivity.LeastPlate.setText(GetName(GetNameList(context, 0, where, condition, false)));
		
			// The most 5 European plate generated (MOST_EU_PLATE)			
			StatisticsActivity.MostEuPlate.setText(GetName(GetNameList(context, 0, where + " and Range = ?", GetCondition(condition, "Europe"), true)));
		
			// The least 5 European plate generated (LEAST_EU_PLATE)
			StatisticsActivity.LeastEuPlate.setText(GetName(GetNameList(context, 0,where + " and Range = ?", GetCondition(condition, "Europe"), false)));
						
			// The most 5 Rest of the world plate generated (MOST_ROTW_PLATE)
			StatisticsActivity.MostROTWPlate.setText(GetName(GetNameList(context, 0, where + " and Range = ?", GetCondition(condition, "ROTW"), true)));
			
			// The least 5 European plate generated (LEAST_ROTW_PLATE)
			StatisticsActivity.LeastROTWPlate.setText(GetName(GetNameList(context, 0, where + " and Range = ?", GetCondition(condition, "ROTW"), false)));

			// The most 3 language chosen (MOST_LANG)
			StatisticsActivity.MostLang.setText(GetName(GetNameList(context, 1, where, condition, true)));
			
			// The most 3 language chosen (LEAST_LANG)
			StatisticsActivity.LeastLang.setText(GetName(GetNameList(context, 1, where, condition, false)));
			
			// The most 3 theme chosen (MOST_THEME)
			StatisticsActivity.MostTheme.setText(GetName(GetNameList(context, 2, where, condition, true)));
			
			// The least 3 theme chosen (LEAST_THEME)
			StatisticsActivity.LeastTheme.setText(GetName(GetNameList(context, 2, where, condition, false)));
			
			// The most 1 range chosen (MOST_RANGE)
			StatisticsActivity.MostRange.setText(GetName(GetNameList(context, 3, where, condition, true)));
			
			// The least 1 range chosen (LEAST_RANGE)
			StatisticsActivity.LeastRange.setText(GetName(GetNameList(context, 3, where, condition, false)));
		}
		
		db.close();
	}
	
	private static String[] GetCondition(String[] condition, String value){
		
		int newSize = condition.length + 1;
		String[] newCondition = new String[newSize];
		System.arraycopy(condition, 0, newCondition, 0, (newSize - 1));
		newCondition[(newSize - 1)] = value;
		return newCondition;
	}
	
	private static List<String> GetNameList(Context context, int queryType, String where, String[] condition, boolean isMax){
		//String preQuery = null;
		String query = null;
		String order = isMax ? "DESC" : "ASC";
		//String result = DEFAULT_STRING;
		List<String> res = null;
		
		switch(queryType)
		{
			case 0: // ImgID
				query = "SELECT Plate.Name, numImgID as newPlate " +
						"FROM(SELECT ImgID, COUNT(*) as numImgID " +
						"FROM Statistics WHERE "+ where +" GROUP BY ImgID) as NewTable " +
						"INNER JOIN Plate on Plate.ImgID = NewTable.ImgID ORDER BY numImgID "+ order +" LIMIT 5";
				break;
			case 1: // Language
				/*if(false){
					preQuery = "SELECT Language FROM Statistics WHERE "+where+" GROUP BY Language";
					result = PreCheck(context, preQuery, condition, R.array.language_array_val);
					if(!result.equals(DEFAULT))
						return result;
				}
				query = isMax ? "SELECT NewTable.Language, MAX(numLang) as newLang " :
								"SELECT NewTable.Language, MIN(numLang) as newLang ";
				
				query +="FROM(SELECT Language, COUNT(*) as numLang " +
						"FROM Statistics WHERE "+where+" GROUP BY Language) as NewTable LIMIT 3";
				*/
				query = "SELECT NewTable.Language, numLang as newLang " +
						"FROM(SELECT Language, COUNT(*) as numLang " +
						"FROM Statistics WHERE "+ where +" GROUP BY Language) as NewTable ORDER BY numLang "+ order + " LIMIT 3";
				
				break;
			case 2: // Theme
				/*if(false){
					preQuery = "SELECT Theme FROM Statistics WHERE "+where+" GROUP BY Theme";
					result = PreCheck(context, preQuery, condition, R.array.theme_array_val);
					if(!result.equals(DEFAULT))
						return result;
				}
				query = isMax ? "SELECT NewTable.Theme, MAX(numTheme) as newTheme " :
								"SELECT NewTable.Theme, MIN(numTheme) as newTheme ";
				
				query +="FROM(SELECT Theme, COUNT(*) as numTheme " +
						"FROM Statistics WHERE "+where+" GROUP BY Theme) as NewTable LIMIT 3";*/
				
				query = "SELECT NewTable.Theme, numTheme as newTheme " +
						"FROM(SELECT Theme, COUNT(*) as numTheme " +
						"FROM Statistics WHERE "+ where +" GROUP BY Theme) as NewTable ORDER BY numTheme "+ order + " LIMIT 3";
				break;
			case 3: // Range
				/*if(false){
					preQuery = "SELECT Range FROM Statistics WHERE "+where+" GROUP BY Range";
					result = PreCheck(context, preQuery, condition, R.array.range_array_val);
					if(!result.equals(DEFAULT))
						return result;
				}
				query = isMax ? "SELECT NewTable.Range, MAX(numRange) as newRange " :
								"SELECT NewTable.Range, MIN(numRange) as newRange ";
				
				query +="FROM(SELECT Range, COUNT(*) as numRange " +
						"FROM Statistics WHERE "+where+" GROUP BY Range) as NewTable LIMIT 3";*/
				query = "SELECT NewTable.Range, numRange as newRange " +
						"FROM(SELECT Range, COUNT(*) as numRange " +
						"FROM Statistics WHERE "+ where +" GROUP BY Range) as NewTable ORDER BY numRange "+ order + " LIMIT 1";
				break;
			default:
				break;
		}
		
		if(query != null){
			Cursor cursor = db.rawQuery(query, condition);
			if(cursor != null && cursor.getCount() > 0){
				res = new ArrayList<String>();
				while (cursor.moveToNext()) {
					String conc = null;
					if (!cursor.isNull(0))
						conc = cursor.getString(0);
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
	
	private static String GetName(List<String> nameList){
		String result = DEFAULT_STRING;
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
	
	@SuppressWarnings("unused")
	private static String PreCheck(Context context, String query, String[] condition, int array){
		String result = DEFAULT_STRING;
		String[] valuesDB = null;

		// Getting all the values for the stat in DB
		Cursor cursor = db.rawQuery(query, condition);
		if(cursor != null && cursor.getCount() > 0){			
			valuesDB = new String[cursor.getCount()];
			int i = 0;
			while (cursor.moveToNext()) {				
				if (!cursor.isNull(0)){
					valuesDB[i] = cursor.getString(0); 
					i++;
				}
			}
		}
		
		// No entries in db for that stat
		String[] allValues = context.getResources().getStringArray(array);
		if((valuesDB == null || !(valuesDB.length > 0)) && allValues.length != 0)
			return allValues[0];
		
		// All the entries in db do not cover all the values
		if(valuesDB.length != allValues.length){
			for(int i=0; i < allValues.length; i++){
				for(int j=0; j < valuesDB.length; j++){
					if(allValues[i] != valuesDB[j])
						return allValues[i];
				} 
			} 
		}
		
		return result;
	} 
	
	// Deleting all the plates from the db
	public static void DeleteAll(){
		databaseHelper = SplashActivity.databaseHelper;
		db = databaseHelper.getWritableDatabase();
		db.delete("Statistics", null, null);
		db.close();
	}
}