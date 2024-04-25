package com.example.quanlysinhvien.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.quanlysinhvien.R;

public class Thong_Tin_Quan_Ly extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_quan_ly);

        Button xemThongTinQLKhoa = findViewById(R.id.button_d19);
        xemThongTinQLKhoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang trang layout của Thông tin quản lý KHÓA
                Intent intent = new Intent(Thong_Tin_Quan_Ly.this, Thong_Tin_Quan_Ly_Khoa.class);
                startActivity(intent);
            }
        });
    }
}