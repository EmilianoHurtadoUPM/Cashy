package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Continentes extends AppCompatActivity {

    ImageView imgvMundo;

    AnimationDrawable animacion = new AnimationDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continentes);

        imgvMundo = findViewById(R.id.imgvMundo);

    }

    public void America(View view)
    {
        Intent america = new Intent(this,America.class);
        startActivity(america);
    }

    public void Europa(View view)
    {
        Intent eur = new Intent(this,Europa.class);
        startActivity(eur);
    }

    public void Asia(View view)
    {
        Intent asi = new Intent(this,Asia.class);
        startActivity(asi);
    }

    public void Africa(View view)
    {
        Intent afr = new Intent(this,Africa.class);
        startActivity(afr);
    }

    public void Oceania(View view)
    {
        Intent oce = new Intent(this,Oceania.class);
        startActivity(oce);
    }

    public void Salir(View view)
    {
        Intent salir=new Intent(this,Menu.class);
        startActivity(salir);
    }
}