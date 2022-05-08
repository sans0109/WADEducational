package com.webandapp.wadeducational.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.webandapp.wadeducational.R

class CourseDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_details)

        findViewById<ImageView>(R.id.backicon).setOnClickListener { finish() }
    }
}