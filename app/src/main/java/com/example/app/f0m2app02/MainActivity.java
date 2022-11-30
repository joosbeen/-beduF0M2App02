package com.example.app.f0m2app02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
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

        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_menu, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_menu_temperatura:
                // Action goes here
                Intent intent = new Intent(this, Temperatura.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        //return super.onOptionsItemSelected(item);
    }
}