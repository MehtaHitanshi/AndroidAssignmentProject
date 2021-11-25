package com.example.assignmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleCursorAdapter

class ViewAllActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all)
        var helper = MyHelper(applicationContext)
        var db = helper.readableDatabase
        var lv = findViewById<ListView>(R.id.listview)
        var rs = db.rawQuery("SELECT _id, GOD_NAME, AVTAR_NAME FROM AVTAR",null)
        var adapter = SimpleCursorAdapter(applicationContext,
            // android.R.layout.simple_expandable_list_item_2,
            R.layout.mylistlayout,
            rs,
            //arrayOf("NAME","UNAME"),
            arrayOf("GOD_NAME","AVTAR_NAME"),
            //intArrayOf(android.R.id.text1,android.R.id.text2),
            intArrayOf(R.id.textView3, R.id.textView4),
            0)
        lv.adapter = adapter
    }
}