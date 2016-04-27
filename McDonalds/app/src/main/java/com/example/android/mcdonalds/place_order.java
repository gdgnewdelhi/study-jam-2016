package com.example.android.mcdonalds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class place_order extends AppCompatActivity {
    boolean burger_box1=false,burger_box2=false,burger_box3=false,burger_box4=false,combo_box1=false,combo_box2=false,combo_box3=false,combo_box4=false,dessert_box1=false,dessert_box2=false,dessert_box3=false,dessert_box4=false;
    String burger_text1,burger_text2,burger_text3,burger_text4,combo_text1,combo_text2,combo_text3,combo_text4,dessert_text1,dessert_text2,dessert_text3,dessert_text4;
    public static int total=0;
    public static String s="";
    public static String s1="";
    public static String s2="";
    public static String s3="";
    public static String s4="";
    public static String s5="";
    public static String s6="";
    public static String s7="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
    }
    public void burger(View view)
    {
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.burger_box);
        linearLayout.setVisibility(view.VISIBLE);

    }
    public void combo(View view)
    {
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.combo_box);
        linearLayout.setVisibility(view.VISIBLE);

    }
    public void dessert(View view)
    {
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.dessert_box);
        linearLayout.setVisibility(view.VISIBLE);

    }

    public void setBurger_box1()
    {

        CheckBox checkBox=(CheckBox)findViewById(R.id.burger_box1);
        burger_box1=checkBox.isChecked();
        if(burger_box1)
        {
            EditText editText1=(EditText)findViewById(R.id.burger_text1);
            burger_text1=editText1.getText().toString();
            int nb=Integer.parseInt(burger_text1);
            s+="\nMcAloo Tikki" ;
            int sum=nb*29;
            s1+="\n"+sum;
            total+=nb*29;
            s2+="\n"+nb;
        }

    }
    public void setBurger_box2() {


        CheckBox checkBox = (CheckBox) findViewById(R.id.burger_box2);
        burger_box2 = checkBox.isChecked();
        if (burger_box2) {
            EditText editText1 = (EditText) findViewById(R.id.burger_text2);
            burger_text2 = editText1.getText().toString();
            int nb = Integer.parseInt(burger_text2);
            total += nb * 44;
            s+="\nChicken McGrill" ;
            int sum=nb*44;
            s1+="\n"+sum;
            s2+="\n"+nb;

        }
    }
    public void setBurger_box3() {


        CheckBox checkBox = (CheckBox) findViewById(R.id.burger_box3);
        burger_box3 = checkBox.isChecked();
        if (burger_box3) {
            EditText editText1 = (EditText) findViewById(R.id.burger_text3);
            burger_text3 = editText1.getText().toString();
            int nb = Integer.parseInt(burger_text3);
            total += nb * 67;
            s+="\nMcVeggie" ;
            int sum=nb*67;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }
    }
    public void setBurger_box4()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.burger_box4);
        burger_box4=checkBox.isChecked();
        if(burger_box4)
        {
            EditText editText1=(EditText)findViewById(R.id.burger_text4);
            burger_text4=editText1.getText().toString();
            int nb=Integer.parseInt(burger_text4);
            total+=nb*116;
            s+="\nMcSpicy Paneer" ;
            int sum=nb*116;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setCombo_box1()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.combo_box1);
        combo_box1=checkBox.isChecked();
        if(combo_box1)
        {
            EditText editText1=(EditText)findViewById(R.id.combo_text1);
            combo_text1=editText1.getText().toString();
            int nb=Integer.parseInt(combo_text1);
            total+=nb*233;
            s+="\nSpicy Meal" ;
            int sum=nb*233;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setCombo_box2()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.combo_box2);
        combo_box2=checkBox.isChecked();
        if(combo_box2)
        {
            EditText editText1=(EditText)findViewById(R.id.combo_text2);
            combo_text2=editText1.getText().toString();
            int nb=Integer.parseInt(combo_text2);
            total+=nb*158;
            s+="\nClassic Meal" ;
            int sum=nb*158;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setCombo_box3()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.combo_box3);
        combo_box3=checkBox.isChecked();
        if(combo_box3)
        {
            EditText editText1=(EditText)findViewById(R.id.combo_text3);
            combo_text3=editText1.getText().toString();
            int nb=Integer.parseInt(combo_text3);
            total+=nb*174;
            s+="\nFish and Grill" ;
            int sum=nb*174;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setCombo_box4()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.combo_box4);
        combo_box4=checkBox.isChecked();
        if(combo_box4)
        {
            EditText editText1=(EditText)findViewById(R.id.combo_text4);
            combo_text4=editText1.getText().toString();
            int nb=Integer.parseInt(combo_text4);
            total+=nb*126;
            s+="\nExtra Value Meal" ;
            int sum=nb*126;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }

    public void setDessert_box1()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.dessert_box1);
        dessert_box1=checkBox.isChecked();
        if(dessert_box1)
        {
            EditText editText1=(EditText)findViewById(R.id.dessert_text1);
            dessert_text1=editText1.getText().toString();
            int nb=Integer.parseInt(dessert_text1);
            total+=nb*69;
            s+="\nMcFlurry" ;
            int sum=nb*69;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setDessert_box2()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.dessert_box2);
        dessert_box2=checkBox.isChecked();
        if(dessert_box2)
        {
            EditText editText1=(EditText)findViewById(R.id.dessert_text2);
            dessert_text2=editText1.getText().toString();
            int nb=Integer.parseInt(dessert_text2);
            total+=nb*50;
            s+="\nSoft Serve" ;
            int sum=nb*50;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setDessert_box3()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.dessert_box3);
        dessert_box3=checkBox.isChecked();
        if(dessert_box3)
        {
            EditText editText1=(EditText)findViewById(R.id.dessert_text3);
            dessert_text3=editText1.getText().toString();
            int nb=Integer.parseInt(dessert_text3);
            total+=nb*65;
            s+="\nWalnut Brownie" ;
            int sum=nb*65;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setDessert_box4()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.dessert_box4);
        dessert_box4=checkBox.isChecked();
        if(dessert_box4)
        {
            EditText editText1=(EditText)findViewById(R.id.dessert_text4);
            dessert_text4=editText1.getText().toString();
            int nb=Integer.parseInt(dessert_text4);
            total+=nb*35;
            s+="\nMcFloat" ;
            int sum=nb*35;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void total_order(View view)
    {
        setBurger_box1();
        setBurger_box2();
        setBurger_box3();
        setBurger_box4();
        setCombo_box1();
        setCombo_box2();
        setCombo_box3();
        setCombo_box4();
        setDessert_box1();
        setDessert_box2();
        setDessert_box3();
        setDessert_box4();
        TextView textView=(TextView)findViewById(R.id.total);

        textView.setText("" + total);
        s3+="TOTAL:                    Rs."+total;
        float vat=(float)(total*0.14);
        float stax=(float)(total*0.0494);
        float gross=(float)(total+vat+stax);
        int r=(int)gross;
        s4+="\nVAT(@14.0%):              Rs."+vat;
        s5+="\nSERVICE TAX(@4.94%):      Rs."+stax;
        s6+="\nTOTAL AMOUNT:             Rs."+gross;
        s7+="\nROUND OFF AMOUNT:         Rs."+r;
    }
    public  void bill_order(View view)
    {
        Intent intent=new Intent(this,bill.class);
        startActivity(intent);
    }
    public void home(View view)
    {
        Intent intent;


        intent = new Intent(this, mainPage.class);


        startActivity(intent);

    }
}
