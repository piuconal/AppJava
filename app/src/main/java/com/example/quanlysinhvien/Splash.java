package com.example.quanlysinhvien;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quanlysinhvien.Activity.Dang_Nhap;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        View layout = findViewById(R.id.splash_layout);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        layout.startAnimation(fadeOut);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                // Chuyển đến màn hình chính
                Intent intent = new Intent(Splash.this, Dang_Nhap.class);
                startActivity(intent);
                finish(); // Đóng activity chào mừng
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
    }

}
