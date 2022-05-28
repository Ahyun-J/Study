package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button plus;
    private Button toast;
    public int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        plus = (Button) findViewById(R.id.plus);
        toast = (Button) findViewById(R.id.toast);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = sum+1;
                text.setText(sum+"");
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }

//    @Override
//    public void onClick(View v) {
//        Toast.makeText(this, text.getText(), Toast.LENGTH_LONG).show();
//    }
}
