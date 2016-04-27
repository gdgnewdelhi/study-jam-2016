package com.example.ashishgupta.poi2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Intent data;
    Double Lat;
    Double Long;
    Marker marker;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
        data=getIntent();
        Lat=data.getDoubleExtra("lat",50);
        Long=data.getDoubleExtra("long", 40);
        name=data.getStringExtra("Name");
    }


    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng latLng = new LatLng(Lat,Long);

        marker= mMap.addMarker(new MarkerOptions().position(latLng).title(name));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 14));
        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {
                if (Math.abs(marker.getPosition().latitude - latLng.latitude) < 0.005 &&
                        Math.abs(marker.getPosition().longitude - latLng.longitude) < 0.005) {
                    Toast.makeText(MapsActivity.this, "SHARE ", Toast.LENGTH_SHORT).show();
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "http://maps.google.com/maps?q=" + latLng.latitude + "," + latLng.longitude);
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                }
            }
        });
    }


}
