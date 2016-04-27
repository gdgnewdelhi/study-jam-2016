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

public class Workouts_guide extends AppCompatActivity {

    private List<workouts> myWorkouts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts_guide);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String name2 = intent.getExtras().getString("name");

        TextView nameField =(TextView) findViewById(R.id.name2);
        nameField.setText("Hi! " + name2 + ".");

        populateWorkoutList();
        populateListView();
        registerClick();
    }

    private void populateWorkoutList() {
        myWorkouts.add(new workouts("Chest", R.drawable.chest));
        myWorkouts.add(new workouts("Back", R.drawable.back));
        myWorkouts.add(new workouts("Shoulders", R.drawable.shoulders));
        myWorkouts.add(new workouts("Biceps", R.drawable.bicep));
        myWorkouts.add(new workouts("Abs", R.drawable.abs2));
    }
    private void populateListView() {
        ArrayAdapter<workouts> adapter= new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.workoutListView);
        list.setAdapter(adapter);
    }

    private void registerClick() {
        ListView list = (ListView) findViewById(R.id.workoutListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                workouts clickedWorkout = myWorkouts.get(position);
                String workoutName = clickedWorkout.getWorkoutName();
                workoutsFunction(workoutName);
            }
        });
    }

    private void workoutsFunction(String workoutName) {
        switch(workoutName){
            case "Chest":{
                Intent intent = new Intent(this,Chest.class);
                startActivity(intent);
                break;}
            case "Back":{
                Intent intent = new Intent(this,Back.class);
                startActivity(intent);
                break;
            }
            case "Shoulders":{
                Intent intent = new Intent(this,Shoulders.class);
                startActivity(intent);
                break;
            }
            case "Biceps":{
                Intent intent = new Intent(this,Biceps.class);
                startActivity(intent);
                break;
            }
            case "Abs":{
                Intent intent = new Intent(this,Abs.class);
                startActivity(intent);
                break;
            }
        }
    }

    private class MyListAdapter extends ArrayAdapter<workouts>{
        public MyListAdapter(){
            super(Workouts_guide.this,R.layout.item_view,myWorkouts);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView==null){
                itemView = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }

            workouts currentWorkout=myWorkouts.get(position);

            ImageView imageview = (ImageView)itemView.findViewById(R.id.workout_image);
            imageview.setImageResource(currentWorkout.getIconId());

            TextView textview = (TextView)itemView.findViewById(R.id.workout_name);
            textview.setText(currentWorkout.getWorkoutName());

            return itemView;
            //return super.getView(position, convertView, parent);
        }
    }
}







