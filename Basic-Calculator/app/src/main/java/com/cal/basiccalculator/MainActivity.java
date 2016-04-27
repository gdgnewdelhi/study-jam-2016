package com.cal.basiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnadd,btnSubt,btndiv,btnmult;
    private TextView tvResult;
    private EditText etfirst,etsecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      init();

    }



    private void init() {
        btnadd =(Button)findViewById(R.id.btnAdd);
        btnSubt=(Button)findViewById(R.id.btnSubtract);
        btndiv=(Button)findViewById(R.id.btnDivide);
        btnmult=(Button)findViewById(R.id.btnMultiply);
        etfirst=(EditText)findViewById(R.id.etfirstnumber);
        etsecond=(EditText)findViewById(R.id.etsecondnumber);
        tvResult=(TextView)findViewById(R.id.tvResult);

        btnadd.setOnClickListener(this);
        btnSubt.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1=etfirst.getText().toString();
        String num2=etsecond.getText().toString();

        switch(View.getId()){
            case R.id.btnAdd:
                float addition = Float.parseFloat(num1)+Float.parseFloat(num2);
                tvResult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                float subtract = Float.parseFloat(num1)-Float.parseFloat(num2);
                tvResult.setText(String.valueOf(subtract));
                break;
            case R.id.btnDivide:
                try {
                    float divide = Float.parseFloat(num1)/ Float.parseFloat(num2);
                    tvResult.setText(String.valueOf(divide));
                }catch (Exception e){
                    tvResult.setText("Error");
                }
                break;
            case R.id.btnMultiply:
                float multiply = Float.parseFloat(num1)*Float.parseFloat(num2);
                tvResult.setText(String.valueOf(multiply));
                break;

        }

    }
}

