package com.guess.license.plate.Repository;

public enum GameMode {
	EASY(0),
	MEDIUM(1),
	HARD(2),
	ALL_PLATES(3),
	NO_FAULT(4);
	
	private final int id;
	
	GameMode(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
}
