package com.example.siddharth.sqlitedemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GetContactDetailsActivity extends AppCompatActivity {

	EditText ID;
	TextView details;
	
	DatabaseHandler db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_contact_details);
		ID = (EditText)findViewById(R.id.editID);
		details = (TextView)findViewById(R.id.textDetails);
	}
	
	public void onClickGet(View v)
	{
		Log.d("SID","Datahandler object is being created from GetContactDetalsActivity.");
		db = new DatabaseHandler(this);
		Contact contact = db.getContact(Integer.parseInt(ID.getText().toString()));
		if(contact!=null)
		{
			details.setText("ID : "+contact.getID()+"\nName : "+contact.getName()+"\nPhone Number : "+contact.getPhoneNumber());
		}
		else
		{
			details.setText("There is no contact with ID : "+ID.getText().toString() );
		}
	}

	public void onClickBack(View v)
	{
		db.close();
		finish();
	}
}
