package com.app.ofontiworldwide
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import org.jsoup.Jsoup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val document = Jsoup.connect("https://www.ofonti.com").get()
        //document.getElementsByClass("site-footer").remove()
        //webView.loadData(document.toString(),"text/html","utf-8")
        //webView.loadDataWithBaseURL("https://www.ofonti.com",document.toString(),"text/html","utf-8","")

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.ofonti.com")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

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
