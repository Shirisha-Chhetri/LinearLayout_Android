package com.example.a2ndapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button add, sub, cal, external,pass;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =findViewById(R.id.result);
        add =findViewById(R.id.btn_1);
        sub =findViewById(R.id.btn_2);
        cal=findViewById(R.id.btn_3);
        external =findViewById(R.id.btn_4);
        pass = findViewById(R.id.btn_5);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(i);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic
                count ++;
                result.setText(count+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic
                count--;
                result.setText(String.valueOf(count));
            }
        });

        external.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic
                String url = "http://www.youtube.com";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                String videoId ="stuvwxyz";
                int phone = 98098908;
                Bundle b = new Bundle();
                b.putString("id",videoId);
                b.putInt("call",phone);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}