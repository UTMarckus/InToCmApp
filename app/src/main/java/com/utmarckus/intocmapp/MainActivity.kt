package com.utmarckus.intocmapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val centimetersInInch = 2.54
    private lateinit var inputInches: EditText
    private lateinit var buttonConvert: Button
    private lateinit var outputCentimeters: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputInches = findViewById(R.id.enterTextInches)
        buttonConvert = findViewById(R.id.button_convert)
        outputCentimeters = findViewById(R.id.textViewCentimeters)

        buttonConvert.setOnClickListener {
            outputCentimeters.text = if (inputInches.text.isEmpty()) "Enter inches"
            else (inputInches.text.toString().toDouble() * centimetersInInch).toString()
        }
    }
}
