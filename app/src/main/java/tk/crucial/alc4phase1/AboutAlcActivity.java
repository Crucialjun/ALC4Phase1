package tk.crucial.alc4phase1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Objects;

@SuppressLint("Registered")
public class AboutAlcActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ProgressBar progressBarLoadingAlC = findViewById(R.id.progressBarLoadingAlc);
        TextView textViewLoadingAboutALC = findViewById(R.id.text_view_loading_about_alc);

        WebView aboutAlcWebView = findViewById(R.id.webview_about_alc);
        aboutAlcWebView.getSettings().setJavaScriptEnabled(true);
        aboutAlcWebView.setWebViewClient(new WebViewClass(progressBarLoadingAlC, textViewLoadingAboutALC));
        aboutAlcWebView.getSettings().setLoadWithOverviewMode(true);
        aboutAlcWebView.getSettings().setBuiltInZoomControls(true);
        aboutAlcWebView.getSettings().setSupportZoom(true);
        aboutAlcWebView.loadUrl("https://andela.com/alc/");


    }


}
