package com.example.webservicessencillo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CajaAhorro extends AppCompatActivity {
    private EditText txteUsuarioo, txteAhorros;
    private Button btnActualizar;
    private TextView txtDA;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja_ahorro);

        txteUsuarioo = findViewById(R.id.txteUsuarioo);
        txteAhorros = findViewById(R.id.txteAhorros);
        btnActualizar = findViewById(R.id.button6);
        txtDA = findViewById(R.id.txtDA);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = txteUsuarioo.getText().toString();
                int dineroIntroducido = Integer.parseInt(txteAhorros.getText().toString());

                DatabaseReference usuarioRef = mDatabase.child("users").child(nombreUsuario);

                usuarioRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            int dineroActual = snapshot.getValue(Integer.class);
                            int dineroTotal = dineroActual + dineroIntroducido;
                            usuarioRef.setValue(dineroTotal);
                        } else {
                            usuarioRef.setValue(dineroIntroducido);
                        }
                        usuarioRef.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                int dineroTotal = snapshot.getValue(Integer.class);
                                txtDA.setText("" + dineroTotal);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {
                                Log.d("Firebase", "Error al leer el valor.", error.toException());
                            }
                        });
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Log.d("Firebase", "Error al leer el valor.", error.toException());
                    }
                });
            }
        });
    }
}