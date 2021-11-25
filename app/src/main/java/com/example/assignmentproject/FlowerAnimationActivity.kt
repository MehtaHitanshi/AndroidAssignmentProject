package com.example.assignmentproject

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FlowerAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower_animation2)

        var ad = AnimationDrawable()
        var frame1 = resources.getDrawable(R.drawable.animation1,null)
        var frame2 = resources.getDrawable(R.drawable.animation2,null)
        var frame3 = resources.getDrawable(R.drawable.animation3,null)
        var frame4 = resources.getDrawable(R.drawable.animation4,null)
        var frame5 = resources.getDrawable(R.drawable.animation5,null)
        var frame6 = resources.getDrawable(R.drawable.animation6,null)
        var frame7 = resources.getDrawable(R.drawable.animation7,null)

        ad.addFrame(frame1,200)
        ad.addFrame(frame2,200)
        ad.addFrame(frame3,200)
        ad.addFrame(frame4,200)
        ad.addFrame(frame5,200)
        ad.addFrame(frame6,200)
        ad.addFrame(frame7,200)

        var iv = findViewById<ImageView>(R.id.imageView2)
        iv.background = ad
        ad.start()
    }
}