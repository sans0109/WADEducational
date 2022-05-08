package com.webandapp.wadeducational.ui.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import androidx.core.view.MenuItemCompat
import com.webandapp.wadeducational.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<ImageView>(R.id.backicon).setOnClickListener { finish() }

        findViewById<Button>(R.id.btnEditProfile).setOnClickListener {
            startActivity(Intent(this,EditProfile::class.java))
        }

        findViewById<Button>(R.id.btnChngePswd).setOnClickListener {
            startActivity(Intent(this,ChangePasswordActivity::class.java))
        }
    }
}