package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class button1activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        }
public static int n;
public void button1selectIntent(View v)
        {ImageView image=(ImageView)findViewById(R.id.img1);
        switch(v.getId())
        {
        case R.id.button1a:
        n=1;
        Intent intent1a=new Intent(this,button1image.class);
        startActivity(intent1a);
        image.setImageResource(R.drawable.a);
        break;
        case R.id.button2a:
        n=2;
        Intent intent2a=new Intent(this,button1image.class);
        startActivity(intent2a);
        image.setImageResource(R.drawable.b);
        break;
        case R.id.button3a:
        n=3;
        Intent intent3a=new Intent(this,button1image.class);
        startActivity(intent3a);
        image.setImageResource(R.drawable.c);
        break;
        case R.id.button4a:
        n=4;
        Intent intent4a=new Intent(this,button1image.class);
        startActivity(intent4a);
        image.setImageResource(R.drawable.d);
        break;
        case R.id.button5a:
        n=5;
        Intent intent5a=new Intent(this,button1image.class);
        startActivity(intent5a);
        image.setImageResource(R.drawable.e);
        break;
        case R.id.button6a:
        n=6;
        Intent intent6a=new Intent(this,button1image.class);
        startActivity(intent6a);
        image.setImageResource(R.drawable.f);
        break;
        }
        }

        }
