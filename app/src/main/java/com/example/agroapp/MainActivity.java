package com.example.agroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registroUsuario(View view){
        //Intent cambio = new Intent(this, FormularioRegistro.class);
        Intent cambio = new Intent(this, Vendedor.class);
        startActivity(cambio);
    }
}