package com.Latte221.week04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbarMain;
    private FloatingActionButton fabMain;
    private ListView listviewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarMain = findViewById(R.id.toolbar_main);
        fabMain = findViewById(R.id.float_main);
        listviewMain = findViewById(R.id.list_main);

        setSupportActionBar(toolbarMain);
//        툴바를 사용하면 여러 레이아웃을 사용할 수 있기 때문
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //뒤로가기 버튼이 생긴다(툴바에
        //getSupportActionBar().setTitle("Latte");
        //툴바 메인 이름 바뀜

        fabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Snackbar.make(listviewMain,
//                        "FloatingActionButtonClick",
//                        Snackbar.LENGTH_INDEFINITE).show();
                Toast.makeText(MainActivity.this,
                        "틀릭",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Part 2: ListView
        //ListVIew, list item, adapter
        //데이터(List) -> adapter -> ListView

        ArrayList<String> data = new ArrayList<>();
        data.add("사과");
        data.add("배");
        data.add("딸기");
        data.add("레몬");
        data.add("코코넛");

        //ListView에 연결할 Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);

        //ListView에 Adapter 연결
        listviewMain.setAdapter(adapter);

        //클릭 리스너 구현하기
        //BUtton: View.OnClickListener
        //OnItemClickListener
        listviewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MainActivity.this,
                        data.get(i),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    //뒤로가기 버튼 실행 어떻게 받아야 하는지
    //툴바에서 클릭되면 이게 실행됨
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId() == android.R.id.home){
//            this.finish();
////            종료
//        }
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                break;

            case R.id.action_test_01:
                Toast.makeText(this, "text 01", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_test_02:
                Toast.makeText(this, "text 02", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_test_03:
                Toast.makeText(this, "text 03", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
