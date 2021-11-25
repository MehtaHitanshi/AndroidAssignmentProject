package com.example.assignmentproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JyotirlingsAdapter : RecyclerView.Adapter<JyotirlingsAdapter.MyHolder> (){

    var shiva_name = arrayOf("Somnath\nJyotirlinga","Mallikarjuna\nJyotirlinga","Mahakaleshwar\nJyotirlinga","Omkareshwar\nJyotirlinga","Vaidyanath\nJyotirlinga","Bhimashankar\nJyotirlinga","Rameshwaram\nJyotirlinga","Nageshwar\nJyotirlinga","Vishwanath\nJyotirlinga","Trimbakeshwar\nJyotirlinga","Kedarnath\nJyotirlinga","Grishneshwar\nJyotirlinga")
    var city_name = arrayOf("Gujarat","Andhra Pradesh","Madhya Pradesh","Madhya Pradesh","Jharkhand","Maharashtra","Tamil Nadu","Gujarat","Varanasi","Nasik","Uttarakhand","Aurangabad")
    var shiva_image = arrayOf(R.drawable.somnath_image,R.drawable.mallikarjuna_image,R.drawable.mahakaleshwar_image,R.drawable.omkareshwar_image,R.drawable.vaidyanath_image,R.drawable.bhimashankar_image,R.drawable.rameshwaram_image,R.drawable.nageshwar_image,R.drawable.vishwanath_image,R.drawable.trimbakeshwar_image,R.drawable.kedarnath_image,R.drawable.grishneshwar_image)
    var temple_image = arrayOf(R.drawable.somnath_temple,R.drawable.mallikarjuna_temple,R.drawable.mahakaleshwar_temple,R.drawable.omkareshwar_temple,R.drawable.vaidhyanath_temple,R.drawable.bhimashankar_temple,R.drawable.rameshwaram_temple,R.drawable.nageshwar_temple,R.drawable.vishwanath_temple,R.drawable.trimbakeshwar_temple,R.drawable.kedarnath_temple,R.drawable.ghrishneshwar_temple)

    inner class MyHolder(view: View): RecyclerView.ViewHolder(view){
        var shiva: TextView
        var city: TextView
        var simage: ImageView
        var timage : ImageView

        init {
            shiva = view.findViewById(R.id.textView)
            city = view.findViewById(R.id.textView2)
            simage = view.findViewById(R.id.imageView)
            timage = view.findViewById(R.id.imageView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.shiva.text = shiva_name[position]
        holder.city.text = city_name[position]
        holder.simage.setImageResource(shiva_image[position])
        holder.timage.setImageResource(temple_image[position])
    }

    override fun getItemCount(): Int {
        return shiva_name.size
    }


}