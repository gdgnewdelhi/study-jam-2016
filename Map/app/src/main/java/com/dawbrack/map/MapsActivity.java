package com.dawbrack.map;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private int k;
    private Intent data;
    //getting latitude and longitude information

    private ArrayList<String> latitude;
    private ArrayList<String> longitude;
    private ArrayList<String> Time;
    private ArrayList<Marker> markers;
    private LatLng first,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        data = getIntent();
        k=0;
        latitude = data.getStringArrayListExtra("lat");
        longitude = data.getStringArrayListExtra("long");
        Time = data.getStringArrayListExtra("Time");
        Toast.makeText(MapsActivity.this, String.valueOf(latitude.size()), Toast.LENGTH_SHORT).show();
        markers = new ArrayList<Marker>();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        markers.add(mMap.addMarker(new MarkerOptions().title(Time.get(k)).position(new LatLng(Double.valueOf(latitude.get(k)), Double.valueOf(longitude.get(k))))));

        for (int i = 1; i < latitude.size(); i++) {
            markers.add(mMap.addMarker(new MarkerOptions().title(Time.get(i)).position(new LatLng(Double.valueOf(latitude.get(i)), Double.valueOf(longitude.get(i))))));
          first=new LatLng(markers.get(k).getPosition().latitude,markers.get(k).getPosition().longitude);
          second=new LatLng(markers.get(i).getPosition().latitude,markers.get(i).getPosition().longitude);

            // removing multiple markers within 50m radius

           if(Marker_position(first,second))
            {

                markers.get(i).remove();
                k=i;
            }
        }

        // dis[laying all the markers with the screen view

        final View mapView = getSupportFragmentManager().findFragmentById(R.id.map).getView();
        if (mapView != null) {
            if (mapView.getViewTreeObserver().isAlive()) {
                mapView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @SuppressWarnings("deprecation") // We use the new method when supported
                    @SuppressLint("NewApi") // We check which build version we are using.
                    @Override
                    public void onGlobalLayout() {
                        //Calculate the markers to get their position
                        LatLngBounds.Builder b = new LatLngBounds.Builder();
                        for (Marker m : markers) {
                            b.include(m.getPosition());
                        }
                        LatLngBounds bounds = b.build();
                        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
                            mapView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        } else {
                            mapView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 200));
                    }
                });
            }
        }

        // for sharing location via other applications

        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {
                for (Marker marker : markers) {
                    if (Marker_position(new LatLng(marker.getPosition().latitude,marker.getPosition().longitude),latLng)) {
                        Toast.makeText(MapsActivity.this, "SHARE ", Toast.LENGTH_SHORT).show();
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "http://maps.google.com/maps?q=" + latLng.latitude + "," + latLng.longitude);
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        break;
                    }
                }

            }
        });

    }

    // checking neighbouring markers

    Boolean Marker_position(LatLng first, LatLng second) {
        if ((Math.abs(first.latitude - second.latitude) < 0.005 && Math.abs(first.longitude - second.longitude) < 0.005)) {
           return true;
        }
        return false;
    }

}
