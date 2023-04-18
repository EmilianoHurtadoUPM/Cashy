package com.example.webservicessencillo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Pago extends AppCompatActivity {

    TextView txtTotal, txtCambio, txtPago;
    double totales, pagos,cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        txtTotal=findViewById(R.id.txtTotal);
        txtCambio=findViewById(R.id.txtCambio);
        txtPago=findViewById(R.id.txtPago);
        Cambio();
    }

    public void Cambio()
    {
        Bundle recibirinfo=getIntent().getExtras();
        pagos=recibirinfo.getDouble("Pago");
        totales=recibirinfo.getDouble("Total");
        txtPago.setText("$"+String.format("%.2f", pagos));
        txtTotal.setText("$"+String.format("%.2f", totales));
        cambio=pagos-totales;

        if(totales<pagos)
        {
            txtCambio.setText("$"+String.format("%.2f", cambio));

        }
        else if(totales>pagos)
        {
            txtCambio.setText("$----");
            Toast toast=Toast.makeText(this,"Por favor, completa el pago con más dinero",Toast.LENGTH_LONG);
            toast.show();


        }
        else if(totales==pagos)
        {
            txtCambio.setText("$0.00");
        }
    }


    public void Regresar(View view)
    {
        Intent cambio=new Intent(this,Comanda.class);
        startActivity(cambio);

    }

    public void Salir(View view)
    {
        Intent salir=new Intent(this,Menu.class);
        startActivity(salir);
    }
}