package com.example.dragonfruitapp.ui.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dragonfruitapp.R
import android.content.Intent
import androidx.appcompat.widget.AppCompatImageView

class PhotoActivity : AppCompatActivity() {

    private lateinit var prvs : AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        prvs = findViewById(R.id.returnbtnphoto)

        prvs.setOnClickListener{
            val bckagain = Intent(this@PhotoActivity, HomePage::class.java)
            startActivity(bckagain)
        }

    }
}