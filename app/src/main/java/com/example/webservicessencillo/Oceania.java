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

public class Oceania extends AppCompatActivity {
    RadioGroup rdbgOc;
    RadioButton rdbFji, rdbTuvalu, rdbAus;
    CheckBox chkMonOc, chkIdiOc, chkCapOc;
    TextView txtMonOc, txtIdiOc, txtCapOc;
    ImageView imgvOc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);

        chkCapOc = findViewById(R.id.chkCapOc);
        chkIdiOc = findViewById(R.id.chkIdiOc);
        chkMonOc = findViewById(R.id.chkMonOc);
        txtCapOc = findViewById(R.id.txtCapOc);
        txtIdiOc = findViewById(R.id.txtIdiOc);
        txtMonOc = findViewById(R.id.txtMonOc);
        rdbgOc  = findViewById(R.id.rdbgOc);
        rdbFji   = findViewById(R.id.rdbFiji);
        rdbTuvalu  = findViewById(R.id.rdbTuvalu);
        rdbAus   = findViewById(R.id.rdbAus);
        imgvOc  = findViewById(R.id.imgvOc);

        rdbgOc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.rdbFiji:
                        imgvOc.setImageResource(R.drawable.ocfijib);
                        InfoFiji(); break;
                    case R.id.rdbTuvalu:
                        imgvOc.setImageResource(R.drawable.octuvalub);
                        InfoTuvalu();   break;
                    case R.id.rdbAus:
                        imgvOc.setImageResource(R.drawable.ocaustraliab);
                        InfoAustralia();
                        break;
                }
            }
        });
    }

    public void InfoFiji() {
        if (chkMonOc.isChecked() & chkIdiOc.isChecked() & chkCapOc.isChecked()) {
            txtCapOc.setText("Suva");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("Dólar");
        } else if (chkCapOc.isChecked() & chkIdiOc.isChecked()) {
            txtCapOc.setText("Suva");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("");
        } else if (chkCapOc.isChecked() & chkMonOc.isChecked()) {
            txtCapOc.setText("Suva");
            txtIdiOc.setText("");
            txtMonOc.setText("Dólar");
        } else if (chkIdiOc.isChecked() & chkMonOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("Dolar");
        } else if (chkMonOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("");
            txtMonOc.setText("Dolar");
        } else if (chkIdiOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("");
        } else if (chkCapOc.isChecked()) {
            txtCapOc.setText("Suva");
            txtIdiOc.setText("");
            txtMonOc.setText("");
        }
    }

    public void InfoTuvalu() {
        if (chkMonOc.isChecked() & chkIdiOc.isChecked() & chkCapOc.isChecked()) {
            txtCapOc.setText("Funafuti");
            txtIdiOc.setText("Tuvaluano");
            txtMonOc.setText("Dólar");
        } else if (chkCapOc.isChecked() & chkIdiOc.isChecked()) {
            txtCapOc.setText("Funafuti");
            txtIdiOc.setText("Tuvaluano");
            txtMonOc.setText("");
        } else if (chkCapOc.isChecked() & chkMonOc.isChecked()) {
            txtCapOc.setText("Funafuti");
            txtIdiOc.setText("");
            txtMonOc.setText("Dólar");
        } else if (chkIdiOc.isChecked() & chkMonOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("Tuvaluano");
            txtMonOc.setText("Dolar");
        } else if (chkMonOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("");
            txtMonOc.setText("Dolar");
        } else if (chkIdiOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("Tuvaluano");
            txtMonOc.setText("");
        } else if (chkCapOc.isChecked()) {
            txtCapOc.setText("Funafuti");
            txtIdiOc.setText("");
            txtMonOc.setText("");
        }
    }

    public void InfoAustralia() {
        if (chkMonOc.isChecked() & chkIdiOc.isChecked() & chkCapOc.isChecked()) {
            txtCapOc.setText("Camberra");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("Dólar");
        } else if (chkCapOc.isChecked() & chkIdiOc.isChecked()) {
            txtCapOc.setText("Camberra");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("");
        } else if (chkCapOc.isChecked() & chkMonOc.isChecked()) {
            txtCapOc.setText("Camberra");
            txtIdiOc.setText("");
            txtMonOc.setText("Dólar");
        } else if (chkIdiOc.isChecked() & chkMonOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("Dolar");
        } else if (chkMonOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("");
            txtMonOc.setText("Dolar");
        } else if (chkIdiOc.isChecked()) {
            txtCapOc.setText("");
            txtIdiOc.setText("Inglés");
            txtMonOc.setText("");
        } else if (chkCapOc.isChecked()) {
            txtCapOc.setText("Camberra");
            txtIdiOc.setText("");
            txtMonOc.setText("");
        }
    }

    public void Limpiar(View view)
    {
        chkCapOc.setChecked(false);
        chkIdiOc.setChecked(false);
        chkMonOc.setChecked(false);
        txtCapOc.setText("");
        txtIdiOc.setText("");
        txtMonOc.setText("");
        rdbFji.setChecked(false);
        rdbAus.setChecked(false);
        rdbTuvalu.setChecked(false);
        imgvOc.setImageResource(R.drawable.africam);
    }

    public void Inicio(View view)
    {
        Intent ini = new Intent(this, Continentes.class);
        startActivity(ini);
    }

}
