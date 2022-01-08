package com.example.a2ndapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView id, phone;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        id= findViewById(R.id.text1);
        phone= findViewById(R.id.text2);

        String videoId = getIntent().getExtras().getString("id");
        int ph = getIntent().getExtras().getInt("call");

        id.setText(videoId);
        phone.setText(String.valueOf(ph));

    }
}