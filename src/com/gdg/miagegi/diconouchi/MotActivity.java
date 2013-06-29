package com.gdg.miagegi.diconouchi;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.app.ListActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import com.gdg.miagegi.diconouchi.DictionaryDatabase;


public class MotActivity extends ListActivity {

private String lettre;	
DictionaryDatabase db = new DictionaryDatabase(this);
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        if(getIntent().getExtras() != null){
        	if(getIntent().getExtras().containsKey("letter")){
        		lettre=getIntent().getExtras().getString("letter");}}
       
        
        // -- android.R.layout.simple_list_item_1 is object which belong to ListActivity itself
        // -- you only need to add list object in your main layout file
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, db.Results(lettre))); 
    }
       
        
    
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	String item = (String) getListAdapter().getItem(position);
    	Intent pageIntent = new Intent(this, PageActivity.class);
		  
			  pageIntent.putExtra("page",item);
			  startActivity(pageIntent);
}

 
}

