package com.webandapp.wadeducational.ui.profile

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.webandapp.wadeducational.R

class ChangePasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        findViewById<Button>(R.id.btnupdate).setOnClickListener {
            val dialog2 =
                Dialog(this, R.style.dialogstyle) // Context, this, etc.

            dialog2.setContentView(R.layout.dialogcorrectpaswd)
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