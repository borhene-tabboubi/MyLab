package com.dsi32g12.ReserviliApp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLITE extends SQLiteOpenHelper {
//variables
    private String creation="create table reservation("
        +"id_reservation INTEGER PRIMARY KEY,"
        +"equipe1 TEXT NOT NULL,"
        +"equipe2 TEXT NOT NULL,"
        +"stade TEXT NOT NULL,"
        +"datematch TEXT NOT NULL,"
        +"ncin INTEGER NOT NULL,"
        +"prix INTEGER NOT NULL);";
    /**
     * constructeur
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public MySQLITE(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
//si changement de base de donnee
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(creation);
    }

//si changement de version
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
