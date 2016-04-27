package com.example.android.mainprojectv2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        Intent intent = getIntent();
        String message = "Welcome, ";
        message = message + intent.getStringExtra(neww.EXTRA_MESSAGE);
        TextView welcome = (TextView) findViewById(R.id.textViewWelcome);
        welcome.setText(message);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        neww.Prefs = getSharedPreferences(neww.MyPREFERENCES, Context.MODE_PRIVATE);
        sports.Prefs = getSharedPreferences(sports.MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed2 = neww.Prefs.edit();
        SharedPreferences.Editor ed = sports.Prefs.edit();
        ed.clear();
        ed2.clear();
        ed.commit();
        ed2.commit();
        neww.bill = "";
    }

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
    }*/

    public void Fruits(View view){
        Intent intent = new Intent(this, neww.class);
        startActivity(intent);
    }

    public void Sports(View view) {
        Intent intent = new Intent(this, sports.class);
        startActivity(intent);
    }

}
