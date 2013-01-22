package com.obriand.android_xmljson;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private static final String TAG = "com.obriand.android_xmljson.MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void mainactivity_load_xml_bt(View view) {
		Log.i(TAG, "load and parse xml");
		
		// Get Count Items from Content Provider

		Toast.makeText(this, "load and parse xml", Toast.LENGTH_LONG).show();
	}
	
	public void mainactivity_load_json_bt(View view) {
		Log.i(TAG, "load and parse json");
		
		// Get Count Items from Content Provider

		Toast.makeText(this, "load and parse json", Toast.LENGTH_LONG).show();
	}

}
