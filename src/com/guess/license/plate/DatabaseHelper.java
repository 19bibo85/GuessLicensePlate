package com.guess.license.plate;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
	private static final String DB_NAME = "LicensePlate";
	private static final int DB_VERSION = 1; 
	
	public DatabaseHelper(Context con) {
		super(con, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		String build = "";
		build += "CREATE TABLE Build (";
		build += " _id INTEGER PRIMARY KEY,";
		build += " Number INTEGER NOT NULL,";
		build += " Name TEXT NOT NULL,";
		build += " Version INTEGER NOT NULL,";
		build += " Developer TEXT NOT NULL";
		build += ");";
		db.execSQL(build);
		
		String plate = "";
		plate += "CREATE TABLE Plate (";
		plate += " _id INTEGER PRIMARY KEY,";
		plate += " Name TEXT NOT NULL,";
		plate += " ImgID TEXT NOT NULL,";
		plate += " Country TEXT NOT NULL,";
		plate += " Difficulty INTEGER NOT NULL,";
		plate += " Version INTEGER NOT NULL,";
		plate += " Continent TEXT NOT NULL";	
		plate += ");";
		db.execSQL(plate);
		
		String language = "";
		language += "CREATE TABLE Language (";
		language += " _id INTEGER PRIMARY KEY,";
		language += " ImgID TEXT NOT NULL,";
		language += " Version INTEGER NOT NULL,";
		language += " en TEXT NOT NULL,";
		language += " it TEXT NOT NULL,";
		language += " es TEXT NOT NULL,";
		language += " fr TEXT NOT NULL,";
		language += " pt TEXT NOT NULL";		
		language += ");";
		db.execSQL(language);
		
		String score = "";
		score += "CREATE TABLE Score (";
		score += " _id INTEGER PRIMARY KEY,";
		score += " GameMode INTEGER NOT NULL,";
		score += " Value INTEGER NOT NULL,";
		score += " Rate DOUBLE NOT NULL";
		score += ");";
		db.execSQL(score);
		
		String statistics = "";
		statistics += "CREATE TABLE Statistics (";
		statistics += " _id INTEGER PRIMARY KEY,";
		statistics += " ImgID TEXT NOT NULL,";
		statistics += " Answer INTEGER NOT NULL,";
		statistics += " GameMode INTEGER NOT NULL,";
		statistics += " Language TEXT NOT NULL,";
		statistics += " Theme TEXT NOT NULL,";
		statistics += " Range TEXT NOT NULL";
		statistics += ");";
		db.execSQL(statistics);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}
