package com.example.vikram.footballreferee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class goals extends AppCompatActivity {

    public static String teamNameA;
    public static String teamNameB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void nextPage(View view) {
        Intent intent = new Intent(this, goal_counter.class);
        this.startActivity(intent);

        EditText teamA = (EditText) findViewById(R.id.team1_name);
        teamNameA = teamA.getText().toString();

        EditText teamB = (EditText) findViewById(R.id.team2_name);
        teamNameB = teamB.getText().toString();


    }
}
