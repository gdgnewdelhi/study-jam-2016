package com.zattack.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Shoulders extends AppCompatActivity {

    private List<workouts> myShouldersWorkouts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        populateWorkoutList();
        populateListView();
        registerClick();
    }

    private void populateWorkoutList() {
        myShouldersWorkouts.add(new workouts("Military Press", R.drawable.shoulders));
        myShouldersWorkouts.add(new workouts("Front Raise", R.drawable.shoulders));
        myShouldersWorkouts.add(new workouts("Upright Row",R.drawable.shoulders));
    }
    private void populateListView() {
        ArrayAdapter<workouts> adapter= new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.shoulderListView);
        list.setAdapter(adapter);
    }

    private void registerClick() {
        ListView list = (ListView) findViewById(R.id.shoulderListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                workouts clickedWorkout = myShouldersWorkouts.get(position);
                String workoutName = clickedWorkout.getWorkoutName();
                workoutsFunction(workoutName);
            }
        });
    }

    private void workoutsFunction(String workoutName) {
        switch(workoutName){
            case "Military Press":{
                Intent intent = new Intent(this,Military_Press.class);
                startActivity(intent);
                break;
            }
            case "Front Raise":{
                Intent intent = new Intent(this,Front_Raise.class);
                startActivity(intent);
                break;
            }
            case "Upright Row": {
                Intent intent = new Intent(this,Upright_Row.class);
                startActivity(intent);
                break;
            }
        }
    }

    private class MyListAdapter extends ArrayAdapter<workouts>{
        public MyListAdapter(){
            super(Shoulders.this, R.layout.item_view, myShouldersWorkouts);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView==null){
                itemView = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }

            workouts currentWorkout=myShouldersWorkouts.get(position);

            ImageView imageview = (ImageView)itemView.findViewById(R.id.workout_image);
            imageview.setImageResource(currentWorkout.getIconId());

            TextView textview = (TextView)itemView.findViewById(R.id.workout_name);
            textview.setText(currentWorkout.getWorkoutName());

            return itemView;
            //return super.getView(position, convertView, parent);
        }
    }
}

