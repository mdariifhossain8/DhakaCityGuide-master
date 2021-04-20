package com.example.ab.dhakacityguide;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar = findViewById(R.id.progressBar);

        // ShortHand of the below code
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                launchMainActivity();
                finish();
            }
        }, 1000);



    }

    /**
     * Launch the Main Activity
     */
    public void launchMainActivity() {
        Intent launchMain = new Intent(SplashScreenActivity.this, MainActivity.class);
        startActivity(launchMain);
    }
}
