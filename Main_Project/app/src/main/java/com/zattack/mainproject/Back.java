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

public class Back extends AppCompatActivity {

    private List<workouts> myBackWorkouts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        populateWorkoutList();
        populateListView();
        registerClick();
    }

    private void populateWorkoutList() {
        myBackWorkouts.add(new workouts("Pull ups", R.drawable.back));
        myBackWorkouts.add(new workouts("Lat pulldowns", R.drawable.back));
        myBackWorkouts.add(new workouts("Dead Lift", R.drawable.back));
    }
    private void populateListView() {
        ArrayAdapter<workouts> adapter= new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.backListView);
        list.setAdapter(adapter);
    }

    private void registerClick() {
        ListView list = (ListView) findViewById(R.id.backListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                workouts clickedWorkout = myBackWorkouts.get(position);
                String workoutName = clickedWorkout.getWorkoutName();
                workoutsFunction(workoutName);
            }
        });
    }

    private void workoutsFunction(String workoutName) {
        switch(workoutName){
            case "Pull ups":{
                Intent intent = new Intent(this,PullUps.class);
                startActivity(intent);
                break;
            }
            case "Lat pulldowns":{
                Intent intent = new Intent(this,LatsPulldown.class);
                startActivity(intent);
                break;
            }
            case "Dead Lift":{
                Intent intent = new Intent(this,DeadLift.class);
                startActivity(intent);
                break;
            }
        }
    }

    private class MyListAdapter extends ArrayAdapter<workouts>{
        public MyListAdapter(){
            super(Back.this,R.layout.item_view,myBackWorkouts);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView==null){
                itemView = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }

            workouts currentWorkout=myBackWorkouts.get(position);

            ImageView imageview = (ImageView)itemView.findViewById(R.id.workout_image);
            imageview.setImageResource(currentWorkout.getIconId());

            TextView textview = (TextView)itemView.findViewById(R.id.workout_name);
            textview.setText(currentWorkout.getWorkoutName());

            return itemView;
            //return super.getView(position, convertView, parent);
        }
    }
}
