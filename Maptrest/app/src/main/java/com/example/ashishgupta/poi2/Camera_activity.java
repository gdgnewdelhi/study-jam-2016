package com.example.ashishgupta.poi2;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.FileOutputStream;


public class Camera_activity extends Activity implements LocationListener {

    private static int REQUEST_CAPTURE_IMAGE = 1;
    Boolean flag;
    String Catageory;
    Button  save;
    ImageView CameraImage;
    EditText edit,edit2;
    String temp;
    Bitmap photo;
    MyDBHandler handler;
    Double lat, lng;
    LocationManager manager;
    AlertDialog.Builder builder,builder2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_activity);
        flag=false;
       builder = new AlertDialog.Builder(this);
        builder2=new AlertDialog.Builder(this);
        CameraImage = (ImageView) findViewById(R.id.imageView);
        edit=new EditText(this);
        edit2=new EditText(this);
        save = (Button) findViewById(R.id.save);

        handler = new MyDBHandler(Camera_activity.this);
        if (!hasCamera())
        {
            Toast.makeText(getApplicationContext(),"Error : No Camera Found ",Toast.LENGTH_LONG).show();
            save.setEnabled(false);
        }

       manager=(LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
       try
       {
           manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,this);
       }catch (SecurityException e)
       { Toast.makeText(getApplicationContext(),"onCreateError",Toast.LENGTH_LONG).show();}

        LaunchCamera();
    }

    public void onClick(View view)
    {  flag=true;
       Catageory= String.valueOf(((RadioButton) view).getText());
        Toast.makeText(getApplicationContext(),Catageory,Toast.LENGTH_LONG).show();
    }



    public boolean hasCamera()
    {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }


    public void LaunchCamera()
    {
        Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(i, REQUEST_CAPTURE_IMAGE);
    }

    public void savephoto(View view)
    {


        builder.setMessage(" Enter the Name :- ");
        builder.setCancelable(false);
        builder.setView(edit);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if(flag == true) {
                    place_info ob1 = new place_info();
                    temp = edit.getText().toString();
                    ob1.setName(temp);
                    ob1.setCatageory(Catageory);
                    ob1.setLatitude(lat);
                    ob1.setLongitude(lng);
                    long i = handler.add_to_db(ob1);
                    Toast.makeText(getApplicationContext(), temp + " : " + i, Toast.LENGTH_LONG).show();
                    ((ViewGroup) edit.getParent()).removeView(edit);
                    saveImage(getApplicationContext(), temp, "jpeg");
                }else
                {
                    Toast.makeText(getApplicationContext(),"Select a Catageory first",Toast.LENGTH_SHORT).show();
                    ((ViewGroup) edit.getParent()).removeView(edit);

                }
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((ViewGroup) edit.getParent()).removeView(edit);
                        dialog.cancel();
                    }
                }).setNeutralButton("CAT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                builder2.setTitle("Enter Catageory");
                builder2.setView(edit2);
                builder2.setPositiveButton("SAVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        place_info ob1 = new place_info();

                        ob1.setName(edit.getText().toString());
                        ob1.setCatageory(edit2.getText().toString());
                        ob1.setLatitude(lat);
                        ob1.setLongitude(lng);
                        long i = handler.add_to_db(ob1);
                        Toast.makeText(getApplicationContext(), edit.getText().toString() + ": " + i, Toast.LENGTH_LONG).show();
                        ((ViewGroup) edit2.getParent()).removeView(edit2);

                        saveImage(getApplicationContext(), edit.getText().toString(), "jpeg");
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                ((ViewGroup) edit.getParent()).removeView(edit);
                builder2.show();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();



    }

    public void saveImage(Context context, String name,String extension){
        name=name+"."+extension;
        FileOutputStream out;
        try {
            out = context.openFileOutput(name, Context.MODE_PRIVATE);
            photo.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.close();
            Toast.makeText(getApplicationContext(),"pic saved",Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode==REQUEST_CAPTURE_IMAGE && resultCode==RESULT_OK)
        {
            Bundle extra = data.getExtras();
            photo = (Bitmap) extra.get("data");
            CameraImage.setImageBitmap(photo);
        }
    }


        @Override
        public void onLocationChanged(Location location) {
            if(location!=null)
            {
                lat=location.getLatitude();
                lng=location.getLongitude();
            }


        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }
