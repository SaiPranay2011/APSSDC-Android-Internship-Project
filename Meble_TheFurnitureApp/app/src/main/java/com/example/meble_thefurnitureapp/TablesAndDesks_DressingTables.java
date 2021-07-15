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

public class TablesAndDesks_DressingTables extends AppCompatActivity implements PaymentResultListener {

    String API_KEY = "rzp_test_ug6aiUEmeZMscW";
    Checkout checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables_and_desks_dressing_tables);
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

    public void Buy_dt(View view) {

        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Katsuro Dressing Table");
            object.put("amount","2200000");
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

    public void Buy_dt1(View view) {

        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Serra Wooden Dressing Table");
            object.put("amount","1600000");
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

    public void Buy_dt2(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Gleam Wooden Dressing Table");
            object.put("amount","2400000");
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

    public void Buy_dt3(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Yamato Dressing Table");
            object.put("amount","2700000");
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

    public void Buy_dt4(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Crysler Dressing Table");
            object.put("amount","2080000");
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