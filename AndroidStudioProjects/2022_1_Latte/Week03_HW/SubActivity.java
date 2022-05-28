package com.example.week03_hw;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SubActivity extends AppCompatActivity {
    private Intent intent;
    private TextView text_to;
    private TextView text_from;
    private TextView to;
    private TextView from;
    private Button btnThird;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        text_to = findViewById(R.id.text_to);
        text_from = findViewById(R.id.text_from);
        to = findViewById(R.id.to);
        from = findViewById(R.id.from);
        btnThird = findViewById(R.id.btn_third);
        intent = getIntent();

        String fromText = intent.getStringExtra("text");
        int colorText = intent.getIntExtra("color", R.color.red);

        text_from.setText(fromText);
        text_from.setTextColor(colorText);

        int mycolor = ContextCompat.getColor(text_to.getContext(), R.color.blue);

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //activity 실행 할 때 Intent 객체 - Message 객체 사용
                Intent intent = new Intent(SubActivity.this, ThirdActivity.class);

                intent.putExtra("text", text_to.getText().toString());
                intent.putExtra("color", mycolor);

                startActivity(intent);
            }
        });

    }

}
