package com.myappfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.myappfasttrack.activity.BottomNavActivity;
import com.myappfasttrack.activity.CustomListViewActivity;
import com.myappfasttrack.activity.MenuActivity;
import com.myappfasttrack.activity.NewTabActivity;
import com.myappfasttrack.activity.TabWithViewPagerActivity;

public class SplashActivity extends AppCompatActivity {

int time = 3000;
GifImageView gifImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        gifImageView = findViewById(R.id.gif_img);
        gifImageView.setGifImageResource(R.drawable.android);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashActivity.this, BottomNavActivity.class);
                startActivity(i);
                finish();
            }
        },time);
    }
}