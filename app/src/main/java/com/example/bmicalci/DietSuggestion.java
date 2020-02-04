package com.example.bmicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class DietSuggestion extends AppCompatActivity {
    static  int a;
    static String b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_suggestion);
        TextView textView=findViewById(R.id.textView4);
        WebView webView=findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        Intent intent=getIntent();
        a= intent.getIntExtra("status",0);
       if(a==1){
            textView.setText("opps! under weight check out the Diet suggestion tips!!! below");

            webView.loadUrl("file:///android_asset/uw.html");
        }else if (a==3||a==4){
            textView.setText("overWeight follow the diet suggestion below");
            webView.loadUrl("file:///android_asset/ow.html");
        }else {
            textView.setText("normal");
        }



    }
}
