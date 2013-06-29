package com.gdg.miagegi.diconouchi;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class Infos extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infos);
		WebView descriptionView = (WebView)findViewById(R.id.webView1);
        descriptionView.getSettings().setAllowFileAccess(true);
        descriptionView.loadUrl("file:///android_res/raw/infos.html");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.infos, menu);
		return true;
	}

}
