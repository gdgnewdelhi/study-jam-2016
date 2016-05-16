package com.example.hp.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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


public class button1image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

int nimg= button1activity.n;

    public void next(View v)
    {
     if(nimg==6){
         nimg=1;
         selectimage();
     }
        else
     {
       nimg++;
         selectimage();
     }
    }
    public void back(View v)
    {
       if(nimg==1)
       {
           nimg=6;
           selectimage();
       }
        else
       {
           nimg--;
           selectimage();
       }
    }
    public void selectimage()
    {
        ImageView image= (ImageView)findViewById(R.id.img1);
        if(nimg==1)
        {
            image.setImageResource(R.drawable.a);
        }
        else if(nimg==2)
        {
            image.setImageResource(R.drawable.b);
        }
        else if(nimg==3)
        {
            image.setImageResource(R.drawable.c);
        }
        else if(nimg==4)
        {
            image.setImageResource(R.drawable.d);
        }
       else if(nimg==5)
        {
            image.setImageResource(R.drawable.e);
        }
       else if(nimg==6)
        {
            image.setImageResource(R.drawable.x);
        }
    }
}
