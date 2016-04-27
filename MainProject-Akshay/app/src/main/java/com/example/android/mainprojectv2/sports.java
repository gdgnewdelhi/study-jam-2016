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

public class sports extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";
    public static double numberOfArsenal = 0.0;
    public static double numberOfAustralia = 0.0;
    public static double numberOfBarca = 0.0;
    public static double numberOfManUtd = 0.0;
    public static double numberOfRealMadrid = 0.0;
    public static double numberOfMunich = 0.0;
    public static double numberOfChelsea = 0.0;
    public static double numberOfIndia = 0.0;
    private double costOfArsenal = 499.0;
    private double costOfAustralia = 499.0;
    private double costOfBarca = 499.0;
    private double costOfManUtd = 499.0;
    private double costOfRealMadrid = 499.0;
    private double costOfMunich = 499.0;
    private double costOfChelsea = 499.0;
    private double costOfIndia = 499.0;
    public static double cost = 0.00;
    private int ArsenalPicCounter = 0;
    private int AustraliaPicCounter = 0;
    private int ManUtdPicCounter = 0;
    private int BarcaPicCounter = 0;
    private int RealMadridPicCounter = 0;
    private int MunichPicCounter = 0;
    private int ChelseaPicCounter = 0;
    private int IndiaPicCounter = 0;
    public String bill3 = "";
    public static SharedPreferences Prefs;
    public static final String MyPREFERENCES = "MyPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Sports:", "onCreate");
        Prefs = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        setContentView(R.layout.activity_sports);
        SharedPreferences.Editor ed2 = Prefs.edit();
        /*ed2.putString("Arse", String.valueOf(numberOfArsenal));
        ed2.putString("Aus", String.valueOf(numberOfAustralia));
        ed2.putString("ManUtd", String.valueOf(numberOfManUtd));
        ed2.putString("Ind", String.valueOf(numberOfIndia));
        ed2.putString("RealMadrid", String.valueOf(numberOfRealMadrid));
        ed2.putString("Munich", String.valueOf(numberOfMunich));
        ed2.putString("Chelsea", String.valueOf(numberOfChelsea));
        ed2.putString("Barca", String.valueOf(numberOfBarca));
        ed2.putString("TotalPrice", String.valueOf(cost));
        ed2.commit();
        */

        String Ars1 = Prefs.getString("Arse", String.valueOf(numberOfArsenal));
        String Aus1 = Prefs.getString("Aus", String.valueOf(numberOfAustralia));
        String ManUtd1 = Prefs.getString("ManUtd", String.valueOf(numberOfManUtd));
        String Ind1 = Prefs.getString("Ind", String.valueOf(numberOfIndia));
        String Chelsea1 = Prefs.getString("Chelsea", String.valueOf(numberOfChelsea));
        String Munich1 = Prefs.getString("Munich", String.valueOf(numberOfMunich));
        String Madrid1 = Prefs.getString("RealMadrid", String.valueOf(numberOfRealMadrid));
        String Barca1 = Prefs.getString("Barca", String.valueOf(numberOfBarca));
        String cost1 = Prefs.getString("TotalPrice", String.valueOf(numberOfArsenal));
        ((TextView) findViewById(R.id.ArsenalQuantity)).setText(String.valueOf(numberOfArsenal));
        ((TextView) findViewById(R.id.AustraliaQuantity)).setText(String.valueOf(numberOfAustralia));
        ((TextView) findViewById(R.id.IndiaQuantity)).setText(String.valueOf(numberOfIndia));
        ((TextView) findViewById(R.id.MunichQuantity)).setText(String.valueOf(numberOfMunich));
        ((TextView) findViewById(R.id.ChelseaQuantity)).setText(String.valueOf(numberOfChelsea));
        ((TextView) findViewById(R.id.ManUtdQuantity)).setText(String.valueOf(numberOfManUtd));
        ((TextView) findViewById(R.id.RealMadridQuantity)).setText(String.valueOf(numberOfRealMadrid));
        ((TextView) findViewById(R.id.BarcaQuantity)).setText(String.valueOf(numberOfBarca));
        ((TextView) findViewById(R.id.totalPrice)).setText(String.valueOf(cost));
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        if (savedInstanceState != null){
            Log.v("Sports:", "RestoreInstanceState");
            numberOfArsenal = savedInstanceState.getDouble("Arse");
            TextView tArsenal = (TextView) findViewById(R.id.ArsenalQuantity);
            tArsenal.setText(String.valueOf(numberOfArsenal));
            numberOfAustralia = savedInstanceState.getDouble("Aus");
            TextView tAus = (TextView) findViewById(R.id.AustraliaQuantity);
            tAus.setText(String.valueOf(numberOfAustralia));
            numberOfManUtd = savedInstanceState.getDouble("ManUtd");
            TextView tManUtd =(TextView) findViewById(R.id.ManUtdQuantity);
            tManUtd.setText(String.valueOf(numberOfManUtd));
            numberOfMunich = savedInstanceState.getDouble("Munich");
            TextView tMunich =(TextView) findViewById(R.id.MunichQuantity);
            tMunich.setText(String.valueOf(numberOfMunich));
            numberOfIndia = savedInstanceState.getDouble("Ind");
            TextView tInd =(TextView) findViewById(R.id.IndiaQuantity);
            tInd.setText(String.valueOf(numberOfIndia));
            numberOfChelsea = savedInstanceState.getDouble("Chelsea");
            TextView tChelsea =(TextView) findViewById(R.id.ChelseaQuantity);
            tChelsea.setText(String.valueOf(numberOfChelsea));
            numberOfRealMadrid = savedInstanceState.getDouble("RealMadrid");
            TextView tRealMadrid =(TextView) findViewById(R.id.RealMadridQuantity);
            tRealMadrid.setText(String.valueOf(numberOfRealMadrid));
            numberOfBarca = savedInstanceState.getDouble("Barca");
            TextView tBarca =(TextView) findViewById(R.id.BarcaQuantity);
            tBarca.setText(String.valueOf(numberOfBarca));
            cost = savedInstanceState.getDouble("TotalPrice");
            TextView tcost = (TextView) findViewById(R.id.totalPrice);
            tcost.setText(String.valueOf(cost));
        }
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.v("Sports:", "saveInstanceState");
        savedInstanceState.putDouble("Arse", numberOfArsenal);
        savedInstanceState.putDouble("Aus",numberOfAustralia);
        savedInstanceState.putDouble("ManUtd",numberOfManUtd);
        savedInstanceState.putDouble("Ind",numberOfIndia);
        savedInstanceState.putDouble("RealMadrid",numberOfRealMadrid);
        savedInstanceState.putDouble("Munich",numberOfMunich);
        savedInstanceState.putDouble("Chelsea",numberOfChelsea);
        savedInstanceState.putDouble("Barca",numberOfBarca);
        savedInstanceState.putDouble("TotalPrice", cost);
    }

   /* @Override
    public void onResume() {
        Log.v("Sports:", "onResume");
        super.onResume();
        String nArsenal = Prefs.getString("Arse",String.valueOf(numberOfArsenal));
        TextView tArsenal = (TextView) findViewById(R.id.ArsenalQuantity);
        tArsenal.setText(nArsenal);
        numberOfArsenal = Double.valueOf(nArsenal);
        String nManUtd = Prefs.getString("ManUtd",String.valueOf(numberOfManUtd));
        TextView tManUtd = (TextView) findViewById(R.id.ManUtdQuantity);
        tManUtd.setText(nManUtd);
        numberOfManUtd = Double.valueOf(nManUtd);
        String nChelsea = Prefs.getString("Chelsea",String.valueOf(numberOfChelsea));
        TextView tChelsea = (TextView) findViewById(R.id.ChelseaQuantity);
        tChelsea.setText(nChelsea);
        numberOfChelsea = Double.valueOf(nChelsea);
        String nRealMadrid = Prefs.getString("RealMadrid",String.valueOf(numberOfRealMadrid));
        TextView tRealMadrid = (TextView) findViewById(R.id.RealMadridQuantity);
        tRealMadrid.setText(nRealMadrid);
        numberOfRealMadrid = Double.valueOf(nRealMadrid);
        String nMunich = Prefs.getString("Munich",String.valueOf(numberOfMunich));
        TextView tMunich = (TextView) findViewById(R.id.MunichQuantity);
        tMunich.setText(nMunich);
        numberOfMunich = Double.valueOf(nMunich);
        String nIndia = Prefs.getString("Ind",String.valueOf(numberOfIndia));
        TextView tIndia = (TextView) findViewById(R.id.IndiaQuantity);
        tIndia.setText(nIndia);
        numberOfIndia = Double.valueOf(nIndia);
        String nAustralia = Prefs.getString("Aus",String.valueOf(numberOfAustralia));
        TextView tAustralia = (TextView) findViewById(R.id.AustraliaQuantity);
        tAustralia.setText(nAustralia);
        numberOfAustralia = Double.valueOf(nAustralia);
        String nBarca = Prefs.getString("Barca",String.valueOf(numberOfBarca));
        TextView tBarca = (TextView) findViewById(R.id.BarcaQuantity);
        tBarca.setText(nBarca);
        numberOfBarca = Double.valueOf(nBarca);
        String ncost = Prefs.getString("TotalPrice",String.valueOf(cost));
        TextView tcost = (TextView) findViewById(R.id.totalPrice);
        tcost.setText(ncost);
        cost = Double.valueOf(ncost);
    }
*/

    /*@Override
    public void onRestart(){
        super.onRestart();
        String nArsenal = Prefs.getString("Arse","0");
        TextView tArsenal = (TextView) findViewById(R.id.ArsenalQuantity);
        tArsenal.setText(nArsenal);
        String nManUtd = Prefs.getString("ManUtd","0");
        TextView tManUtd = (TextView) findViewById(R.id.ManUtdQuantity);
        tManUtd.setText(nManUtd);
        String nChelsea = Prefs.getString("Chelsea","0");
        TextView tChelsea = (TextView) findViewById(R.id.ChelseaQuantity);
        tChelsea.setText(nChelsea);
        String nRealMadrid = Prefs.getString("RealMadrid","0");
        TextView tRealMadrid = (TextView) findViewById(R.id.RealMadridQuantity);
        tRealMadrid.setText(nRealMadrid);
        String nMunich = Prefs.getString("Munich","0");
        TextView tMunich = (TextView) findViewById(R.id.MunichQuantity);
        tMunich.setText(nMunich);
        String nIndia = Prefs.getString("Ind","0");
        TextView tIndia = (TextView) findViewById(R.id.IndiaQuantity);
        tIndia.setText(nIndia);
        String nAustralia = Prefs.getString("Aus","0");
        TextView tAustralia = (TextView) findViewById(R.id.AustraliaQuantity);
        tAustralia.setText(nAustralia);
        String nBarca = Prefs.getString("Barca","0");
        TextView tBarca = (TextView) findViewById(R.id.BarcaQuantity);
        tBarca.setText(nBarca);
        String ncost = Prefs.getString("TotalPrice","0");
        TextView tcost = (TextView) findViewById(R.id.totalPrice);
        tcost.setText(ncost);
    }
*/

    /*@Override
    public void onStart(){
        super.onStart();
        numberOfArsenal = Double.valueOf(((TextView) findViewById(R.id.ArsenalQuantity)).getText().toString());
        numberOfAustralia = Double.valueOf(((TextView) findViewById(R.id.AustraliaQuantity)).getText().toString());
        numberOfManUtd = Double.valueOf(((TextView) findViewById(R.id.ManUtdQuantity)).getText().toString());
        numberOfIndia = Double.valueOf(((TextView) findViewById(R.id.IndiaQuantity)).getText().toString());
        numberOfChelsea = Double.valueOf(((TextView) findViewById(R.id.ChelseaQuantity)).getText().toString());
        numberOfRealMadrid = Double.valueOf(((TextView) findViewById(R.id.RealMadridQuantity)).getText().toString());
        numberOfMunich = Double.valueOf(((TextView) findViewById(R.id.MunichQuantity)).getText().toString());
        numberOfBarca = Double.valueOf(((TextView) findViewById(R.id.BarcaQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
    }*/

    @Override
    public void onStop(){
        Log.v("Sports:", "onStop");
        super.onStop();
        SharedPreferences.Editor ed = Prefs.edit();
        numberOfArsenal = Double.valueOf(((TextView) findViewById(R.id.ArsenalQuantity)).getText().toString());
        numberOfAustralia = Double.valueOf(((TextView) findViewById(R.id.AustraliaQuantity)).getText().toString());
        numberOfManUtd = Double.valueOf(((TextView) findViewById(R.id.ManUtdQuantity)).getText().toString());
        numberOfIndia = Double.valueOf(((TextView) findViewById(R.id.IndiaQuantity)).getText().toString());
        numberOfRealMadrid = Double.valueOf(((TextView) findViewById(R.id.RealMadridQuantity)).getText().toString());
        numberOfMunich = Double.valueOf(((TextView) findViewById(R.id.MunichQuantity)).getText().toString());
        numberOfChelsea = Double.valueOf(((TextView) findViewById(R.id.ChelseaQuantity)).getText().toString());
        numberOfBarca = Double.valueOf(((TextView) findViewById(R.id.BarcaQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
        ed.putString("Arse",String.valueOf(numberOfArsenal));
        ed.putString("Aus", String.valueOf(numberOfAustralia));
        ed.putString("ManUtd", String.valueOf(numberOfManUtd));
        ed.putString("Ind", String.valueOf(numberOfIndia));
        ed.putString("RealMadrid", String.valueOf(numberOfRealMadrid));
        ed.putString("Munich", String.valueOf(numberOfMunich));
        ed.putString("Chelsea", String.valueOf(numberOfChelsea));
        ed.putString("Barca", String.valueOf(numberOfBarca));
        ed.putString("TotalPrice", String.valueOf(cost));
        ed.commit();
    }

    /*@Override
    public void onStop() {
        super.onStop();
        numberOfArsenal = 0;
        ((TextView) findViewById(R.id.ArsenalQuantity)).setText(String.valueOf(numberOfArsenal));
    }*/

    public void checkOut(View view) {
        if (numberOfArsenal > 0) {
            neww.bill = neww.bill + "\nArsenal: " + numberOfArsenal + " pc" + " = " + costOfArsenal * numberOfArsenal;
            //neww.bill.concat(bill3);
        }
        if (numberOfBarca > 0)
            neww.bill = neww.bill + "\nBarcelona: " + numberOfBarca + " pc" + " = " + costOfBarca * numberOfBarca;
        if (numberOfChelsea > 0)
            neww.bill = neww.bill + "\nChelsea: " + numberOfChelsea + " pc" + " = " + costOfChelsea * numberOfChelsea;
        if (numberOfManUtd > 0)
            neww.bill = neww.bill + "\nManUtd: " + numberOfManUtd + " pc" + " = " + costOfManUtd * numberOfManUtd;
        if (numberOfRealMadrid > 0)
            neww.bill = neww.bill + "\nRealMadrid: " + numberOfRealMadrid + " pc" + " = " + costOfRealMadrid * numberOfRealMadrid;
        if (numberOfIndia > 0)
            neww.bill = neww.bill + "\nIndia: " + numberOfIndia + " pc" + " = " + costOfIndia * numberOfIndia;
        if (numberOfMunich > 0)
            neww.bill = neww.bill + "\nMunich: " + numberOfMunich + " pc" + " = " + costOfMunich * numberOfMunich;
        if (numberOfAustralia > 0)
            neww.bill = neww.bill + "\nAustralia: " + numberOfAustralia + " pc" + " = " + costOfAustralia * numberOfAustralia;
        neww.totalcost = neww.totalcost + cost;
        Log.v( "Total Cost is (sports)", String.valueOf(neww.totalcost));
        Intent intent = new Intent(this, finalmap.class);
        String bills = neww.bill;
        intent.putExtra(EXTRA_MESSAGE, bills);
        intent.putExtra(EXTRA_MESSAGE2, String.valueOf(neww.totalcost));
        startActivity(intent);
    }

    public void PriceList(View view){
        Intent intent = new Intent(this, pricelistSports.class);
        startActivity(intent);
    }

    public void ArsenalInc(View view){
        numberOfArsenal +=1;
        TextView quantArsenalView = (TextView) findViewById(R.id.ArsenalQuantity);
        String noOfArsenal = Double.toString(numberOfArsenal);
        quantArsenalView.setText(noOfArsenal);
        TotalPrice();
    }



    public void ArsenalDec(View view) {
        if (numberOfArsenal > 0)
        {
            numberOfArsenal -= 1;
            TextView quantArsenalView = (TextView) findViewById(R.id.ArsenalQuantity);
            String noOfArsenal = Double.toString(numberOfArsenal);
            quantArsenalView.setText(noOfArsenal);
            TotalPrice();
        }
    }
    public void AustraliaInc(View view){
        numberOfAustralia += 1;
        TextView quantAustraliaView = (TextView) findViewById(R.id.AustraliaQuantity);
        String noOfAustralia = Double.toString(numberOfAustralia);
        quantAustraliaView.setText(noOfAustralia);
        TotalPrice();
    }
    public void AustraliaDec(View view) {
        if (numberOfAustralia > 0)
        {
            numberOfAustralia -= 1;
            TextView quantAustraliaView = (TextView) findViewById(R.id.AustraliaQuantity);
            String noOfAustralia = Double.toString(numberOfAustralia);
            quantAustraliaView.setText(noOfAustralia);
            TotalPrice();
        }
    }
    public void BarcaInc(View view){
        numberOfBarca += 1;
        TextView quantBarcaView = (TextView) findViewById(R.id.BarcaQuantity);
        String noOfBarca = Double.toString(numberOfBarca);
        quantBarcaView.setText(noOfBarca);
        TotalPrice();

    }
    public void BarcaDec(View view) {
        if (numberOfBarca > 0)
        {
            numberOfBarca -= 1;
            TextView quantBarcaView = (TextView) findViewById(R.id.BarcaQuantity);
            String noOfBarca = Double.toString(numberOfBarca);
            quantBarcaView.setText(noOfBarca);
            TotalPrice();
        }
    }
    public void ManUtdInc(View view){
        numberOfManUtd += 1;
        TextView quantManUtdView = (TextView) findViewById(R.id.ManUtdQuantity);
        String noOfManUtd = Double.toString(numberOfManUtd);
        quantManUtdView.setText(noOfManUtd);
        TotalPrice();
    }
    public void ManUtdDec(View view) {
        if (numberOfManUtd > 0)
        {
            numberOfManUtd -= 1;
            TextView quantManUtdView = (TextView) findViewById(R.id.ManUtdQuantity);
            String noOfManUtd = Double.toString(numberOfManUtd);
            quantManUtdView.setText(noOfManUtd);
            TotalPrice();
        }
    }

    public void RealMadridInc(View view){
        numberOfRealMadrid += 1;
        TextView quantRealMadridView = (TextView) findViewById(R.id.RealMadridQuantity);
        String noOfRealMadrid = Double.toString(numberOfRealMadrid);
        quantRealMadridView.setText(noOfRealMadrid);
        TotalPrice();

    }
    public void RealMadridDec(View view) {
        if (numberOfRealMadrid > 0)
        {
            numberOfRealMadrid -= 1;
            TextView quantRealMadridView = (TextView) findViewById(R.id.RealMadridQuantity);
            String noOfRealMadrid = Double.toString(numberOfRealMadrid);
            quantRealMadridView.setText(noOfRealMadrid);
            TotalPrice();
        }
    }

    public void MunichInc(View view){
        numberOfMunich += 1;
        TextView quantMunichView = (TextView) findViewById(R.id.MunichQuantity);
        String noOfMunich = Double.toString(numberOfMunich);
        quantMunichView.setText(noOfMunich);
        TotalPrice();

    }
    public void MunichDec(View view) {
        if (numberOfMunich > 0)
        {
            numberOfMunich -=1;
            TextView quantMunichView = (TextView) findViewById(R.id.MunichQuantity);
            String noOfMunich = Double.toString(numberOfMunich);
            quantMunichView.setText(noOfMunich);
            TotalPrice();
        }
    }

    public void ChelseaInc(View view){
        numberOfChelsea += 1;
        TextView quantChelseaView = (TextView) findViewById(R.id.ChelseaQuantity);
        String noOfChelsea = Double.toString(numberOfChelsea);
        quantChelseaView.setText(noOfChelsea);
        TotalPrice();

    }
    public void ChelseaDec(View view) {
        if (numberOfChelsea > 0)
        {
            numberOfChelsea -= 1;
            TextView quantChelseaView = (TextView) findViewById(R.id.ChelseaQuantity);
            String noOfChelsea = Double.toString(numberOfChelsea);
            quantChelseaView.setText(noOfChelsea);
            TotalPrice();
        }
    }

    public void IndiaInc(View view){
        numberOfIndia += 1;
        TextView quantIndiaView = (TextView) findViewById(R.id.IndiaQuantity);
        String noOfIndia = Double.toString(numberOfIndia);
        quantIndiaView.setText(noOfIndia);
        TotalPrice();

    }
    public void IndiaDec(View view) {
        if (numberOfIndia > 0)
        {
            numberOfIndia -= 1;
            TextView quantIndiaView = (TextView) findViewById(R.id.IndiaQuantity);
            String noOfIndia = Double.toString(numberOfIndia);
            quantIndiaView.setText(noOfIndia);
            TotalPrice();
        }
    }
    public void TotalPrice(){
        cost = (numberOfArsenal+numberOfAustralia+numberOfBarca+numberOfChelsea+numberOfIndia+numberOfManUtd+numberOfMunich+numberOfRealMadrid)*499;
        String totalCost = Double.toString(cost);
        TextView totalcostView = (TextView) findViewById(R.id.totalPrice);
        totalcostView.setText(totalCost);
    }
    public void picIncrementArsenal(View view){

        if ((ArsenalPicCounter<4)&&(ArsenalPicCounter>=0))
        {
            ArsenalPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewArsenal);
            if (ArsenalPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.arsenal);
            }
            if (ArsenalPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.arsenal2);
            }
            if (ArsenalPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.arsenal3);
            }
            if (ArsenalPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.arsenal4);
            }

        }
    }
    public void picDecrementArsenal(View view){

        if ((ArsenalPicCounter<=4)&&(ArsenalPicCounter>0))
        {
            ArsenalPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewArsenal);
            if (ArsenalPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.arsenal);
            }
            if (ArsenalPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.arsenal2);
            }
            if (ArsenalPicCounter == 2) {
                imageView.setImageResource(R.drawable.arsenal3);
            }
            if (ArsenalPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.arsenal4);
            }

        }
    }

    public void picIncrementManUtd(View view){

        if ((ManUtdPicCounter<4)&&(ManUtdPicCounter>=0))
        {
            ManUtdPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewManUtd);
            if (ManUtdPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.manutd);
            }
            if (ManUtdPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.manutd2);
            }
            if (ManUtdPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.manutd3);
            }
            if (ManUtdPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.manutd4);
            }

        }
    }
    public void picDecrementManUtd(View view) {

        if ((ManUtdPicCounter <= 4) && (ManUtdPicCounter > 0)) {
            ManUtdPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewManUtd);
            if (ManUtdPicCounter == 0) {
                imageView.setImageResource(R.drawable.manutd);
            }
            if (ManUtdPicCounter == 1) {
                imageView.setImageResource(R.drawable.manutd2);
            }
            if (ManUtdPicCounter == 2) {
                imageView.setImageResource(R.drawable.manutd3);
            }
            if (ManUtdPicCounter == 3) {
                imageView.setImageResource(R.drawable.manutd4);
            }
        }
    }

    public void picIncrementBarca(View view){

        if ((BarcaPicCounter<4)&&(BarcaPicCounter>=0))
        {
            BarcaPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewBarca);
            if (BarcaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.barca);
            }
            if (BarcaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.barca2);
            }
            if (BarcaPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.barca3);
            }
            if (BarcaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.barca4);
            }

        }
    }
    public void picDecrementBarca(View view) {

        if ((BarcaPicCounter <= 4) && (BarcaPicCounter > 0)) {
            BarcaPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewBarca);
            if (BarcaPicCounter == 0) {
                imageView.setImageResource(R.drawable.barca);
            }
            if (BarcaPicCounter == 1) {
                imageView.setImageResource(R.drawable.barca2);
            }
            if (BarcaPicCounter == 2) {
                imageView.setImageResource(R.drawable.barca3);
            }
            if (BarcaPicCounter == 3) {
                imageView.setImageResource(R.drawable.barca4);
            }
        }
    }

    public void picIncrementAustralia(View view){

        if ((AustraliaPicCounter<4)&&(AustraliaPicCounter>=0))
        {
            AustraliaPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewAustralia);
            if (AustraliaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.australia);
            }
            if (AustraliaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.australia2);
            }
            if (AustraliaPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.australia3);
            }
            if (AustraliaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.australia4);
            }

        }
    }
    public void picDecrementAustralia(View view) {

        if ((AustraliaPicCounter <= 4) && (AustraliaPicCounter > 0)) {
            AustraliaPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewAustralia);
            if (AustraliaPicCounter == 0) {
                imageView.setImageResource(R.drawable.australia);
            }
            if (AustraliaPicCounter == 1) {
                imageView.setImageResource(R.drawable.australia2);
            }
            if (AustraliaPicCounter == 2) {
                imageView.setImageResource(R.drawable.australia3);
            }
            if (AustraliaPicCounter == 3) {
                imageView.setImageResource(R.drawable.australia4);
            }

        }
    }

    public void picIncrementRealMadrid(View view){

        if ((RealMadridPicCounter<4)&&(RealMadridPicCounter>=0))
        {
            RealMadridPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewRealMadrid);
            if (RealMadridPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.madrid);
            }
            if (RealMadridPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.madrid2);
            }
            if (RealMadridPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.madrid3);
            }
            if (RealMadridPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.madrid4);
            }

        }
    }
    public void picDecrementRealMadrid(View view){

        if ((RealMadridPicCounter<=4)&&(RealMadridPicCounter>0))
        {
            RealMadridPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewRealMadrid);
            if (RealMadridPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.madrid);
            }
            if (RealMadridPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.madrid2);
            }
            if (RealMadridPicCounter == 2) {
                imageView.setImageResource(R.drawable.madrid3);
            }
            if (RealMadridPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.madrid4);
            }

        }
    }


    public void picIncrementMunich(View view){

        if ((MunichPicCounter<4)&&(MunichPicCounter>=0))
        {
            MunichPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewMunich);
            if (MunichPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.munich);
            }
            if (MunichPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.munich2);
            }
            if (MunichPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.munich3);
            }
            if (MunichPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.munich4);
            }

        }
    }
    public void picDecrementMunich(View view){

        if ((MunichPicCounter<=4)&&(MunichPicCounter>0))
        {
            MunichPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewMunich);
            if (MunichPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.munich);
            }
            if (MunichPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.munich2);
            }
            if (MunichPicCounter == 2) {
                imageView.setImageResource(R.drawable.munich3);
            }
            if (MunichPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.munich4);
            }
        }
    }


    public void picIncrementIndia(View view){

        if ((IndiaPicCounter<4)&&(IndiaPicCounter>=0))
        {
            IndiaPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewIndia);
            if (IndiaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.india);
            }
            if (IndiaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.india2);
            }
            if (IndiaPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.india3);
            }
            if (IndiaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.india4);
            }

        }
    }
    public void picDecrementIndia(View view){

        if ((IndiaPicCounter<=4)&&(IndiaPicCounter>0))
        {
            IndiaPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewIndia);
            if (IndiaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.india);
            }
            if (IndiaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.india2);
            }
            if (IndiaPicCounter == 2) {
                imageView.setImageResource(R.drawable.india3);
            }
            if (IndiaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.india4);
            }

        }
    }


    public void picIncrementChelsea(View view){

        if ((ChelseaPicCounter<4)&&(ChelseaPicCounter>=0))
        {
            ChelseaPicCounter++;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewChelsea);
            if (ChelseaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.chelsea);
            }
            if (ChelseaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.chelsea2);
            }
            if (ChelseaPicCounter == 2)
            {
                imageView.setImageResource(R.drawable.chelsea3);
            }
            if (ChelseaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.chelsea4);
            }

        }
    }
    public void picDecrementChelsea(View view){

        if ((ChelseaPicCounter<=4)&&(ChelseaPicCounter>0))
        {
            ChelseaPicCounter--;
            ImageView imageView = (ImageView) findViewById(R.id.imageViewChelsea);
            if (ChelseaPicCounter == 0)
            {
                imageView.setImageResource(R.drawable.chelsea);
            }
            if (ChelseaPicCounter == 1)
            {
                imageView.setImageResource(R.drawable.chelsea2);
            }
            if (ChelseaPicCounter == 2) {
                imageView.setImageResource(R.drawable.chelsea3);
            }
            if (ChelseaPicCounter == 3)
            {
                imageView.setImageResource(R.drawable.chelsea4);
            }

        }
    }



}
