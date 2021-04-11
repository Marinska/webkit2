package com.umaribnuzm.webkit2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class webkit2 extends Activity {
    WebView browser;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        browser = (WebView) findViewById(R.id.webkit);

        browser.loadUrl("https://www.marinska.site");
    }
}
