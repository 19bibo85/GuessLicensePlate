package com.guess.license.plate;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NewDatabaseHelper extends SQLiteOpenHelper{
	private static final String DATABASE_NAME = "guesslicense.db";
	private static final int DATABASE_VERSION = 1;

	public NewDatabaseHelper(Context context) {
	    super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Method is called during creation of the database
	@Override
  	public void onCreate(SQLiteDatabase database) {
		Database.onCreate(database);
  	}
	
	// Method is called during an upgrade of the database,
	// e.g. if you increase the database version
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		Database.onUpgrade(database, oldVersion, newVersion);
	}
}