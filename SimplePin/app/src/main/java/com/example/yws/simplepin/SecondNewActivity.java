package com.example.yws.simplepin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class SecondNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_new);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
        //返回箭头
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //一键获取

        Button simple = findViewById(R.id.btn9);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SecondNewActivity.this,ForthActivity.class);
                SecondNewActivity.this.startActivity(intent);
            }
        });

        //研发按钮
        Button yanButton = findViewById(R.id.btn1);
        yanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SecondNewActivity.this,TestActivity.class);
                SecondNewActivity.this.startActivity(intent);
            }
        });
    }



}

