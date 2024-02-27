package com.example.cateringapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SelectOptionActivity : AppCompatActivity() {

    lateinit var adminLogo : ImageView
    lateinit var customerLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option)
        adminLogo=findViewById(R.id.adminLogo)
        customerLogo=findViewById(R.id.customerLogo)

        adminLogo.setOnClickListener{
            val intent =Intent(this@SelectOptionActivity,AdminActivity::class.java)
            startActivity(intent)
        }

        customerLogo.setOnClickListener {
            val intent =Intent(this@SelectOptionActivity,CustomerActivity::class.java)
            startActivity(intent)
        }

    }
}