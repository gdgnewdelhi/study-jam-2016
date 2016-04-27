package com.example.nimish.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view)
    {
        Intent intent = new Intent(this, step_1.class);

        startActivity(intent);
    }
    public void callFirst(View view)
    {
        Intent intent = new Intent(this, step2.class);

        startActivity(intent);
    }
    public void callSecond(View view)
    {
        Intent intent = new Intent(this, step3.class);

        startActivity(intent);
    }

    public void callThird(View view)
    {
        Intent intent = new Intent(this, step4.class);

        startActivity(intent);
    }
    public void callFourth(View view)
    {
        Intent intent = new Intent(this, step4.class);

        startActivity(intent);
    }
}
