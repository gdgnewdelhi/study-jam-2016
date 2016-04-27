package com.example.ashishgupta.poi2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileInputStream;

public class Display_Activity extends AppCompatActivity {

    ImageView imageView;
    String name;
    Intent data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_);
        imageView=(ImageView)findViewById(R.id.imageView3);
        data=getIntent();
        name=data.getStringExtra("Name");
        imageView.setImageBitmap(getImageBitmap(getApplicationContext()));

    }

    public Bitmap getImageBitmap(Context context){
        name=name+"."+"jpeg";
        try
        {
            FileInputStream fis = context.openFileInput(name);
            Bitmap b = BitmapFactory.decodeStream(fis);
            fis.close();
            return b;
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error Image : "+name, Toast.LENGTH_SHORT).show();
        }
        return null;
    }
}
