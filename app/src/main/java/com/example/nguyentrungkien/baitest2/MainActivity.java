package com.example.nguyentrungkien.baitest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nguyentrungkien.baitest2.Bai2_1.Bai2_1;
import com.example.nguyentrungkien.baitest2.Bai2_2.Bai2_2;

public class MainActivity extends AppCompatActivity {

    private Button btnBai2_1, btnBai2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBai2_1 = findViewById(R.id.btnBai2_1);
        btnBai2_2 = findViewById(R.id.btnBai2_2);

        btnBai2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai2_1.class);

                startActivity(intent);
            }
        });

        btnBai2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai2_2.class);

                startActivity(intent);
            }
        });
    }
}
