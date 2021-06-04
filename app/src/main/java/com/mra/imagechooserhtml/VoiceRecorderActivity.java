package com.mra.imagechooserhtml;

import android.app.Activity;

import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;

import com.mra.imagechooserhtml.utils.AudioRecorder;


public class VoiceRecorderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_chooser);


        WebView webView = findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new AudioRecorder(this), "Audio");
//        webView.loadDataWithBaseURL(null, html, mime, encoding, null);

        webView.loadUrl("file:///android_asset/voiceRecorder/index.html");

    }

}