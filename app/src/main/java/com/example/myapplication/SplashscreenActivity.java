package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.imageswitcher.MainActivity;
import com.example.imageswitcher.R;


public class SplashscreenActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.activity_splashscreen);
        setTitle("This is Splash Screen");

        Thread td = new Thread() {
            public void run() {
                try {

                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashscreenActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

        };
        td.start();

    }
}
