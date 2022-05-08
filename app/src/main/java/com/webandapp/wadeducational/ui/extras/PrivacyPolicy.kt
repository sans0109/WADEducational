package com.webandapp.wadeducational.ui.extras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.webandapp.wadeducational.R

class PrivacyPolicy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy)

        findViewById<ImageView>(R.id.backicon).setOnClickListener { finish() }
    }
}