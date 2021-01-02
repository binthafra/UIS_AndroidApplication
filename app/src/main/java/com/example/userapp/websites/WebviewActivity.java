package com.example.userapp.websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.userapp.R;

public class WebviewActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webview=findViewById(R.id.webview);
        String url = getIntent().getStringExtra("url");
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(url);

       /* String url = getIntent().getStringExtra("url");
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(url);*/
    }
}