package com.example.firstactivity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnClickMe = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)
        var timesClided = 0;
        btnClickMe.setOnClickListener{
            timesClided++
            text.text = timesClided.toString()
        }
    }
}