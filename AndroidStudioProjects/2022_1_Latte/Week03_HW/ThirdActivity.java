package com.example.week03_hw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private Intent intent;
    private TextView text_to;
    private TextView text_from;
    private TextView to;
    private TextView from;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        text_to = findViewById(R.id.text_to);
        text_from = findViewById(R.id.text_from);
        to = findViewById(R.id.to);
        from = findViewById(R.id.from);
        intent = getIntent();

        String fromText = intent.getStringExtra("text");
        int colorText = intent.getIntExtra("color", R.color.red);

        text_from.setText(fromText);
        text_from.setTextColor(colorText);

    }
}
