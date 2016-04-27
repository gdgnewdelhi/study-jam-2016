package com.example.android.mcdonalds;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);    }
    public void dial(View view)
    {
        String number="01166000666";

        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        if(intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(intent);
        }


    }
    public void email(View view)
    {
        String[] address={"info@mcdonaldsindia.com"};

        Intent intent=new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto:"));

        intent.putExtra(Intent.EXTRA_EMAIL, address);
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
