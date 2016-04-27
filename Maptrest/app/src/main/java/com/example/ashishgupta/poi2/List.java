package com.example.ashishgupta.poi2;

import android.app.AlertDialog;
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


public class List extends AppCompatActivity implements AdapterView.OnItemClickListener ,AdapterView.OnItemLongClickListener{

    private static ListView l1;
    Bundle data;
    String cat,Name="";
    int option;
    MyDBHandler handler;
    ArrayList<String> arr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        l1=(ListView)findViewById(R.id.listView);
        data=getIntent().getExtras();
        option=data.getInt("Option");
        if(option==1)
        {
            catageory();
        }
        else
        {
            catageorylist();
        }
    }

    public void catageory()
    {
        handler=new MyDBHandler(List.this);
        cat=data.getString("CAT");
        Cursor c = handler.databasetostring2(cat);
        arr=new ArrayList<String>();

        if(c.getCount()==0)
        {
            Toast.makeText(getApplicationContext(),"EMPTY",Toast.LENGTH_LONG).show();
            return;
        }
        try {
            while (c.moveToNext()) {
                arr.add(c.getString(2));
            }
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_LONG);
        }
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(this);
        l1.setOnItemLongClickListener(this);
    }
    public void catageorylist()
    {
        handler=new MyDBHandler(List.this);
        Cursor c = handler.all();
        arr=new ArrayList<String>();

        if(c.getCount()==0)
        {
            Toast.makeText(getApplicationContext(),"EMPTY",Toast.LENGTH_LONG).show();
            return;
        }
        try {
            while (c.moveToNext()) {
                arr.add(c.getString(0));
            }
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_LONG);
        }
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
       l1.setAdapter(adapter);
        l1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(option==2)
        {
            Intent intent=new Intent(List.this,List.class);
            intent.putExtra("CAT",arr.get(position).toString());
            intent.putExtra("Option",1);
            startActivity(intent);
        }
        else {
            Name = arr.get(position).toString();
            Toast.makeText(getApplicationContext(), "ITEMCLICKED : " + Name, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(List.this, MapsActivity.class);
            Cursor c = handler.databasetostring(Name);
            if (c.getCount() == 0) {
                alert("ERROR", "Select An Item To Show");
                return;
            }
            c.moveToNext();
            Toast.makeText(getApplicationContext(), c.getDouble(3) + " :: " + c.getDouble(4), Toast.LENGTH_LONG).show();
            intent.putExtra("lat", c.getDouble(3));
            intent.putExtra("long", c.getDouble(4));
            startActivity(intent);
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

        Name=arr.get(position).toString();

        Toast.makeText(getApplicationContext(),"ITEMLongCLICKED : "+Name,Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(List.this,Display_Activity.class);
        intent.putExtra("Name",Name);
        startActivity(intent);
        return true;
    }



    public void alert(String Title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(message);
        builder.show();
    }

}
