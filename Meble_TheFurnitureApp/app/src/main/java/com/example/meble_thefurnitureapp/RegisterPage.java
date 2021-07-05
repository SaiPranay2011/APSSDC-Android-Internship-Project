package com.example.meble_thefurnitureapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.meble_thefurnitureapp.databinding.ActivityRegisterPageBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class RegisterPage extends AppCompatActivity {
    ActivityRegisterPageBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_register_page);
        auth = FirebaseAuth.getInstance();
    }

    public void register(View view) {
        String email = binding.email.getText().toString();
        String password = binding.pass.getText().toString();
        String repassword = binding.repass.getText().toString();
        String number = binding.phno.getText().toString();

        if(email.isEmpty() || password.isEmpty() || repassword.isEmpty() || number.isEmpty()){
            Toast.makeText(this, "Please Fill all details", Toast.LENGTH_SHORT).show();
        }else if(!password.equals(repassword)){
            binding.repass.setError("Passwords do not match");
        }else if(password.length() < 8){
            binding.pass.setError("Length of password must be at least 8 characters");
        }
        else{
            auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        startActivity(new Intent(RegisterPage.this,LoginPage.class));
                    }else{
                        Toast.makeText(RegisterPage.this, "Already Registered", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    public void alrregistered(View view) {
        Intent i = new Intent(this,LoginPage.class);
        startActivity(i);
    }
}