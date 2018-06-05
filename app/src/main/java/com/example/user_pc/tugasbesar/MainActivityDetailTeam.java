package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

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

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

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
                listTeam.add(new DetailTeam(R.drawable.logo_a, R.drawable.tim_a, "Team A",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 1:
                listTeam.add(new DetailTeam(R.drawable.logo_b, R.drawable.tim_b, "Team B",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 2:
                listTeam.add(new DetailTeam(R.drawable.logo_c, R.drawable.tim_c, "Team C",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 3:
                listTeam.add(new DetailTeam(R.drawable.logo_d, R.drawable.tim_d, "Team D",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 4:
                listTeam.add(new DetailTeam(R.drawable.logo_e, R.drawable.tim_e, "Team E",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 5:
                listTeam.add(new DetailTeam(R.drawable.logo_f, R.drawable.tim_f, "Team F",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 6:
                listTeam.add(new DetailTeam(R.drawable.logo_g, R.drawable.tim_g, "Team G",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 7:
                listTeam.add(new DetailTeam(R.drawable.logo_h, R.drawable.tim_h, "Team H",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 8:
                listTeam.add(new DetailTeam(R.drawable.logo_i, R.drawable.tim_i, "Team I",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 9:
                listTeam.add(new DetailTeam(R.drawable.logo_j, R.drawable.tim_j, "Team J",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 10:
                listTeam.add(new DetailTeam(R.drawable.logo_k, R.drawable.tim_k, "Team K",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 11:
                listTeam.add(new DetailTeam(R.drawable.logo_l, R.drawable.tim_l, "Team L",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 12:
                listTeam.add(new DetailTeam(R.drawable.logo_m, R.drawable.tim_m, "Team M",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 13:
                listTeam.add(new DetailTeam(R.drawable.logo_n, R.drawable.tim_n, "Team N",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Support",
                        R.drawable.anggota, "Nyoman", "Carry",
                        R.drawable.anggota, "Putu", "Fielder",
                        R.drawable.anggota, "Ketut", "Belakang"));
                break;
            case 14:
                listTeam.add(new DetailTeam(R.drawable.logo_o, R.drawable.tim_o, "Team O",
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Intent intent = new Intent(MainActivityDetailTeam.this, MainActivityTeam.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }

    }

}
