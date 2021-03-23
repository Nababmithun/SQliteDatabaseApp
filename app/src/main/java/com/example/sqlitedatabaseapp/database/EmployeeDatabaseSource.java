package com.example.sqlitedatabaseapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.sqlitedatabaseapp.Model.Employee;

public class EmployeeDatabaseSource {

    private EmployeeDatabase helper;
    private SQLiteDatabase db;


    public EmployeeDatabaseSource(Context context) {
        helper = new EmployeeDatabase(context);
    }


    public void openDatabase(){
        db = helper.getWritableDatabase();
    }
    public void closeDatabase(){
        db.close();
    }

    public boolean insertEmployee(Employee employee){
        this.openDatabase();
        ContentValues values = new ContentValues();

        values.put(helper.EMP_COL_NAME,employee.getEmployeeName());
        values.put(helper.EMP_COL_DESIGNATION,employee.getEmployeeDesignation());

        long employeeData = db.insert(helper.TABLE_EMPLOYEE,null,values);

        if (employeeData >0){
            return true;
        }else {
            return false;
        }
    }
}