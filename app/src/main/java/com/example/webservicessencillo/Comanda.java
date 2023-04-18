package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Comanda extends AppCompatActivity {
    EditText txtenTaco, txtenChesco, txteNombre, txtenMesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comanda);

        txtenChesco=findViewById(R.id.txtenChesco);
        txtenTaco=findViewById(R.id.txtenTaco);
        txtenMesa=findViewById(R.id.txtenMesa);
        txteNombre=findViewById(R.id.txteNombre);
    }

    public  void Enviar (View view)
    {
        Intent envio=new Intent(view.getContext(),Ticket.class);
        envio.putExtra("Nombre",String.valueOf(txteNombre.getText()));
        envio.putExtra("Chesco",String.valueOf(txtenChesco.getText()));
        envio.putExtra("Taco",String.valueOf(txtenTaco.getText()));
        envio.putExtra("Mesa",String.valueOf(txtenMesa.getText()));
        startActivity(envio);
    }
}