package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;;import com.example.user_pc.tugasbesar.Adapter.DetailJuaraAdapter;
import com.example.user_pc.tugasbesar.Models.DetailTeamJuara;

import java.util.ArrayList;
import java.util.List;

public class MainActivityJuaraDetail extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    int position;
    List<DetailTeamJuara> listTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_juara_detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("DETAIL JUARA SEBELUMNYA | IT-ESEGA");

        recyclerView = (RecyclerView) findViewById(R.id.rv_detail_juara);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        position = getIntent().getIntExtra("position", 0);
        listTeam = new ArrayList<>();

        LisTeamDetail();
    }

    public void LisTeamDetail() {
        switch (position){
            case 0:
                listTeam.add(new DetailTeamJuara(R.drawable.logo_juara_a, R.drawable.tim_a, "Juara IT-ESEGA 2015", "Team A",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Depan",
                        R.drawable.anggota, "Made", "Belakang",
                        R.drawable.anggota, "Nyoman", "Samping",
                        R.drawable.anggota, "Ketut", "Samping"));
                break;
            case 1:
                listTeam.add(new DetailTeamJuara(R.drawable.logo_juara_b, R.drawable.tim_b, "Juara IT-ESEGA 2016", "Team A",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Depan",
                        R.drawable.anggota, "Made", "Belakang",
                        R.drawable.anggota, "Nyoman", "Samping",
                        R.drawable.anggota, "Ketut", "Samping"));
                break;
            case 2:
                listTeam.add(new DetailTeamJuara(R.drawable.logo_juara_c, R.drawable.tim_c, "Juara IT-ESEGA 2017", "Team A",
                        R.drawable.anggota, "Agus", "Tingker",
                        R.drawable.anggota, "Wayan", "Depan",
                        R.drawable.anggota, "Made", "Belakang",
                        R.drawable.anggota, "Nyoman", "Samping",
                        R.drawable.anggota, "Ketut", "Samping"));
                break;
            default:
        }
        loadRecyclerView();
    }

    public void loadRecyclerView() {
        adapter = new DetailJuaraAdapter(listTeam, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Intent intent = new Intent(MainActivityJuaraDetail.this, MainActivityJuara.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }

    }

}
