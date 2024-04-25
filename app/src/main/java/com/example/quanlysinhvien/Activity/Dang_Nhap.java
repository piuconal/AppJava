package com.example.quanlysinhvien.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quanlysinhvien.R;

public class Dang_Nhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_nhap);

        Button button = findViewById(R.id.quan_tri_vien);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang trang layout của Quản trị viên
                Intent intent = new Intent(Dang_Nhap.this, Quan_Tri_Vien.class);
                startActivity(intent);
            }
        });
    }
}
