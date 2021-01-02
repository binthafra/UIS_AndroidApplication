package com.example.userapp.websites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.userapp.R;

public class PanelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panels);
    }

    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);

        switch(view.getId())
        {
            case R.id.uniWebsite:
                intent.putExtra("url", "https://www.iiuc.ac.bd/");
                startActivity(intent);
                break;

            case R.id.oldPanel:
                intent.putExtra("url", "http://upanel.iiuc.ac.bd:81/Status.php");
                startActivity(intent);
                break;
            case R.id.newPanel:
                intent.putExtra("url", "https://www.iiuc.ac.bd/login");
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}