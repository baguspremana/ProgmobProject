package com.example.user_pc.tugasbesar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user_pc.tugasbesar.Adapter.DetailJuaraAdapter;
import com.example.user_pc.tugasbesar.Models.DetailJuara;

import java.util.ArrayList;
import java.util.List;

public class MainActivityJuaraDetail extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    int position;
    List<DetailJuara> listJuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_juara_detail);

        getSupportActionBar().setTitle("DETAIL JUARA SEBELUMNYA | IT-ESEGA");

        /*recyclerView = (RecyclerView) findViewById(R.id.rv_detail_team);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        position = getIntent().getIntExtra("position", 0);
        listJuara = new ArrayList<>();

        JuaraDetail();*/
    }

    /*public void JuaraDetail() {
        switch (position){
            case 0:
                listJuara.add(new DetailJuara(R.drawable.juara, R.drawable.btn1, "Juara IT-ESEGA 2015", "Team A",
                        "Agus", "Tingker","Wayan", "Depan",
                        "Made", "Belakang", "Nyoman", "Samping",
                        "Ketut", "Samping"));
                break;
            case 1:
                listJuara.add(new DetailJuara(R.drawable.juara, R.drawable.btn1, "Juara IT-ESEGA 2016", "Team B",
                        "Agus", "Tingker","Wayan", "Depan",
                        "Made", "Belakang", "Nyoman", "Samping",
                        "Ketut", "Samping"));
                break;
            case 2:
                listJuara.add(new DetailJuara(R.drawable.juara, R.drawable.btn1, "Juara IT-ESEGA 2017", "Team C",
                        "Agus", "Tingker","Wayan", "Depan",
                        "Made", "Belakang", "Nyoman", "Samping",
                        "Ketut", "Samping"));
                break;
            default:
        }
        loadJuara();
    }

    public void loadJuara() {
        adapter = new DetailJuaraAdapter(listJuara, this);
        recyclerView.setAdapter(adapter);
    }*/

}
