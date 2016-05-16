package com.example.sachin.scorecounter;

import android.graphics.Color;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score,wkt,us,ub,uw;
    int o,ball,wc,nc,dot,four,six,overs;
    String s;
    boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(savedInstanceState!=null)
            onRestoreInstanceState(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        o=ball=0;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

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
        if (id == R.id.exit) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("You Want To Reset The Values ?");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ball = wkt = score = o = 0;
                            dispovr(o, ball);
                            display();
                            wkt();
                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }

        return super.onOptionsItemSelected(item);
    }
    public void display()
    {
       TextView a=(TextView)findViewById(R.id.score);
        if(score>99)
        {
            a.setTextSize(20);
        }
        a.setText(""+score);
        us=0;
    }
    public void add(int a)
    {
        us=a;
        score=score+a;

    }
    public void dispovr(int a,int b)
    {
        TextView o=(TextView)findViewById(R.id.overs);
        TextView ball=(TextView)findViewById(R.id.overs1);
        o.setText(""+a);
        ball.setText("" + b);
        ub=0;
    }
    public void addover()
    {
        if(flag==true) {
            if (ball < 5)
                ball = ball + 1;
            else {
                ball = 0;
                o = o + 1;
            }
            ub=1;
            dispovr(o, ball);
        }
       else {
            flag = true;
        }
        uw=0;
        dispovr(o, ball);
    }
    public void r1(View v)
    {
        add(1);
        addover();
        display();
    }
    public void r2(View v)
    {
        add(2);
        addover();
        display();
    }
    public void r3(View v)
    {
        add(3);
        addover();
        display();
    }
    public void r4(View v)
    {
        four++;
        add(4);
        addover();
        display();
    }
    public void r6(View v)
    {
        six++;
        add(6);
        addover();
        display();
    }
    public void wide(View v)
    {
        add(1);
        wc++;
        display();
        ub=0;
    }
    public void NO(View v)
    {
        add(1);
        nc++;
        display();
        ub=0;
    }
    public void dot(View v)
    {
        dot++;
        addover();
        display();
    }
    public void wkt()
    {
        TextView a1=(TextView)findViewById(R.id.wkt);
        a1.setText("" + wkt);
        if(wkt>9)
        {
            a1.setTextSize(20);
        }
    }
    public void wicket(View v) {

        uw=1;
        if(wkt>9)
        {
            submit(v);
        }
        else {
            wkt = wkt + 1;
            wkt();
            addover();

        }

    }

    public void Plus(View v)
    {
        display();
        dispovr(o, ball);
        flag=false;
    }
    public void call(View view)
    {
        dispovr(o, ball);
        display();
        wkt();
    }
    public void submit(View view)
    {
        int f=wc+nc;
        s="\t\tScore = "+score+"\n\n"+" \t\t Wickets  = "+wkt+"\n\n\t\t Over ="+o+"."+ball+
            "\n\n\t\tExtra = "+f+"(\tWide "+wc+"\t\t"+"No "+nc+"\t)"+"\n\n\t\tDot Ball "+dot+""+
                "\n\n\t\tFours "+four+""+"\n\n\t\tSixes "+six+"";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"New Cricket Score");
        intent.putExtra(Intent.EXTRA_TEXT,s);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
       /* TextView e=(TextView)findViewById(R.id.showscore);
        e.setTextSize(20);
        e.setTextColor(Color.RED);
        e.setText(""+s);*/
    }
}
