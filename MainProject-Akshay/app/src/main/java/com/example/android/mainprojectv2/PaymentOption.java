package com.example.android.mainprojectv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PaymentOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_option);
    }

    public void ThankYou(View view){
        sports.numberOfAustralia = 0.0;
        sports.numberOfArsenal = 0.0;
        sports.numberOfBarca = 0.0;
        sports.numberOfRealMadrid = 0.0;
        sports.numberOfChelsea = 0.0;
        sports.numberOfIndia = 0.0;
        sports.numberOfManUtd = 0.0;
        sports.numberOfMunich = 0.0;
        sports.cost = 0.0;
        Intent intent = new Intent(this, ThankYou.class);
        startActivity(intent);
    }
}
