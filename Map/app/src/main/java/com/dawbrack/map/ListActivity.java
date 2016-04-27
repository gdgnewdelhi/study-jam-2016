package com.dawbrack.map;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private Intent intent;  // for starting new activities
    private MyDBHandler handler; // for database Manipulation
    private ArrayList<String> arr,Latitude,Longitude,TempLat,Templong,Temptime;
    private String date;
    private Intent data; // for catching data from new activites
    private int option;
    private Cursor c;   // for retrieving imformation from database

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=(ListView)findViewById(R.id.listView);
        handler=new MyDBHandler(ListActivity.this);

        Latitude=new ArrayList<String>();
        Longitude=new ArrayList<String>();
         arr=new ArrayList<String>();

        data=getIntent();
        option=data.getIntExtra("Option",0);

        // selection according to option

        if(option==1) {   c = handler.show();  }
        else if(option==2) { c=handler.alldates();  }
        else {  date=data.getStringExtra("Date");  c=handler.specific_date(date);  }

        // checking database count

        if(c.getCount()==0)
        { Toast.makeText(getApplicationContext(), "EMPTY", Toast.LENGTH_LONG).show(); return; }

        try {
            if(option==1) {
                while (c.moveToNext()) {
                    arr.add(c.getString(6)+" - "+c.getString(1)+" - "+c.getInt(2)+":"+c.getInt(3));
                    Latitude.add(String.valueOf(c.getDouble(4)));
                    Longitude.add(String.valueOf(c.getDouble(5)));
                }
            }
            else if(option==2)
            {
                while (c.moveToNext()) {
                    arr.add(c.getString(0));
                }
            }
            else {
                while (c.moveToNext()) {
                    arr.add(c.getInt(2) + ":" + c.getInt(3));
                    Latitude.add(String.valueOf(c.getDouble(4)));
                    Longitude.add(String.valueOf(c.getDouble(5)));
                }
            }

        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_LONG);
        }

        // setting list in listview

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);

        // OnItemClickListner

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             if(option==2)
             {
                 intent=new Intent(ListActivity.this,ListActivity.class);
                 intent.putExtra("Date",arr.get(position).toString());
                 intent.putExtra("Option",3);
                 startActivity(intent);
             }
             else
             {
                 TempLat=new ArrayList<String>();
                 Templong=new ArrayList<String>();
                 Temptime=new ArrayList<String>();

                 intent=new Intent(ListActivity.this,MapsActivity.class);
                TempLat.add(String.valueOf(Latitude.get(position)));
                Templong.add(String.valueOf(Longitude.get(position)));
                Temptime.add(String.valueOf(arr.get(position)));
                intent.putStringArrayListExtra("lat", TempLat);
                intent.putStringArrayListExtra("long", Templong);
                intent.putStringArrayListExtra("Time", Temptime);
                startActivity(intent);
             }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        TempLat=new ArrayList<String>();
        Templong=new ArrayList<String>();
        Temptime=new ArrayList<String>();
    }
}
