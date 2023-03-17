package com.example.firstactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    var btnClickMe = findViewById<Button>(R.id.button)
        var text = findViewById<TextView>(R.id.text_id)
    }
}