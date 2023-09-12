package com.carlos.mi_votacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int cedula;
    String nombre;
    String fecha;
    int voto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);

        enviarDatos.putExtra("nombre", nombre);
        enviarDatos.putExtra("cedula", cedula);
        enviarDatos.putExtra("fecha", fecha);
        enviarDatos.putExtra("voto", voto);
        startActivity(enviarDatos);
    }
}