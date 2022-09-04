package com.example.panthersrealestate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Pattern

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerUser = findViewById<Button>(R.id.button)

        registerUser.setOnClickListener {
            // your code to perform when the user clicks on the button
//            Toast.makeText(this, "You clicked me!",Toast.LENGTH_LONG).show()

//            Toast.makeText(this, "Name is $nameText", Toast.LENGTH_LONG).show()

            val name = findViewById<EditText>(R.id.editTextTextPersonName)
            val nameText = name.editableText.toString()

            val  email = findViewById<EditText>(R.id.editTextTextEmailAddress3)
            val emailText = email.editableText.toString()

            val password = findViewById<EditText>(R.id.editTextTextPassword2)
            val passwordText = password.editableText.toString()

            val confirmpassword = findViewById<EditText>(R.id.editTextTextPassword3)
            val confirmpasswordText = confirmpassword.editableText.toString()

            if(passwordText != confirmpasswordText){
                Toast.makeText(this, "Your password did not match",Toast.LENGTH_LONG).show()
            }
             else{
                // to go to another activity --> use Intent()
                val intent = Intent(this, Estimate::class.java)
//                intent.putExtra("email", nameText)
                startActivity(intent)
            }

        }



    }
//    val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
//        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
//                "\\@" +
//                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
//                "(" +
//                "\\." +
//                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
//                ")+"
//    )
}