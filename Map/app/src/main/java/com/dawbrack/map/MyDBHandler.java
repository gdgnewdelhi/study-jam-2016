package com.dawbrack.map;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDBHandler extends SQLiteOpenHelper
{

    //DATABASE INFORMATION

    private static final int DATABSE_VERSION = 2;
    private static final String DATABASE_NAME="Location.db";
    private static final String LOCATION_NAME="LOCATION_NAME ";
    private static final String TABLE_NAME="LOCATION";
    private static final String COLUMN_ID="ID";
    private static final String DATE="DATE";
    private static final String HOUR="HOUR";
    private static final String MIN="MINUTES";
    private static final String LAT="LATITUDE";
    private static final String LONG="LONGITUDE";

    private String Query;
    private Cursor c;

    public MyDBHandler(Context context) {
        super(context,DATABASE_NAME, null,DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Query=" CREATE TABLE "+TABLE_NAME+" ("+
                COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                DATE +" VARCHAR(10)," +
                HOUR+" INTEGER,"+
                MIN+" INTEGER,"+
                LAT+" DOUBLE," +
                LONG+" DOUBLE," +
                LOCATION_NAME +" VARCHAR(20));";
        db.execSQL(Query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    // add values into database

    public long add(LocationInfo product)
    {
        ContentValues value=new ContentValues();
        SQLiteDatabase db=getWritableDatabase();
        value.put(DATE,product.getDATE());
        value.put(HOUR,product.getHOUR_OF_THE_DAY());
        value.put(MIN,product.getMINUTE());
        value.put(LAT,product.getLatitude());
        value.put(LONG,product.getLongitude());
        value.put(LOCATION_NAME, product.getLocation_Name());
        long  i= db.insert(TABLE_NAME, null, value);

        db.close();
        return i;

    }
   // recieving location information

    public Cursor databasetostring(String date,int h1,int h2)
    {
        try {
            SQLiteDatabase db = getWritableDatabase();
            String Query = "SELECT * FROM " + TABLE_NAME + " WHERE DATE =" + "'" + date + "'"+" AND HOUR >=\'"+h1+"\' AND HOUR <\'"+h2+"\'"; ;
            c = db.rawQuery(Query, null);

        }catch (Exception e){e.printStackTrace();}

        finally {
            return c;
        }
    }

    public Cursor show()
    {
        try {
            SQLiteDatabase db = getWritableDatabase();
            String Query = "SELECT * FROM " + TABLE_NAME + " WHERE LOCATION_NAME != ''; ";
            c = db.rawQuery(Query, null);
        }catch (Exception e){e.printStackTrace();}

        finally {
            return c;
        }
    }

    // Retrieving all the distinct dates

    public Cursor alldates()
    {
        try {
            SQLiteDatabase db = getWritableDatabase();
            String Query = "SELECT DISTINCT DATE FROM " + TABLE_NAME +";";
            c = db.rawQuery(Query, null);
        }catch (Exception e){e.printStackTrace();}

        finally {
            return c;
        }
    }

    // Retrieving information on specific date

    public Cursor specific_date(String date)
    {
        try {
            SQLiteDatabase db = getWritableDatabase();
            String Query = "SELECT * FROM " + TABLE_NAME + " WHERE DATE =" + "'" + date + "';";
            c = db.rawQuery(Query, null);

        }catch (Exception e){e.printStackTrace();}

        finally {
            return c;
        }
    }

}
