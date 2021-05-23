package com.example.notesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class forgotpassword extends AppCompatActivity {
private EditText mforgotpassword;
private Button mpasswordRecoverButton;
private TextView mgoBackToLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
getSupportActionBar().hide();
mforgotpassword=findViewById(R.id.forgotpassword);
mpasswordRecoverButton=findViewById(R.id.passwordRecoverButton);
mgoBackToLogIn=findViewById(R.id.goBackToLogIn);

        mgoBackToLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(forgotpassword.this,MainActivity.class);
                startActivity(intent);
            }
        });
mpasswordRecoverButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String mail=mforgotpassword.getText().toString().trim();
        if(mail.isEmpty()){
            Toast.makeText(getApplicationContext(),"Enter your email",Toast.LENGTH_SHORT).show();
        }
        else{
            //we have to send mail password revvocer email

        }
    }
});
    }
}