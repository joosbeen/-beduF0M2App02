package com.example.app.f0m2app02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviarMensaje;
    private EditText edtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviarMensaje = findViewById(R.id.btnEnviarMensaje);
        edtMensaje = findViewById(R.id.edtMensaje);

        btnEnviarMensaje.setOnClickListener(this::onClickEnviar);

    }

    private void onClickEnviar(View v) {

        String mensaje = edtMensaje.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("mensaje", mensaje);
        startActivity(intent);

    }

    public void btnOnOpenActivity(View view) {

        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}