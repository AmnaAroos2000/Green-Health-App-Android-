package com.amna.greenhealth;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

public class DatabaseHelper extends SQLiteOpenHelper {

    //Declaring Elements
    public static final String DATABASE_NAME = "Customers.db";
    public static final String TABLE_NAME = "customers_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "ADDRESS";
    public static final String COL_4 = "FOOD_NAME";
    public static final String COL_5 = "FOOD_COUNT";

    public static final String TABLE = "RegisterTable";
    public static final String Table_Column_ID = "id";
    public static final String Table_Column_1_Name = "name";
    public static final String Table_Column_2_Email = "email";
    public static final String Table_Column_3_Password = "password";
    public static final String Table_Column_4_C_Password = "cpassword";


    //Database creation
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    //Tables creation
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"NAME TEXT,ADDRESS TEXT, FOOD_NAME TEXT, FOOD_COUNT INTEGER )");

        String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE+" ("+Table_Column_ID+" INTEGER PRIMARY KEY, "+Table_Column_1_Name+" VARCHAR, "+Table_Column_2_Email+" VARCHAR, "+Table_Column_3_Password+" VARCHAR, "+Table_Column_4_C_Password+" VARCHAR)";
        db.execSQL(CREATE_TABLE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS "+TABLE);
        onCreate(db);

    }

    //insertion of data
    public boolean insertData(String name, String address, String foodName, String foodCount){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, address);
        contentValues.put(COL_4, foodName);
        contentValues.put(COL_5, foodCount);
        long results = db.insert(TABLE_NAME, null, contentValues);
        if (results == -1)
            return false;
        else
            return true;
    }

    //retrieving data
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("select * from " + TABLE_NAME, null);
        return results;
    }

    //update the datas
    public boolean updateData(String id, String name, String address, String foodName, String foodCount){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, address);
        contentValues.put(COL_4, foodName);
        contentValues.put(COL_5, foodCount);
        db.update(TABLE_NAME, contentValues, "id = ?", new String[] {id});
        return true;
    }

    //delete datas
    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
    }
}
