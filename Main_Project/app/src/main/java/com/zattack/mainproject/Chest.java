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

public class Chest extends AppCompatActivity {
    private List<workouts> myChestWorkouts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        populateWorkoutList();
        populateListView();
        registerClick();
    }
    private void populateWorkoutList() {
        myChestWorkouts.add(new workouts("Push Ups", R.drawable.chest));
        myChestWorkouts.add(new workouts("Bench Press", R.drawable.chest));
        myChestWorkouts.add(new workouts("Incline Press", R.drawable.chest));
    }
    private void populateListView() {
        ArrayAdapter<workouts> adapter= new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.chestListView);
        list.setAdapter(adapter);
    }

    private void registerClick() {
        ListView list = (ListView) findViewById(R.id.chestListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                workouts clickedWorkout = myChestWorkouts.get(position);
                String workoutName = clickedWorkout.getWorkoutName();
                workoutsFunction(workoutName);
            }
        });
    }

    private void workoutsFunction(String workoutName) {
        switch(workoutName){
            case "Push Ups":{
                Intent intent = new Intent(this,PushUps.class);
                startActivity(intent);
                break;}
            case "Bench Press":{
                Intent intent = new Intent(this,BenchPress.class);
                startActivity(intent);
                break;
            }
            case "Incline Press":{
                Intent intent = new Intent(this,Incline.class);
                startActivity(intent);
                break;
            }
        }
    }

    private class MyListAdapter extends ArrayAdapter<workouts>{
        public MyListAdapter(){
            super(Chest.this,R.layout.item_view,myChestWorkouts);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView==null){
                itemView = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }

            workouts currentWorkout=myChestWorkouts.get(position);

            ImageView imageview = (ImageView)itemView.findViewById(R.id.workout_image);
            imageview.setImageResource(currentWorkout.getIconId());

            TextView textview = (TextView)itemView.findViewById(R.id.workout_name);
            textview.setText(currentWorkout.getWorkoutName());

            return itemView;
            //return super.getView(position, convertView, parent);
        }
    }

}
