package com.example.anshul.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Scientific extends AppCompatActivity {
  float res1;
    double res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
   public void sqr(View view){
       EditText numr = (EditText)findViewById(R.id.num3);
       float numfield1= Float.valueOf(numr.getText().toString());
       res1=root(numfield1);
       display(res1);

    }
    public float root(float num){
        res1=(float)Math.sqrt(num);
        return res1;
    }
    public void sin(View view){
        EditText numr = (EditText)findViewById(R.id.num3);
        Double numfield1= Double.valueOf(numr.getText().toString());
        res2=sin1(numfield1);
        display(res2);

    }
    public double sin1(double num){

        res2=Math.sin(num);
        return res2;
    }
    public void cos(View view){
        EditText numr = (EditText)findViewById(R.id.num3);
        Double numfield1= Double.valueOf(numr.getText().toString());
        res2=cos1(numfield1);
        display(res2);
    }
    public double cos1(double num){
        res2=Math.cos(num);
        return res2;
    }
    public void tan(View view){
        EditText numr = (EditText)findViewById(R.id.num3);
        Double numfield1= Double.valueOf(numr.getText().toString());
        res2=tan1(numfield1);
        display(res2);
    }
    public double tan1(double num){
        res2=Math.tan(num);
        return res2;
    }
    public void log(View view)
    {
        EditText numr = (EditText)findViewById(R.id.num3);
        Double numfield1= Double.valueOf(numr.getText().toString());
        res2=log1(numfield1);
        display(res2);
    }
    public double log1(double num){
        res2=Math.log10(num);
        return res2;

    }
    public void exp(View view){
        EditText numr = (EditText)findViewById(R.id.num3);
        Double numfield1= Double.valueOf(numr.getText().toString());
        res2=exp1(numfield1);
        display(res2);
    }
    public double exp1(double num){
        res2=Math.exp(num);
        return res2;
    }
    public void display(float message) {
        TextView resv = (TextView) findViewById(R.id.blank);
        resv.setText(String.valueOf(message));
    }
    public void display(double message) {
        TextView resv = (TextView) findViewById(R.id.blank);
        resv.setText(String.valueOf(message));
    }
}
