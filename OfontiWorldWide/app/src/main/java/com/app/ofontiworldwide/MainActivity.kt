package com.app.ofontiworldwide
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.ofonti.com")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled
    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }

        else{
            super.onBackPressed()
        }
    }
}
