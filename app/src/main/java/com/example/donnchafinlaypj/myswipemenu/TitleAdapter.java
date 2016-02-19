/*
 * Created on 19/02/16, 15:37
 *
 * Copyright(c) 2016 PagesJaunes, SoLocal Group - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited. Proprietary and confidential
 *
 */
package com.example.donnchafinlaypj.myswipemenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TitleAdapter extends ArrayAdapter<Title>
{

	private List<Title> titleList;
	private Context context;

	public TitleAdapter(List<Title> planetList, Context ctx)
	{
		super(ctx, R.layout.line1, planetList);
		this.titleList = planetList;
		this.context = ctx;
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{

		// First let's verify the convertView is not null

		if (convertView == null)
		{
			// This a new view we inflate the new layout
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.line1, parent, false);
		}
		// Now we can fill the layout with the right values
		TextView tv = (TextView) convertView.findViewById(R.id.name);
		TextView distView = (TextView) convertView.findViewById(R.id.dist);
		Title p = titleList.get(position);

		tv.setText(p.getName());
		distView.setText("" + p.getDist());

		return convertView;
	}
}
