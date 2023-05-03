package com.example.webservicessencillo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Africa extends AppCompatActivity
{

    RadioGroup rdbgAfr;
    RadioButton rdbEgi, rdbCam, rdbMar;
    CheckBox chkMonAf, chkIdiAf, chkCapAf;
    TextView txtMonAf, txtIdiAf, txtCapAf;
    ImageView imgvAfr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        chkCapAf = findViewById(R.id.chkCapAf);
        chkIdiAf = findViewById(R.id.chkIdiAf);
        chkMonAf = findViewById(R.id.chkMonAf);
        txtCapAf = findViewById(R.id.txtCapO);
        txtIdiAf = findViewById(R.id.txtIdiO);
        txtMonAf = findViewById(R.id.txtMonO);
        rdbgAfr  = findViewById(R.id.rdbgAfr);
        rdbEgi   = findViewById(R.id.rdbEgi);
        rdbCam   = findViewById(R.id.rdbCam);
        rdbMar   = findViewById(R.id.rdbMar);
        imgvAfr  = findViewById(R.id.imgvAfr);

        rdbgAfr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.rdbEgi:
                        imgvAfr.setImageResource(R.drawable.afegiptob);
                        InfoEgipto(); break;
                    case R.id.rdbCam:
                        imgvAfr.setImageResource(R.drawable.afcamerunb);
                        InfoCamerun();   break;
                    case R.id.rdbMar:
                        imgvAfr.setImageResource(R.drawable.afmarruecosb);
                        InfoMarruecos();
                        break;
                }
            }
        });
    }

    public void InfoEgipto() {
        if (chkMonAf.isChecked() & chkIdiAf.isChecked() & chkCapAf.isChecked()) {
            txtCapAf.setText("El Cairo");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("Libra egipcia");
        } else if (chkCapAf.isChecked() & chkIdiAf.isChecked()) {
            txtCapAf.setText("El Cairo");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("");
        } else if (chkCapAf.isChecked() & chkMonAf.isChecked()) {
            txtCapAf.setText("El Cairo");
            txtIdiAf.setText("");
            txtMonAf.setText("Libra egipcia");
        } else if (chkIdiAf.isChecked() & chkMonAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("Libra egipcia");
        } else if (chkMonAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("");
            txtMonAf.setText("Libra egipcia");
        } else if (chkIdiAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("");
        } else if (chkCapAf.isChecked()) {
            txtCapAf.setText("El Cairo");
            txtIdiAf.setText("");
            txtMonAf.setText("");
        }
    }
    public void InfoCamerun() {
        if (chkMonAf.isChecked() & chkIdiAf.isChecked() & chkCapAf.isChecked()) {
            txtCapAf.setText("Yaundé");
            txtIdiAf.setText("Francés / Inglés");
            txtMonAf.setText("Franco");
        } else if (chkCapAf.isChecked() & chkIdiAf.isChecked()) {
            txtCapAf.setText("Yaundé");
            txtIdiAf.setText("Francés / Inglés");
            txtMonAf.setText("");
        } else if (chkCapAf.isChecked() & chkMonAf.isChecked()) {
            txtCapAf.setText("Yaundé");
            txtIdiAf.setText("");
            txtMonAf.setText("Franco");
        } else if (chkIdiAf.isChecked() & chkMonAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("Francés / Inglés");
            txtMonAf.setText("Franco");
        } else if (chkMonAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("");
            txtMonAf.setText("Franco");
        } else if (chkIdiAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("Francés / Inglés");
            txtMonAf.setText("");
        } else if (chkCapAf.isChecked()) {
            txtCapAf.setText("Yaundé");
            txtIdiAf.setText("");
            txtMonAf.setText("");
        }
    }
    public void InfoMarruecos() {
        if (chkMonAf.isChecked() & chkIdiAf.isChecked() & chkCapAf.isChecked()) {
            txtCapAf.setText("Rabat");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("Dirham");
        } else if (chkCapAf.isChecked() & chkIdiAf.isChecked()) {
            txtCapAf.setText("Rabat");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("");
        } else if (chkCapAf.isChecked() & chkMonAf.isChecked()) {
            txtCapAf.setText("Rabat");
            txtIdiAf.setText("");
            txtMonAf.setText("Dirham");
        } else if (chkIdiAf.isChecked() & chkMonAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("Dirham");
        } else if (chkMonAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("");
            txtMonAf.setText("Dirham");
        } else if (chkIdiAf.isChecked()) {
            txtCapAf.setText("");
            txtIdiAf.setText("Árabe");
            txtMonAf.setText("");
        } else if (chkCapAf.isChecked()) {
            txtCapAf.setText("Rabat");
            txtIdiAf.setText("");
            txtMonAf.setText("");
        }
    }

    public void Limpiar(View view)
    {
        chkCapAf.setChecked(false);
        chkIdiAf.setChecked(false);
        chkMonAf.setChecked(false);
        txtCapAf.setText("");
        txtIdiAf.setText("");
        txtMonAf.setText("");
        rdbEgi.setChecked(false);
        rdbCam.setChecked(false);
        rdbMar.setChecked(false);
        imgvAfr.setImageResource(R.drawable.africam);
    }

    public void Inicio(View view)
    {
        Intent ini = new Intent(this, Continentes.class);
        startActivity(ini);
    }
}
