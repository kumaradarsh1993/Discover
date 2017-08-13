package com.example.kadar.discover;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ExpandArticle extends AppCompatActivity {
    private WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove action bar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //set layout
        setContentView(R.layout.activity_expand_article);

        //Web view for article rendering
        wv1 = (WebView) findViewById(R.id.webView);
        wv1.setWebViewClient(new MyBrowser());

        String url = "http://www.google.com";

        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl(url);

        //=================================================
        //Recommendation Card view : Horizontal scroll
        FragmentManager fm2 = getSupportFragmentManager();
        Fragment fragment2 = fm2.findFragmentById(R.id.fragCon2);

        if (fragment2 == null) {
            fragment2 = new CardFragment2();
            fm2.beginTransaction()
                    .add(R.id.fragCon2, fragment2)
                    .commit();
        }
    }
}
class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
