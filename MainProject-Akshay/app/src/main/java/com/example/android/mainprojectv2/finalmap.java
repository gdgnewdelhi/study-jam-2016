package com.example.android.mainprojectv2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class finalmap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalmap);
        Intent intent = getIntent();
        String message = intent.getStringExtra(neww.EXTRA_MESSAGE);
        String cost = intent.getStringExtra(neww.EXTRA_MESSAGE2);
        TextView billText = (TextView) findViewById(R.id.textViewBill);
        billText.setText(message);
        TextView tbill = (TextView) findViewById(R.id.textViewTotalBill);
        tbill.setText(cost);

    }

    public void location(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        EditText add = (EditText) findViewById(R.id.editTextAddress);
        String addre = add.getText().toString();
        String free = "geo:0,0?q=";
        free = free + addre.replace(" ","+");
        //add1.setText(free);

        intent.setData(Uri.parse(free));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void PaymentMethod(View view){
        Intent intent = new Intent(this, PaymentOption.class);
        startActivity(intent);
    }


}
