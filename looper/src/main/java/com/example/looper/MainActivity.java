package com.example.looper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    com.example.looper.myLooper myLooper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLooper = new myLooper();
        myLooper.start();
    }

    public void onClick(View view){
        Message msg = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("KEY", "19 лет, студентка");
        msg.setData(bundle);
        if (myLooper != null) {
            myLooper.handler.sendMessageDelayed(msg, 19);
        }
    }}