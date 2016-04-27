package com.example.nimish.learnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class step2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        String message="Android is a mature platform these days, and there are many tools available to help you. You would be surprised though (or maybe not) at how many professional Android developers don’t use or don’t even know about all of the tools available to them.\n" +
                "\n" +
                "You can learn a lot from broken code, but not if you don’t know how to read the signs. Get acquainted with the Android Debugging Bridge (ADB), the Dalkvik Debug Monitor Server (DDMS) first of all, then move on to the more advanced features of Traceview and dmtracedump when you are looking to learn how to make your apps run smoothly and make efficient use of system resources.\n" +
                "\n" +
                "It is also important to make sure that your IDE is set up properly, as Source not found messages aren’t helpful when you’re trying to get to the bottom of a Force Close situation. Android Studio is simple and integrated in so far as installation, and check out Vogella’s excellent tutorial if you decide to go down the more involved Eclipse route.";

        TextView txtView = (TextView) findViewById(R.id.step2);
        txtView.setText(message);

    }



}
