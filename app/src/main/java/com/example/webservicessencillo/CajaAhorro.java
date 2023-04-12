package com.example.webservicessencillo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CajaAhorro extends AppCompatActivity {

    EditText txteAhorros, txtePasswordd, txteUsuarioo;
    Button btnActualizar;
    TextView txtDA;
    int acu=0, acu2;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       /* btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarAhorros("http://192.168.1.84/php2/buscar_ahorros.php?usuario="+txteUsuarioo.getText()+"&password="+txtePasswordd.getText()+"");
            }
        });*/

    }

    public void Insertar (View view){
        acu=Integer.parseInt(txteAhorros.getText().toString());
        acu2=acu2+acu;
        txtDA.setText(""+acu2);
    }



    /*public void Insertar(View view)
    {
        final String ahorros=txteAhorros.getText().toString().trim();
        final String usuario=txteUsuarioo.getText().toString();
        final String password=txtePasswordd.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.GET,"http://192.168.1.84/php2/actualizar.php?ahorro="+txteAhorros.getText()+"&usuario="+txteUsuarioo.getText()+"&password="+txtePasswordd.getText()+"" , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(CajaAhorro.this, "Cantidad aceptada", Toast.LENGTH_LONG).show();


            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(CajaAhorro.this, error.toString(), Toast.LENGTH_LONG).show();
            }
        }) {
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("ahorros",ahorros);

                return parametros;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void buscarAhorros(String URL){
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        txtDA.setText(jsonObject.getString("ahorros"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error de Conexión", Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);



    }*/


}