package com.example.sidharthyatish.infinterecycleview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ReaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        Intent intent=new Intent();
        String content=getIntent().getStringExtra("content");
        WebView wb= (WebView) findViewById(R.id.webView2);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setDefaultTextEncodingName("UTF-8");
        wb.loadData(content,"text/html;charset=UTF-8",null);
    }
}
