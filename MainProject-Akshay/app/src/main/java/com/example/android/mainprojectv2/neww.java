//Fruits activity
package com.example.android.mainprojectv2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class neww extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";
    private double numberOfApples = 0.0;
    private double numberOfGrapes = 0.0;
    private double numberOfBananas = 0.0;
    private double numberOfOranges = 0.0;
    private double numberOfPineapple = 0.0;
    private double numberOfPomegranate = 0.0;
    private double numberOfCherry = 0.0;
    private double numberOfStrawberry = 0.0;
    private double costOfApples = 150.0;
    private double costOfGrapes = 120.0;
    private double costOfBananas = 60.0;
    private double costOfOranges = 50.0;
    private double costOfPineapple = 200.0;
    private double costOfPomegranate = 230.0;
    private double costOfCherry = 250.0;
    private double costOfStrawberry = 300.0;
    private double cost = 0.00;
    private int applePicCounter = 0;
    private int bananaPicCounter = 0;
    private int orangePicCounter = 0;
    private int grapesPicCounter = 0;
    private int pineapplePicCounter = 0;
    private int pomegranatePicCounter = 0;
    private int cherryPicCounter = 0;
    private int strawberryPicCounter = 0;
    public static String bill = "";
    public static double totalcost = 0.0;
    public String bill2 = "";
    public static SharedPreferences Prefs;
    public static final String MyPREFERENCES = "MyPrefs2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Neww","onCreate method running");
        setContentView(R.layout.activity_neww);
        Prefs = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed2 = Prefs.edit();
        /*ed2.putString("Apple", String.valueOf(numberOfApples));
        ed2.putString("Banana", String.valueOf(numberOfBananas));
        ed2.putString("Grapes", String.valueOf(numberOfGrapes));
        ed2.putString("Strawberry", String.valueOf(numberOfStrawberry));
        ed2.putString("Cherry", String.valueOf(numberOfCherry));
        ed2.putString("Pineapple", String.valueOf(numberOfPineapple));
        ed2.putString("Pomegranate", String.valueOf(numberOfPomegranate));
        ed2.putString("Oranges", String.valueOf(numberOfOranges));
        ed2.putString("TotalPrice", String.valueOf(cost));
        ed2.commit();*/
        String orange1 = Prefs.getString("Oranges",String.valueOf(numberOfOranges));
        String apple1 = Prefs.getString("Apple",String.valueOf(numberOfApples));
        String banana1 = Prefs.getString("Banana",String.valueOf(numberOfBananas));
        String pineapple1 = Prefs.getString("Pineapple",String.valueOf(numberOfPineapple));
        String pomegranate1 = Prefs.getString("Pomegranate",String.valueOf(numberOfPomegranate));
        String cherry1 = Prefs.getString("Cherry",String.valueOf(numberOfCherry));
        String grapes1 = Prefs.getString("Grapes",String.valueOf(numberOfGrapes));
        String strawberry1 = Prefs.getString("Strawberry",String.valueOf(numberOfStrawberry));
        ((TextView) findViewById(R.id.appleQuantity)).setText(apple1);//.setText(String.valueOf(numberOfApples));
        ((TextView) findViewById(R.id.bananaQuantity)).setText(banana1);
        ((TextView) findViewById(R.id.strawberryQuantity)).setText(strawberry1);
        ((TextView) findViewById(R.id.pineappleQuantity)).setText(pineapple1);
        ((TextView) findViewById(R.id.pomegranateQuantity)).setText(pomegranate1);
        ((TextView) findViewById(R.id.grapesQuantity)).setText(grapes1);
        ((TextView) findViewById(R.id.cherryQuantity)).setText(cherry1);
        ((TextView) findViewById(R.id.orangeQuantity)).setText(orange1);//.setText(String.valueOf(numberOfOranges));
        ((TextView) findViewById(R.id.totalPrice)).setText(String.valueOf(cost));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        if (savedInstanceState != null){
            Log.v("Neww:", "RestoreInstanceState");
            numberOfApples = savedInstanceState.getDouble("apple");
            TextView tapples = (TextView) findViewById(R.id.appleQuantity);
            tapples.setText(String.valueOf(numberOfApples));
            numberOfBananas = savedInstanceState.getDouble("banana");
            TextView tba = (TextView) findViewById(R.id.bananaQuantity);
            tba.setText(String.valueOf(numberOfBananas));
            numberOfCherry = savedInstanceState.getDouble("cherry");
            TextView tcher =(TextView) findViewById(R.id.cherryQuantity);
            tcher.setText(String.valueOf(numberOfCherry));
            numberOfGrapes = savedInstanceState.getDouble("grapes");
            TextView tgrap =(TextView) findViewById(R.id.grapesQuantity);
            tgrap.setText(String.valueOf(numberOfGrapes));
            numberOfOranges = savedInstanceState.getDouble("oranges");
            TextView torange =(TextView) findViewById(R.id.orangeQuantity);
            torange.setText(String.valueOf(numberOfOranges));
            numberOfPineapple = savedInstanceState.getDouble("pineapple");
            TextView tpa =(TextView) findViewById(R.id.pineappleQuantity);
            tpa.setText(String.valueOf(numberOfPineapple));
            numberOfPomegranate = savedInstanceState.getDouble("pomegranate");
            TextView tpo =(TextView) findViewById(R.id.pomegranateQuantity);
            tpo.setText(String.valueOf(numberOfPomegranate));
            numberOfStrawberry = savedInstanceState.getDouble("strawberry");
            TextView tstraw =(TextView) findViewById(R.id.strawberryQuantity);
            tstraw.setText(String.valueOf(numberOfStrawberry));
            cost = savedInstanceState.getDouble("totalPrice");
            TextView tcost = (TextView) findViewById(R.id.totalPrice);
            tcost.setText(String.valueOf(cost));
        }
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        Log.v("Neww:", "SaveInstanceState");
        savedInstanceState.putDouble("apple", numberOfApples);
        savedInstanceState.putDouble("banana",numberOfBananas);
        savedInstanceState.putDouble("cherry",numberOfCherry);
        savedInstanceState.putDouble("grapes",numberOfGrapes);
        savedInstanceState.putDouble("oranges", numberOfOranges);
        savedInstanceState.putDouble("pineapple",numberOfPineapple);
        savedInstanceState.putDouble("pomegranate", numberOfPomegranate);
        savedInstanceState.putDouble("strawberry", numberOfStrawberry);
        savedInstanceState.putDouble("totalPrice", cost);
    }

    /*@Override
    public void onResume() {
        super.onResume();
        Log.v("Neww", "onResume Method running");
        String nApples = Prefs.getString("Apple",String.valueOf(numberOfApples));
        TextView tApples = (TextView) findViewById(R.id.appleQuantity);
        tApples.setText(nApples);
        numberOfApples = Double.valueOf(nApples);
        //String nBananas = Prefs2.getString("Banana",String.valueOf(numberOfBananas));
        String nBananas = Prefs.getString("Banana",String.valueOf(numberOfBananas));
        TextView tBananas = (TextView) findViewById(R.id.bananaQuantity);
        tBananas.setText(nBananas);
        numberOfBananas = Double.valueOf(nBananas);
        String nCherry = Prefs.getString("Cherry",String.valueOf(numberOfCherry));
        TextView tCherry = (TextView) findViewById(R.id.cherryQuantity);
        tCherry.setText(nCherry);
        numberOfCherry = Double.valueOf(nCherry);
        String nGrapes = Prefs.getString("Grapes",String.valueOf(numberOfGrapes));
        TextView tGrapes = (TextView) findViewById(R.id.grapesQuantity);
        tGrapes.setText(nGrapes);
        numberOfGrapes = Double.valueOf(nGrapes);
        String nPomegranate = Prefs.getString("Pomegranate",String.valueOf(numberOfPomegranate));
        TextView tPomegranate = (TextView) findViewById(R.id.pomegranateQuantity);
        tPomegranate.setText(nPomegranate);
        numberOfPomegranate = Double.valueOf(nPomegranate);
        String nPineapple = Prefs.getString("Pineapple",String.valueOf(numberOfPineapple));
        TextView tPineapple = (TextView) findViewById(R.id.pineappleQuantity);
        tPineapple.setText(nPineapple);
        numberOfPineapple = Double.valueOf(nPineapple);
        String nStrawberry = Prefs.getString("Strawberry",String.valueOf(numberOfStrawberry));
        TextView tStrawberry = (TextView) findViewById(R.id.strawberryQuantity);
        tStrawberry.setText(nStrawberry);
        numberOfStrawberry = Double.valueOf(nStrawberry);
        String nOranges = Prefs.getString("Oranges",String.valueOf(numberOfOranges));
        TextView tOranges = (TextView) findViewById(R.id.orangeQuantity);
        tOranges.setText(nOranges);
        numberOfOranges = Double.valueOf(nOranges);
        String ncost = Prefs.getString("TotalPrice",String.valueOf(cost));
        TextView tcost = (TextView) findViewById(R.id.totalPrice);
        tcost.setText(ncost);
        cost = Double.valueOf(ncost);
    }
*/
    /*@Override
    public void onPause(){
        super.onPause();
        Log.v("Neww", "onPause Method running");
        SharedPreferences.Editor ed = Prefs2.edit();
        numberOfApples = Double.valueOf(((TextView) findViewById(R.id.appleQuantity)).getText().toString());
        numberOfBananas = Double.valueOf(((TextView) findViewById(R.id.bananaQuantity)).getText().toString());
        numberOfCherry = Double.valueOf(((TextView) findViewById(R.id.cherryQuantity)).getText().toString());
        numberOfPineapple = Double.valueOf(((TextView) findViewById(R.id.pineappleQuantity)).getText().toString());
        numberOfPomegranate = Double.valueOf(((TextView) findViewById(R.id.pomegranateQuantity)).getText().toString());
        numberOfOranges = Double.valueOf(((TextView) findViewById(R.id.orangeQuantity)).getText().toString());
        numberOfStrawberry = Double.valueOf(((TextView) findViewById(R.id.strawberryQuantity)).getText().toString());
        numberOfGrapes = Double.valueOf(((TextView) findViewById(R.id.grapesQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
        ed.putString("Apple",String.valueOf(numberOfApples));
        ed.putString("Banana", String.valueOf(numberOfBananas));
        ed.putString("Cherry", String.valueOf(numberOfCherry));
        ed.putString("Pineapple", String.valueOf(numberOfPineapple));
        ed.putString("Pomegranate", String.valueOf(numberOfPomegranate));
        ed.putString("Oranges", String.valueOf(numberOfOranges));
        ed.putString("Strawberry", String.valueOf(numberOfStrawberry));
        ed.putString("Grapes", String.valueOf(numberOfGrapes));
        ed.putString("TotalPrice", String.valueOf(cost));
        ed.commit();
    }*/

    @Override
    public void onStart(){
        super.onStart();
        numberOfApples = Double.valueOf(((TextView) findViewById(R.id.appleQuantity)).getText().toString());
        numberOfBananas = Double.valueOf(((TextView) findViewById(R.id.bananaQuantity)).getText().toString());
        numberOfGrapes = Double.valueOf(((TextView) findViewById(R.id.grapesQuantity)).getText().toString());
        numberOfOranges = Double.valueOf(((TextView) findViewById(R.id.orangeQuantity)).getText().toString());
        numberOfCherry = Double.valueOf(((TextView) findViewById(R.id.cherryQuantity)).getText().toString());
        numberOfPomegranate = Double.valueOf(((TextView) findViewById(R.id.pomegranateQuantity)).getText().toString());
        numberOfPineapple = Double.valueOf(((TextView) findViewById(R.id.pineappleQuantity)).getText().toString());
        numberOfStrawberry = Double.valueOf(((TextView) findViewById(R.id.strawberryQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.v("Neww", "onStop Method running");
        SharedPreferences.Editor ed3 = Prefs.edit();
        numberOfApples = Double.valueOf(((TextView) findViewById(R.id.appleQuantity)).getText().toString());
        numberOfBananas = Double.valueOf(((TextView) findViewById(R.id.bananaQuantity)).getText().toString());
        numberOfCherry = Double.valueOf(((TextView) findViewById(R.id.cherryQuantity)).getText().toString());
        numberOfPineapple = Double.valueOf(((TextView) findViewById(R.id.pineappleQuantity)).getText().toString());
        numberOfPomegranate = Double.valueOf(((TextView) findViewById(R.id.pomegranateQuantity)).getText().toString());
        numberOfOranges = Double.valueOf(((TextView) findViewById(R.id.orangeQuantity)).getText().toString());
        numberOfStrawberry = Double.valueOf(((TextView) findViewById(R.id.strawberryQuantity)).getText().toString());
        numberOfGrapes = Double.valueOf(((TextView) findViewById(R.id.grapesQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
        ed3.putString("Apple",String.valueOf(numberOfApples));
        ed3.putString("Banana", String.valueOf(numberOfBananas));
        ed3.putString("Cherry", String.valueOf(numberOfCherry));
        ed3.putString("Pineapple", String.valueOf(numberOfPineapple));
        ed3.putString("Pomegranate", String.valueOf(numberOfPomegranate));
        ed3.putString("Oranges", String.valueOf(numberOfOranges));
        ed3.putString("Strawberry", String.valueOf(numberOfStrawberry));
        ed3.putString("Grapes", String.valueOf(numberOfGrapes));
        ed3.putString("TotalPrice", String.valueOf(cost));
        ed3.commit();
    }

    public void checkOut(View view){
        if (numberOfApples > 0) {
            neww.bill = neww.bill + "\nApple: " + numberOfApples + " Kg" + " = " + costOfApples * numberOfApples;
        }
        if (numberOfBananas > 0)
            neww.bill = neww.bill + "\nBanana: " + numberOfBananas + " Kg" + " = " + costOfBananas*numberOfBananas;
        if (numberOfCherry > 0)
            neww.bill = neww.bill + "\nCherry: " + numberOfCherry + " Kg" + " = " + costOfCherry*numberOfCherry;
        if (numberOfGrapes > 0)
            neww.bill = neww.bill + "\nGrapes: " + numberOfGrapes + " Kg" + " = " + costOfGrapes*numberOfGrapes;
        if (numberOfOranges > 0)
            neww.bill = neww.bill + "\nOranges: " + numberOfOranges + " Kg" + " = " + costOfOranges*numberOfOranges;
        if (numberOfPineapple > 0)
            neww.bill = neww.bill + "\nPineapple: " + numberOfPineapple + " Kg" + " = " + costOfPineapple*numberOfPineapple;
        if (numberOfPomegranate > 0)
            neww.bill = neww.bill + "\nPomegranate: " + numberOfPomegranate + " Kg" + " = " + costOfPomegranate*numberOfPomegranate;
        if (numberOfStrawberry > 0)
            neww.bill = neww.bill + "\nStrawberry: " + numberOfStrawberry + " Kg" + " = " + costOfStrawberry*numberOfStrawberry;
        neww.totalcost = neww.totalcost + cost;
        Log.v("Total Cost is ", String.valueOf(totalcost));
        Intent intent = new Intent(this,finalmap.class);
        String bills = neww.bill;
        intent.putExtra(EXTRA_MESSAGE, bills);
        intent.putExtra(EXTRA_MESSAGE2, String.valueOf(totalcost));
        startActivity(intent);
    }


    public void PriceList(View view){
        Intent intent = new Intent(this, pricelistFruits.class);
        startActivity(intent);
    }

    public void appleInc(View view){
        numberOfApples +=0.5;
        TextView quantapplesView = (TextView) findViewById(R.id.appleQuantity);
        String noOfApples = Double.toString(numberOfApples);
        quantapplesView.setText(noOfApples);
        TotalPrice();
    }
    public void appleDec(View view) {
        if (numberOfApples > 0)
        {
            numberOfApples -= 0.5;
            TextView quantapplesView = (TextView) findViewById(R.id.appleQuantity);
            String noOfApples = Double.toString(numberOfApples);
            quantapplesView.setText(noOfApples);
            TotalPrice();
        }
    }
    public void bananaInc(View view){
        numberOfBananas += 0.5;
        TextView quantbananaView = (TextView) findViewById(R.id.bananaQuantity);
        String noOfBananas = Double.toString(numberOfBananas);
        quantbananaView.setText(noOfBananas);
        TotalPrice();
    }
    public void bananaDec(View view) {
        if (numberOfBananas > 0)
        {
            numberOfBananas -= 0.5;
            TextView quantbananaView = (TextView) findViewById(R.id.bananaQuantity);
            String noOfBananas = Double.toString(numberOfBananas);
            quantbananaView.setText(noOfBananas);
            TotalPrice();
        }
    }
    public void grapesInc(View view){
        numberOfGrapes += 0.5;
        TextView quantgrapesView = (TextView) findViewById(R.id.grapesQuantity);
        String noOfGrapes = Double.toString(numberOfGrapes);
        quantgrapesView.setText(noOfGrapes);
        TotalPrice();

    }
    public void grapesDec(View view) {
        if (numberOfGrapes > 0)
        {
            numberOfGrapes -= 0.5;
            TextView quantgrapesView = (TextView) findViewById(R.id.grapesQuantity);
            String noOfGrapes = Double.toString(numberOfGrapes);
            quantgrapesView.setText(noOfGrapes);
            TotalPrice();
        }
    }
    public void OrangeInc(View view){
        numberOfOranges += 0.5;
        TextView quantorangesView = (TextView) findViewById(R.id.orangeQuantity);
        String noOfOranges = Double.toString(numberOfOranges);
        quantorangesView.setText(noOfOranges);
        TotalPrice();
    }
    public void OrangeDec(View view) {
        if (numberOfOranges > 0)
        {
            numberOfOranges -= 0.5;
            TextView quantorangesView = (TextView) findViewById(R.id.orangeQuantity);
            String noOfOranges = Double.toString(numberOfOranges);
            quantorangesView.setText(noOfOranges);
            TotalPrice();
        }
    }

    public void pineappleInc(View view){
        numberOfPineapple += 0.5;
        TextView quantPineappleView = (TextView) findViewById(R.id.pineappleQuantity);
        String noOfPineapple = Double.toString(numberOfPineapple);
        quantPineappleView.setText(noOfPineapple);
        TotalPrice();

    }
    public void pineappleDec(View view) {
        if (numberOfPineapple > 0)
        {
            numberOfPineapple -= 0.5;
            TextView quantPineappleView = (TextView) findViewById(R.id.pineappleQuantity);
            String noOfPineapple = Double.toString(numberOfPineapple);
            quantPineappleView.setText(noOfPineapple);
            TotalPrice();
        }
    }

    public void pomegranateInc(View view){
        numberOfPomegranate += 0.5;
        TextView quantPomegranateView = (TextView) findViewById(R.id.pomegranateQuantity);
        String noOfPomegranate = Double.toString(numberOfPomegranate);
        quantPomegranateView.setText(noOfPomegranate);
        TotalPrice();

    }
    public void pomegranateDec(View view) {
        if (numberOfPomegranate > 0)
        {
            numberOfPomegranate -= 0.5;
            TextView quantPomegranateView = (TextView) findViewById(R.id.pomegranateQuantity);
            String noOfPomegranate = Double.toString(numberOfPomegranate);
            quantPomegranateView.setText(noOfPomegranate);
            TotalPrice();
        }
    }

    public void cherryInc(View view){
        numberOfCherry += 0.5;
        TextView quantCherryView = (TextView) findViewById(R.id.cherryQuantity);
        String noOfCherry = Double.toString(numberOfCherry);
        quantCherryView.setText(noOfCherry);
        TotalPrice();

    }
    public void cherryDec(View view) {
        if (numberOfCherry > 0)
        {
            numberOfCherry -= 0.5;
            TextView quantCherryView = (TextView) findViewById(R.id.cherryQuantity);
            String noOfCherry = Double.toString(numberOfCherry);
            quantCherryView.setText(noOfCherry);
            TotalPrice();
        }
    }

    public void strawberryInc(View view){
        numberOfStrawberry += 0.5;
        TextView quantStrawberryView = (TextView) findViewById(R.id.strawberryQuantity);
        String noOfStrawberry = Double.toString(numberOfStrawberry);
        quantStrawberryView.setText(noOfStrawberry);
        TotalPrice();

    }
    public void strawberryDec(View view) {
        if (numberOfStrawberry > 0)
        {
            numberOfStrawberry -= 0.5;
            TextView quantStrawberryView = (TextView) findViewById(R.id.strawberryQuantity);
            String noOfStrawberry = Double.toString(numberOfStrawberry);
            quantStrawberryView.setText(noOfStrawberry);
            TotalPrice();
        }
    }
    public void TotalPrice(){
        cost = numberOfApples*costOfApples + numberOfOranges*costOfOranges + numberOfGrapes*costOfGrapes + numberOfBananas*costOfBananas + numberOfPineapple*costOfPineapple + numberOfCherry*costOfCherry + numberOfPomegranate*costOfPomegranate + numberOfStrawberry*costOfStrawberry;
        String totalCost = Double.toString(cost);
        TextView totalcostView = (TextView) findViewById(R.id.totalPrice);
        totalcostView.setText(totalCost);
    }


    public void reset(View view){
        numberOfApples = 0;
        numberOfGrapes = 0;
        numberOfBananas = 0;
        numberOfOranges = 0;
        numberOfStrawberry=0;
        numberOfCherry=0;
        numberOfPomegranate=0;
        numberOfPineapple=0;
        cost = 0;
        TotalPrice();
        TextView quantorangesView = (TextView) findViewById(R.id.orangeQuantity);
        String noOfOranges = Double.toString(numberOfOranges);
        quantorangesView.setText(noOfOranges);

        TextView quantgrapesView = (TextView) findViewById(R.id.grapesQuantity);
        String noOfGrapes = Double.toString(numberOfGrapes);
        quantgrapesView.setText(noOfGrapes);

        TextView quantbananaView = (TextView) findViewById(R.id.bananaQuantity);
        String noOfBananas = Double.toString(numberOfBananas);
        quantbananaView.setText(noOfBananas);

        TextView quantcherryView = (TextView) findViewById(R.id.cherryQuantity);
        String noOfCherry = Double.toString(numberOfCherry);
        quantcherryView.setText(noOfCherry);

        TextView quantApplesView = (TextView) findViewById(R.id.appleQuantity);
        String noOfApples = Double.toString(numberOfApples);
        quantApplesView.setText(noOfApples);

        TextView quantStrawberryView = (TextView) findViewById(R.id.strawberryQuantity);
        String noOfStrawberry = Double.toString(numberOfStrawberry);
        quantStrawberryView.setText(noOfStrawberry);

        TextView quantPomegranateView = (TextView) findViewById(R.id.pomegranateQuantity);
        String noOfPomegranate = Double.toString(numberOfPomegranate);
        quantPomegranateView.setText(noOfPomegranate);

        TextView quantPineappleView = (TextView) findViewById(R.id.pineappleQuantity);
        String noOfPineapple = Double.toString(numberOfPineapple);
        quantPineappleView.setText(noOfPineapple);
    }

    public void picIncrementApple(View view){

        if ((applePicCounter<4)&&(applePicCounter>=0))
        {
            applePicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewApple);
            if (applePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.apple);
            }
            if (applePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.apple2);
            }
            if (applePicCounter == 2)
            {
                imageView.setImageResource(R.drawable.apple3);
            }
            if (applePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.apple4);
            }

        }
    }
    public void picDecrementApple(View view){

        if ((applePicCounter<=4)&&(applePicCounter>0))
        {
            applePicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewApple);
            if (applePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.apple);
            }
            if (applePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.apple2);
            }
            if (applePicCounter == 2) {
                imageView.setImageResource(R.drawable.apple3);
            }
            if (applePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.apple4);
            }

        }
    }

    public void picIncrementGrapes(View view){

        if ((grapesPicCounter<4)&&(grapesPicCounter>=0))
        {
            grapesPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewGrapes);
            if (grapesPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.grapes);
            }
            if (grapesPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.grapes2);
            }
            if (grapesPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.grapes3);
            }
            if (grapesPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.grapes4);
            }

        }
    }
    public void picDecrementGrapes(View view) {

        if ((grapesPicCounter <= 4) && (grapesPicCounter > 0)) {
            grapesPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewGrapes);
            if (grapesPicCounter == 0) {
                imageView.setImageResource(R.drawable.grapes);
            }
            if (grapesPicCounter == 1) {
                imageView.setImageResource(R.drawable.grapes2);
            }
            if (grapesPicCounter == 2) {
                imageView.setImageResource(R.drawable.grapes3);
            }
            if (grapesPicCounter == 3) {
                imageView.setImageResource(R.drawable.grapes4);
            }

        }
    }

    public void picIncrementBanana(View view){

        if ((bananaPicCounter<4)&&(bananaPicCounter>=0))
        {
            bananaPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewBanana);
            if (bananaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.banana);
            }
            if (bananaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.banana2);
            }
            if (bananaPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.banana3);
            }
            if (bananaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.banana4);
            }

        }
    }
    public void picDecrementBanana(View view) {

        if ((bananaPicCounter <= 4) && (bananaPicCounter > 0)) {
            bananaPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewBanana);
            if (bananaPicCounter == 0) {
                imageView.setImageResource(R.drawable.banana);
            }
            if (bananaPicCounter == 1) {
                imageView.setImageResource(R.drawable.banana2);
            }
            if (bananaPicCounter == 2) {
                imageView.setImageResource(R.drawable.banana3);
            }
            if (bananaPicCounter == 3) {
                imageView.setImageResource(R.drawable.banana4);
            }

        }
    }

    public void picIncrementOrange(View view){

        if ((orangePicCounter<4)&&(orangePicCounter>=0))
        {
            orangePicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewOrange);
            if (orangePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.orange);
            }
            if (orangePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.orange2);
            }
            if (orangePicCounter == 2)
            {
                imageView.setImageResource(R.drawable.orange3);
            }
            if (orangePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.orange4);
            }

        }
    }
    public void picDecrementOrange(View view) {

        if ((orangePicCounter <= 4) && (orangePicCounter > 0)) {
            orangePicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewOrange);
            if (orangePicCounter == 0) {
                imageView.setImageResource(R.drawable.orange);
            }
            if (orangePicCounter == 1) {
                imageView.setImageResource(R.drawable.orange2);
            }
            if (orangePicCounter == 2) {
                imageView.setImageResource(R.drawable.orange3);
            }
            if (orangePicCounter == 3) {
                imageView.setImageResource(R.drawable.orange4);
            }

        }
    }

    public void picIncrementPineapple(View view){

        if ((pineapplePicCounter<4)&&(pineapplePicCounter>=0))
        {
            pineapplePicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewpineapple);
            if (pineapplePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.pineapple);
            }
            if (pineapplePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.pineapple2);
            }
            if (pineapplePicCounter == 2)
            {
                imageView.setImageResource(R.drawable.pineapple3);
            }
            if (pineapplePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.pineapple4);
            }

        }
    }
    public void picDecrementPineapple(View view){

        if ((pineapplePicCounter<=4)&&(pineapplePicCounter>0))
        {
            pineapplePicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewpineapple);
            if (pineapplePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.pineapple);
            }
            if (pineapplePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.pineapple2);
            }
            if (pineapplePicCounter == 2) {
                imageView.setImageResource(R.drawable.pineapple3);
            }
            if (pineapplePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.pineapple4);
            }

        }
    }


    public void picIncrementPomegranate(View view){

        if ((pomegranatePicCounter<4)&&(pomegranatePicCounter>=0))
        {
            pomegranatePicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewPomegranate);
            if (pomegranatePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.pomegranate);
            }
            if (pomegranatePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.pomegranate2);
            }
            if (pomegranatePicCounter == 2)
            {
                imageView.setImageResource(R.drawable.pomegranate3);
            }
            if (pomegranatePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.pomegranate4);
            }

        }
    }
    public void picDecrementPomegranate(View view){

        if ((pomegranatePicCounter<=4)&&(pomegranatePicCounter>0))
        {
            pomegranatePicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewPomegranate);
            if (pomegranatePicCounter == 0)
            {
                imageView.setImageResource(R.drawable.pomegranate);
            }
            if (pomegranatePicCounter == 1)
            {
                imageView.setImageResource(R.drawable.pomegranate2);
            }
            if (pomegranatePicCounter == 2) {
                imageView.setImageResource(R.drawable.pomegranate3);
            }
            if (pomegranatePicCounter == 3)
            {
                imageView.setImageResource(R.drawable.pomegranate4);
            }

        }
    }


    public void picIncrementStrawberry(View view){

        if ((strawberryPicCounter<4)&&(strawberryPicCounter>=0))
        {
            strawberryPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewStrawberry);
            if (strawberryPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.strawberry);
            }
            if (strawberryPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.strawberry2);
            }
            if (strawberryPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.strawberry3);
            }
            if (strawberryPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.strawberry4);
            }

        }
    }
    public void picDecrementStrawberry(View view){

        if ((strawberryPicCounter<=4)&&(strawberryPicCounter>0))
        {
            strawberryPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewStrawberry);
            if (strawberryPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.strawberry);
            }
            if (strawberryPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.strawberry2);
            }
            if (strawberryPicCounter == 2) {
                imageView.setImageResource(R.drawable.strawberry3);
            }
            if (strawberryPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.strawberry4);
            }

        }
    }


    public void picIncrementCherry(View view){

        if ((cherryPicCounter<4)&&(cherryPicCounter>=0))
        {
            cherryPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewCherry);
            if (cherryPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.cherry);
            }
            if (cherryPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.cherry2);
            }
            if (cherryPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.cherry3);
            }
            if (cherryPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.cherry4);
            }

        }
    }
    public void picDecrementCherry(View view){

        if ((cherryPicCounter<=4)&&(cherryPicCounter>0))
        {
            cherryPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewCherry);
            if (cherryPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.cherry);
            }
            if (cherryPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.cherry2);
            }
            if (cherryPicCounter == 2) {
                imageView.setImageResource(R.drawable.cherry3);
            }
            if (cherryPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.cherry4);
            }

        }
    }


}
