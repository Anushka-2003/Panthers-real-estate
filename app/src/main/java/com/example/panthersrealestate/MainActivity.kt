package com.example.panthersrealestate

import android.content.Intent
import android.media.effect.Effect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginUser = findViewById<Button>(R.id.login)
        val register = findViewById<Button>(R.id.register)

        loginUser.setOnClickListener {
            val em = findViewById<EditText>(R.id.editTextTextEmailAddress)
            val email = em.editableText.toString()


            val pw = findViewById<EditText>(R.id.editTextTextPassword)
            val pass = em.editableText.toString()

            if (email == "" || pass == "") {
                Toast.makeText(this, "Please fill the credentials ", Toast.LENGTH_SHORT).show()

            }else if(!EMAIL_ADDRESS_PATTERN.matcher(email).matches()){
                Toast.makeText(this, "Email is invalid ", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Estimate::class.java)
//                intent.putExtra("email", nameText)
                startActivity(intent)
            }
        }

        register.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

    }

    val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
}

