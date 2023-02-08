package com.mycompany.myapp8;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity 
{

	private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		web = (WebView) findViewById(R.id.mWebView);
		WebSettings webSettings=web.getSettings();
		webSettings.setJavaScriptEnabled(true);
		web.loadUrl("https://wwwdclxviclancom.github.io");
		
    }
}
