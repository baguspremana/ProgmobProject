package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.user_pc.tugasbesar.Adapter.JuaraAdapter;
import com.example.user_pc.tugasbesar.Models.HomeJuara;

import java.util.ArrayList;
import java.util.List;

public class MainActivityJuara extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    List<HomeJuara> listJuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juara);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("JUARA TAHUN SEBELUMNYA | IT-ESEGA");

        recyclerView = (RecyclerView) findViewById(R.id.rvJuara);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listJuara = new ArrayList<>();

        ListJuara();
    }

    public void ListJuara() {
        listJuara.add(new HomeJuara(R.drawable.logo_juara_a, "IT-ESEGA 2015", "Team A"));
        listJuara.add(new HomeJuara(R.drawable.logo_juara_b, "IT-ESEGA 2016", "Team B"));
        listJuara.add(new HomeJuara(R.drawable.logo_juara_c, "IT-ESEGA 2017", "Team C"));

        loadRecyclerViewJuara();
    }

    public void loadRecyclerViewJuara() {
        adapter = new JuaraAdapter(listJuara, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Intent intent = new Intent(MainActivityJuara.this, MainActivityHome.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }

    }
}
