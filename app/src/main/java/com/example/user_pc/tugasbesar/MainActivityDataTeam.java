package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.user_pc.tugasbesar.Adapter.DataTeamAdapter;
import com.example.user_pc.tugasbesar.Models.DataTeam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivityDataTeam extends AppCompatActivity {

    List<DataTeam> dataTeams = new ArrayList<>();
    private static final String ARRAYLIST_MY_TEAM_EXTRA = "ARRAY_MY_TEAM";
    RecyclerView rvMyTeam;
    DataTeamAdapter myTeamAdapter;
    TextView myTeamKosong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_data_team);

        rvMyTeam = findViewById(R.id.rv_data_tim);
        myTeamKosong = findViewById(R.id.tv_team_kosong);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LIHAT DATA TIM | IT-ESEGA");

        dataTeams = (ArrayList<DataTeam>)getIntent().getSerializableExtra(ARRAYLIST_MY_TEAM_EXTRA);

        if (dataTeams.size() == 0){
            myTeamKosong.setText("Anda belum mendaftarkan tim anda");
        }

        myTeamAdapter = new DataTeamAdapter();
        myTeamAdapter.setDataTeams(dataTeams);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvMyTeam.setLayoutManager(linearLayoutManager);
        rvMyTeam.setAdapter(myTeamAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            Intent intent = new Intent(MainActivityDataTeam.this, MainActivityRegisterTim.class);
            intent.putExtra(ARRAYLIST_MY_TEAM_EXTRA, (Serializable) dataTeams);
            finish();
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MainActivityDataTeam.this, MainActivityRegisterTim.class);
        intent.putExtra(ARRAYLIST_MY_TEAM_EXTRA, (Serializable) dataTeams);
        finish();
    }
}
