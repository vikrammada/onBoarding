package com.example.fragment;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class test_results extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("SavedInstanceState", "before the if of savedInstance State");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_results);
    }
}
