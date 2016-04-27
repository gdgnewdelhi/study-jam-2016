package com.example.ashishgupta.poi2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDBHandler extends SQLiteOpenHelper
{   public String TAG="HANDLER MESSAGE ";
    private static final int DATABSE_VERSION = 1;
    private static final String DATABASE_NAME="poi.db";
    private static final String TABLE_NAME="LAOCATION";
    private static final String COLUMN_ID="ID";
    private static final String CATAGEORY="CATAGEORY";
    private static final String NAME="NAME";
    private static final String LAT="LATITUDE";
    private static final String LONG="LONGITUDE";



    public MyDBHandler(Context context) {
        super(context,DATABASE_NAME, null,DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + CATAGEORY + " VARCHAR(20),"
                + NAME + " VARCHAR(20) ,"
                + LAT + " DOUBLE ,"
                + LONG + " DOUBLE);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public long add_to_db(place_info product)
    {
        ContentValues value=new ContentValues();
        SQLiteDatabase db=getWritableDatabase();
        value.put(CATAGEORY,product.getCatageory());
        value.put(NAME,product.getName());
        value.put(LAT,product.getLatitude());
        value.put(LONG, product.getLongitude());
        long  i= db.insert(TABLE_NAME, null, value);

        db.close();
        return i;

    }

    public Cursor databasetostring(String name)
    {


        SQLiteDatabase db=getWritableDatabase();
        String Query="SELECT * FROM "+TABLE_NAME + " WHERE NAME =" + "\'"+name+"\'";
        Cursor c = db.rawQuery(Query, null);
        return c;
    }
    public Cursor databasetostring2(String catageory)
    {


        SQLiteDatabase db=getWritableDatabase();
        String Query="SELECT * FROM "+TABLE_NAME +" WHERE CATAGEORY = \'"+catageory+"\'";
        Cursor c = db.rawQuery(Query,null);
        return c;
    }
    public Cursor all()
    {

        SQLiteDatabase db=getWritableDatabase();
        String Query="SELECT DISTINCT CATAGEORY FROM "+TABLE_NAME ;
        Cursor c = db.rawQuery(Query,null);
        return c;
    }
}
