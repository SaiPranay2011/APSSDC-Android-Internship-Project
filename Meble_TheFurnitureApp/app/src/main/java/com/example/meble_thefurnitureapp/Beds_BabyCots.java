package com.example.meble_thefurnitureapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.meble_thefurnitureapp.R;
import com.example.meble_thefurnitureapp.databinding.ActivityBedsBabyCotsBinding;
import com.example.meble_thefurnitureapp.databinding.ActivityHomePageBinding;

public class Beds_BabyCots extends AppCompatActivity {
ActivityBedsBabyCotsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beds_baby_cots);


       /* TextView someTextView = (TextView) findViewById(R.id.rate);
        someTextView.getText();
        someTextView.setPaintFlags(someTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);*/
    }


}