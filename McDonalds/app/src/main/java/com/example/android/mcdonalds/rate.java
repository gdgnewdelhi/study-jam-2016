package com.example.android.mcdonalds;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;


public class rate extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView txtRatingValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        addListenerOnRatingBar();
    }
    public void addListenerOnRatingBar() {

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        txtRatingValue = (TextView) findViewById(R.id.txtRatingValue);

        //if rating value is changed,
        //display the current rating value in the result (textview) automatically
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                int  a=(int)rating;
                txtRatingValue.setText(String.valueOf(a));

            }
        });
    }
    public void email(View view)
    {
        String[] address={"myfeedback@mcdonaldsindia.com"};

        Intent intent=new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto:"));

        intent.putExtra(Intent.EXTRA_EMAIL, address);
        intent.putExtra(Intent.EXTRA_SUBJECT, new String[]{"Feedback by "+signingup.name});
        if(intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(intent);
        }


    }
    public void home(View view)
    {
        Intent intent;


        intent = new Intent(this, mainPage.class);


        startActivity(intent);

    }



}
