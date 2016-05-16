package com.example.prakash.first;

/**
 * Created by PRAKASH on 01-May-16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.second);

        TextView  tA=(TextView) findViewById(R.id.t1);
        TextView  tB=(TextView) findViewById(R.id.t2);
        TextView  tC=(TextView) findViewById(R.id.t3);
        TextView  tD=(TextView) findViewById(R.id.t4);
    Bundle bundle=getIntent().getExtras();
        String data1=bundle.get("data1").toString();
        String data2=bundle.get("data2").toString();
        String data3=bundle.get("data3").toString();
        String n1 = getIntent().getStringExtra("name");
        tD.setText("Hi "+n1);
        tA.setText("Your Start Station is "+data1);
        tB.setText("And Your Destination is "+data2);
        tC.setText("Your Comfort class is "+data3);

}
}
