package com.webandapp.wadeducational.ui.extras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import com.webandapp.wadeducational.R

class BlogActivity : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        findViewById<ImageView>(R.id.backicon).setOnClickListener { finish() }

        webView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.easydigiacademy.com/blog.php")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }
}