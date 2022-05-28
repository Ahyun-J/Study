package com.example.week03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    private Intent intent;
    private TextView txtSub;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        txtSub = findViewById(R.id.text_sub);
        intent = getIntent();

        String editText = intent.getStringExtra("edittext");
        int progress = intent.getIntExtra("seekbar", -1);
        boolean sw = intent.getBooleanExtra("switch", false);
        boolean cd = intent.getBooleanExtra("checkbox", false);

        txtSub.setText("edittext: " + editText
                        + "\nprogress: " + progress
                        + "\nswitch: " + sw
                        + "\ncheckbox: " + cd);

    }
}
