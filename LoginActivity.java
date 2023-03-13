package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        MaterialButton loginbtn =(MaterialButton)findViewById(R.id.loginbtn);
        TextView btn = findViewById(R.id.signup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

                loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(username.getText().toString().equals("Manoj")&& password.getText().toString().equals("12345")){
                            Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFULL",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(LoginActivity.this,"LOGIN Failed !",Toast.LENGTH_SHORT).show();

                    }


                });
    }
}