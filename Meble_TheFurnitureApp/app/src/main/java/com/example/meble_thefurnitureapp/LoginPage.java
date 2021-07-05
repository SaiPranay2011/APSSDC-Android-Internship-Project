package com.example.meble_thefurnitureapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.meble_thefurnitureapp.databinding.ActivityLoginPageBinding;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class LoginPage extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseDatabase database;
    ActivityLoginPageBinding binding;
    GoogleSignInClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_page);
        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser()!= null){
            startActivity(new Intent(this,HomePage.class));
            finish();
        }

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail().build();
        client = GoogleSignIn.getClient(this,gso);

    }

    public void gsign(View view) {
        Intent i = client.getSignInIntent();
        startActivityForResult(i,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
        try {
            GoogleSignInAccount account = task.getResult(ApiException.class);
            firebaseGsign(account.getIdToken(),account.getEmail());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private void firebaseGsign(String idToken, String email) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken,null);
        auth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(LoginPage.this,HomePage.class));
                    finish();
                }else{
                    Toast.makeText(LoginPage.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void register(View view) {
        Intent i = new Intent(this,RegisterPage.class);
        startActivity(i);
    }

    public void login(View view) {
        String email = binding.email.getText().toString();
        String password = binding.pass.getText().toString();
        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Please fill the details", Toast.LENGTH_SHORT).show();
        }
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        startActivity(new Intent(LoginPage.this,HomePage.class));
                    }else{
                        Toast.makeText(LoginPage.this, "Failed to Login", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }

    public void forgetpass(View view) {
    }
}