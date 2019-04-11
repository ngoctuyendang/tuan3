package com.example.week3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_background.*

class Background : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)
    }
    fun btnsave(view: View){
        val intent = Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
    fun img1(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.apple)
        )
    }
    fun img2(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.cry)
        )
    }
    fun img3(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.heart)
        )
    }
    fun img4(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.feet)
        )
    }
    fun img5(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.glad)
        )
    }
    fun img6(view:View ){
        img0.setImageDrawable(
            ContextCompat.getDrawable(applicationContext,R.drawable.myhouse)
        )
    }
}
