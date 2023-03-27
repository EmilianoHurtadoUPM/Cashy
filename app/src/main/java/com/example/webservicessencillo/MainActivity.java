package com.example.webservicessencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7, e8;
Button b, mostrar, buscar;

RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relacionamosVistas();

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            e1.setText("");
            e2.setText("");
            e3.setText("");
            e4.setText("");
            e5.setText("");
            e6.setText("");
            e7.setText("");
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarUsuarios("http://192.168.1.84/php2/buscar_producto.php?id="+e7.getText()+"");
            }
        });
    }
    public void relacionamosVistas(){
        e1=(EditText)findViewById(R.id.nombre);
        e2=(EditText)findViewById(R.id.usuario);
        e3=(EditText)findViewById(R.id.password);
        e4=(EditText)findViewById(R.id.direccion);
        e5=(EditText)findViewById(R.id.telefono);
        e6=(EditText)findViewById(R.id.correo);
        e7=(EditText)findViewById(R.id.id);
        b=(Button) findViewById(R.id.acceso);
        mostrar=(Button)findViewById(R.id.mostrar);
        buscar = (Button)findViewById(R.id.btnBuscar);
    }

    public void validar(View v){

        final String nombre=e1.getText().toString();
        final String usuario=e2.getText().toString();
        final String password=e3.getText().toString();
        final String direccion=e4.getText().toString();
        final String telefono=e5.getText().toString();
        final String correo=e6.getText().toString();

        String url="http://192.168.1.84/php2/ingreso.php?nombre="+nombre+"&usuario="+usuario+"&password="+password+"&direccion="+direccion+"&telefono="+telefono+"&correo="+correo;
        RequestQueue servicio= Volley.newRequestQueue(this);
        StringRequest respuesta=new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(),
                        response,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Login11.class);
                startActivity(intent);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),
                        "Error comunicación",Toast.LENGTH_SHORT).show();
            }
        });
        servicio.add(respuesta);


    }

    public void buscarUsuarios(String URL){
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        e1.setText(jsonObject.getString("nombre"));
                        e2.setText(jsonObject.getString("usuario"));
                        e3.setText(jsonObject.getString("password"));
                        e4.setText(jsonObject.getString("direccion"));
                        e5.setText(jsonObject.getString("telefono"));
                        e6.setText(jsonObject.getString("correo"));

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



    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, Login2.class);
        startActivity(regresar);
    }


}
