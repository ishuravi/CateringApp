package com.example.cateringapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AdminActivity : AppCompatActivity() {
    lateinit var adUsername:EditText
    lateinit var adPass:EditText
    lateinit var adLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        adUsername=findViewById(R.id.adUsername)
        adPass=findViewById(R.id.adPass)
        adLogin=findViewById(R.id.adLogin)

        adLogin.setOnClickListener {
            validation()
        }

    }

    fun validation(){
        var username =adUsername.text.toString()
        var password =adPass.text.toString()

        if (username.isEmpty()){
            adUsername.requestFocus()
            adUsername.error="Enter User Name"
        }else if (password.isEmpty()){
            adPass.requestFocus()
            adPass.error="Enter the Password"
        }else{
            if (username=="admin" && password == "ishu"){
                Toast.makeText(this@AdminActivity,"Logged in Successfully",Toast.LENGTH_LONG).show()
                val intent=Intent(this@AdminActivity,MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this@AdminActivity,"Invalid Username or Password",Toast.LENGTH_LONG).show()

            }
        }




    }
}