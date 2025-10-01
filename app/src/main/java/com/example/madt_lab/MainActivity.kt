package com.example.madt_lab   // <-- change this if your package is different

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvMessage: TextView
    private lateinit var btnChangeText: Button
    private lateinit var btnChangeColor: Button
    private lateinit var btnChangeBackground: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        //Code for revert
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // connect views from XML
        tvMessage = findViewById(R.id.tvMessage)
        btnChangeText = findViewById(R.id.btnChangeText)
        btnChangeColor = findViewById(R.id.btnChangeColor)

        // Button 1: change the text
        btnChangeText.setOnClickListener {
            tvMessage.text = "Hello from MADT Lab 1"
        }

        // Button 2: change text color
        btnChangeColor.setOnClickListener {
            tvMessage.setTextColor(Color.RED)
        }
        btnChangeBackground = findViewById(R.id.btnChangeBackground)
        btnChangeBackground.setOnClickListener {
            val root = findViewById<android.view.View>(R.id.rootLayout)
            root.setBackgroundColor(android.graphics.Color.YELLOW)
        }
    }
}
