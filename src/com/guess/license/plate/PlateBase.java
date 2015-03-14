package com.guess.license.plate;

public class PlateBase {
	private int id;
	private String name;
	private String language;
	private String imgID;
	
	public PlateBase(){}
	
	public PlateBase(int id, String name, String language, String imgID){
		this.id = id;
		this.name = name;
		this.language = language;
		this.imgID = imgID;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLanguage(String language){
		this.language = language;
	}
	
	public void setImgID(String imgID){
		this.imgID = imgID;		
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getLanguage(){
		return language;
	}
	
	public String getImgID(){
		return imgID;
	}
}
