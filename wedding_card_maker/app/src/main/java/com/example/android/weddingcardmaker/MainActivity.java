package com.example.android.weddingcardmaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public static String nameg;
    public static String nameb;
    public static String date;
    public static String venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        EditText namefield1 = (EditText) findViewById(R.id.message_groom);
        nameg = namefield1.getText().toString();

        EditText namefield2 = (EditText) findViewById(R.id.message_bride);
        nameb = namefield2.getText().toString();
        EditText namefield3 = (EditText) findViewById(R.id.message_date);
        date = namefield3.getText().toString();
        EditText namefield4 = (EditText) findViewById(R.id.message_venue);
        venue = namefield4.getText().toString();
        Log.v("Main", nameg + "weds" + nameb + "on" + date + "at\n" + venue);

        Intent i = new Intent(getApplicationContext(), Main2Activity.class);

        startActivity(i);


    }



}