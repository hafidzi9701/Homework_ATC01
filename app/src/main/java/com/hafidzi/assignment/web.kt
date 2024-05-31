package com.hafidzi.assignment

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hafidzi.assignment.databinding.ActivityWebBinding

class web : AppCompatActivity() {
    private lateinit var binding: ActivityWebBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cancelText.setOnClickListener {
            finish()
        }

        val myBrowser: WebView = binding.webviewView
        myBrowser.webViewClient = WebViewClient()
        myBrowser.loadUrl("https://www.androidatc.com")
        myBrowser.setBackgroundColor(Color.TRANSPARENT)
        myBrowser.settings.javaScriptEnabled = true
        myBrowser.settings.loadsImagesAutomatically = true
        myBrowser.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

    }
}