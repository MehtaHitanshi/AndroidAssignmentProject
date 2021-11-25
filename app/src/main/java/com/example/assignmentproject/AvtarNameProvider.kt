package com.example.assignmentproject

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.net.Uri

class AvtarNameProvider: ContentProvider() {

    companion object{
        val PROVIDER_NAME ="com.example.assignmentproject/AvtarNameProvider"
        val URL = "content://$PROVIDER_NAME/AVTAR"
        val CONTENT_URI =Uri.parse(URL)

        val _ID = "_id"
        val GOD_NAME = "GOD_NAME"
        val AVTAR_NAME = "AVTAR_NAME"

    }

    lateinit var db : SQLiteDatabase

    override fun onCreate(): Boolean {
        var helper = MyHelper(getContext()!!)
        db = helper.writableDatabase
        return if(db==null) false else true
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {

        return  db.query("AVTAR",p1,p2,p3,null,null,p4)

    }

    override fun getType(p0: Uri): String? {
        return "vnd.android.cursor.dir/vnd.example.AVTAR"
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        db.insert("AVTAR",null,p1)
        getContext()?.getContentResolver()?.notifyChange(p0,null)
        return p0
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        var count = db.delete("AVTAR",p1,p2)
        getContext()?.getContentResolver()?.notifyChange(p0,null)
        return count
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        var count = db.update("AVTAR",p1,p2,p3)
        getContext()?.getContentResolver()?.notifyChange(p0,null)
        return count

    }

}