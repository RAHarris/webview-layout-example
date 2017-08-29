package demo.webviewlayoutexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String html = "<html><body>" +
                "<h2>Title</h2>" +
                "<div>Using a webview to present some information</div>" +
                "<table><tr><td>1</td><td>2</td><td>3</td></tr>" +
                "<tr><td>4</td><td>5</td><td>6</td></tr>" +
                "<tr><td>7</td><td>8</td><td>9</td></tr></table>" +
                "</body></html>";

        WebView mWebView = (WebView) findViewById(R.id.webview);
        mWebView.loadData(html, "text/html", null);
    }
}
