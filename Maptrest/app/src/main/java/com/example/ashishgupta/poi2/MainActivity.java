package com.example.ashishgupta.poi2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Button cameraButton, searchButton,historic,lesuire,Educational,General,viewall,info;
    private EditText edit;
    MyDBHandler handler;
    Intent camera,intent;
    AlertDialog.Builder builder;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=new TextView(this);
        builder= new AlertDialog.Builder(this);
        builder.setMessage(" Enter the Name :- ");
        builder.setCancelable(false);
        info=(Button)findViewById(R.id.info);
        camera = new Intent(this,Camera_activity.class);
        handler=new MyDBHandler(MainActivity.this);
        cameraButton=(Button)findViewById(R.id.Camera);
        edit=new EditText(this);
        searchButton=(Button)findViewById(R.id.Search);
        historic=(Button)findViewById(R.id.History);
        lesuire=(Button)findViewById(R.id.Lesuire);
        Educational=(Button)findViewById(R.id.Educational);
        General=(Button)findViewById(R.id.General);
        viewall=(Button)findViewById(R.id.viewall);

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(camera);
            }
        });
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"SEARCH",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder=cameraactivity();
                builder.show();
            }
        });


        historic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,List.class);
                intent.putExtra("CAT","History");
                intent.putExtra("Option",1);
                startActivity(intent);
            }
        });
        lesuire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,List.class);
                intent.putExtra("CAT","Lesuire");
                intent.putExtra("Option",1);
                startActivity(intent);
            }
        });
        General.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,List.class);
                intent.putExtra("CAT","General");
                intent.putExtra("Option",1);
                startActivity(intent);
            }

        });
        Educational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,List.class);
                intent.putExtra("CAT","Educational");
                intent.putExtra("Option",1);
                startActivity(intent);
            }
        });
        try {
            viewall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent intent = new Intent(MainActivity.this, List.class);
                        intent.putExtra("Option", 2);
                        startActivity(intent);
                    }catch (Exception e)
                    {Toast.makeText(getApplicationContext(),"Error starting",Toast.LENGTH_SHORT).show();}
                }
            });

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("INFO");
                    builder.setMessage("ABOUT APP :-");
                    textView.setText("This app lets a user mark and save the location of interests\n(This app requires active internet connection for location services)" +
                            "\n\n\n" +
                            "# Use camera button to take a snapshot of the place and save it according to the catagoery or create new custom catageory \n\n" +
                            "# Search By name - user can either display image or display location of the place \n\n" +
                            "# User can access custom catageory by viewall button\n\n" +
                            "# predifened catageories are listed as folows :-\n1.History \n2.Lesuire\n3.Education\n4.General\n\n" +
                            "# click on item in list for location and long click for image ");
                    textView.setTextColor(Color.BLUE);
                    AlertDialog alert=builder.create();
                    alert.setView(textView, 50, 0, 50, 50);
                    alert.setCancelable(false);
                    alert.setButton(DialogInterface.BUTTON_NEUTRAL, "Done", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ((ViewGroup) textView.getParent()).removeView(textView);
                            dialog.cancel();
                        }
                    });
                    alert.show();
                }
            });

        }
        catch (Exception e)
        {Toast.makeText(getApplicationContext(),"Error clicking",Toast.LENGTH_SHORT).show();}
    }

    public AlertDialog.Builder cameraactivity()
    {
        builder.setView(edit);
        builder.setPositiveButton("Map", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Cursor c = handler.databasetostring(edit.getText().toString());
                if(c.getCount()==0)
                {    alert("ERROR","NOTHING TO SHOW");
                    ((ViewGroup) edit.getParent()).removeView(edit);

                    return;
                }
                else {
                    c.moveToNext();
                    intent = new Intent(MainActivity.this, MapsActivity.class);
                    intent.putExtra("lat", c.getDouble(3));
                    intent.putExtra("long", c.getDouble(4));
                    intent.putExtra("Name",edit.getText().toString());
                    Toast.makeText(getApplicationContext(),c.getDouble(3)+" "+c.getDouble(4),Toast.LENGTH_SHORT).show();
                    ((ViewGroup) edit.getParent()).removeView(edit);
                    startActivity(intent);
                }

            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ((ViewGroup) edit.getParent()).removeView(edit);
                dialog.cancel();

            }
                }).setNeutralButton("Image", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(MainActivity.this,Display_Activity.class);
                intent.putExtra("Name",edit.getText().toString());
                ((ViewGroup) edit.getParent()).removeView(edit);
                startActivity(intent);
            }
        });

        return builder;
    }

    public void alert(String Title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(message);
        builder.show();
    }}


