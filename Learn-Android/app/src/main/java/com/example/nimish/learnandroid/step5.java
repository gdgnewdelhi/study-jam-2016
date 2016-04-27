package com.example.nimish.learnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class step5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
        String message="Better still: have lots of projects! Nothing is a better motivator than having a target to achieve. You could spend days, weeks, months ploughing through tutorials and achieve very little that is useful in the day to day. Worse still, you could try to create a fully scalable multi-language, phone and tablet-ready social media platform in a weekend for your first app. You’ll fail, an you’ll feel like you’ve failed.\n" +
                "\n" +
                "Instead find a problem that you can solve with an app, it doesn’t have to be new. Do you want a custom calculator that can send the result to your emaill address? Do you want a one-shot Tweet app? A soundboard of fart noises? Whatever it is, it needn’t be a viable product or groundbreaking app when you’re done, it just needs to be a project that you can work towards.\n" +
                "\n" +
                "Once you’ve decided on that, break it down into smaller sections; an app that plays a single MP3 file, a button that changes colour when you press it or an asynchronous image downloader. Make each of these work before you try and build it into your larger project.\n" +
                "\n" +
                "This way will teach you how to work modularly, an invaluable skill if you’ve never worked on a true OO project before, and it will give you a finished mini-project at the end of each coding session to look at and say: “I made that”";

        TextView txtView = (TextView) findViewById(R.id.step4);
        txtView.setText(message);

    }
}
