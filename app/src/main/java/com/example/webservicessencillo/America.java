package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;




public class America extends AppCompatActivity
{

    CheckBox chkCapA, chkIdiA, chkMonA;
    TextView txtCapA, txtIdiA, txtMonA;
    RadioButton rdbBra, rdbChi, rdbMex;
    RadioGroup rdbgAme;
    ImageView imgvAme;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);

        chkCapA = findViewById(R.id.chkCapA);
        chkIdiA = findViewById(R.id.chkIdiA);
        chkMonA = findViewById(R.id.chkMonA);
        txtCapA = findViewById(R.id.txtCapA);
        txtIdiA = findViewById(R.id.txtIdiA);
        txtMonA = findViewById(R.id.txtMonA);
        rdbgAme = findViewById(R.id.rdbgAme);
        rdbBra  = findViewById(R.id.rdbBra);
        rdbChi  = findViewById(R.id.rdbChi);
        rdbMex  = findViewById(R.id.rdbMex);
        imgvAme = findViewById(R.id.imgvAme);

        rdbgAme.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.rdbMex: imgvAme.setImageResource(R.drawable.ammexicob);
                        InfoMexico(); break;

                    case R.id.rdbBra: imgvAme.setImageResource(R.drawable.ambrasilb);
                        InfoBrasil(); break;

                    case R.id.rdbChi: imgvAme.setImageResource(R.drawable.amchileb);
                        InfoChile(); break;
                }
            }
        });

    }

    public void InfoMexico()
    {
        if (chkMonA.isChecked() & chkIdiA.isChecked() & chkCapA.isChecked())
        {
            txtCapA.setText("Ciudad de México");
            txtIdiA.setText("Español");
            txtMonA.setText("Peso");
        }
        else if(chkCapA.isChecked() & chkIdiA.isChecked())
        {
            txtCapA.setText("Ciudad de México");
            txtIdiA.setText("Español");
            txtMonA.setText("");
        }
        else if (chkCapA.isChecked() & chkMonA.isChecked())
        {
            txtCapA.setText("Ciudad de México");
            txtIdiA.setText("");
            txtMonA.setText("Peso");
        }
        else if (chkIdiA.isChecked() & chkMonA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("Español");
            txtMonA.setText("Peso");
        }
        else if(chkMonA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("");
            txtMonA.setText("Peso");
        }
        else if (chkIdiA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("Español");
            txtMonA.setText("");
        }
        else if (chkCapA.isChecked())
        {
            txtCapA.setText("Ciudad de México");
            txtIdiA.setText("");
            txtMonA.setText("");
        }
    }

    public void InfoBrasil()
    {
        if (chkMonA.isChecked() & chkIdiA.isChecked() & chkCapA.isChecked())
        {
            txtCapA.setText("Brasilia");
            txtIdiA.setText("Portugues");
            txtMonA.setText("Real Brasileño");
        }
        else if(chkCapA.isChecked() & chkIdiA.isChecked())
        {
            txtCapA.setText("Brasilia");
            txtIdiA.setText("Portugues");
            txtMonA.setText("");
        }
        else if (chkCapA.isChecked() & chkMonA.isChecked())
        {
            txtCapA.setText("Brasilia");
            txtIdiA.setText("");
            txtMonA.setText("Real Brasileño");
        }
        else if (chkIdiA.isChecked() & chkMonA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("Portugues");
            txtMonA.setText("Real Brasileño");
        }
        else if(chkMonA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("");
            txtMonA.setText("Real Brasileño");
        }
        else if (chkIdiA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("Portugues");
            txtMonA.setText("");
        }
        else if (chkCapA.isChecked())
        {
            txtCapA.setText("Brasilia");
            txtIdiA.setText("");
            txtMonA.setText("");
        }
    }

    public void InfoChile()
    {
        if (chkMonA.isChecked() & chkIdiA.isChecked() & chkCapA.isChecked())
        {
            txtCapA.setText("Santiago de Chile");
            txtIdiA.setText("Español");
            txtMonA.setText("Peso Chileno");
        }
        else if(chkCapA.isChecked() & chkIdiA.isChecked())
        {
            txtCapA.setText("Santiago de Chile");
            txtIdiA.setText("Español");
            txtMonA.setText("");
        }
        else if (chkCapA.isChecked() & chkMonA.isChecked())
        {
            txtCapA.setText("Santiago de Chile");
            txtIdiA.setText("");
            txtMonA.setText("Peso Chileno");
        }
        else if (chkIdiA.isChecked() & chkMonA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("Español");
            txtMonA.setText("Peso Chileno");
        }
        else if(chkMonA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("");
            txtMonA.setText("Peso Chileno");
        }
        else if (chkIdiA.isChecked())
        {
            txtCapA.setText("");
            txtIdiA.setText("Español");
            txtMonA.setText("");
        }
        else if (chkCapA.isChecked())
        {
            txtCapA.setText("Santiago de Chile");
            txtIdiA.setText("");
            txtMonA.setText("");
        }
    }

    public void Limpiar(View view)
    {
        chkCapA.setChecked(false);
        chkIdiA.setChecked(false);
        chkMonA.setChecked(false);
        txtCapA.setText("");
        txtIdiA.setText("");
        txtMonA.setText("");
        rdbBra.setChecked(false);
        rdbChi.setChecked(false);
        rdbMex.setChecked(false);
        imgvAme.setImageResource(R.drawable.americam);
    }

    public void Inicio(View view)
    {
        Intent ini = new Intent(this, Continentes.class);
        startActivity(ini);
    }
}
