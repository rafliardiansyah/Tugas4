package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val pindahTiga = findViewById<Button>(R.id.button2)
        pindahTiga.setOnClickListener{
            val Intent = Intent (this,MainActivity3::class.java)
            startActivity(Intent)
    }
        val pindahSatu = findViewById<TextView>(R.id.textView5)
        pindahSatu.setOnClickListener {
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)
        }
}}