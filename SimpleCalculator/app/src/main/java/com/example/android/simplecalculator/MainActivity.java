package com.example.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String total="";
    double v1,v2;
    String sign="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Onclick(View v){
        Button button = (Button)v;
        String str=button.getText().toString();
        total+=str;
        EditText edit=(EditText)findViewById(R.id.editText);
        edit.setText(total);
    }
    public void onAdd(View v){
        v1=Double.parseDouble(total);
        total="";
        Button button = (Button)v;
        String str = button.getText().toString();
        sign = str;
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
    }
    public void Oncalculate(View v){
        EditText edit=(EditText)findViewById(R.id.editText);
        String str2=edit.getText().toString();
        v2=Double.parseDouble(str2);
        double grand_total=0;
        if(sign.equals("+")){
            grand_total=v1+v2;
        }
        if(sign.equals("-")){
            grand_total=v1-v2;
        }
        if(sign.equals("*")){
            grand_total=v1*v2;
        }
        if(sign.equals("/")){
            grand_total=v1/v2;
        }
        edit.setText(grand_total+"");
    }
    public void Onclear(View v){
        EditText edit=(EditText)findViewById(R.id.editText);
        edit.setText("");
        total="";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}
