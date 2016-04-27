package com.example.android.mainprojectv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pricelistSports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricelist_sports);

    }

    public void backToSports(View view){
        Intent intent = new Intent(this, sports.class);
        startActivity(intent);
    }

}
