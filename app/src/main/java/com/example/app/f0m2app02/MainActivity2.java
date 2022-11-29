package com.example.app.f0m2app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView lblMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lblMensaje = findViewById(R.id.lblMensaje);
        String mensaje = getIntent().getStringExtra("mensaje");
        lblMensaje.setText(mensaje);
    }
}