package com.webandapp.wadeducational.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.navigateUp
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.ui.classes.LiveClassesActivity
import com.webandapp.wadeducational.ui.extras.*
import com.webandapp.wadeducational.ui.myCourse.MyCourseActivity
import com.webandapp.wadeducational.ui.profile.ProfileActivity
import com.webandapp.wadeducational.ui.resume.ResumeActivity
import com.webandapp.wadeducational.ui.search.SearchActivity


class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {

    lateinit var navigationView: NavigationView
    lateinit var drawer: DrawerLayout
    lateinit var sliderr: ImageView
    lateinit var heading: TextView
    private var mAppBarConfiguration: AppBarConfiguration? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        drawer = findViewById(R.id.drawer_layout)
        setSupportActionBar(toolbar)
        heading = findViewById(R.id.tv_studentname)

        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        // Passing each menu ID as a set of Ids because each
        val header = (findViewById<View>(R.id.nav_view) as NavigationView).getHeaderView(0)
        navigationView.setNavigationItemSelectedListener(this)
        navigationView.itemIconTintList = null

        // menu should be considered as top level destinations.
        mAppBarConfiguration = AppBarConfiguration.Builder(
            R.id.nav_home
        )
            .setDrawerLayout(drawer)
            .build()
        val navController = findNavController(this, R.id.nav_host_fragment)
        setupActionBarWithNavController(this, navController, mAppBarConfiguration!!)
        setupWithNavController(navigationView, navController)

        findViewById<ImageView>(R.id.search).setOnClickListener {
            val i = Intent(this,SearchActivity::class.java)
            startActivity(i)
        }


        findViewById<LinearLayout>(R.id.ll_profile).setOnClickListener { transaction(ProfileActivity()) }
        findViewById<LinearLayout>(R.id.ll_home).setOnClickListener { drawer.closeDrawer(GravityCompat.START) }
        findViewById<LinearLayout>(R.id.ll_course).setOnClickListener { transaction(MyCourseActivity()) }
        findViewById<LinearLayout>(R.id.ll_resume).setOnClickListener { transaction(ResumeActivity()) }
        findViewById<LinearLayout>(R.id.ll_classes).setOnClickListener { transaction(LiveClassesActivity()) }
        findViewById<LinearLayout>(R.id.ll_about).setOnClickListener { transaction(AboutActivity()) }
        findViewById<LinearLayout>(R.id.ll_blog).setOnClickListener { transaction(BlogActivity()) }
        findViewById<LinearLayout>(R.id.ll_help).setOnClickListener { transaction(NeedHelpActivity()) }
        findViewById<LinearLayout>(R.id.ll_privacy).setOnClickListener { transaction(PrivacyPolicy()) }
        findViewById<LinearLayout>(R.id.ll_review).setOnClickListener { transaction(RateActivity()) }


    }

    fun transaction(activity: AppCompatActivity) {
        val i = Intent(this,activity::class.java)
        startActivity(i)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.home, menu)
        return super.onCreateOptionsMenu(menu)
    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.search -> startActivity(Intent(this,SearchActivity::class.java))
//        }
//        return true
//    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(this, R.id.nav_host_fragment)
        return (navigateUp(navController, mAppBarConfiguration!!)
                || super.onSupportNavigateUp())
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

}