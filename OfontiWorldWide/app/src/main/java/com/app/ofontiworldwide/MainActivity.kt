package com.app.ofontiworldwide
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
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
        setupWebView()

    }

    private fun setupWebView() {

        val webViewClient: WebViewClient = object: WebViewClient() {

            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(request?.url.toString())
                return super.shouldOverrideUrlLoading(view, request)
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                progressBar.visibility = View.VISIBLE
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                progressBar.visibility = View.GONE
                super.onPageFinished(view, url)
            }
        }
        webView.webViewClient = webViewClient
        webView.loadUrl("https://www.ofonti.com/")

        webView.settings.javaScriptEnabled = true
        webView.settings.defaultTextEncodingName = "utf-8"
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