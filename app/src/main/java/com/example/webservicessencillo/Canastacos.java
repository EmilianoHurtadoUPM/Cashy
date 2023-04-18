package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Canastacos extends AppCompatActivity {

    AnimationDrawable animacion=new AnimationDrawable();
    ImageView imgvAnimar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canastacos);
        imgvAnimar=findViewById(R.id.imgvAnimar);
        Animacion();

    }

    public void Animacion()
    {
        animacion.addFrame(getResources().getDrawable(R.drawable.img1),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.img2),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.img3),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.img4),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.img5),3000);
        animacion.setOneShot(false);
        imgvAnimar.setBackgroundDrawable(animacion);
        animacion.start();
    }


    public void Cambiar(View view)
    {
        Intent cambio=new Intent(this,Comanda.class);
        startActivity(cambio);
    }

}