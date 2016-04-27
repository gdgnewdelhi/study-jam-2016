package com.dawbrack.map;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends Activity implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener, LocationListener {

    MyDBHandler handler;
    LocationInfo locationInfo;
    AlertDialog.Builder builder;
    SharedPreferences pref;
    Notification.Builder  notification;
    private static int Dialog_date=1;
    private static int Dialog_time1=2;
    private static int Dialog_time2=3;
    private int h1,h2;
    EditText Name;
    Calendar now;
    TextView about;
    private final static int PLAY_SERVICES_RESOLUTION_REQUEST = 1000;
    private Location mLastLocation;
    double lat;
    double lng;
    Intent intent;
    String date;
    Cursor c;
    private GoogleApiClient mGoogleApiClient;
    // boolean flag to toggle periodic location updates
    private boolean mRequestingLocationUpdates = true;

    private LocationRequest mLocationRequest;
    Long i;
    // Location updates intervals in sec
    private static int UPDATE_INTERVAL = 15*60*1000;
    private static int FATEST_INTERVAL = 15*30*1000; //6 sec

    // UI elements
    private Button power;
    ArrayList<String> latitude,longitude,Time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationInfo=new LocationInfo();
        about=new TextView(this);
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        handler = new MyDBHandler(MainActivity.this);
        power = (Button) findViewById(R.id.power);
       power.setBackgroundResource(R.drawable.poweroff);
        latitude = new ArrayList<String>();
        longitude = new ArrayList<String>();
        Name=new EditText(this);
        pref=getSharedPreferences("com.dawbrack.map",MODE_PRIVATE);
        // First we need to check availability of play services
        if (checkPlayServices()) {
            // Building the GoogleApi client
            buildGoogleApiClient();
            createLocationRequest();
        }else
        {Toast.makeText(getApplicationContext(),"PLAYSERVICENOTAVAILABLE",Toast.LENGTH_SHORT).show();}
    }

    public void onclick(View view)
    {
        switch (view.getId())
        {

            case R.id.power:  togglePeriodicLocationUpdates();
                                          break;

            case R.id.search: showDialog(Dialog_date);
                              showDialog(Dialog_time2);
                              showDialog(Dialog_time1);
                                          break;

            case R.id.currentlocation: displayLocation();
                                          break;
            case R.id.viewall:  intent=new Intent(MainActivity.this,ListActivity.class);
                                intent.putExtra("Option",2);
                                startActivity(intent);
                                 break;
            case R.id.saved:   intent=new Intent(MainActivity.this,ListActivity.class);
                               intent.putExtra("Option",1);
                               startActivity(intent);
                                 break;
            case R.id.add:      add();
                                 break;
            case R.id.info :   info();
                                   break;
        }
    }

    public void info()
    {   builder=new AlertDialog.Builder(this);
        builder.setTitle("INFO");
        builder.setMessage("ABOUT APP :-");
        about.setText("This app helps to track the users location\n\n" +
                "Power on to start recording location \n\n" +
                "Search according to the time interval(Start/End) and Date \n\n" +
                "Add a Bookmark to save a specific location\n\n" +
                "View all the saved locations ");
        about.setTextColor(Color.BLUE);
        AlertDialog alert=builder.create();
        alert.setView(about, 50, 0, 50, 50);
        alert.setCancelable(false);
        alert.setButton(DialogInterface.BUTTON_NEUTRAL, "Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((ViewGroup) about.getParent()).removeView(about);
                dialog.cancel();
            }
        });
        alert.show();

    }
    @Override
    protected Dialog onCreateDialog(int id) {
        now=Calendar.getInstance();
        if (id == Dialog_date) {
            DatePickerDialog d = new DatePickerDialog(this, dplistner, now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH));
            return d;
        }
        else if(id == Dialog_time1) {
            TimePickerDialog t = new TimePickerDialog(this, tp1listner, 12, 00, true);
            return t;
        }  else if(id == Dialog_time2) {
            TimePickerDialog t = new TimePickerDialog(this, tp2listner, 12, 00, true);
            return t;
        }

        return null;
    }

    TimePickerDialog.OnTimeSetListener tp1listner=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            h1=hourOfDay;

        }
    };

    TimePickerDialog.OnTimeSetListener tp2listner=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            h2=hourOfDay;

        }
    };

    DatePickerDialog.OnDateSetListener dplistner = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            date=(String.valueOf(dayOfMonth)+"/"+
                    String.valueOf(monthOfYear+1)+"/"+
                    String.valueOf(year));
            try {
                Toast.makeText(getApplicationContext(),date+" , "+h1+"-"+h2,Toast.LENGTH_SHORT).show();
                latitude=new ArrayList<String>();
                longitude=new ArrayList<String>();
                Time=new ArrayList<String>();
                c = handler.databasetostring(date,h1,h2);
                if(c.getCount()==0)
                {   if(view.isShown())
                    alert("ERROR","NOTHING TO SHOW");
                    return;
                }
                while(c.moveToNext())
                {
                    latitude.add(String.valueOf(c.getDouble(4)));
                    longitude.add(String.valueOf(c.getDouble(5)));
                    Time.add(String.valueOf(c.getInt(2))+":"+String.valueOf(c.getInt(3)) );
                }

                if(view.isShown())
                {
                    Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                    intent.putStringArrayListExtra("lat",latitude);
                    intent.putStringArrayListExtra("long",longitude);
                    intent.putStringArrayListExtra("Time",Time);
                    startActivity(intent);
                }

            }catch (Exception e){Toast.makeText(getApplicationContext(),"ERROR IN calling map",Toast.LENGTH_SHORT).show();}
        }
    };

    public void send_notification(String message)
    {   notification=new Notification.Builder(this);
        notification.setSmallIcon(R.mipmap.ic_launcher);
        notification.setAutoCancel(true);
        notification.setTicker("New Notification");
        notification.setContentTitle("MapMyLocation");
        notification.setContentText(message);
        notification.setWhen(System.currentTimeMillis());

        intent = new Intent(MainActivity.this,MainActivity.class);
        PendingIntent p_intent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(p_intent);

        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(1,notification.build());
    }
    public void add()
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage(" Enter the Name :- ");
        builder.setCancelable(false);
        builder.setView(Name);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                add_to_db(String.valueOf(Name.getText()));
                ((ViewGroup) Name.getParent()).removeView(Name);
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ((ViewGroup) Name.getParent()).removeView(Name);
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void alert(String Title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(message);
        builder.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mGoogleApiClient != null) {
            mGoogleApiClient.connect();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"MapMyLocation Application closed",Toast.LENGTH_SHORT).show();
        send_notification("For continuous Location update restart the application and power on");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mGoogleApiClient != null) {
            mGoogleApiClient.connect();
        }
    }

    private void displayLocation() {
        try {
            mLastLocation = LocationServices.FusedLocationApi
                    .getLastLocation(mGoogleApiClient);
        }catch(SecurityException e)
        {e.printStackTrace();}
        if (mLastLocation != null) {
            lat = mLastLocation.getLatitude();
            lng = mLastLocation.getLongitude();
            Intent intent=new Intent(MainActivity.this,MapsActivity.class);
            latitude= new ArrayList<String>();
            latitude.add(String.valueOf(lat));
            longitude=new ArrayList<String>();
            longitude.add(String.valueOf(lng));
            Time=new ArrayList<String>();
            now=Calendar.getInstance();
            Time.add(String.valueOf(now.getTime()));

            intent.putStringArrayListExtra("lat", latitude);
            intent.putStringArrayListExtra("long", longitude);
            intent.putStringArrayListExtra("Time",Time);
            Toast.makeText(MainActivity.this, lat +"::"+ lng,Toast.LENGTH_SHORT).show();
            startActivity(intent);

        } else {

            Toast.makeText(MainActivity.this, "(Couldn't get the location. Make sure location is enabled on the device)",Toast.LENGTH_SHORT).show();
        }
    }

    public void add_to_db(String name)
    {  String date="";
        try
        {
            mLastLocation=LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        }catch (SecurityException e)
        {
            e.printStackTrace();
        }

        if(mLastLocation!=null)
        {
            now=Calendar.getInstance();
            locationInfo.setLatitude(mLastLocation.getLatitude());
            locationInfo.setLongitude(mLastLocation.getLongitude());
            locationInfo.setHOUR_OF_THE_DAY(now.get(Calendar.HOUR_OF_DAY));
            locationInfo.setMINUTE(now.get(Calendar.MINUTE));
            date +=String.valueOf(now.get(Calendar.DAY_OF_MONTH))+"/"+
                    String.valueOf(now.get(Calendar.MONTH)+1)+"/"+
                    String.valueOf(now.get(Calendar.YEAR));
            locationInfo.setDATE(date);
            locationInfo.setLocation_Name(name.toUpperCase());
            i=handler.add(locationInfo);
            Toast.makeText(getApplicationContext()," "+i+" ",Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Method to toggle periodic location updates
     * */
    private void togglePeriodicLocationUpdates() {
        if (mRequestingLocationUpdates) {
            // Changing the button text
           power.setBackgroundResource(R.drawable.poweron);

            mRequestingLocationUpdates = false;

            // Starting the location updates
            startLocationUpdates();

        } else {
            // Changing the button text
            power.setBackgroundResource(R.drawable.poweroff);

            mRequestingLocationUpdates = true;

            // Stopping the location updates
            stopLocationUpdates();

        }
    }

    /**
     * Creating google api client object
     * */
    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API).build();
    }

    /**
     * Creating location request object
     * */
    protected void createLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(UPDATE_INTERVAL);
        mLocationRequest.setFastestInterval(FATEST_INTERVAL);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
    }

    /**
     * Method to verify google play services on the device
     * */
    private boolean checkPlayServices() {
        int resultCode = GooglePlayServicesUtil
                .isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                GooglePlayServicesUtil.getErrorDialog(resultCode, this,
                        PLAY_SERVICES_RESOLUTION_REQUEST).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "This device is not supported.", Toast.LENGTH_LONG)
                        .show();
                finish();
            }
            return false;
        }
        return true;
    }

    /**
     * Starting the location updates
     * */
    protected void startLocationUpdates() {
        try {
            LocationServices.FusedLocationApi.requestLocationUpdates(
                    mGoogleApiClient, mLocationRequest, this);
        }catch (SecurityException e)
        {e.printStackTrace();}
        send_notification("Location Update Started");
        locationInfo=new LocationInfo();
    }

    /**
     * Stopping location updates
     */
    protected void stopLocationUpdates() {
        LocationServices.FusedLocationApi.removeLocationUpdates(
                mGoogleApiClient, this);
        send_notification("Location Update Stopped");
    }

    /**
     * Google api callback methods
     */
    @Override
    public void onConnectionFailed(ConnectionResult result) {
    }

    @Override
    public void onConnected(Bundle arg0) {

        // Once connected with google api, get the location

        if (!mRequestingLocationUpdates) {
            startLocationUpdates();
        }
    }

    @Override
    public void onConnectionSuspended(int arg0) {
        mGoogleApiClient.connect();
    }

    @Override
    public void onLocationChanged(Location location) {
        // Assign the new location
        mLastLocation = location;
        Toast.makeText(getApplicationContext(), "Location changed!",
                Toast.LENGTH_SHORT).show();
        add_to_db("");
    }

}
