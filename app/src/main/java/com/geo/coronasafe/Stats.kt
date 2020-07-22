package com.geo.coronasafe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_stats.*

class Stats : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        val webView: WebView = findViewById(R.id.stats)
        toolbar.setTitle("Stats")
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.webViewClient = WebViewClient()
        webView.getSettings().setDomStorageEnabled(true)
        webView.loadUrl("https://www.covid19india.org/")

    }
}
