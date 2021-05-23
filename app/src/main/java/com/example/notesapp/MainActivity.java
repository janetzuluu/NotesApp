 package com.example.notesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

 public class MainActivity extends AppCompatActivity {
private EditText mloginEmail, mloginPassword;
private RelativeLayout mlogin, mgotosignup;
private TextView mgotoforgotpassword;
private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
       mgotoforgotpassword=findViewById(R.id.gotoforgotpassword);
        mgotosignup=findViewById(R.id.gotosignup);
        mlogin=findViewById(R.id.Login);
        mloginPassword=findViewById(R.id.LoginPassword);
        mloginEmail=findViewById(R.id.LoginEmail);

mgotosignup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,signUp.class));

    }
});
mgotoforgotpassword.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,forgotpassword.class));

    }
});
mlogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String mail=mloginEmail.getText().toString().trim();
        String password=mloginPassword.getText().toString().trim();
        if (mail.isEmpty()|| password.isEmpty()) {
            Toast.makeText(getApplicationContext(), "All field required to log in", Toast.LENGTH_SHORT).show();
        }
        else{
            //login the user
        }
    }
});
    }

 }