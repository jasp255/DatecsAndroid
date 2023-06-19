package com.datecs.examples.PrinterSample;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppBarOverlay_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

          new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                gotToMain();
            }
        }, SPLASH_TIME_OUT);
    }

    public void gotToMain(){
        Intent homeIntent = new Intent(SplashActivity.this, PrinterActivity.class);
        startActivity(homeIntent);
        finish();
    }


}
