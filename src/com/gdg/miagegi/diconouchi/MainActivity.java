package com.gdg.miagegi.diconouchi;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void Rechercher(View v)
	
	{
		
		onSearchRequested();
	}
	public void Dictionnaire(View v)
	{
	startActivity(new Intent(this,Alphabet.class));	
	}
	public void Nouchi(View v)
	{
		startActivity(new Intent(this,Infos.class));		
	}
	public void Propos(View v)
	{
		Credit about = new Credit(this);
		about.setTitle("Credit");
		about.show();	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu ,menu);
		return true;
	}

}
