package com.testapp.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val greetMessage = findViewById<TextView>(R.id.greetMessage)
            val inputField = findViewById<EditText>(R.id.etName)
            val btnSubmit = findViewById<Button>(R.id.btnSubmit)
            val btnOffers = findViewById<Button>(R.id.btnOffers)
            var username = ""

            btnSubmit.setOnClickListener {
                username = inputField.text.toString()
                if(username == "")
                {
                    btnOffers.visibility = INVISIBLE
                    greetMessage.text=""
                   Toast.makeText(
                       this@MainActivity,
                       "Please, enter your name!",
                       Toast.LENGTH_SHORT).show()
                }
                else{
                    val message = "Welcome $username"
                    greetMessage.text = message
                    inputField.text.clear()
                    btnOffers.visibility = VISIBLE
                }

            }
        btnOffers.setOnClickListener{
            val intent = Intent(this,testactivity::class.java)
            intent.putExtra("USER", username)
            startActivity(intent)
        }
    }
}