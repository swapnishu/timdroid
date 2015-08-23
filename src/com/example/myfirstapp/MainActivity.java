package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	private MyFirstClass myFirstClass;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {//executes when application starts
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		int i = 9;
//		int j = 0;
//		int res = i/j;
		//Toast toast = Toast.makeText(this, "MyFirstAwesomeApp has successfully loaded", Toast.LENGTH_LONG);
		//toast.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		Toast toast = Toast.makeText(this, "Curretly in onCreateOptions Menu", Toast.LENGTH_LONG);
		toast.show();
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast toast = Toast.makeText(this, "Settings was pressed", Toast.LENGTH_LONG);
			toast.show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
