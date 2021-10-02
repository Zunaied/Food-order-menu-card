package com.example.foodorder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHELPER extends SQLiteOpenHelper {
    final static String DBname="mydatabase.db";
    final static int DBversion=1;
    public DBHELPER(@Nullable Context context) {
        super(context, DBname, null, DBversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        SQLiteDatabase.exec

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
