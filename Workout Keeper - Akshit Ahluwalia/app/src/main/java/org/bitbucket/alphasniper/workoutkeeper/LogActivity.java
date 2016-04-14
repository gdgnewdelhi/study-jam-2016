package org.bitbucket.alphasniper.workoutkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LogActivity extends AppCompatActivity {
    EditText notesEditTextView;
    EditText workoutCountEditTextView;
    Button addWorkout ;

    ArrayList<LogDataClass> pushupList       = new ArrayList<LogDataClass>();
    ArrayList<LogDataClass> pullupList       = new ArrayList<LogDataClass>();
    ArrayList<LogDataClass> benchpressList   = new ArrayList<LogDataClass>();
    ArrayList<LogDataClass> squatList        = new ArrayList<LogDataClass>();
    ArrayList<LogDataClass> crunchesList     = new ArrayList<LogDataClass>();

    int receivedIntentToken ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        Intent intentReceived = getIntent();
        receivedIntentToken = intentReceived.getIntExtra(QuickAddActivity.intentTokenPassed, 0);
        notesEditTextView = (EditText) findViewById(R.id.notes_edit_text_view);
        workoutCountEditTextView = (EditText) findViewById(R.id.log_edit_text_view);
        addWorkout = (Button) findViewById(R.id.add_log_button);

        addWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataAdd();
                populateListview();
            }
        });

    }

    public void dataAdd () {

        String notes = notesEditTextView.getText().toString();
        String countText = workoutCountEditTextView.getText().toString();
        int count;
        // checking whether the workoutCountEditTextView is empty.
        if (countText.matches("")){
            count = 0;
        }
        else {
            count = Integer.parseInt(workoutCountEditTextView.getText().toString());

        }

        if (count == 0) {
            workoutCountEditTextView.setError("This field is Empty !!!..");
        }
        else {
            if (receivedIntentToken == 1) {
                pushupList.add(new LogDataClass(notes, count));
            } else if (receivedIntentToken == 2) {
                pullupList.add(new LogDataClass(notes, count));
            } else if (receivedIntentToken == 3) {
                crunchesList.add(new LogDataClass(notes, count));
            } else if (receivedIntentToken == 4) {
                benchpressList.add(new LogDataClass(notes, count));
            } else if (receivedIntentToken == 5) {
                squatList.add(new LogDataClass(notes, count));
            } else {
                //  DO NOTHING
            }
        }
    }


    private void populateListview() {

        // populates the listview items and attaches custom adapter for the ListView
        ListView logListView = (ListView) findViewById(R.id.logs_list_view);

        if (receivedIntentToken == 1) {
            CustomArrayAdapter adapter = new CustomArrayAdapter(this,R.layout.listview_item_layout,pushupList);
            logListView.setAdapter(adapter);
        }
        else if (receivedIntentToken == 2) {
            CustomArrayAdapter adapter = new CustomArrayAdapter(this,R.layout.listview_item_layout,pullupList);
            logListView.setAdapter(adapter);
        }
        else if (receivedIntentToken == 3) {
            CustomArrayAdapter adapter = new CustomArrayAdapter(this,R.layout.listview_item_layout,crunchesList);
            logListView.setAdapter(adapter);
        }
        else if (receivedIntentToken == 4) {
            CustomArrayAdapter adapter = new CustomArrayAdapter(this,R.layout.listview_item_layout,benchpressList);
            logListView.setAdapter(adapter);
        }
        else if (receivedIntentToken == 5) {
            CustomArrayAdapter adapter = new CustomArrayAdapter(this,R.layout.listview_item_layout,squatList);
            logListView.setAdapter(adapter);
        }
        else {
            //  DO NOTHING
        }



    }

}

