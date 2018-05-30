package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.user_pc.tugasbesar.Adapter.TeamAdapter;
import com.example.user_pc.tugasbesar.Models.HomeTeam;

import java.util.ArrayList;
import java.util.List;

public class MainActivityTeam extends AppCompatActivity {

//    private CardView team1,team2,team3,team4;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    List<HomeTeam> lisTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_team);

        getSupportActionBar().setTitle("LIST TEAM | IT-ESEGA");

        recyclerView = (RecyclerView) findViewById(R.id.rvTeam);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lisTeam = new ArrayList<>();

        ListTeam();

        //intent to detail team layout
        /*team1 = (CardView) findViewById(R.id.team1);
        team2 = (CardView) findViewById(R.id.team2);
        team3 = (CardView) findViewById(R.id.team3);
        team4 = (CardView) findViewById(R.id.team4);

        team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_team1 = new Intent(getApplicationContext(),MainActivityDetailTeam.class);
                startActivity(view_detail_team1);
            }
        });

        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_team2 = new Intent(getApplicationContext(),MainActivityDetailTeam.class);
                startActivity(view_detail_team2);
            }
        });

        team3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_team3 = new Intent(getApplicationContext(),MainActivityDetailTeam.class);
                startActivity(view_detail_team3);
            }
        });
        team4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_item4 = new Intent(getApplicationContext(),MainActivityDetailTeam.class);
                startActivity(view_detail_item4);
            }
        });*/

    }

    public void ListTeam() {
        lisTeam.add(new HomeTeam(R.drawable.juara, "Team A"));
        lisTeam.add(new HomeTeam(R.drawable.juara, "Team B"));
        lisTeam.add(new HomeTeam(R.drawable.juara, "Team C"));
        lisTeam.add(new HomeTeam(R.drawable.juara, "Team D"));
        lisTeam.add(new HomeTeam(R.drawable.juara, "Team E"));

        loadRecyclerView();
    }

    public void loadRecyclerView() {
        adapter = new TeamAdapter(lisTeam, this);
        recyclerView.setAdapter(adapter);
    }
}
