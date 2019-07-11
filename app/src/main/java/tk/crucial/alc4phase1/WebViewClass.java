package tk.crucial.alc4phase1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

class WebViewClass extends WebViewClient {
    private final TextView mTextView;
    private final ProgressBar mProgressBar;

    WebViewClass(ProgressBar progressBar, TextView textView) {
        mProgressBar = progressBar;
        mTextView = textView;
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed();
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        mProgressBar.setVisibility(ProgressBar.VISIBLE);
        mTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        mProgressBar.setVisibility(ProgressBar.GONE);
        mTextView.setVisibility(View.GONE);
    }

}
