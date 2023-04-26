package com.example.webservicessencillo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Adivina extends AppCompatActivity {

    EditText txtenN;
    ImageButton imgbAdi;
    ImageView imgvNuAd;

    int num=0, dado=0;
    Random adivina = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adivina);

        txtenN = findViewById(R.id.txtenN);
        imgbAdi = findViewById(R.id.imgbAdi);
        imgvNuAd = findViewById(R.id.imgvNuAd);

        View.OnClickListener evento = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num = adivina.nextInt(5);
                Adivinar(num);
                switch (num)
                {
                    case 1: imgvNuAd.setImageResource(R.drawable.uno); break;
                    case 2: imgvNuAd.setImageResource(R.drawable.dos); break;
                    case 3: imgvNuAd.setImageResource(R.drawable.tres); break;
                    case 4: imgvNuAd.setImageResource(R.drawable.cuatro); break;
                    case 0: imgvNuAd.setImageResource(R.drawable.cero); break;

                }

            }
        };
        imgbAdi.setOnClickListener(evento);
    }

    public void Adivinar(int num)
    {
        dado= Integer.parseInt(txtenN.getText().toString());
        if(num == dado)
            Toast.makeText(this,"Recuerda que el dinero sirve para satisfacer las necesidades y los deseos. Pero, tenemos que tener muy claro en qué situaciones es conveniente hacerlo.",Toast.LENGTH_LONG).show();
        else
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Lastima Margarito!").
                    setTitle("PERDISTE:(").

                    setNeutralButton("Adivina otra vez", new
                            DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        txtenN.setText("");
        txtenN.setFocusable(true);
    }

    public void regresar(View view) {
        Intent regresar = new Intent(this, Menu.class);
        startActivity(regresar);
    }
}