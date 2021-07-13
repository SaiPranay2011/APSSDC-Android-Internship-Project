package com.example.meble_thefurnitureapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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

        /*ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle("My new title"); // set the top title
        String title = actionBar.getTitle().toString(); // get the title
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#0F9D58"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
*/
        binding = ActivityBedsBabyCotsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
    }


}