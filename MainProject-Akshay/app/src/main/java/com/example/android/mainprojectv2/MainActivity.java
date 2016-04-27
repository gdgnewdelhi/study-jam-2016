package com.example.android.mainprojectv2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static final String MyPREFERENCES = "MyPrefs2";
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStop(){
        super.onStop();
        neww.Prefs = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed2 = neww.Prefs.edit();
        ed2.clear();
        ed2.commit();
        sports.Prefs = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sports.Prefs.edit();
        ed.clear();
        ed.commit();
    }

    public void contactDeveloper(View view){
        String[] address = new String[1];
        address[0] = "akshaykhushu.ak@gmail.com";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, address);
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void signIn(View view){
        Intent intent = new Intent(this,mainmenu.class);
        Button signIN = (Button) findViewById(R.id.buttonSignIN);
        EditText nameText = (EditText) findViewById(R.id.editTextName);
        EditText numberText = (EditText) findViewById(R.id.editTextNumber);
        String number = numberText.getText().toString();
        String name = nameText.getText().toString();
        if (name.isEmpty()){
            Context context = getApplicationContext();
            String error = "Enter your name ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,error,duration);
            toast.show();
        }
        else
        if (number.isEmpty()){
            Context context = getApplicationContext();
            String error = "Enter your Number ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,error,duration);
            toast.show();
        }
        else
        if ((name!=null) && (number!=null)) {
            intent.putExtra(EXTRA_MESSAGE, name);
            startActivity(intent);
        }
    }

}

