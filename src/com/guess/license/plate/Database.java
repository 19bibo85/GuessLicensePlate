package com.guess.license.plate;

import android.database.sqlite.SQLiteDatabase;

public class Database {
	// Database tables
	public static final String[] TABLES = {"build", "plate", "language", "score", "statistics"};
	
	// Table fields
	public static final String[] BUILD = {"_id", "number", "name", "version", "developer"};
	public static final String[] PLATE = {"_id", "name", "imgID", "country", "difficulty", "version", "continent"};
	public static final String[] LANG = {"_id", "imgID", "version", "en", "it", "es", "fr", "pt"};
	public static final String[] SCORE = {"_id", "gameMode", "value", "rate"};
	public static final String[] STATS = {"_id", "imgID", "answer", "gameMode", "language", "theme", "range"};

	// Database creation SQL statement
	private static final String DATABASE_CREATE_BUILD = 
			  " CREATE TABLE " 
		      + TABLES[0]
		      + "(" 
		      + BUILD[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
		      + BUILD[1] + " INTEGER NOT NULL, " 
		      + BUILD[2] + " TEXT NOT NULL, " 
		      + BUILD[3] + " INTEGER NOT NULL, " 
		      + BUILD[4] + " TEXT NOT NULL" 
		      + ");";
	
	private static final String DATABASE_CREATE_PLATE =	
		      " CREATE TABLE " 
		      + TABLES[1]
		      + "(" 
		      + PLATE[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
		      + PLATE[1] + " TEXT NOT NULL, " 
		      + PLATE[2] + " TEXT NOT NULL," 
		      + PLATE[3] + " TEXT NOT NULL, " 
		      + PLATE[4] + " INTEGER NOT NULL, "
		      + PLATE[5] + " INTEGER NOT NULL, " 
		      + PLATE[6] + " TEXT NOT NULL" 
		      + ");";
	
	private static final String DATABASE_CREATE_LANG =	
		      " CREATE TABLE " 
		      + TABLES[2]
		      + "(" 
		      + LANG[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
		      + LANG[1] + " TEXT NOT NULL, " 
		      + LANG[2] + " INTEGER NOT NULL," 
		      + LANG[3] + " TEXT NOT NULL, " 
		      + LANG[4] + " TEXT NOT NULL, "
		      + LANG[5] + " TEXT NOT NULL, " 
		      + LANG[6] + " TEXT NOT NULL, "
		      + LANG[7] + " TEXT NOT NULL" 
		      + ")";
	
	private static final String DATABASE_CREATE_SCORE =	
		      " CREATE TABLE " 
		      + TABLES[3]
		      + "(" 
		      + SCORE[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
		      + SCORE[1] + " INTEGER NOT NULL, " 
		      + SCORE[2] + " INTEGER NOT NULL," 
		      + SCORE[3] + " DOUBLE NOT NULL"
		      + ");";
	
	private static final String DATABASE_CREATE_STATS =	
		      " CREATE TABLE " 
		      + TABLES[4]
		      + "(" 
		      + STATS[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
		      + STATS[1] + " TEXT NOT NULL, " 
		      + STATS[2] + " INTEGER NOT NULL," 
		      + STATS[3] + " INTEGER NOT NULL, "
		      + STATS[4] + " TEXT NOT NULL, " 
		      + STATS[5] + " TEXT NOT NULL," 
		      + STATS[6] + " TEXT NOT NULL"
		      + ");";

	public static void onCreate(SQLiteDatabase database) {		
	    database.execSQL(DATABASE_CREATE_BUILD);
	    database.execSQL(DATABASE_CREATE_PLATE);
	    database.execSQL(DATABASE_CREATE_LANG);
	    database.execSQL(DATABASE_CREATE_SCORE);
	    database.execSQL(DATABASE_CREATE_STATS);
	    //Log.i("DATABASE", DATABASE_CREATE_STATS);
	}
	
	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
			
	}
}