package com.guess.license.contentprovider;

import com.guess.license.plate.Database;
import com.guess.license.plate.NewDatabaseHelper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;

public class DatabaseContentProvider extends ContentProvider{
	// database
	private static NewDatabaseHelper database;

	private static final String AUTHORITY = "com.guess.license.contentprovider";
		
	// define uris
	private static final String PATH_BUILD = "build";
	private static final String PATH_PLATE = "plate";
	private static final String PATH_LANG = "lang";
	private static final String PATH_SCORE = "score";
	private static final String PATH_STATS = "stats";
	
	public static final Uri CONTENT_URI_BUILD = Uri.parse("content://" + AUTHORITY + "/" + PATH_BUILD);
	public static final Uri CONTENT_URI_PLATE = Uri.parse("content://" + AUTHORITY + "/" + PATH_PLATE);
	public static final Uri CONTENT_URI_LANG = Uri.parse("content://" + AUTHORITY + "/" + PATH_LANG);
	public static final Uri CONTENT_URI_SCORE = Uri.parse("content://" + AUTHORITY + "/" + PATH_SCORE);
	public static final Uri CONTENT_URI_STATS = Uri.parse("content://" + AUTHORITY + "/" + PATH_STATS);
	
	// used for the UriMacher
	// Build table
	private static final int BUILD = 10;
	private static final int BUILD_ID = 20;
	// Plate table
	private static final int PLATE = 30;
	private static final int PLATE_ID = 40;
	// Lang table
	private static final int LANG = 50;
	private static final int LANG_ID = 60;
	// Score table
	private static final int SCORE = 70;
	private static final int SCORE_ID = 80;
	// Stats table
	private static final int STATS = 90;
	private static final int STATS_ID = 100;
	
	private static final UriMatcher sURIMatcher = new UriMatcher(UriMatcher.NO_MATCH);
	static {
		sURIMatcher.addURI(AUTHORITY, PATH_BUILD, BUILD);
		sURIMatcher.addURI(AUTHORITY, PATH_BUILD + "/#", BUILD_ID);
		sURIMatcher.addURI(AUTHORITY, PATH_PLATE, PLATE);
		sURIMatcher.addURI(AUTHORITY, PATH_PLATE + "/#", PLATE_ID);
		sURIMatcher.addURI(AUTHORITY, PATH_LANG, LANG);
		sURIMatcher.addURI(AUTHORITY, PATH_LANG + "/#", LANG_ID);
		sURIMatcher.addURI(AUTHORITY, PATH_SCORE, SCORE);
		sURIMatcher.addURI(AUTHORITY, PATH_SCORE + "/#", SCORE_ID);
		sURIMatcher.addURI(AUTHORITY, PATH_STATS, STATS);
		sURIMatcher.addURI(AUTHORITY, PATH_STATS + "/#", STATS_ID);
	}

	@Override
	public boolean onCreate() {
		database = new NewDatabaseHelper(getContext());
		return false;
	}
	
	public static NewDatabaseHelper GetDatabaseHelper(){
		return database;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		int uriType = sURIMatcher.match(uri);
		// Using SQLiteQueryBuilder instead of query() method
		SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();		
		
		switch (uriType) {
		case BUILD_ID:
			// adding the ID to the original query
			queryBuilder.appendWhere(Database.BUILD[0] + "="+ uri.getLastPathSegment());
		case BUILD:
			queryBuilder.setTables(Database.TABLES[0]);
			break;
		case PLATE_ID:
			// adding the ID to the original query
			queryBuilder.appendWhere(Database.PLATE[0] + "="+ uri.getLastPathSegment());
		case PLATE:
			queryBuilder.setTables(Database.TABLES[1]);
			break;
		case LANG_ID:
			// adding the ID to the original query
			queryBuilder.appendWhere(Database.LANG[0] + "="+ uri.getLastPathSegment());
		case LANG:
			queryBuilder.setTables(Database.TABLES[2]);
			break;
		case SCORE_ID:
			// adding the ID to the original query
			queryBuilder.appendWhere(Database.SCORE[0] + "="+ uri.getLastPathSegment());
		case SCORE:
			queryBuilder.setTables(Database.TABLES[3]);
			break;
		case STATS_ID:
			// adding the ID to the original query
			queryBuilder.appendWhere(Database.STATS[0] + "="+ uri.getLastPathSegment());
		case STATS:
			queryBuilder.setTables(Database.TABLES[4]);
			break;		
		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}

		SQLiteDatabase db = database.getWritableDatabase();
		Cursor cursor = queryBuilder.query(db, projection, selection, selectionArgs, null, null, sortOrder);
		// make sure that potential listeners are getting notified
		cursor.setNotificationUri(getContext().getContentResolver(), uri);

		return cursor;
	}

