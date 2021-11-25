package com.example.assignmentproject

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyHelper(context: Context?) : SQLiteOpenHelper(context,"AvtarDb",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE AVTAR(_id INTEGER PRIMARY KEY AUTOINCREMENT, GOD_NAME TEXT, AVTAR_NAME TEXT)")
        p0?.execSQL("INSERT INTO AVTAR(GOD_NAME,AVTAR_NAME) VALUES('VISHNU','KRISHNA')")
        p0?.execSQL("INSERT INTO AVTAR(GOD_NAME,AVTAR_NAME) VALUES('SHIVA','HANUMAN')")
        p0?.execSQL("INSERT INTO AVTAR(GOD_NAME,AVTAR_NAME) VALUES('BRAHMA','DATTATREYA')")
        p0?.execSQL("INSERT INTO AVTAR(GOD_NAME,AVTAR_NAME) VALUES('VISHNU','RAMA')")
        p0?.execSQL("INSERT INTO AVTAR(GOD_NAME,AVTAR_NAME) VALUES('SHIVA','Veerabhadra')")
        p0?.execSQL("INSERT INTO AVTAR(GOD_NAME,AVTAR_NAME) VALUES('BRAHMA','VALMIKI')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}