package race12.admin.jobs.freshers_job_pane.web_view_ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Second extends AppCompatActivity {

    WebView web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        web_view = (WebView) findViewById(R.id.web_view);
        web_view.loadUrl("http://"+getIntent().getExtras().getString("link"));

        web_view.setWebViewClient(new WebViewClient() {
                                      @Override
                                      public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                          view.loadUrl(url);
                                          return true;
                                      }
                                  }
        );

        web_view.getSettings().setJavaScriptEnabled(true);

    }
}
