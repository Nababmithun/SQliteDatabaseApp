package com.example.sqlitedatabaseapp.database;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class EmployeeDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "employee_db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_EMPLOYEE = "table_db";
    public static final String EMP_COL_ID = "id_db";
    public static final String EMP_COL_NAME = "name_db";
    public static final String EMP_COL_DESIGNATION = "designation_db";



    public static final String CREATE_EMP_TABLE = "CREATE TABLE "+TABLE_EMPLOYEE+"("+
            EMP_COL_ID+" INTEGER PRIMARY KEY, "+
            EMP_COL_NAME+" TEXT, "+
            EMP_COL_DESIGNATION+" TEXT);";



    public EmployeeDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_EMP_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}