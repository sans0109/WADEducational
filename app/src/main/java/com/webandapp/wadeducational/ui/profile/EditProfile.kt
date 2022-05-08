package com.webandapp.wadeducational.ui.profile

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.webandapp.wadeducational.R

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        findViewById<ImageView>(R.id.backicon).setOnClickListener { finish() }

        findViewById<Button>(R.id.btnUpdateprofile).setOnClickListener {
            val dialog2 =
                Dialog(this, R.style.dialogstyle) // Context, this, etc.

            dialog2.setContentView(R.layout.dialogprofilesaved)
            val yesbutton = dialog2.findViewById<Button>(R.id.yesbutton)
            dialog2.show()
            dialog2.setCanceledOnTouchOutside(false)
            yesbutton.setOnClickListener {
                dialog2.hide()
                finish()
            }
        }
    }
}