package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasein  extends SQLiteOpenHelper {

    static String name="dbs";
    static int version=3;
    public databasein(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE JUWI(name text,password text,place text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS JUWI");
        onCreate(db);
    }

    public void InsertValues(String s1, String s2, String s3) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("Name",s1);
        values.put("Password",s2);
        values.put("Place",s3);

        db.insert("JUWI",null,values);
    }

    public Cursor getAllData() {
        SQLiteDatabase vb=this.getWritableDatabase();
        Cursor res=vb.rawQuery("SELECT * FROM JUWII",null);
        return res;
    }
}
