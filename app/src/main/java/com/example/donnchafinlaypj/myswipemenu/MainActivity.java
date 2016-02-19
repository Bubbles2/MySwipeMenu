package com.example.donnchafinlaypj.myswipemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
	//LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
	ArrayList<Title> listItems=new ArrayList<Title>();
	//DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
	TitleAdapter adapter;
	int clickCounter=0;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// Create Data
		Title t1 = new Title("Saturn", "12");
		Title t2 = new Title("Mercury", "25");
		listItems.add(t1);
		listItems.add(t2);


		//RECORDING HOW MANY TIMES THE BUTTON HAS BEEN CLICKED

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		ListView lv = (ListView) findViewById(R.id.listView);
		RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.RL1);
		RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.RL2);
		//
		adapter= new TitleAdapter(listItems,this);

		lv.setAdapter(adapter);

	}
	public void addItems(View v) {
	//	listItems.add("Clicked : "+clickCounter++);
		adapter.notifyDataSetChanged();
	}
}
