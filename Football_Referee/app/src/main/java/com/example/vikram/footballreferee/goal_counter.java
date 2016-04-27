package com.example.vikram.footballreferee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class goal_counter extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    String team1;
    String team2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_counter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void goalTeamA (View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void goalDisallowedTeamA (View v){
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }
    public void yellowCard (View view){
        Intent intent = new Intent(this, yellow_card.class);
        this.startActivity(intent);
    }
    public void goalTeamB (View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void goalDisallowedTeamB (View v){
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }
    public void redCard (View view){
        Intent intent = new Intent(this, red_card.class);
        this.startActivity(intent);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
