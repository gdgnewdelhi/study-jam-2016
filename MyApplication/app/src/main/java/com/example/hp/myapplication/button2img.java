package com.example.hp.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class button2img extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2img);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
int n=1;
    public void back(View v)
    {
        if(n==1)
        {
            n=6;
        }
        else
        {
       n--;
        }
        changeImg();
    }
    public void next(View v)
    {
       if(n==6)
       {
        n=1;
       }
        else
       {
           n++;
       }
        changeImg();
    }

    public void changeImg()
    {
        ImageView img2= (ImageView)findViewById(R.id.img2);
        if(n==1) {
            img2.setImageResource(R.drawable.g);
        }

        if(n==2)
        {
            img2.setImageResource(R.drawable.h);
        }

        if(n==3)
        {
            img2.setImageResource(R.drawable.i);
        }
        if(n==4)
        {
            img2.setImageResource(R.drawable.a);
        }
        if(n==5)
    {
        img2.setImageResource(R.drawable.b);
    }
        if(n==6)
    {
        img2.setImageResource(R.drawable.c);
    }
    }
}
