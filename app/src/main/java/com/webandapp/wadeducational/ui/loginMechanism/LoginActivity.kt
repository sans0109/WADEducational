package com.webandapp.wadeducational.ui.loginMechanism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.ui.MainActivity

class LoginActivity : AppCompatActivity() {

    lateinit var register : RelativeLayout
    lateinit var login : Button
    lateinit var forget :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        register = findViewById(R.id.register_ll)
        login = findViewById(R.id.login)
        forget = findViewById(R.id.forgetTv)

        login.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
//            finish()
        }
        register.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
//            finish()
        }

        forget.setOnClickListener {
            val i = Intent(this, ConfirmActivity::class.java)
            startActivity(i)
//            finish()
        }
    }
}