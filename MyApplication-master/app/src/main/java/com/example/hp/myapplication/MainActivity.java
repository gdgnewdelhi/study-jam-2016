package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void selectintent(View v) {
        switch (v.getId())
        {
            case R.id.button_1: Intent intent1= new Intent(this,button1activity.class);
                startActivity(intent1);break;
            case R.id.button_2: Intent intent2= new Intent(this,button2activity.class);
                startActivity(intent2);break;
            case R.id.button_3: Intent intent3= new Intent(this,button3activity.class);
                startActivity(intent3);break;
            case R.id.button_4: Intent intent4= new Intent(this,button4activity.class);
                startActivity(intent4);break;
            case R.id.button_5: Intent intent5= new Intent(this,button5activity.class);
                startActivity(intent5);break;
            case R.id.button_6: Intent intent6= new Intent(this,button6activity.class);
                startActivity(intent6);break;
        }

    }
}
