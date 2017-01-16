package com.guess.license.plate.Adapter;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Model.Plate;
import com.guess.license.plate.Repository.Utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListPlateAdapter extends ArrayAdapter<Plate> {
	private final SherlockActivity activity;
	private final Context context;
	private final ArrayList<Plate> plateList;
	private int layout;

	public ListPlateAdapter(SherlockActivity activity, Context context, ArrayList<Plate> plateList, int layout) {
		super(context, layout, plateList);
		this.activity = activity;
		this.context = context;
		this.plateList = plateList;
		this.layout = layout;
	}

	
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ViewHolder holder = null;
		
		if(view == null){			
			// Setting the Layout
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(layout, parent, false);
			holder = new ViewHolder();
			holder.plateImage = (ImageView) view.findViewById(R.id.image);
			holder.plateName = (TextView) view.findViewById(R.id.name);
			view.setTag(holder);		
		}else{
			holder = (ViewHolder) view.getTag();
		}
		
		// Setting the image
		String plateImage = plateList.get(position).getImgID();
		int imgID = Utility.GetResId(plateImage, context, R.drawable.class);
		holder.plateImage.setImageResource(imgID);
		Utility.ScaleSizeForTable(context, holder.plateImage);
		
		// Setting the name
		String plateName = plateList.get(position).getLanguage();
		holder.plateName.setText(plateName);
		holder.plateName.setTypeface(Utility.GetFont(activity));
				
		return view;
	}
	
	
	static class ViewHolder {
	  ImageView plateImage;
	  TextView plateName;
	 }	
}