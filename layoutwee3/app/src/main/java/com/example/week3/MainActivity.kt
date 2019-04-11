package com.example.week3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnbackground(view: View){
        val intent = Intent(this,Background::class.java);
        startActivity(intent);
    }
    fun btntitle(view: View){
        val intent = Intent(this,Title_screen::class.java);
        startActivity(intent);
    }
}
