package com.example.nimish.bmicalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);
    }
    public void calculateBMI(View v)
    {
        EditText et1=(EditText)findViewById(R.id.editText1);
        EditText et2=(EditText)findViewById(R.id.editText2);
        Button b=(Button)findViewById(R.id.button2);
        TextView tv1= (TextView) findViewById(R.id.textView2);
        TextView tv2= (TextView) findViewById(R.id.textView3);

        double weight=0;
        double height=0;
        double bmi=0;
        String result="";
        weight= Double.parseDouble(et1.getText().toString());
        height= Double.parseDouble(et2.getText().toString());
         double x=height*height;
        bmi=weight/x;
        String.format("%.2f", bmi);
        tv1.setText(String.valueOf(bmi));
        if(bmi<18.5)
        {
            result="Underweight";
        } else if(bmi>25)
    {
        result="overrweight";
    }
        else if(bmi>18.5 && bmi<25){
        result="Normal";
    }
        tv2.setText(String.valueOf(result));
    }
}
