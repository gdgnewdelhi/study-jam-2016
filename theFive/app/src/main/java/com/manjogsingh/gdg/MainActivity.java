package com.manjogsingh.gdg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button air;
    Button fire;
    Button water;
    Button earth;
    Button space;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        air = (Button) findViewById(R.id.air);
        fire = (Button) findViewById(R.id.fire);
        water = (Button) findViewById(R.id.water);
        earth = (Button) findViewById(R.id.earth);
        space = (Button) findViewById(R.id.space);

        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), AirMain.class);
                startActivity(i);
            }
        });

        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), FireMain.class);
                startActivity(i);
            }
        });

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), WaterMain.class);
                startActivity(i);
            }
        });

        earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), EarthMain.class);
                startActivity(i);
            }
        });

        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), SpaceMain.class);
                startActivity(i);
            }
        });
    }
}

