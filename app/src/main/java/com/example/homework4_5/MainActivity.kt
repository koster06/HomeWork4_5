package com.example.homework4_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,MainActivity2::class.java)

        val btn: Button = findViewById(R.id.button3)

        btn.setOnClickListener {
            startActivity(intent)
            Log.d("testMsg", "Intent");
        }

    }
}