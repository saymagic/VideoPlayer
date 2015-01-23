package com.cherry.videoplayer;


import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.IntToString;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button mBtnMovie;
	private Button mBtnMVMonster;
	private Button mBtnGravity;
	private ArrayList<String> urlList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
		setListers();
	}

	private void setListers() {
		mBtnMovie.setOnClickListener(this);
		mBtnMVMonster.setOnClickListener(this);
		mBtnGravity.setOnClickListener(this);
		urlList = new ArrayList<String>();
	}

	private void initViews() {
		mBtnMovie = (Button) findViewById(R.id.btn_movie);
		mBtnMVMonster = (Button) findViewById(R.id.btn_mv_monster);
		mBtnGravity = (Button) findViewById(R.id.btn_mv_gravity);
	}

	@Override
	public void onClick(View v) {
		Intent intent=new Intent();
		intent.putExtra("from", "MainActivity");
		switch (v.getId()) {
		case R.id.btn_movie:
			urlList.clear();
			urlList.add("http://7u2ope.com1.z0.glb.clouddn.com/惊天魔盗团_高清.mp4");
			intent.putExtra("name", "惊天魔盗团");
			intent.putExtra("url", urlList);
			intent.setClass(MainActivity.this, PlayActivity.class);
			startActivity(intent);
			break;
		case R.id.btn_mv_monster:
			urlList.clear();
			urlList.add("http://7u2ope.com1.z0.glb.clouddn.com/The_Monster_高清.mp4");
			intent.putExtra("name", "The Monster _高清");
			intent.putExtra("url", urlList);
			intent.setClass(MainActivity.this, PlayActivity.class);
			startActivity(intent);
			break;
		case R.id.btn_mv_gravity:
			urlList.clear();
			urlList.add("http://7u2ope.com1.z0.glb.clouddn.com/Gravity_高清.mp4");
			intent.putExtra("name", "Gravity_高清");
			intent.putExtra("url", urlList);
			intent.setClass(MainActivity.this, PlayActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
