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

public class Biceps extends AppCompatActivity {

    private List<workouts> myBicepWorkouts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        populateWorkoutList();
        populateListView();
        registerClick();
    }

    private void populateWorkoutList() {
        myBicepWorkouts.add(new workouts("Bicep Curls", R.drawable.bicep));
        myBicepWorkouts.add(new workouts("Hammer Curls", R.drawable.bicep));
        myBicepWorkouts.add(new workouts("Preacher Curls",R.drawable.bicep));
    }
    private void populateListView() {
        ArrayAdapter<workouts> adapter= new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.bicepsListView);
        list.setAdapter(adapter);
    }

    private void registerClick() {
        ListView list = (ListView) findViewById(R.id.bicepsListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                workouts clickedWorkout = myBicepWorkouts.get(position);
                String workoutName = clickedWorkout.getWorkoutName();
                workoutsFunction(workoutName);
            }
        });
    }

    private void workoutsFunction(String workoutName) {
        switch(workoutName){
            case "Bicep Curls":{
                Intent intent = new Intent(this,Bicep_Curls.class);
                startActivity(intent);
                break;
            }
            case "Hammer Curls":{
                Intent intent = new Intent(this,Hammer_Curls.class);
                startActivity(intent);
                break;
            }
            case "Preacher Curls":{
                Intent intent = new Intent(this,Preacher_Curls.class);
                startActivity(intent);
                break;
            }
        }
    }

    private class MyListAdapter extends ArrayAdapter<workouts>{
        public MyListAdapter(){
            super(Biceps.this,R.layout.item_view,myBicepWorkouts);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView==null){
                itemView = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }

            workouts currentWorkout=myBicepWorkouts.get(position);

            ImageView imageview = (ImageView)itemView.findViewById(R.id.workout_image);
            imageview.setImageResource(currentWorkout.getIconId());

            TextView textview = (TextView)itemView.findViewById(R.id.workout_name);
            textview.setText(currentWorkout.getWorkoutName());

            return itemView;
            //return super.getView(position, convertView, parent);
        }
    }
}

