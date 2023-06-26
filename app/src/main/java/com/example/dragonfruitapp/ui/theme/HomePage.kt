package com.example.dragonfruitapp.ui.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dragonfruitapp.R
import android.content.Intent
import androidx.appcompat.widget.AppCompatImageView
import com.example.dragonfruitapp.LoginActivity


class HomePage : AppCompatActivity() {

    private lateinit var btnProf: AppCompatImageView
    private lateinit var btnimage: AppCompatImageView
    private lateinit var btnback: AppCompatImageView
    private lateinit var btnset: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btnProf = findViewById(R.id.btnprofile)
        btnback = findViewById(R.id.btnreturn)
        btnimage = findViewById(R.id.btnfileupload)
        btnset = findViewById(R.id.btnsettings)

        btnProf.setOnClickListener{
            val toProf = Intent(this@HomePage, ProfileActivity::class.java)
            startActivity(toProf)
        }
        btnimage.setOnClickListener{
            val toImg = Intent(this@HomePage, PhotoActivity::class.java)
            startActivity(toImg)
        }
        btnback.setOnClickListener{
            val tologin = Intent(this@HomePage, LoginActivity::class.java)
            startActivity(tologin)
        }
        btnset.setOnClickListener{
            val toset = Intent(this@HomePage, SettingActivity::class.java)
            startActivity(toset)
        }
    }
}