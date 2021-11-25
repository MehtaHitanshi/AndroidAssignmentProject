package com.example.recyclerviewandcardviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter():RecyclerView.Adapter<MyAdapter.MyHolder>() {

    var vimage_data = arrayOf(R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ics,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marsh,R.drawable.nougat,R.drawable.oreo,R.drawable.pie)
    var vname_data = arrayOf("CupCake","Donut","Eclair","Froyo","GingerBread","HoneyComb","Ics","JellyBean","KitKat","Lollipop","MarshMellow","Nougat","Oreo","Pie")
    var vno_data = arrayOf("1.5","1.6","2.0-2.0.1-2.1","2.2 – 2.2.3","2.3 – 2.3.2-2.3.3 - 2.3.7","3.0-3.1-3.2 - 3.2.6","4.0 – 4.0.2-4.0.3 - 4.0.4","4.1 – 4.1.2-4.2 - 4.2.2-4.3 - 4.3.1","4.4 – 4.4.4-4.4W - 4.4W.2","5.0 – 5.0.2-5.1 - 5.1.1","6.0 – 6.0.1","7.0-7.1 - 7.1.2","8.0-8.1","9")

    lateinit var context : Context
    constructor(context:Context) : this() {
        this.context = context
    }

    inner class MyHolder(view:View):RecyclerView.ViewHolder(view){
        var vimage : ImageView
        var vname : TextView
        var vno : TextView

        init {
            vimage = view.findViewById(R.id.imageview)
            vno = view.findViewById(R.id.textview)
            vname = view.findViewById(R.id.textview2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.vno.text = vno_data[position]
        holder.vname.text = vname_data[position]
        holder.vimage.setImageResource(vimage_data[position])

        holder.vname.setOnClickListener {
            Toast.makeText(context,vname_data[position],Toast.LENGTH_LONG).show()
        }

        holder.vno.setOnClickListener {
            Toast.makeText(context,vno_data[position],Toast.LENGTH_LONG).show()
        }

        holder.vimage.setOnClickListener {
            var data=""
            when(position)
            {
                0 -> {data = "CupCake"}
                1 -> {data = "Donut"}
                2 -> {data = "Eclair"}
                3 -> {data = "Froyo"}
                4 -> {data = "GingerBread"}
                5 -> {data = "HoneyComb"}
                6 -> {data = "Ics"}
                7 -> {data = "JellyBean"}
                8 -> {data = "KitKat"}
                9 -> {data = "Lollipop"}
                10 -> {data = "MarshMellow"}
                11 -> {data = "Nougat"}
                12 -> {data = "Oreo"}
                13 -> {data = "Pie"}

            }
            Toast.makeText(context,data,Toast.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
        return vno_data.size
    }
}