package com.example.anshul.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
float num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void sci(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(),Scientific.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
     public void addition(View view){
        EditText num = (EditText) findViewById(R.id.num1);
                Float numfield= Float.valueOf(num.getText().toString());
        EditText numb = (EditText) findViewById(R.id.num2);
        Float numbfield= Float.valueOf(numb.getText().toString());
            result= plus(numfield,numbfield);
        display(result);

    }

    public Float plus(float num1, float num2){
        result= num1 + num2;
        return result;

    }
    public void substraction(View view){
        EditText num = (EditText) findViewById(R.id.num1);
        Float numfield= Float.valueOf(num.getText().toString());
        EditText numb = (EditText) findViewById(R.id.num2);
        Float numbfield= Float.valueOf(numb.getText().toString());

        result =minus(numfield,numbfield);
        display(result);

    }
    public float minus(float num1,float num2){
       result=num1 - num2;
        return result;
    }
    public void division(View view){
        EditText num = (EditText) findViewById(R.id.num1);
        Float numfield= Float.valueOf(num.getText().toString());
        EditText numb = (EditText) findViewById(R.id.num2);
        Float numbfield= Float.valueOf(numb.getText().toString());
                result=div(numfield,numbfield);
        display(result);
    }
    public float div(float num1,float num2){
        result=num1/num2;
    return result;
    }
    public void multipication(View view)
    {
        EditText num = (EditText) findViewById(R.id.num1);
        Float numfield= Float.valueOf(num.getText().toString());
        EditText numb = (EditText) findViewById(R.id.num2);
        Float numbfield= Float.valueOf(numb.getText().toString());
        result=mult(numfield,numbfield);
        display(result);
    }
    public float mult(float num1,float num2){
        result=num1*num2;
        return result;

    }
    public void reset(View view){
        result=0;
        display(result);
    }
    public void display(float message) {
            TextView resview= (TextView)  findViewById(R.id.Res);
             resview.setText(String.valueOf(message));
    }
}
