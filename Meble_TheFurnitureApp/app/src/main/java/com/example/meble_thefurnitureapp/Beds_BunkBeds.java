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

public class Beds_BunkBeds extends AppCompatActivity implements PaymentResultListener {
    String API_KEY = "rzp_test_ug6aiUEmeZMscW";
    Checkout checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beds_bunk_beds);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        /*For Payment*/
        Checkout.preload(getApplicationContext());
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

    public void Buy_bb(View view) {


        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Molly Bunk Bed");
            object.put("amount","2800000");
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

    public void Buy_bb1(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Stockton Bunk Bed ");
            object.put("amount","4500000");
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

    public void Buy_bb2(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Avalon Bunk Bed");
            object.put("amount","3800000");
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

    public void Buy_bb3(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Celeste 3ft Bunk Bed  ");
            object.put("amount","3900000");
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

    public void Buy_bb4(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Eldon Bunk Bed");
            object.put("amount","3300000");
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