package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.user_pc.tugasbesar.Adapter.JuaraAdapter;
import com.example.user_pc.tugasbesar.Models.HomeJuara;

import java.util.ArrayList;
import java.util.List;

public class MainActivityJuara extends AppCompatActivity {

//    private Button btn2015,btn2016,btn2017;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    List<HomeJuara> listJuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juara);

        getSupportActionBar().setTitle("JUARA TAHUN SEBELUMNYA | IT-ESEGA");

        recyclerView = (RecyclerView) findViewById(R.id.rvJuara);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listJuara = new ArrayList<>();

        ListJuara();

        /*btn2015 = (Button) findViewById(R.id.btn2015);
        btn2016 = (Button) findViewById(R.id.btn2016);
        btn2017 = (Button) findViewById(R.id.btn2017);

        btn2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_juara2015 = new Intent(getApplicationContext(),MainActivityJuaraDetail.class);
                startActivity(view_detail_juara2015);
            }
        });
        btn2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_juara2016 = new Intent(getApplicationContext(),MainActivityJuaraDetail.class);
                startActivity(view_detail_juara2016);
            }
        });

        btn2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_juara2017 = new Intent(getApplicationContext(),MainActivityJuaraDetail.class);
                startActivity(view_detail_juara2017);
            }
        });*/
    }

    public void ListJuara() {
        listJuara.add(new HomeJuara(R.drawable.juara, "IT-ESEGA 2015", "Team A"));
        listJuara.add(new HomeJuara(R.drawable.juara, "IT-ESEGA 2016", "Team B"));
        listJuara.add(new HomeJuara(R.drawable.juara, "IT-ESEGA 2017", "Team C"));

        loadRecyclerViewJuara();
    }

    public void loadRecyclerViewJuara() {
        adapter = new JuaraAdapter(listJuara, this);
        recyclerView.setAdapter(adapter);
    }
}
