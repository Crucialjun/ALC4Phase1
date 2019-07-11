package tk.crucial.alc4phase1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.asksira.webviewsuite.WebViewSuite;

public class AboutAlcActivity extends AppCompatActivity {

    private WebView mAboutAlcWebView;
    private TextView mTextViewLoadingAboutALC;
    private ProgressBar mProgressBarLoadingAlC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mProgressBarLoadingAlC = findViewById(R.id.progressBarLoadingAlc);
        mTextViewLoadingAboutALC = findViewById(R.id.text_view_loading_about_alc);

        mAboutAlcWebView = findViewById(R.id.webview_about_alc);
        mAboutAlcWebView.getSettings().setJavaScriptEnabled(true);
        mAboutAlcWebView.setWebViewClient(new WebViewClass(mProgressBarLoadingAlC,mTextViewLoadingAboutALC));
        mAboutAlcWebView.loadUrl("https://andela.com/alc/");




    }


}
