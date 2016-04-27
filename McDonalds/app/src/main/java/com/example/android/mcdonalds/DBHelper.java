package com.example.android.mcdonalds;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "UserInfo.db";
    public static final String User_TABLE_NAME = "user";
    public static final String User_COLUMN_NAME = "name";
    public static final String User_COLUMN_Contact = "Contact";
    public static final String User_COLUMN_id = "login_id";
    public static final String User_COLUMN_password = "password";



    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table User " +
                        "( name text,contact text,login_id text, password text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS User");
        onCreate(db);
    }
    public boolean insertUser  (String name, String contact, String login_id, String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("contact", contact);
        contentValues.put("login_id", login_id);
        contentValues.put("password", password);

        db.insert("contacts", null, contentValues);
        return true;
    }


    public Cursor getData(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from User ",null );
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, User_TABLE_NAME);
        return numRows;
    }

    public boolean updateContact (Integer id, String name, String Contact, String login_id, String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("Contact", Contact);
        contentValues.put("login_id", login_id);
        contentValues.put("password", password);
        db.update("User", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }


    public ArrayList <String> getAllUsers()
    {


        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts", null );
        res.moveToFirst();

        while(!res.isAfterLast()){
            array_list.add(res.getString(res.getColumnIndex(User_COLUMN_id+User_COLUMN_password)));
            res.moveToNext();
        }

        return array_list;
    }
}


