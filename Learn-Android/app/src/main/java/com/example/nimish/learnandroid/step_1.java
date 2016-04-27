package com.example.nimish.learnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class step_1 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_1);
//        String test = getResources().getString(R.string.)
        String message = "One thing that those trawling through quick and dirty web tutorials miss entirely is that in order to develop Android apps, you don’t learn “Android” itself. It is an operating system and a platform, that is to say it is a collection of languages and tools that all work together. To illustrate, in your average app development project you’re looking at:\n" +
                "\n" +
                "    Programming Logic (Java)\n" +
                "    UI components (XML and Java)\n" +
                "    Data storage (SQLite, HTTP)\n" +
                "    Connectivity (HTTP, XML-RPC)\n" +
                "    Compiling (Gradle, ANT)\n and some others that I’ve probably missed, so you need to do some homework – just knowing Java is not enough. However learning to code in Java by making an Android app is not advisable because you’re going to encounter issues that have nothing to do with the Java code that you’ve just written. Instead, break it down:\n" +
                "\n" +
                "    If you don’t know Java, start with the official Oracle Java tutorials.\n" +
                "    If you don’t know XML, W3Schools have an excellent and thorough tutorial section.\n" +
                "    If you want to make a Google Maps app as your first project, learn how the API works on its own, before starting to integrate it into an app.\n" +
                "\n" +
                "Once you have a grasp of the individual concepts you can bring them together in a much smoother way than if you were hacking away trying to figure out if you are looking at an XML syntax error or an actual Java exception.";

        TextView txtView = (TextView) findViewById(R.id.step1);
        txtView.setText(message);
    }


   /* public void backToMainAcivity(View v)

    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }*/
}
