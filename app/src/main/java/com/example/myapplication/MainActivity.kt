package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pindahTiga = findViewById<Button>(R.id.button)
        pindahTiga.setOnClickListener{
            val Intent = Intent (this,MainActivity3::class.java)
            startActivity(Intent)

        }
        val pindahDua = findViewById<TextView>(R.id.textView)
        pindahDua.setOnClickListener {
            val Intent = Intent (this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}