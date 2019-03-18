package com.example.ahmedpc.icms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainLauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_launcher);
       ImageView imageView = findViewById(R.id.icms_iv_logo);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadelogo);
        imageView.startAnimation(animation);
        logolauncher logolauncher = new logolauncher();
        logolauncher.start();


    }

    private class logolauncher extends Thread {

        public void run() {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(MainLauncherActivity.this, CatureImageActivity.class);
            startActivity(intent);
            MainLauncherActivity.this.finish();
        }
    }
}


