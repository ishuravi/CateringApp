package com.example.cateringapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CustomerActivity : AppCompatActivity() {
    lateinit var CUsername:EditText
    lateinit var CPass:EditText
    lateinit var CLogin:Button
    lateinit var Cregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)
        CUsername=findViewById(R.id.CUsername)
        CPass=findViewById(R.id.CPass)
        CLogin=findViewById(R.id.CLogin)
        Cregister=findViewById(R.id.Cregister)

        Cregister.setOnClickListener {
            val intent=Intent(this@CustomerActivity,CustomerRegister::class.java)
            startActivity(intent)
        }
    }
}