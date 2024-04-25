package com.example.quanlysinhvien.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.quanlysinhvien.R;

public class Quan_Tri_Vien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quan_tri_vien);

        Button themSinhVienButton = findViewById(R.id.themsinhvien);
        themSinhVienButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang trang layout của Thêm sinh viên
                Intent intent = new Intent(Quan_Tri_Vien.this, Them_Sinh_Vien.class);
                startActivity(intent);
            }
        });

        Button xemThongTinButton = findViewById(R.id.xemthongtin);
        xemThongTinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang trang layout của Xem thông tin sinh viên
                Intent intent = new Intent(Quan_Tri_Vien.this, Thong_Tin_Quan_Ly.class);
                startActivity(intent);
            }
        });
    }
}