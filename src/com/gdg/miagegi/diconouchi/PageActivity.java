package com.gdg.miagegi.diconouchi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class PageActivity extends Activity {
	private TextView page;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page);
		page = (TextView)findViewById(R.id.page);
		 if(getIntent().getExtras() != null){
	        	if(getIntent().getExtras().containsKey("page")){
	        		page.setText(getIntent().getExtras().getString("page"));}}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_page, menu);
		return true;
	}

}
