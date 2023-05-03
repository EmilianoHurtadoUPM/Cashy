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

public class Europa extends AppCompatActivity
{

    CheckBox chkCapE, chkIdiE, chkMonE;
    TextView txtCapE, txtIdiE, txtMonE;
    RadioButton rdbAle, rdbFra, rdbEsp;
    RadioGroup rdbgEur;
    ImageView imgvEur;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europa);

        chkCapE = findViewById(R.id.chkCapE);
        chkIdiE = findViewById(R.id.chkIdiE);
        chkMonE = findViewById(R.id.chkMonE);
        txtCapE = findViewById(R.id.txtCapE);
        txtIdiE = findViewById(R.id.txtIdiE);
        txtMonE = findViewById(R.id.txtMonE);
        rdbgEur = findViewById(R.id.rdbgEur);
        rdbEsp  = findViewById(R.id.rdbEsp);
        rdbFra  = findViewById(R.id.rdbFra);
        rdbAle  = findViewById(R.id.rdbAle);
        imgvEur = findViewById(R.id.imgvEur);

        rdbgEur.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.rdbAle: imgvEur.setImageResource(R.drawable.eualemaniab);
                        InfoAlemania(); break;

                    case R.id.rdbEsp: imgvEur.setImageResource(R.drawable.euespanab);
                        InfoEspaña(); break;

                    case R.id.rdbFra: imgvEur.setImageResource(R.drawable.eufranciab);
                        InfoFrancia(); break;
                }
            }
        });

    }

    public void InfoAlemania()
    {
        if (chkMonE.isChecked() & chkIdiE.isChecked() & chkCapE.isChecked())
        {
            txtCapE.setText("Berlín");
            txtIdiE.setText("Alemán");
            txtMonE.setText("Euro");
        }
        else if(chkCapE.isChecked() & chkIdiE.isChecked())
        {
            txtCapE.setText("Berlín");
            txtIdiE.setText("Alemán");
            txtMonE.setText("");
        }
        else if (chkCapE.isChecked() & chkMonE.isChecked())
        {
            txtCapE.setText("Berlín");
            txtIdiE.setText("");
            txtMonE.setText("Euro");
        }
        else if (chkIdiE.isChecked() & chkMonE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("Alemán");
            txtMonE.setText("Euro");
        }
        else if(chkMonE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("");
            txtMonE.setText("Euro");
        }
        else if (chkIdiE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("Alemán");
            txtMonE.setText("");
        }
        else if (chkCapE.isChecked())
        {
            txtCapE.setText("Berlín");
            txtIdiE.setText("");
            txtMonE.setText("");
        }
    }

    public void InfoEspaña()
    {
        if (chkMonE.isChecked() & chkIdiE.isChecked() & chkCapE.isChecked())
        {
            txtCapE.setText("Madrid");
            txtIdiE.setText("Español");
            txtMonE.setText("Euro");
        }
        else if(chkCapE.isChecked() & chkIdiE.isChecked())
        {
            txtCapE.setText("Madrid");
            txtIdiE.setText("Español");
            txtMonE.setText("");
        }
        else if (chkCapE.isChecked() & chkMonE.isChecked())
        {
            txtCapE.setText("Madrid");
            txtIdiE.setText("");
            txtMonE.setText("Euro");
        }
        else if (chkIdiE.isChecked() & chkMonE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("Español");
            txtMonE.setText("Euro");
        }
        else if(chkMonE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("");
            txtMonE.setText("Euro");
        }
        else if (chkIdiE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("Español");
            txtMonE.setText("");
        }
        else if (chkCapE.isChecked())
        {
            txtCapE.setText("Madrid");
            txtIdiE.setText("");
            txtMonE.setText("");
        }
    }

    public void InfoFrancia()
    {
        if (chkMonE.isChecked() & chkIdiE.isChecked() & chkCapE.isChecked())
        {
            txtCapE.setText("París");
            txtIdiE.setText("Francés");
            txtMonE.setText("Euro");
        }
        else if(chkCapE.isChecked() & chkIdiE.isChecked())
        {
            txtCapE.setText("París");
            txtIdiE.setText("Francés");
            txtMonE.setText("");
        }
        else if (chkCapE.isChecked() & chkMonE.isChecked())
        {
            txtCapE.setText("París");
            txtIdiE.setText("");
            txtMonE.setText("Euro");
        }
        else if (chkIdiE.isChecked() & chkMonE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("Francés");
            txtMonE.setText("Euro");
        }
        else if(chkMonE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("");
            txtMonE.setText("Euro");
        }
        else if (chkIdiE.isChecked())
        {
            txtCapE.setText("");
            txtIdiE.setText("Francés");
            txtMonE.setText("");
        }
        else if (chkCapE.isChecked())
        {
            txtCapE.setText("París");
            txtIdiE.setText("");
            txtMonE.setText("");
        }
    }

    public void Limpiar(View view)
    {
        chkCapE.setChecked(false);
        chkIdiE.setChecked(false);
        chkMonE.setChecked(false);
        txtCapE.setText("");
        txtIdiE.setText("");
        txtMonE.setText("");
        rdbAle.setChecked(false);
        rdbEsp.setChecked(false);
        rdbFra.setChecked(false);
        imgvEur.setImageResource(R.drawable.europam);
    }

    public void Inicio(View view)
    {
        Intent ini = new Intent(this, Continentes.class);
        startActivity(ini);
    }
}
