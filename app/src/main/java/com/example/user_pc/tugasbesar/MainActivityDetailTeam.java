package com.example.user_pc.tugasbesar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user_pc.tugasbesar.Adapter.DetailTeamAdapter;
import com.example.user_pc.tugasbesar.Models.DetailTeam;

import java.util.ArrayList;
import java.util.List;

public class MainActivityDetailTeam extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    int position;
    List<DetailTeam> listTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_team_detail);

        getSupportActionBar().setTitle("DETAIL TEAM | IT-ESEGA");

        recyclerView = (RecyclerView) findViewById(R.id.rv_detail_team);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        position = getIntent().getIntExtra("position", 0);
        listTeam = new ArrayList<>();

        ListTeamDetail();
    }

    public void ListTeamDetail() {
        switch (position){
            case 0:
                listTeam.add(new DetailTeam(R.drawable.btn1, R.drawable.btn1, "Team A",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 1:
                listTeam.add(new DetailTeam(R.drawable.btn1, R.drawable.btn1, "Team B",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 2:
                listTeam.add(new DetailTeam(R.drawable.btn1, R.drawable.btn1, "Team C",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 3:
                listTeam.add(new DetailTeam(R.drawable.btn1, R.drawable.btn1, "Team D",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 4:
                listTeam.add(new DetailTeam(R.drawable.btn1, R.drawable.btn1, "Team E",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            default:
        }
        loadRecyclerView();
    }

    public void loadRecyclerView() {
        adapter = new DetailTeamAdapter(listTeam, this);
        recyclerView.setAdapter(adapter);
    }

}
