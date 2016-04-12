package com.example.azfar.freshersjam_final;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class JamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jam);

        Button bt1 = (Button)findViewById(R.id.boptics);
        Button bt2 = (Button)findViewById(R.id.belectro);
        Button bt3 = (Button)findViewById(R.id.bnrt);
        Button bt4 = (Button)findViewById(R.id.blt);
        Button bt5 = (Button)findViewById(R.id.blasers);
        Button bt6 = (Button)findViewById(R.id.bpos);
        Button bt7 = (Button)findViewById(R.id.bass2);
        Button bt8 = (Button)findViewById(R.id.bass4);
        Button bt9 = (Button)findViewById(R.id.bu1);
        Button bt10 = (Button)findViewById(R.id.bss);
        Button bt11 = (Button)findViewById(R.id.bu34);
        Button bt12 = (Button)findViewById(R.id.bcc3);
        Button bt13 = (Button)findViewById(R.id.bck1);
        Button bt14 = (Button)findViewById(R.id.btow);
        Button bt15 = (Button)findViewById(R.id.bfac);
        Button bt16 = (Button)findViewById(R.id.bcement);
        Button bt17 = (Button)findViewById(R.id.bsteel);
        Button bt18 = (Button)findViewById(R.id.bid1);
        Button bt19 = (Button)findViewById(R.id.bid2);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/physics/Optics.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent1 = getIntent();
        RelativeLayout layout1 = (RelativeLayout)findViewById(R.id.contentjam);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/physics/Electrodynamics.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent2 = getIntent();
        RelativeLayout layout2 = (RelativeLayout)findViewById(R.id.contentjam);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/physics/02_phy_1A.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent3 = getIntent();
        RelativeLayout layout3 = (RelativeLayout)findViewById(R.id.contentjam);

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/physics/02_phy_1B.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent4 = getIntent();
        RelativeLayout layout4 = (RelativeLayout)findViewById(R.id.contentjam);

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/physics/02_phy_2A.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent5 = getIntent();
        RelativeLayout layout5 = (RelativeLayout)findViewById(R.id.contentjam);

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/physics/02_phy_4.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent6 = getIntent();
        RelativeLayout layout6 = (RelativeLayout)findViewById(R.id.contentjam);

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/physics/02_phy_2A.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent7 = getIntent();
        RelativeLayout layout7 = (RelativeLayout)findViewById(R.id.contentjam);

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/physics/02_phy_4.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent8 = getIntent();
        RelativeLayout layout8 = (RelativeLayout)findViewById(R.id.contentjam);

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/chem/chem-1.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent9 = getIntent();
        RelativeLayout layout9 = (RelativeLayout)findViewById(R.id.contentjam);

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/chem/solid-state.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent10 = getIntent();
        RelativeLayout layout10 = (RelativeLayout)findViewById(R.id.contentjam);

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/chem/chem-3n4.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent11 = getIntent();
        RelativeLayout layout11 = (RelativeLayout)findViewById(R.id.contentjam);

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/chem/malam-complete.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent12 = getIntent();
        RelativeLayout layout12 = (RelativeLayout)findViewById(R.id.contentjam);

        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/chem/wahmad-complete.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent13 = getIntent();
        RelativeLayout layout13 = (RelativeLayout)findViewById(R.id.contentjam);

        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/chem/02_chem_1.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent14 = getIntent();
        RelativeLayout layout14 = (RelativeLayout)findViewById(R.id.contentjam);

        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/chem/02_chem_2.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent15 = getIntent();
        RelativeLayout layout15 = (RelativeLayout)findViewById(R.id.contentjam);

        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/chem/02_chem_4_jadoo.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent16 = getIntent();
        RelativeLayout layout16 = (RelativeLayout)findViewById(R.id.contentjam);

        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/chem/malam-complete.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent17 = getIntent();
        RelativeLayout layout17 = (RelativeLayout)findViewById(R.id.contentjam);

        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/1/maths-idrees.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent18 = getIntent();
        RelativeLayout layout18 = (RelativeLayout)findViewById(R.id.contentjam);

        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.freshersjam.com/src/notes/2/02_maths_idris.7z"));
                startActivity(browserIntent);


            }
        });
        Intent intent19 = getIntent();
        RelativeLayout layout19 = (RelativeLayout)findViewById(R.id.contentjam);

    }
    public void About(View view){
        Intent intent = new Intent(this, AboutActivity.class);
        setContentView(R.layout.activity_about);
        startActivity(intent);
    }

    public void Events(View view) {
        Intent intent = new Intent(this, EventsActivity.class);
        setContentView(R.layout.activity_events);
        startActivity(intent);
    }

    public void Jam(View view){
        Intent intent = new Intent(this, JamActivity.class);
        setContentView(R.layout.activity_jam);
        startActivity(intent);
    }

    public void Contact(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        setContentView(R.layout.activity_contact);
        startActivity(intent);
    }

    public void Home(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        setContentView(R.layout.activity_home);
        startActivity(intent);
    }

}
