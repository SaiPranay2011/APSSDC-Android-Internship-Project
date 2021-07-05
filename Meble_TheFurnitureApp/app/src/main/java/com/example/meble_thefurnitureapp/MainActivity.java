package com.example.meble_thefurnitureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void letsgo(View view) {
        Intent i = new Intent(this,LoginPage.class);
        startActivity(i);
    }
}