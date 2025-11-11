package com.example.th2_lab2_dnk24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bai2_Lab3_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2_lab3_activity_detail);

        TextView tvName = findViewById(R.id.tv_animal_name);
        TextView tvDesc = findViewById(R.id.tv_animal_desc);
        ImageView ivAnimal = findViewById(R.id.iv_animal);
        ivAnimal.setImageResource(R.drawable.bai2_lab3_bg_rabbit);
    }
}