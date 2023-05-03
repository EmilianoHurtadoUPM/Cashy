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

public class Asia extends AppCompatActivity
{

    RadioGroup rdbgAsi;
    RadioButton rdbChin, rdbJap, rdbSin;
    CheckBox chkMonAs, chkIdiAs, chkCapAs;
    TextView txtMonAs, txtIdiAs, txtCapAs;
    ImageView imgvAsi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        chkCapAs = findViewById(R.id.chkCapAs);
        chkIdiAs = findViewById(R.id.chkIdiAs);
        chkMonAs = findViewById(R.id.chkMonAs);
        txtCapAs = findViewById(R.id.txtCapAs);
        txtIdiAs = findViewById(R.id.txtIdiAs);
        txtMonAs = findViewById(R.id.txtMonAs);
        rdbgAsi  = findViewById(R.id.rdbgAsi);
        rdbChin  = findViewById(R.id.rdbChin);
        rdbJap   = findViewById(R.id.rdbJap);
        rdbSin   = findViewById(R.id.rdbSin);
        imgvAsi  = findViewById(R.id.imgvAsi);

        rdbgAsi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId) {
                    case R.id.rdbChin:
                        imgvAsi.setImageResource(R.drawable.aschinab);
                        InfoChina(); break;
                    case R.id.rdbJap:
                        imgvAsi.setImageResource(R.drawable.asjaponb);
                        InfoJapon();   break;
                    case R.id.rdbSin:
                        imgvAsi.setImageResource(R.drawable.assingapurb);
                        InfoSingapur();
                        break;
                }
            }
        });
    }

    public void InfoChina() {
        if (chkMonAs.isChecked() & chkIdiAs.isChecked() & chkCapAs.isChecked()) {
            txtCapAs.setText("Pekín");
            txtIdiAs.setText("Chino");
            txtMonAs.setText("Renminbi");
        } else if (chkCapAs.isChecked() & chkIdiAs.isChecked()) {
            txtCapAs.setText("Pekín");
            txtIdiAs.setText("Chino");
            txtMonAs.setText("");
        } else if (chkCapAs.isChecked() & chkMonAs.isChecked()) {
            txtCapAs.setText("Pekín");
            txtIdiAs.setText("");
            txtMonAs.setText("Renminbi");
        } else if (chkIdiAs.isChecked() & chkMonAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("Chino");
            txtMonAs.setText("Renminbi");
        } else if (chkMonAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("");
            txtMonAs.setText("Renminbi");
        } else if (chkIdiAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("Chino");
            txtMonAs.setText("");
        } else if (chkCapAs.isChecked()) {
            txtCapAs.setText("Pekín");
            txtIdiAs.setText("");
            txtMonAs.setText("");
        }
    }
    public void InfoJapon() {
        if (chkMonAs.isChecked() & chkIdiAs.isChecked() & chkCapAs.isChecked()) {
            txtCapAs.setText("Tokio");
            txtIdiAs.setText("Japonés");
            txtMonAs.setText("Yen");
        } else if (chkCapAs.isChecked() & chkIdiAs.isChecked()) {
            txtCapAs.setText("Tokio");
            txtIdiAs.setText("Japonés");
            txtMonAs.setText("");
        } else if (chkCapAs.isChecked() & chkMonAs.isChecked()) {
            txtCapAs.setText("Tokio");
            txtIdiAs.setText("");
            txtMonAs.setText("Yen");
        } else if (chkIdiAs.isChecked() & chkMonAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("Japonés");
            txtMonAs.setText("Yen");
        } else if (chkMonAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("");
            txtMonAs.setText("Yen");
        } else if (chkIdiAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("Japonés");
            txtMonAs.setText("");
        } else if (chkCapAs.isChecked()) {
            txtCapAs.setText("Tokio");
            txtIdiAs.setText("");
            txtMonAs.setText("");
        }
    }
    public void InfoSingapur() {
        if (chkMonAs.isChecked() & chkIdiAs.isChecked() & chkCapAs.isChecked()) {
            txtCapAs.setText("Singapur");
            txtIdiAs.setText("Inglés");
            txtMonAs.setText("Dólar");
        } else if (chkCapAs.isChecked() & chkIdiAs.isChecked()) {
            txtCapAs.setText("Singapur");
            txtIdiAs.setText("Inglés");
            txtMonAs.setText("");
        } else if (chkCapAs.isChecked() & chkMonAs.isChecked()) {
            txtCapAs.setText("Singapur");
            txtIdiAs.setText("");
            txtMonAs.setText("Dólar");
        } else if (chkIdiAs.isChecked() & chkMonAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("Inglés");
            txtMonAs.setText("Dólar");
        } else if (chkMonAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("");
            txtMonAs.setText("Dólar");
        } else if (chkIdiAs.isChecked()) {
            txtCapAs.setText("");
            txtIdiAs.setText("Inglés");
            txtMonAs.setText("");
        } else if (chkCapAs.isChecked()) {
            txtCapAs.setText("Singapur");
            txtIdiAs.setText("");
            txtMonAs.setText("");
        }
    }

    public void Limpiar(View view)
    {
        chkCapAs.setChecked(false);
        chkIdiAs.setChecked(false);
        chkMonAs.setChecked(false);
        txtCapAs.setText("");
        txtIdiAs.setText("");
        txtMonAs.setText("");
        rdbChin.setChecked(false);
        rdbJap.setChecked(false);
        rdbSin.setChecked(false);
        imgvAsi.setImageResource(R.drawable.asiam);
    }

    public void Inicio(View view)
    {
        Intent ini = new Intent(this, Continentes.class);
        startActivity(ini);
    }
}
