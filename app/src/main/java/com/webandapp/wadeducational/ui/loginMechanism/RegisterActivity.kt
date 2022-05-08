package com.webandapp.wadeducational.ui.loginMechanism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import com.webandapp.wadeducational.R

class RegisterActivity : AppCompatActivity() {

    lateinit var register: Button
    lateinit var login : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        register = findViewById(R.id.register)
        login = findViewById(R.id.login_ll)
        register.setOnClickListener {
            val i = Intent(this, VerifyOTPActivity::class.java)
            startActivity(i)
            finish()
        }
        login.setOnClickListener { val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish() }
    }

}