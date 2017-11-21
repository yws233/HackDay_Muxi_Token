package com.example.yws.simplepin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ForthActivity extends AppCompatActivity implements View.OnClickListener{

    List<SimplePin> movieList = new ArrayList<SimplePin>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        Button sendRequest = findViewById(R.id.send_request);
        listView = findViewById(R.id.response_text);
        sendRequest.setOnClickListener(this);

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
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.send_request) { //点击校园招聘的“产品”按钮
            sendRequestWithOkHttp();
            SimplePinAdapter simplePinAdapter = new SimplePinAdapter(ForthActivity.this,R.layout.movie_item,
                    movieList);
            listView = findViewById(R.id.response_text);
            listView.setAdapter(simplePinAdapter);
        }
    }

    private void sendRequestWithOkHttp() {
        // 开启线程来发起网络请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder().url("http:120.77.220.239:9999/service/simpleping").build();
                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();
                    parseJSONWithGSON(responseData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void parseJSONWithGSON(String jsonData){
        Gson gson = new Gson();
        movieList = gson.fromJson(jsonData,new TypeToken<List<SimplePin>>(){}.getType());
        for (SimplePin movie : movieList){
            Log.d("ForthActivity",movie.getCompany());
        }
    }
}
