package com.guess.license.plate.Repository;

public enum Stats {
	GENERAL(0),
	GAME_TIME(1),
	GAME_NO_TIME(2);
	
	private int mode;
	Stats(int mode){
		this.mode = mode;
	}
	
	public int getModeId(){
		return mode;
	}
}
