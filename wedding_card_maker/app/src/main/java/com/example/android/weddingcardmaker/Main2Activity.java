package com.example.android.weddingcardmaker;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String nameg;
    String nameb;
    String date;
    String venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail();
            }
        });


        nameg = MainActivity.nameg;

        nameb = MainActivity.nameb;
        display(nameb);
        display3(nameg);
        date = MainActivity.date;

        venue = MainActivity.venue;
        display1(date, venue);
        Typeface font = Typeface.createFromAsset(getAssets(), "Kiss Me Quick.ttf");
        TextView txt = (TextView) findViewById(R.id.title_text_view);

        txt.setTypeface(font);

        TextView txt1 = (TextView) findViewById(R.id.title_textg_view);
        txt1.setTypeface(font);

        Typeface font1 = Typeface.createFromAsset(getAssets(), "LittleLordFontleroyNF.ttf");

        TextView txt2 = (TextView) findViewById(R.id.message_c);
        txt2.setTypeface(font1);
        TextView txt3 = (TextView) findViewById(R.id.occ_1);
        txt3.setTypeface(font1);
        TextView txt4 = (TextView) findViewById(R.id.message_d);
        txt4.setTypeface(font1);
        TextView txt5 = (TextView) findViewById(R.id.center);
        txt5.setTypeface(font);


        TextView txt6 = (TextView) findViewById(R.id.title_date_view);
        txt6.setTypeface(font);

    }


    private void display(String nameb) {
        TextView titleTextView = (TextView) findViewById(
                R.id.title_text_view);
        titleTextView.setText(nameb);
    }

    private void display3(String nameg) {
        TextView titleTextView = (TextView) findViewById(
                R.id.title_textg_view);
        titleTextView.setText(nameg);
    }

    private void display1(String date, String venue) {
        TextView titleTextView = (TextView) findViewById(
                R.id.title_date_view);
        titleTextView.setText("\n" + "ON\n" + date + " \n " + "AT\n" + venue);
    }

    public void mail() {


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"anshul.rana95@gmail.com"});

        startActivity(intent);


    }


}

