package nefersky.webbrowserapp2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenBrowser(View view) {
        Intent intent = new Intent("ru.alexanderklimov.Browser");
        intent.setData(Uri.parse("http://developer.alexanderklimov.ru/android/"));
        startActivity(Intent.createChooser(intent, "Мяу..."));
    }
}
