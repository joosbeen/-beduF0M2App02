package com.example.app.f0m2app02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.app.f0m2app02.adapters.ItemAdapter;
import com.example.app.f0m2app02.data.Datasource;
import com.example.app.f0m2app02.model.Planta;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        List<Planta> plantas = new Datasource().data();


            mRecyclerView = findViewById(R.id.recycler_view);
            // Esta línea mejora el rendimiento, si sabemos que el contenido
            // no va a afectar al tamaño del RecyclerView
            mRecyclerView.setHasFixedSize(true);

            // Nuestro RecyclerView usará un linear layout manager
            LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
            mRecyclerView.setLayoutManager(layoutManager);

            // Asociamos un adapter (ver más adelante cómo definirlo)
            mAdapter = new ItemAdapter(plantas);
            mRecyclerView.setAdapter(mAdapter);
            /*
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            ItemAdapter fragment = new ItemAdapter(plantas);
            transaction.replace(R.id.recycler_view, fragment);
            transaction.commit();
            */


    }
}