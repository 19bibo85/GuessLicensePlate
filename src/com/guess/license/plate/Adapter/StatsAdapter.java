package com.guess.license.plate.Adapter;

import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;
import com.guess.license.plate.release.R;
import com.guess.license.plate.Adapter.ReviewAdapter.ViewHolder;
import com.guess.license.plate.Model.PlateBase;
import com.guess.license.plate.Repository.Utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StatsAdapter extends ArrayAdapter<PlateBase> {
	private final SherlockActivity activity;
	private Context context;
	private ArrayList<PlateBase> statsList;

	public StatsAdapter(SherlockActivity activity, Context context, ArrayList<PlateBase> statsList) {
		super(context, R.layout.stats_custom, statsList);
		this.activity = activity;
		this.context = context;
		this.statsList = statsList;
	}

	
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ViewHolder holder = null;
		
		if(view == null){	
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			// Setting the Layout
			view = inflater.inflate(R.layout.stats_custom, parent, false);
			holder = new ViewHolder();
			holder.plateImage = (ImageView) view.findViewById(R.id.image);
			Utility.ScaleSizeForTable(context, holder.plateImage);
			holder.plateName1 = (TextView) view.findViewById(R.id.name);
			view.setTag(holder);		
		}else{
			holder = (ViewHolder) view.getTag();
		} 
		
		String imagine = statsList.get(position).getImgID();
		int imgID = Utility.GetResId(imagine, context, R.drawable.class);
		holder.plateImage.setImageResource(imgID);
		
		String name1 = statsList.get(position).getName();
		holder.plateName1.setText(name1);
		holder.plateName1.setTypeface(Utility.GetFont(activity));
				
		return view;
	}	
}