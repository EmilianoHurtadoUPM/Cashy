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

    }

    public void Europa(View view)
    {

    }

    public void Asia(View view)
    {

    }

    public void Africa(View view)
    {

    }

    public void Oceania(View view)
    {

    }

    public void Salir(View view)
    {
        Intent salir=new Intent(this,Menu.class);
        startActivity(salir);
    }
}