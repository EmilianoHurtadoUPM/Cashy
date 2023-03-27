package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login2(View v)
    {
        Intent login2=new Intent(Login.this, Login2.class);
        startActivity(login2);
    }

    public void Registrar(View v)
    {
        Intent registrar=new Intent(Login.this, MainActivity.class);
        startActivity(registrar);
    }
}