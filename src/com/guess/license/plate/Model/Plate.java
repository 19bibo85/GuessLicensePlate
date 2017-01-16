package com.guess.license.plate.Model;

public class Plate extends PlateBase{
	private int difficulty;	
	private String country;
	private String continent;
	
	public Plate(){}
	
	// Setters defined in SuperClass
	public void setID(int id){
		super.setID(id);
	}
	
	public void setName(String name){
		super.setName(name);
	}
	
	public void setLanguage(String language){
		super.setLanguage(language);
	}
	
	public void setImgID(String imgID){
		super.setImgID(imgID);
	}
		
	// Setters defined in SubClass
	public void setDifficulty(int difficulty){
		this.difficulty = difficulty;
	}
	
	public void setCountry(String country){
		this.country = country;		
	}
	
	public void setContinent(String continent){
		this.continent = continent;
	}
	
	// Getters defined in SuperClass
	public int getId(){
		return super.getId();
	}
	
	public String getName(){
		return super.getName();
	}
	
	public String getLanguage(){
		return super.getLanguage();
	}
	
	public String getImgID(){
		return super.getImgID();
	}
	
	// Getters defined in SubClass	
	public int getDifficulty(){
		return difficulty;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String getContinent(){
		return continent;
	}
}
