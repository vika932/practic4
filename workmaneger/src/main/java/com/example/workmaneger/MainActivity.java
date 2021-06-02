package com.example.workmaneger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private Calendar WorkManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkRequest uploadWorkRequest =
                new OneTimeWorkRequest.Builder(UpLOadWorked.class)
                        .build();
        WorkManager
                .getInstance(this)
                .enqueue(uploadWorkRequest);
    }
}