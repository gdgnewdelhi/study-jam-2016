package com.example.android.musicshop;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Order extends Activity {

    int quantity = 0;
    int position;
    int price=0;
    int p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent= getIntent();
        position=intent.getIntExtra("position",0);
    }

    private int price(int position)
    {
        if (position==0)
        {
            price = 2500;
        }

        if (position==1)
        {
            price = 1545;
        }
        if (position==2)
        {
            price = 12100;
        }

        if (position==3)
        {
            price = 13000;
        }

        if (position==4)
        {
            price = 14500;
        }

        if (position==5)
        {
            price = 1750;
        }
        if (position==6)
        {
            price = 1600;
        }
        if (position==7)
        {
            price = 17000;
        }

        return price;
    }


    public void increment(View view) {


        quantity = quantity + 1;
        display(quantity);


    }
    public void decrement(View view) {

        if (quantity > 0) {
            quantity = quantity - 1;
            display(quantity);
        } else {
            quantity = 0;
            display(quantity);
        }

    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {


        EditText nameField = (EditText)findViewById(R.id.name_field);
        String name = nameField.getText().toString();


        CheckBox cod =(CheckBox) findViewById(R.id.cash_on_delivery);
        boolean hascod = cod.isChecked();

        CheckBox wrap =(CheckBox) findViewById(R.id.gift_wrap);
        boolean haswrap = wrap.isChecked();

        if (hascod == true)
        {
            p = price(position)+50;
        }

        else if (haswrap == true)
        {
            p = price(position)+10;
        }


        String priceMessage = "Hi " + name +"\n";
        priceMessage+= "\nGift wrap (Rs 10) : " + haswrap + "\n";
        priceMessage+= "\nCash on delivery (Rs 50) : " + hascod +"\n";

        priceMessage+= "\nUnit Price = " + price(position) + "\n";
        priceMessage += "\nTotal Rs " + (quantity* p) + "\n";
        priceMessage += "\nThank You!";
        displayMessage(priceMessage);

    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }



    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
