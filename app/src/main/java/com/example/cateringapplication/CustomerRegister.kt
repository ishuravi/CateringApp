package com.example.cateringapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CustomerRegister : AppCompatActivity() {
    lateinit var Cname:EditText
    lateinit var Cmail:EditText
    lateinit var Cpass:EditText
    lateinit var Cnumber:EditText
    lateinit var Caddress:EditText
    lateinit var Cregbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_register)
        Cname=findViewById(R.id.Cname)
        Cmail=findViewById(R.id.Cmail)
        Cpass=findViewById(R.id.CPass)
        Cnumber=findViewById(R.id.Cnumber)
        Caddress=findViewById(R.id.Caddress)
        Cregbtn=findViewById(R.id.Cregbtn)

       Cregbtn.setOnClickListener {
            val intent=Intent(this@CustomerRegister,CustomerActivity::class.java)
            startActivity(intent)
      }
    }
}