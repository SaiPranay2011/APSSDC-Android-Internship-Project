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

public class FurnitureSets_Bathroomfurniture extends AppCompatActivity implements PaymentResultListener {

    String API_KEY = "rzp_test_ug6aiUEmeZMscW";
    Checkout checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_sets_bathroomfurniture);
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
    public void Buy_bfs(View view) {


        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Branco Bathroom Set");
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

    public void Buy_bfs1(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Nilkamal Bathroom Set");
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

    public void Buy_bfs2(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Branco Bathroom Set");
            object.put("amount","3500000");
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

    public void Buy_bfs3(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Retroza \\n Bathroom Set");
            object.put("amount","3200000");
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

    public void Buy_bfs4(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Nayasa Furniture Set");
            object.put("amount","4200000");
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