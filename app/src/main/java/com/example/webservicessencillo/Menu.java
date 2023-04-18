package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Canastacos(View view) {
        Intent canastacos = new Intent(this, Canastacos.class);
        startActivity(canastacos);
    }

    public void Adivina(View view) {

    }

    public void Continentes(View view) {

    }

    public void Caja(View view) {
        Intent caja = new Intent(this, CajaAhorro.class);
        startActivity(caja);
    }


    public void regresar(View view) {
        Intent regresar = new Intent(this, Login2.class);
        startActivity(regresar);
    }
}