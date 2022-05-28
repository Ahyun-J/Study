package com.example.week03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private EditText editMain;
    private SeekBar seekMain;
    private SwitchCompat switchMain;
    private CheckBox checkMain;
    private Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMain = findViewById(R.id.edit_main);
        seekMain = findViewById(R.id.seek_main);
        switchMain = findViewById(R.id.switch_main);
        checkMain = findViewById(R.id.cd_main);
        btnMain = findViewById(R.id.btn_main);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //activity 실행 할 때 Intent 객체 - Message 객체 사용
                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                // Extra - 전달할 데이터
                // Key - Value
                // "id" : "---"
                // "age" : 00
                // "fridends" : {"ooo","aaa"}
                intent.putExtra("edittext", editMain.getText().toString());
                intent.putExtra("seekbar", seekMain.getProgress());
                intent.putExtra("switch", switchMain.isChecked());
                intent.putExtra("checkbox", checkMain.isChecked());

                startActivity(intent);

            }
        });
    }
}
