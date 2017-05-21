package com.guess.license.plate.Network;

public class WebConf {
	
	// Database connection string
	//public static final String DB_CONN = "http://192.168.0.16:8080/";
	
	public static final String DB_CONN = "http://albertotosibrandi.comeze.com/";
	
	// Database URI path
	public static final String URI_PATH = "GuessLicensePlatePHP/src/";
	
	// JSON Generator file
	public static final String URI_FILE = "JSONGenerator.php";
	
	// Separator used in the URI
	public static final String URI_SEP = "?";
	
	// First parameter used with the connection string 
	public static final String[] PARAMETER = {"table=", "format="};
	
	// Separator used between the parameters
	public static final String PAR_SEP = "&";
	
	// Connection status code to web service OK
	public static final int STATUS_CODE = 200;
	
	// JSON objects mapped from the DB tables
	public static final String[] JSON_OBJECTS = {"Build", "Plate", "Language"};
	
	// Extension of the entity provided from the Online DB 
	public static final String[] EXSTENSION = {"json"};
	
	public static final int DEFAULT_VERSION = 1;
	
	// JSON Elements for Build
	public static final String TAG_BUILD_NUMBER = "Number";
	public static final String TAG_BUILD_NAME = "Name";
	public static final String TAG_BUILD_VERSION = "Version";
	public static final String TAG_BUILD_DEVELOPER = "Developer";
	
	// JSON Elements for Plate file, these elements are the DB fields for table Plate
	public static final String TAG_PLATE_NAME = "Name";
	public static final String TAG_PLATE_IMG_ID = "ImgID";
	public static final String TAG_PLATE_COUNTRY = "Country";
	public static final String TAG_PLATE_DIFFICULTY = "Difficulty";
	public static final String TAG_PLATE_VERSION = "Version";
	public static final String TAG_PLATE_CONTINENT = "Continent";
	
	// JSON Elements for Language file, these elements are the DB fields for table Language
	public static final String TAG_LANGUAGE_IMG_ID = "ImgID";
	public static final String TAG_LANGUAGE_VERSION = "Version";
	public static final String TAG_LANGUAGE_ENGLISH = "English";
	public static final String TAG_LANGUAGE_ITALIAN = "Italian";
	public static final String TAG_LANGUAGE_SPANISH = "Spanish";
	public static final String TAG_LANGUAGE_FRENCH = "French";
	public static final String TAG_LANGUAGE_PORTUGUESE = "Portuguese";
}