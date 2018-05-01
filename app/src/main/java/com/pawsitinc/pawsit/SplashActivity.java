package com.pawsitinc.pawsit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DELAY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //DRAW BEHIND STATUS BAR
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        //NEXT ACTIVITY
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intentLoginActivity;
                intentLoginActivity = new Intent(SplashActivity.this,MainActivity.class);

                startActivity(intentLoginActivity);
                finish();
            }
        },SPLASH_DELAY);

    }
}
