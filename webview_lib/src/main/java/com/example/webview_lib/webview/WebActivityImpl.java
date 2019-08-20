package com.example.webview_lib.webview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.webview_lib.webview.chromeclient.EcChromeClient;
import com.example.webview_lib.webview.router.EcRouter;
import com.example.webview_lib.webview.webviewclient.EcWebViewClient;

public final class WebActivityImpl extends WebActivity implements IWebViewAvailable {
    @Override
    protected IWebViewAvailable initIWebViewAvailable() {
        return this;
    }

    @Override
    protected View setLayout() {
        return getWebView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        EcRouter.Companion.getIns().loadPage(this, getUrl());
    }

    @Override
    public WebView initWebView(WebView webView) {
        return EcWebViewInit.INSTANCE.initWebView(webView);
    }

    @Override
    public WebChromeClient initWebChromeClient() {
        final WebChromeClient chromeClient = new EcChromeClient();
        return chromeClient;
    }

    @Override
    public WebViewClient initWebViewClient() {
        return new EcWebViewClient(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
