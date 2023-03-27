package com.example.webservicessencillo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login11);

    }

    public void Iniciar(View view)
    {
        Intent iniciar = new Intent(this,Login2.class);
        startActivity(iniciar);
    }

    public void Registrar(View view)
    {
        Intent registrar = new Intent(this,MainActivity.class);
        startActivity(registrar);
    }

}