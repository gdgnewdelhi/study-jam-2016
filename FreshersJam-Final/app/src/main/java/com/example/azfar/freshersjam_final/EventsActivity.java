package com.example.azfar.freshersjam_final;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        Button bt1 = (Button)findViewById(R.id.tripster);
        Button bt2 = (Button)findViewById(R.id.algorhythm);
        Button bt5 = (Button)findViewById(R.id.tangelo);
        Button bt3 = (Button)findViewById(R.id.robocon);
        Button bt4 = (Button)findViewById(R.id.encomium);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.tripster2015.com"));
                startActivity(browserIntent);


            }
        });
        Intent intent1 = getIntent();
        RelativeLayout layout1 = (RelativeLayout)findViewById(R.id.contentevents);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/jmi.algorhythm/"));
                startActivity(browserIntent);


            }
        });
        Intent intent2 = getIntent();
        RelativeLayout layout2 = (RelativeLayout)findViewById(R.id.contentevents);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://robojmi.blogspot.in/"));
                startActivity(browserIntent);


            }
        });
        Intent intent3 = getIntent();
        RelativeLayout layout3 = (RelativeLayout)findViewById(R.id.contentevents);

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/encomium15/"));
                startActivity(browserIntent);


            }
        });
        Intent intent4 = getIntent();
        RelativeLayout layout4 = (RelativeLayout)findViewById(R.id.contentevents);

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/TangeloTown/"));
                startActivity(browserIntent);


            }
        });
        Intent intent5 = getIntent();
        RelativeLayout layout5 = (RelativeLayout)findViewById(R.id.contentevents);

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
