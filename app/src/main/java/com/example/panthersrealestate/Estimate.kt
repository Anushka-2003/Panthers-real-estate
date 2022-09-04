package com.example.panthersrealestate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.widget.Toast

class Estimate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estimate)

        val estimate = findViewById<Button>(R.id.button2)

        estimate.setOnClickListener{
            val sqfeet = findViewById<EditText>(R.id.editTextNumber)
            val sqfeetText = sqfeet.editableText.toString().toInt()

            if(sqfeetText < 1000){
                Toast.makeText(this, "Square feet should be greater than 1000", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, Result::class.java)

                startActivity(intent)
            }
        }
    }




}