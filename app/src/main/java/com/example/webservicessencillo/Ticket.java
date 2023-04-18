package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ticket extends AppCompatActivity {

    EditText txtendPago;
    TextView txtSub,txtDes,txtTotal,txtChesImp,txtTacImp,txtNombre,txtMesa;
    int tacons,chescons;
    double totacos, tochescos, total, subtotal, desc,cambio, pago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        txtTacImp=findViewById(R.id.txtTacImp);
        txtSub=findViewById(R.id.txtSub);
        txtDes=findViewById(R.id.txtDes);
        txtTotal=findViewById(R.id.txtTotal);
        txtChesImp=findViewById(R.id.txtChesImp);
        txtendPago=findViewById(R.id.txtendPago);
        txtNombre=findViewById(R.id.txtNombre);
        txtMesa=findViewById(R.id.txtMesa);


        Bundle recibirinfo=getIntent().getExtras();
        String tacos=recibirinfo.getString("Taco");
        String nombre=recibirinfo.getString("Nombre");
        String mesa=recibirinfo.getString("Mesa");
        String chesco=recibirinfo.getString("Chesco");

        txtNombre.setText(""+nombre);
        txtMesa.setText(""+mesa);

        tacons=Integer.parseInt(String.valueOf(tacos));
        chescons=Integer.parseInt(String.valueOf(chesco));
        totacos=tacons*12.50;
        tochescos=chescons*15.25;

        subtotal=totacos+tochescos;

        if(subtotal<=300)
        {
            desc=subtotal*.15;
        }
        else if(subtotal>300)
        {
            desc=subtotal*.25;
        }

        total=subtotal-desc;

        txtTacImp.setText("$"+String.format("%.2f", totacos));
        txtChesImp.setText("$"+String.format("%.2f", tochescos));
        txtSub.setText("$"+String.format("%.2f", subtotal));
        txtTotal.setText("$"+String.format("%.2f", total));
        txtDes.setText("$"+String.format("%.2f", desc));
    }

    public void Pago(View view)
    {
        pago=Double.parseDouble(String.valueOf(txtendPago.getText()));
        Intent envio=new Intent(view.getContext(),Pago.class);
        envio.putExtra("Pago",pago);
        envio.putExtra("Total",total);
        startActivity(envio);
    }
}