package com.example.goodgame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView titleView,subtitleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        titleView = findViewById(R.id.titleview_id);
        subtitleView =findViewById(R.id.subtitle_id);

        Animation popup = AnimationUtils.loadAnimation(this, R.anim.popup);
        Animation popup2 = AnimationUtils.loadAnimation(this, R.anim.popup2);

        titleView.startAnimation(popup);
        subtitleView.startAnimation(popup2);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);
    }
}