package com.app.ofontiworldwide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_men.*

class MenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men)
        shopMen.webViewClient = WebViewClient()
        shopMen.loadUrl("https://www.ofonti.com/product-category/men/")

        val webSettings = shopMen.settings
        webSettings.javaScriptEnabled
    }

    override fun onBackPressed() {
        if (shopMen.canGoBack()){
            shopMen.goBack()
        }

        else{
            super.onBackPressed()
        }
    }
}
