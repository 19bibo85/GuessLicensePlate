package com.guess.license.plate.Adapter;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Model.Review;
import com.guess.license.plate.Repository.Utility;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ReviewAdapter extends ArrayAdapter<Review> {
	private final SherlockActivity activity;
	private final Context context;
	private final ArrayList<Review> reviewList;

	public ReviewAdapter(SherlockActivity activity, Context context, ArrayList<Review> reviewList) {
		super(context, R.layout.review_custom, reviewList);
		this.activity = activity;
		this.context = context;
		this.reviewList = reviewList;
	}

	
	public View getView(int position, View convertView, ViewGroup parent) {		
		View view = convertView;
		ViewHolder holder = null;
		
		if(view == null){			
			// Setting the Layout
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.review_custom, parent, false);
			holder = new ViewHolder();
			holder.plateImage = (ImageView) view.findViewById(R.id.image);
			Utility.ScaleSizeForTable(context, holder.plateImage);
			holder.plateName1 = (TextView) view.findViewById(R.id.name1);
			holder.plateName2 = (TextView) view.findViewById(R.id.name2);
			holder.plateName3 = (TextView) view.findViewById(R.id.name3);
			holder.plateName4 = (TextView) view.findViewById(R.id.name4);
			view.setTag(holder);		
		}else{
			holder = (ViewHolder) view.getTag();
		}
		
		// Setting the image
		String plateImage = reviewList.get(position).getImgID();
		int imgID = Utility.GetResId(plateImage, context, R.drawable.class);
		holder.plateImage.setImageResource(imgID);
		
		String correct = reviewList.get(position).getCorrectAnswer();
		ArrayList<String> wrongs = reviewList.get(position).getWrongAnswer();
		String[] answers = { reviewList.get(position).getNamePlate1(),
				reviewList.get(position).getNamePlate2(),
				reviewList.get(position).getNamePlate3(),
				reviewList.get(position).getNamePlate4() };
		
		// Setting plate name 1
		String plateName1 = answers[0];
		holder.plateName1.setText(plateName1);
		holder.plateName1.setTypeface(Utility.GetFont(activity));
		
		// Setting plate name 2
		String plateName2 = answers[1];
		holder.plateName2.setText(plateName2);
		holder.plateName2.setTypeface(Utility.GetFont(activity));
		
		// Setting plate name 3
		String plateName3 = answers[2];
		holder.plateName3.setText(plateName3);
		holder.plateName3.setTypeface(Utility.GetFont(activity));
		
		// Setting plate name 4
		String plateName4 = answers[3];
		holder.plateName4.setText(plateName4);
		holder.plateName4.setTypeface(Utility.GetFont(activity));
		
		colorAnswers(holder, answers, correct, wrongs);
		
		return view;
	}
	
	
	private void colorAnswers(ViewHolder holder, String[] answers, String correct, ArrayList<String> wrongs) {
		
		// Set the holder text view with the default colour
		holder.plateName1.setTextColor(Color.BLACK);
		holder.plateName2.setTextColor(Color.BLACK);
		holder.plateName3.setTextColor(Color.BLACK);
		holder.plateName4.setTextColor(Color.BLACK);
		
		// Setting the colour of the answers to green if it's correct or to red if are wrongs
		for (int i = 0; i <= answers.length; i++) {
						
			if (answers[0].equals(correct))
				holder.plateName1.setTextColor(Color.GREEN);
			else if (answers[1].equals(correct))
				holder.plateName2.setTextColor(Color.GREEN);
			else if (answers[2].equals(correct))
				holder.plateName3.setTextColor(Color.GREEN);
			else if (answers[3].equals(correct))
				holder.plateName4.setTextColor(Color.GREEN);
			
			if (wrongs.contains(answers[0]))
				holder.plateName1.setTextColor(Color.RED);
			if (wrongs.contains(answers[1]))
				holder.plateName2.setTextColor(Color.RED);
			if (wrongs.contains(answers[2]))
				holder.plateName3.setTextColor(Color.RED);
			if (wrongs.contains(answers[3]))
				holder.plateName4.setTextColor(Color.RED);
		}
	}
	
	static class ViewHolder {
	  ImageView plateImage;
	  TextView plateName1;
	  TextView plateName2;
	  TextView plateName3;
	  TextView plateName4;
	 }	
}