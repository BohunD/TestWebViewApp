package com.example.testwebviewapp

import android.content.Context
import android.content.Intent
import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.testwebviewapp.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        launchWebView()
    }

    private fun launchWebView(){
        val webView = binding.webView
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://pin-up.ua")
        webView.settings.javaScriptEnabled = true

        webView.settings.setSupportZoom(true)
        webView.visibility = View.VISIBLE
        webView.settings.loadsImagesAutomatically = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.domStorageEnabled = true;

    }
    override fun onBackPressed() {
        val webView = binding.webView
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

    fun reloadWebView(view: View) {
        binding.webView.reload()
    }

    companion object{
        fun newIntent(context: Context) =
            Intent(context, WebViewActivity::class.java)
    }
}