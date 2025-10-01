package com.example.madt_lab

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvMessage: TextView
    private lateinit var btnChangeText: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvMessage = findViewById(R.id.tvMessage)
        btnChangeText = findViewById(R.id.btnChangeText)

        btnChangeText.setOnClickListener {
            tvMessage.text = "Hello from MADT Lab 1"
        }
    }
}
