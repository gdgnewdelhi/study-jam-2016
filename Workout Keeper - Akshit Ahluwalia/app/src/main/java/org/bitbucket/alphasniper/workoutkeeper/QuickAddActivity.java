package org.bitbucket.alphasniper.workoutkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuickAddActivity extends AppCompatActivity {

    public final static String intentTokenPassed = "org.bitbucket,alphasniper.workoutkeeper" ;

        int INTENT_TOKEN = 0;

    Button btnBestPractices ;
    Button btnPushup ;
    Button btnPullup ;
    Button btnBenchpress ;
    Button btnSquats ;
    Button btnCrunches ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_add);

        btnBestPractices = (Button) findViewById(R.id.btn_best_practices);
        btnPushup        = (Button) findViewById(R.id.btn_pushup);
        btnPullup        = (Button) findViewById(R.id.btn_pullup);
        btnBenchpress    = (Button) findViewById(R.id.btn_benchpress);
        btnSquats        = (Button) findViewById(R.id.btn_squats);
        btnCrunches      = (Button) findViewById(R.id.btn_crunches);

//        Setting the onClick Event Listeners for these UI Buttons .
        btnPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INTENT_TOKEN = 1;
                Intent intent = new Intent(QuickAddActivity.this , LogActivity.class);
                intent.putExtra(intentTokenPassed,INTENT_TOKEN);
                QuickAddActivity.this.startActivity(intent);
            }
        });

        btnPullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INTENT_TOKEN = 2;
                Intent intent = new Intent(QuickAddActivity.this , LogActivity.class);
                intent.putExtra(intentTokenPassed,INTENT_TOKEN);
                QuickAddActivity.this.startActivity(intent);
            }
        });

        btnCrunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INTENT_TOKEN = 3;
                Intent intent = new Intent(QuickAddActivity.this , LogActivity.class);
                intent.putExtra(intentTokenPassed,INTENT_TOKEN);
                QuickAddActivity.this.startActivity(intent);
            }
        });

        btnBenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INTENT_TOKEN = 4;
                Intent intent = new Intent(QuickAddActivity.this , LogActivity.class);
                intent.putExtra(intentTokenPassed,INTENT_TOKEN);
                QuickAddActivity.this.startActivity(intent);
            }
        });
        btnSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INTENT_TOKEN = 5;
                Intent intent = new Intent(QuickAddActivity.this, LogActivity.class);
                intent.putExtra(intentTokenPassed, INTENT_TOKEN);
                QuickAddActivity.this.startActivity(intent);
            }
        });
        btnBestPractices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuickAddActivity.this, GuideActivity.class);
                QuickAddActivity.this.startActivity(intent);
            }
        });
    }


}
