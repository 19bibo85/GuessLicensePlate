package com.guess.license.plate;

import java.util.ArrayList;

public class Review {
	private String imagePlate, namePlate1, namePlate2, namePlate3, namePlate4, correctAnswer, country, imgID;
	private ArrayList<String> wrongAnswers = new ArrayList<String>();
	
	public void setImagePlate(String imagePlate){
		this.imagePlate = imagePlate;
	}
	
	public void setNamePlate1(String namePlate1){
		this.namePlate1 = namePlate1;
	}
	
	public void setNamePlate2(String namePlate2){
		this.namePlate2 = namePlate2;
	}
	
	public void setNamePlate3(String namePlate3){
		this.namePlate3 = namePlate3;
	}
	
	public void setNamePlate4(String namePlate4){
		this.namePlate4 = namePlate4;
	}
	
	public void setCorrectAnswer(String correctAnswer){
		this.correctAnswer = correctAnswer;
	}	
	
	public void setWrongAnswers(String wrongAnswer){
		wrongAnswers.add(wrongAnswer);
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public void setImgID(String imgID){
		this.imgID = imgID;
	}
	
	public String getImagePlate(){
		return imagePlate;
	}
	
	public String getNamePlate1(){
		return namePlate1;
	}
	
	public String getNamePlate2(){
		return namePlate2;
	}
	
	public String getNamePlate3(){
		return namePlate3;
	}
	
	public String getNamePlate4(){
		return namePlate4;
	}
	
	public String getCorrectAnswer(){
		return correctAnswer;
	}
	
	public ArrayList<String> getWrongAnswer(){
		return wrongAnswers;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String getImgID(){
		return imgID;
	}
}
