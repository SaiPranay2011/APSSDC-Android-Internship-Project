package com.example.meble_thefurnitureapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class FurnitureSets_Diningsets extends AppCompatActivity implements PaymentResultListener {

    String API_KEY = "rzp_test_ug6aiUEmeZMscW";
    Checkout checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_sets_diningsets);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return true;
    }
    public void Buy_ds(View view) {


        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Rose Dining Set");
            object.put("amount","4300000");
            object.put("theme.color","#44BB04");
            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ds1(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Pearl Dining Set");
            object.put("amount","5100000");
            object.put("theme.color","#44BB04");
            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ds2(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Proton Dining Set");
            object.put("amount","5500000");
            object.put("theme.color","#44BB04");
            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ds3(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Cooper  Dining Set");
            object.put("amount","6400000");
            object.put("theme.color","#44BB04");
            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ds4(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Woltus Dining Set");
            object.put("amount","4800000");
            object.put("theme.color","#44BB04");
            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }
}