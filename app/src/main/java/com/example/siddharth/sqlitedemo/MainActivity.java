package com.example.siddharth.sqlitedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.insertButton)
        {
            Intent i = new Intent(this, FillFormActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.retrieveButton)
        {
            Intent i = new Intent(this, GetContactDetailsActivity.class);
            startActivity(i);
        }
        else
        {
            Log.d("SID :","Invalid button pressed");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
