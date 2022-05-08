package com.webandapp.wadeducational.ui.loginMechanism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.ui.MainActivity

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        findViewById<Button>(R.id.next).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}