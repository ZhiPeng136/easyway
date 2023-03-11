package com.example.easyway;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class ShowRoutesActivity extends AppCompatActivity {

    List<Ruta> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_routes);
        RutaAdapter rutaAdapter = new RutaAdapter(ListRutaSingleton.getInstance().getRutas(),this);
        RecyclerView recyclerView = findViewById(R.id.recycleInfoRuta);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(rutaAdapter);
    }
}