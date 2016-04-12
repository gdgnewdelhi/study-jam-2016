package com.example.azfar.freshersjam_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        RelativeLayout layout = (RelativeLayout)findViewById(R.id.contenthome);
    }

    public void About(View view){
        Intent intent = new Intent(this, AboutActivity.class);
        setContentView(R.layout.activity_about);
        startActivity(intent);
    }

    public void Events(View view) {
        Intent intent = new Intent(this, EventsActivity.class);
        setContentView(R.layout.activity_events);
        startActivity(intent);
    }

    public void Jam(View view){
        Intent intent = new Intent(this, JamActivity.class);
        setContentView(R.layout.activity_jam);
        startActivity(intent);
    }

    public void Contact(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        setContentView(R.layout.activity_contact);
        startActivity(intent);
    }

    public void Home(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        setContentView(R.layout.activity_home);
        startActivity(intent);
    }
}