	@Override
	public String getType(Uri uri) {
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		int uriType = sURIMatcher.match(uri);
		SQLiteDatabase sqlDB = database.getWritableDatabase();		
		long id = 0;
		Uri uriParsed = null;
		
		switch (uriType) {
		case BUILD:
			id = sqlDB.insert(Database.TABLES[0], null, values);
			uriParsed = Uri.parse(PATH_BUILD + "/" + id);
			break;
		case PLATE:
			id = sqlDB.insert(Database.TABLES[1], null, values);
			uriParsed = Uri.parse(PATH_PLATE + "/" + id);
			break;
		case LANG:
			id = sqlDB.insert(Database.TABLES[2], null, values);
			uriParsed = Uri.parse(PATH_LANG + "/" + id);
			break;
		case SCORE:
			id = sqlDB.insert(Database.TABLES[3], null, values);
			uriParsed = Uri.parse(PATH_SCORE + "/" + id);
			break;
		case STATS:
			id = sqlDB.insert(Database.TABLES[4], null, values);
			uriParsed = Uri.parse(PATH_STATS + "/" + id);
		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}
		
		getContext().getContentResolver().notifyChange(uri, null);
		return uriParsed;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		int uriType = sURIMatcher.match(uri);
		SQLiteDatabase sqlDB = database.getWritableDatabase();
		int rowsDeleted = 0;
		String id = uri.getLastPathSegment();
		
		switch (uriType) {
		case BUILD_ID:			
			rowsDeleted = TextUtils.isEmpty(selection) ?
														sqlDB.delete(Database.TABLES[0], Database.BUILD[0] + "=" + id, null)
														:
														sqlDB.delete(Database.TABLES[0], Database.BUILD[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case BUILD:
			rowsDeleted = sqlDB.delete(Database.TABLES[0], selection, selectionArgs);
			break;
		case PLATE_ID:
			rowsDeleted = TextUtils.isEmpty(selection) ?
														sqlDB.delete(Database.TABLES[1], Database.PLATE[0] + "=" + id, null)
														:
														sqlDB.delete(Database.TABLES[1], Database.PLATE[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case PLATE:
			rowsDeleted = sqlDB.delete(Database.TABLES[1], selection, selectionArgs);
			break;
		case LANG_ID:
			rowsDeleted = TextUtils.isEmpty(selection) ?
														sqlDB.delete(Database.TABLES[2], Database.LANG[0] + "=" + id, null)
														:
														sqlDB.delete(Database.TABLES[2], Database.LANG[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case LANG:
			rowsDeleted = sqlDB.delete(Database.TABLES[2], selection, selectionArgs);
			break;
		case SCORE_ID:
			rowsDeleted = TextUtils.isEmpty(selection) ?
														sqlDB.delete(Database.TABLES[3], Database.SCORE[0] + "=" + id, null)
														:
														sqlDB.delete(Database.TABLES[3], Database.SCORE[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case SCORE:
			rowsDeleted = sqlDB.delete(Database.TABLES[3], selection, selectionArgs);
			break;
		case STATS_ID:
			rowsDeleted = TextUtils.isEmpty(selection) ?
														sqlDB.delete(Database.TABLES[4], Database.STATS[0] + "=" + id, null)
														:
														sqlDB.delete(Database.TABLES[4], Database.STATS[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case STATS:
			rowsDeleted = sqlDB.delete(Database.TABLES[4], selection, selectionArgs);
			break;		
		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}
		
		getContext().getContentResolver().notifyChange(uri, null);
		return rowsDeleted;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {

		int uriType = sURIMatcher.match(uri);
		SQLiteDatabase sqlDB = database.getWritableDatabase();
		int rowsUpdated = 0;
		String id = uri.getLastPathSegment();
		
		switch (uriType) {
		case BUILD_ID:			
			rowsUpdated = TextUtils.isEmpty(selection) ?
														sqlDB.update(Database.TABLES[0], values, Database.BUILD[0] + "=" + id, null)
														:
														sqlDB.update(Database.TABLES[0], values, Database.BUILD[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case BUILD:
			rowsUpdated = sqlDB.update(Database.TABLES[0], values, selection, selectionArgs);
			break;
		case PLATE_ID:
			rowsUpdated = TextUtils.isEmpty(selection) ?
														sqlDB.update(Database.TABLES[1], values, Database.PLATE[0] + "=" + id, null)
														:
														sqlDB.update(Database.TABLES[1], values, Database.PLATE[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case PLATE:
			rowsUpdated = sqlDB.update(Database.TABLES[1], values, selection, selectionArgs);
			break;
		case LANG_ID:
			rowsUpdated = TextUtils.isEmpty(selection) ?
														sqlDB.update(Database.TABLES[2], values, Database.LANG[0] + "=" + id, null)
														:
														sqlDB.update(Database.TABLES[2], values, Database.LANG[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case LANG:
			rowsUpdated = sqlDB.update(Database.TABLES[2], values, selection, selectionArgs);
			break;
		case SCORE_ID:
			rowsUpdated = TextUtils.isEmpty(selection) ?
														sqlDB.update(Database.TABLES[3], values, Database.SCORE[0] + "=" + id, null)
														:
														sqlDB.update(Database.TABLES[3], values, Database.SCORE[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case SCORE:
			rowsUpdated = sqlDB.update(Database.TABLES[3], values, selection, selectionArgs);
			break;
		case STATS_ID:
			rowsUpdated = TextUtils.isEmpty(selection) ?
														sqlDB.update(Database.TABLES[4], values, Database.STATS[0] + "=" + id, null)
														:
														sqlDB.update(Database.TABLES[4], values, Database.STATS[0] + "=" + id + " and " + selection, selectionArgs);
			break;
		case STATS:
			rowsUpdated = sqlDB.update(Database.TABLES[4], values, selection, selectionArgs);
			break;		
		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}
		
		getContext().getContentResolver().notifyChange(uri, null);
		return rowsUpdated;
	}
}
