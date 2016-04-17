package com.example.bhagat_singh_97.five_ways_otg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button Use1,Use2,Use3,Use4,Use5;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Use1 = (Button)findViewById(R.id.Button1);
        Use2 = (Button)findViewById(R.id.Button2);
        Use3 = (Button)findViewById(R.id.Button3);
        Use4 = (Button)findViewById(R.id.Button4);
        Use5 = (Button)findViewById(R.id.Button5);

        Use1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),Use1.class);
                startActivity(i);
            }
        });

        Use2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),Use2.class);
                startActivity(i);
            }
        });

        Use3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),Use3.class);
                startActivity(i);
            }
        });

        Use4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),Use4.class);
                startActivity(i);
            }
        });

        Use5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),Use5.class);
                startActivity(i);
            }
        });
    }
}
