package com.gdg.miagegi.diconouchi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Alphabet extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 String[] values = new String[] { "A","B","C","D","E","F","G","J","K","L","M","N","O","P","Q","R","S","T","V","W","Y","Z" };
		    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1, values);
		    setListAdapter(adapter);
		  }

		  @Override
		  protected void onListItemClick(ListView l, View v, int position, long id) {
			  Intent motIntent = new Intent(this, MotActivity.class);
			  if (position==0){
				  motIntent.putExtra("letter","a" );
				  startActivity(motIntent);
			  }else if (position==1){
				  motIntent.putExtra("letter","b" );
				  startActivity(motIntent);
			  }else if (position==2){
				  motIntent.putExtra("letter","c" );
				  startActivity(motIntent);
			  }else if (position==3){
				  motIntent.putExtra("letter","d" );
				  startActivity(motIntent);
			  }else if (position==4){
				  motIntent.putExtra("letter","e" );
				  startActivity(motIntent);
			  }else if (position==5){
				  motIntent.putExtra("letter","f" );
				  startActivity(motIntent);
			  }else if (position==6){
				  motIntent.putExtra("letter","g" );
				  startActivity(motIntent);
			  
			  }else if (position==7){
				  motIntent.putExtra("letter","j" );
				  startActivity(motIntent);
			  }else if (position==8){
				  motIntent.putExtra("letter","k" );
				  startActivity(motIntent);
			  }else if (position==9){
				  motIntent.putExtra("letter","l" );
				  startActivity(motIntent);
			  }else if (position==10){
				  motIntent.putExtra("letter","m" );
				  startActivity(motIntent);
			  }else if (position==11){
				  motIntent.putExtra("letter","n" );
				  startActivity(motIntent);
			  }else if (position==12){
				  motIntent.putExtra("letter","o" );
				  startActivity(motIntent);
			  }else if (position==13){
				  motIntent.putExtra("letter","p" );
				  startActivity(motIntent);
			  }else if (position==14){
				  motIntent.putExtra("letter","q" );
				  startActivity(motIntent);
			  }else if (position==15){
				  motIntent.putExtra("letter","r" );
				  startActivity(motIntent);
			  }else if (position==16){
				  motIntent.putExtra("letter","s" );
				  startActivity(motIntent);
			  }else if (position==17){
				  motIntent.putExtra("letter","t" );
				  startActivity(motIntent);
			 
			  }else if (position==18){
				  motIntent.putExtra("letter","v" );
				  startActivity(motIntent);
			  }else if (position==19){
				  motIntent.putExtra("letter","w" );
				  startActivity(motIntent);
			
			  }else if (position==20){
				  motIntent.putExtra("letter","y" );
				  startActivity(motIntent);
			  }else if (position==21){
				  motIntent.putExtra("letter","z" );
				  startActivity(motIntent);
			  }
              
			  
			  
		  }
		} 