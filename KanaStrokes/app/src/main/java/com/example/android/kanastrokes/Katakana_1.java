package com.example.android.kanastrokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Katakana_1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katakana_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Toast.makeText(this, "Tap on any Katakana to see its stroke order and listen to its pronunciation :)", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.katakana_1, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_hira) {
            Intent intent= new Intent(this,Hiragana_1.class);
            startActivity(intent);
        } else if (id == R.id.nav_kata) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void next(View view){
        Intent intent = new Intent(this, Katakana_2.class);
        switch(view.getId()){
            case R.id.kata_a:
                n=1;
                break;
            case R.id.kata_i:
                n=2;
                break;
            case R.id.kata_u:
                n=3;
                break;
            case R.id.kata_e:
                n=4;
                break;
            case R.id.kata_o:
                n=5;
                break;
            case R.id.kata_ka:
                n=6;
                break;
            case R.id.kata_ki:
                n=7;
                break;
            case R.id.kata_ku:
                n=8;
                break;
            case R.id.kata_ke:
                n=9;
                break;
            case R.id.kata_ko:
                n=10;
                break;
            case R.id.kata_sa:
                n=11;
                break;
            case R.id.kata_shi:
                n=12;
                break;
            case R.id.kata_su:
                n=13;
                break;
            case R.id.kata_se:
                n=14;
                break;
            case R.id.kata_so:
                n=15;
                break;
            case R.id.kata_ta:
                n=16;
                break;
            case R.id.kata_chi:
                n=17;
                break;
            case R.id.kata_tsu:
                n=18;
                break;
            case R.id.kata_te:
                n=19;
                break;
            case R.id.kata_to:
                n=20;
                break;
            case R.id.kata_na:
                n=21;
                break;
            case R.id.kata_ni:
                n=22;
                break;
            case R.id.kata_nu:
                n=23;
                break;
            case R.id.kata_ne:
                n=24;
                break;
            case R.id.kata_no:
                n=25;
                break;
            case R.id.kata_ha:
                n=26;
                break;
            case R.id.kata_hi:
                n=27;
                break;
            case R.id.kata_fu:
                n=28;
                break;
            case R.id.kata_he:
                n=29;
                break;
            case R.id.kata_ho:
                n=30;
                break;
            case R.id.kata_ma:
                n=31;
                break;
            case R.id.kata_mi:
                n=32;
                break;
            case R.id.kata_mu:
                n=33;
                break;
            case R.id.kata_me:
                n=34;
                break;
            case R.id.kata_mo:
                n=35;
                break;
            case R.id.kata_ya:
                n=36;
                break;
            case R.id.kata_yu:
                n=37;
                break;
            case R.id.kata_yo:
                n=38;
                break;
            case R.id.kata_ra:
                n=39;
                break;
            case R.id.kata_ri:
                n=40;
                break;
            case R.id.kata_ru:
                n=41;
                break;
            case R.id.kata_re:
                n=42;
                break;
            case R.id.kata_ro:
                n=43;
                break;
            case R.id.kata_wa:
                n=44;
                break;
            case R.id.kata_wo:
                n=45;
                break;
            case R.id.kata_n:
                n=46;
                break;
        }
        startActivity(intent);
    }
}
