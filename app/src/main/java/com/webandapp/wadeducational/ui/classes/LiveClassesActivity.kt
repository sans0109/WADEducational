package com.webandapp.wadeducational.ui.classes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.webandapp.wadeducational.R

class LiveClassesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_classes)

        findViewById<Button>(R.id.backicon).setOnClickListener { finish() }
    }
}