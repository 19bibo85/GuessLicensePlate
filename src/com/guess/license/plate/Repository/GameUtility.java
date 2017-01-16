package com.guess.license.plate.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.guess.license.plate.release.R;
import com.guess.license.plate.Activity.GameActivity;
import com.guess.license.plate.Activity.StartActivity;
import com.guess.license.plate.Database.DatabaseHelper;
import com.guess.license.plate.Model.Plate;
import com.guess.license.plate.Model.Review;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.widget.ImageView;

/**
 * This class provides some utilities for the construction of the game layout.
 * 
 * @author Alberto Tosi Brandi
 * 
 */
public class GameUtility {

	public static Plate correctPlate;
	public static Review review;
	
	// Note this method prints the image selected
	public static void SetImage(ImageView image, Context context, String imageString) {
		int imgID = Utility.GetResId(imageString, context, R.drawable.class);
		image.setImageResource(imgID);
		Utility.ScaleSizeForTable(context, image);
	}
	
	private static MediaPlayer answer = null;
	
	public static void SetAudio(Context context, boolean isActive, boolean isCorrect){
		if(answer != null && isActive){
			int audioID = isCorrect ? R.raw.shiny_ding : R.raw.buzzer;
			try {
				answer.reset();
				AssetFileDescriptor afd = context.getResources().openRawResourceFd(audioID);
				if (afd == null) return;			
				answer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
				afd.close();
				answer.prepare();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Log.e("GAME_UTILITY", audioID + "");
			if(answer.isPlaying())
				answer.seekTo(0);
			else
				answer.start();
		}
	}
	
	public static void CreateAudio(Context context){
		if(answer == null)
			answer = MediaPlayer.create(context, R.raw.shwink);
	}

	/**
	 * Note this method, after choosing a random License Plate, draw the image,
	 * sets the layout, creates a list of answers and inserts the License Plate
	 * answers on the buttons.
	 * 
	 * @param licensePlate
	 *            License plate names choose
	 * @param imageView
	 *            Image object
	 * @param button1
	 *            First button object
	 * @param button2
	 *            Second button object
	 * @param button3
	 *            Third button object
	 * @param button4
	 *            Fourth button object
	 * @throws CloneNotSupportedException 
	 */
	public static void SetDataGame(Context context, ImageView imageView) throws CloneNotSupportedException {
		// Getting the clone plate list		
		ArrayList<Plate> clonePlateList = GameActivity.CloPlateList;
						
		// Choose a Random plate from the plate list
		Plate plate = GetRandomPlate(clonePlateList, false, false);
		
		// Setting the image of the plate chose
		SetImage(imageView, context, plate.getImgID());
		
		// Plate chose is the correct plate
		correctPlate = plate;
		
		// Setting the progress
		SetProgressAndTotal();

		// A new list of plate with answer
		ArrayList<Plate> answerPlateList = new ArrayList<Plate>();
		// adding the correct Plate to the answer
		answerPlateList.add(plate);
		
		// Adding the correct answer to the list of plate in review
		review = new Review();
		review.setCorrectAnswer(plate.getLanguage());
		review.setImgID(plate.getImgID());
				
		// Removing to the clone of the list of plate the correct answer
		clonePlateList.remove(plate);
		
		// Create a new clone for plate list, needs to chose the wrong answers
		@SuppressWarnings("unchecked")
		ArrayList<Plate> wrongCloPlateList = (ArrayList<Plate>) GameActivity.OrgPlateList.clone();
		// All the plate can be generate except the correct one
		wrongCloPlateList.remove(plate);
		
		// Generate the first wrong answer, adding to the answer list and remove to the clone
		Plate wrongPlate1 = GetRandomPlate(wrongCloPlateList, true, SetSimilarWrongPlate()[0]);
		answerPlateList.add(wrongPlate1);
		wrongCloPlateList.remove(wrongPlate1);
		
		// Generate the second wrong answer, adding to the answer list and remove to the clone
		Plate wrongPlate2 = GetRandomPlate(wrongCloPlateList, true, SetSimilarWrongPlate()[1]);
		answerPlateList.add(wrongPlate2);
		wrongCloPlateList.remove(wrongPlate2);
		
		// Generate the third wrong answer, adding to the answer list and remove to the clone
		Plate wrongPlate3 = GetRandomPlate(wrongCloPlateList, true, SetSimilarWrongPlate()[2]);
		answerPlateList.add(wrongPlate3);
		wrongCloPlateList.remove(wrongPlate3);

		// Getting randomly the answers from the possible answers,
		// setting the text on the button, set the translation in review
		// and removing from the answer list
		Plate plate1 = GetRandomPlate(answerPlateList, false, false);
		GameActivity.Button1.setText(plate1.getLanguage());
		review.setNamePlate1(plate1.getLanguage());
		answerPlateList.remove(plate1);
		
		Plate plate2 = GetRandomPlate(answerPlateList, false, false);
		GameActivity.Button2.setText(plate2.getLanguage());
		review.setNamePlate2(plate2.getLanguage());
		answerPlateList.remove(plate2);
		
		Plate plate3 = GetRandomPlate(answerPlateList, false, false);
		GameActivity.Button3.setText(plate3.getLanguage());
		review.setNamePlate3(plate3.getLanguage());
		answerPlateList.remove(plate3);
		
		Plate plate4 = (Plate) answerPlateList.get(0);
		GameActivity.Button4.setText(plate4.getLanguage());
		review.setNamePlate4(plate4.getLanguage());
		answerPlateList.remove(plate4);
	}

	public static ArrayList<Plate> CopyDbToList(ArrayList<Plate> plateList, Context context, String where) {
		String query = Utility.GetPlates(context, where);
		DatabaseHelper databaseHelper = new DatabaseHelper(context);
		SQLiteDatabase db = databaseHelper.getReadableDatabase();
		
		Cursor cursor = db.rawQuery(query, null);
		int count = cursor.getCount();
		
		if(count > 0){
		
			while (cursor.moveToNext()) {
				String name;
				int difficulty;
				String language;
				String country;
				String imgID;
				String continent;
				Plate plate;
	
				if (cursor.isNull(0))
					name = "ABKHAZIA";
				else
					name = cursor.getString(0);
	
				if (cursor.isNull(1))
					difficulty = 0;
				else
					difficulty = cursor.getInt(1);
	
				if (cursor.isNull(2))
					language = "ABKHAZIA";
				else
					language = cursor.getString(2);
	
				if (cursor.isNull(3))
					country = "Europe";
				else
					country = cursor.getString(3);
				
				if (cursor.isNull(4))
					imgID = "eu_abk_001";
				else
					imgID = cursor.getString(4);
				
				if (cursor.isNull(4))
					continent = "Europe";
				else
					continent = cursor.getString(5);
				
				
				plate = new Plate();
				plate.setName(name);
				plate.setDifficulty(difficulty);
				plate.setLanguage(language);
				plate.setCountry(country);
				plate.setImgID(imgID);
				plate.setContinent(continent);
				plateList.add(plate);
			}
		}
		
		db.close();

		return plateList;
	}

	/**
	 * Note this method sets a list of the plates based on their difficulties.
	 * 
	 * 
	 * @param type
	 *            If Easy, Medium or Hard
	 * @param plateList
	 *            List with all of the the plates
	 * @return Plate list with only the plates belong to the level choose
	 */
	public static ArrayList<Plate> GetPlateOnDifficulty(){
		ArrayList<Plate> plateListDiff = new ArrayList<Plate>();		
		ArrayList<Plate> plateList = GameActivity.OrgPlateList;
		
		int length = plateList.size();
		
		for (int i = 0; i < length; i++) {			
			switch(StartActivity.GameModeVal){
				case ALL_PLATES:
				case NO_FAULT:
					plateListDiff.add(plateList.get(i));
					break;
				case EASY:
					if(plateList.get(i).getDifficulty() >= 0 || plateList.get(i).getDifficulty() <= 1)
						plateListDiff.add(plateList.get(i));
					break;
				case MEDIUM:
					if(plateList.get(i).getDifficulty() >= 0 && plateList.get(i).getDifficulty() <= 2) 
						plateListDiff.add(plateList.get(i));
					break;
				case HARD:
					if(plateList.get(i).getDifficulty() >= 1 && plateList.get(i).getDifficulty() <= 3) 
						plateListDiff.add(plateList.get(i));
					break;
			}
		}
		
		return plateListDiff;
	}

	private static boolean[] SetSimilarWrongPlate() {
		boolean[] similarWrongPlate = new boolean[3];
		GameMode difficultyType = StartActivity.GameModeVal;
		
		switch(difficultyType){
			case EASY:
				similarWrongPlate[0] = true;
				similarWrongPlate[1] = false;
				similarWrongPlate[2] = false;
				break;
			case MEDIUM:
				similarWrongPlate[0] = true;
				similarWrongPlate[1] = true;
				similarWrongPlate[2] = false;
				break;
			case HARD:
				similarWrongPlate[0] = true;
				similarWrongPlate[1] = true;
				similarWrongPlate[2] = true;
				break;
			default:
				break;
		}
		
		return similarWrongPlate;
	}

	/**
	 * Note this method choose a random object.
	 * 
	 * @param PlateList
	 *            List with all the plate for the level choose
	 * @param Type
	 *            if it needs to be choose following the first letter of the
	 *            correct plate or not.
	 * @return The plate randomly choose
	 */
	private static Plate GetRandomPlate(ArrayList<Plate> plateList, boolean hasToCheckCorrPlate, boolean hasToBeSimilar) {
		
		if(plateList == null || !(plateList.size() > 0)){
			Plate plate = new Plate();
			plate.setImgID("eu_abk_001");
			plate.setLanguage("ABKHAZIA");
			plate.setName("ABKHAZIA");
			plate.setDifficulty(0);
			plate.setCountry("Europe");
			plate.setContinent("Europe");
			return plate;
		}
		
		// Getting a random plate from the list
		int length = plateList.size();
		Random random = new Random();
		int num = random.nextInt(length);
		Plate randomPlate = plateList.get(num);
		
		if(hasToCheckCorrPlate){
			// Getting the first char of the correct plate
			char charCorrectPlate = correctPlate.getName().charAt(0);
			// Getting continent correct plate
			String contCorrPlate = correctPlate.getContinent();
			
			// In case has to be similar checks if the first char of the correct plate is equal
			// to the first char of the plate chosen otherwise the opposite
			ArrayList<Plate> othersPlate = new ArrayList<Plate>();
			for (int i = 0; i < length; i++) {
				Plate plate = plateList.get(i);
				String countryPlateChoosen = plate.getContinent();
				
				boolean isSimilar = hasToBeSimilar ? 
												(plate.getName().charAt(0) == charCorrectPlate && contCorrPlate.equals(countryPlateChoosen)) ? true : false
												:
												(plate.getName().charAt(0) != charCorrectPlate && contCorrPlate.equals(countryPlateChoosen)) ? true : false;
												
				if(isSimilar)
					othersPlate.add(plate);
			}
			
			if (othersPlate.size() != 0) {
				num = random.nextInt(othersPlate.size());
				randomPlate = othersPlate.get(num);
			}
		}
		
		return randomPlate;
	}

	/**
	 * Note this method sets the variables Progress and Total
	 * 
	 * @param licensePlate
	 *            List of license plate name
	 */
	private static void SetProgressAndTotal() {
		switch(StartActivity.GameModeVal){
			case NO_FAULT:
			case ALL_PLATES:
				int sizeOrg = GameActivity.OrgPlateList.size();
				int sizeClone = GameActivity.CloPlateList.size();				
				GameActivity.Progress.setText(Integer.toString(sizeOrg - sizeClone).concat("/"));
				GameActivity.Total.setText(Integer.toString(sizeOrg));
			break;
			default:
				break;
		}
	}
}
