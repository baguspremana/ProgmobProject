package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.example.user_pc.tugasbesar.Adapter.TeamAdapter;
import com.example.user_pc.tugasbesar.Models.HomeTeam;

import java.util.ArrayList;
import java.util.List;

public class MainActivityTeam extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    List<HomeTeam> lisTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_team);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("LIST TEAM | IT-ESEGA");

        recyclerView = (RecyclerView) findViewById(R.id.rvTeam);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lisTeam = new ArrayList<>();

        ListTeam();

    }

    public void ListTeam() {
        lisTeam.add(new HomeTeam(R.drawable.logo_a, "Team A"));
        lisTeam.add(new HomeTeam(R.drawable.logo_b, "Team B"));
        lisTeam.add(new HomeTeam(R.drawable.logo_c, "Team C"));
        lisTeam.add(new HomeTeam(R.drawable.logo_d, "Team D"));
        lisTeam.add(new HomeTeam(R.drawable.logo_e, "Team E"));
        lisTeam.add(new HomeTeam(R.drawable.logo_f, "Team F"));
        lisTeam.add(new HomeTeam(R.drawable.logo_g, "Team G"));
        lisTeam.add(new HomeTeam(R.drawable.logo_h, "Team H"));
        lisTeam.add(new HomeTeam(R.drawable.logo_i, "Team I"));
        lisTeam.add(new HomeTeam(R.drawable.logo_j, "Team J"));
        lisTeam.add(new HomeTeam(R.drawable.logo_k, "Team K"));
        lisTeam.add(new HomeTeam(R.drawable.logo_l, "Team L"));
        lisTeam.add(new HomeTeam(R.drawable.logo_m, "Team M"));
        lisTeam.add(new HomeTeam(R.drawable.logo_n, "Team N"));
        lisTeam.add(new HomeTeam(R.drawable.logo_o, "Team O"));

        loadRecyclerView();
    }

    public void loadRecyclerView() {
        adapter = new TeamAdapter(lisTeam, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Intent intent = new Intent(MainActivityTeam.this, MainActivityHome.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }

    }
}
