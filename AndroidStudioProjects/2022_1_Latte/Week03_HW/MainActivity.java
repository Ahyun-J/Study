package com.example.week03_hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textMain;
    private Button btnSub;
    private Button btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textMain = findViewById(R.id.text_main);
        btnSub = findViewById(R.id.btn_sub);
        btnThird = findViewById(R.id.btn_third);

        int mycolor = ContextCompat.getColor(textMain.getContext(), R.color.red);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //activity 실행 할 때 Intent 객체 - Message 객체 사용
                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                intent.putExtra("text", textMain.getText().toString());
                intent.putExtra("color", mycolor);

                startActivity(intent);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //activity 실행 할 때 Intent 객체 - Message 객체 사용
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);

                intent.putExtra("text", textMain.getText().toString());
                intent.putExtra("color", mycolor);

                startActivity(intent);
            }
        });
    }
}
