package com.webandapp.wadeducational.ui.loginMechanism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.webandapp.wadeducational.R

class MainScreenActivity : AppCompatActivity() {

    lateinit var login : Button
    lateinit var register : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        login = findViewById(R.id.btnLogin)
        register = findViewById(R.id.btnRegister)

        login.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        register.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }
    }
}