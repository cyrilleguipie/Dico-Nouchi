package com.gdg.miagegi.diconouchi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.widget.TextView;

public class Credit extends Dialog{

	private static Context mContext = null;
	
	public Credit(Context context) {
		super(context);
		mContext = context;
	}
	
	/**
     * This is the standard Android on create method that gets called when the activity initialized.
     */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.credit);
		
		TextView tv = (TextView)findViewById(R.id.about_text);
		tv.setText(Html.fromHtml(readRawTextFile(R.raw.about)));
		
		tv.setTextSize(12);
				
		tv.setLinkTextColor(Color.YELLOW);
		Linkify.addLinks(tv, Linkify.ALL);
	}
	
	public static String readRawTextFile(int id) {
		InputStream inputStream = mContext.getResources().openRawResource(id);
        InputStreamReader in = new InputStreamReader(inputStream);
        BufferedReader buf = new BufferedReader(in);
        String line;
        StringBuilder text = new StringBuilder();
        try {
        	while (( line = buf.readLine()) != null) text.append(line);
         } catch (IOException e) {
            return null;
         }
         return text.toString();
     }

}

