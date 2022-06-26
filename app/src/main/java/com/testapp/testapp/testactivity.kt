package com.testapp.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class testactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testactivity)

        val userName = intent.getStringExtra("USER")
        val msg = findViewById<TextView>(R.id.offer)
        val message = "$userName, you will get free access to all the content for one month"
        msg.text = message
    }
}