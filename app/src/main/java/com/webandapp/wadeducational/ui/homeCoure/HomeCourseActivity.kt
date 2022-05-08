package com.webandapp.wadeducational.ui.homeCoure

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.fragment.assignment.AssignmentFragment
import com.webandapp.wadeducational.fragment.home.TestFragment
import com.webandapp.wadeducational.fragment.interview.InterviewFragment
import com.webandapp.wadeducational.fragment.video.VideoFragment

class HomeCourseActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_course)

        bottomNavigationView = findViewById(R.id.nav_view)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.navigation_assignment -> setCurrentFragment(AssignmentFragment())
                R.id.navigation_video -> setCurrentFragment(VideoFragment())
                R.id.navigation_test -> setCurrentFragment(TestFragment())
                R.id.navigation_interview -> setCurrentFragment(InterviewFragment())
            }
            true
        }


    }

    private fun setCurrentFragment(fragment: androidx.fragment.app.Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment)
            commit()
        }

}