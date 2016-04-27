package com.example.android.mainprojectv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pricelistFruits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricelist_fruits);
    }

    public void backToFruits(View view){
        Intent intent = new Intent(this, neww.class);
        startActivity(intent);
    }

}
