package com.example.vibhor.webviewdemoapp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.web_view);

        webView = (WebView) findViewById(R.id.web_view_one);
        webView.getSettings().getJavaScriptEnabled();




        webView.clearCache(false);
        webView.getCertificate();
        webView.loadUrl("http://www.google.com");



    }
}
