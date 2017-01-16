package com.guess.license.plate.Repository;

public enum Preferences {
	LANGUAGE("pref_language"),
	THEME("pref_theme"),
	RANGE("pref_range"),
	UPDATE("pref_update"),
	SOUND("pref_sound"),	
	CLEAR("pref_clear");
	
	String key;
	private Preferences(String key)
	{
		this.key = key;
	}
	
	public String toString()
	{
		return key;
	}
}
