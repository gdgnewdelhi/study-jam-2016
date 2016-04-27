package com.example.android.mcdonalds;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class bill extends AppCompatActivity {
    String name;
    String value_name;
    String value_price;
    String value_qty;
    String contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        gen_bill();
    }
    public void gen_bill()
    {

        RelativeLayout r=(RelativeLayout)findViewById(R.id.bill_print);
        r.setVisibility(View.VISIBLE);

        name=signingup.name;
        contact=signingup.contact;
        value_name=place_order.s;
        value_price=place_order.s1;
        value_qty=place_order.s2;
        TextView textView=(TextView)findViewById(R.id.name);
        textView.setText(name);
        TextView textView1=(TextView)findViewById(R.id.number);
        textView1.setText(contact);
        TextView textView2=(TextView)findViewById(R.id.item_value);
        textView2.setText(value_name);
        TextView textView4=(TextView)findViewById(R.id.quantity_value);
        textView4.setText(value_qty);
        TextView textView3=(TextView)findViewById(R.id.price_value);
        textView3.setText(value_price);
        TextView textView5=(TextView)findViewById(R.id.text1);
        textView5.setText(place_order.s3);
        TextView textView6=(TextView)findViewById(R.id.text2);
        textView6.setText(place_order.s4);
        TextView textView7=(TextView)findViewById(R.id.text3);
        textView7.setText(place_order.s5);
        TextView textView8=(TextView)findViewById(R.id.text4);
        textView8.setText(place_order.s6);
        TextView textView9=(TextView)findViewById(R.id.text5);
        textView9.setText(place_order.s7);
    }
    public void order(View view)
    {
        if(place_order.total==0)
        {
            Context context = getApplicationContext();
            CharSequence text = "Your havn't selected anything yet";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            Intent intent;


            intent = new Intent(this, place_order.class);


            startActivity(intent);

        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Your order was successfully placed";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
    public void home(View view)
    {
        name="";contact="";value_qty="";value_name="";value_price="";
        place_order.s3="";place_order.s4="";place_order.s5="";place_order.s6="";place_order.s7="";place_order.s1="";place_order.s2="";
        place_order.total=0;
        Intent intent;


        intent = new Intent(this, mainPage.class);


        startActivity(intent);

    }
}