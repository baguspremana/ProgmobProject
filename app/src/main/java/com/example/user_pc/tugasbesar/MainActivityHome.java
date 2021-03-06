package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.user_pc.tugasbesar.Models.DataTeam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivityHome extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mToggle;
    private CardView daftarkanTim;

    List<DataTeam> myTeam = new ArrayList<>();
    private static final String ARRAYLIST_MY_TEAM_EXTRA = "ARRAY_MY_TEAM";

    //variabel spinner dan array-nya
    Spinner posisi1,posisi2,posisi3,posisi4,posisi5;
    String[] stringposisi1,stringposisi2,stringposisi3,stringposisi4,stringposisi5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawer, R.string.open, R.string.close);
        mDrawer.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Intent to layout halaman daftarkan tim
        daftarkanTim = (CardView)findViewById(R.id.daftarkanTim);
        daftarkanTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftarTim = new Intent(getApplicationContext(),MainActivityRegisterTim.class);
                startActivity(daftarTim);
            }
        });

        //Intent to layout halaman jadwal
        daftarkanTim = (CardView)findViewById(R.id.lihatJadwal);
        daftarkanTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatJadwal = new Intent(getApplicationContext(),MainActivitySchedule.class);
                startActivity(lihatJadwal);
            }
        });

        //Intent to layout halaman Team
        daftarkanTim = (CardView)findViewById(R.id.dataTim);
        daftarkanTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatTim = new Intent(getApplicationContext(),MainActivityTeam.class);
                startActivity(lihatTim);
            }
        });

        //Intent to layout pembayaran
        daftarkanTim = (CardView) findViewById(R.id.lihatBayar);
        daftarkanTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatBayar = new Intent(getApplicationContext(),MainActivityPayment.class);
                startActivity(lihatBayar);
            }
        });

        //Intent to layout juara
        daftarkanTim = (CardView) findViewById(R.id.juara);
        daftarkanTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatJuara = new Intent(getApplicationContext(),MainActivityJuara.class);
                startActivity(lihatJuara);
            }
        });

        //Proses Spinner 1
//        posisi1 = (Spinner)findViewById(R.id.spinnerPosisi1);
//        stringposisi1=getResources().getStringArray(R.array.posisi);
//        posisi1.setPrompt("Posisi");
//        posisi1.setOnItemSelectedListener(new onItemSlectedListener(){
//
//        });

        setNavigationViewListener();
    }

    private void setNavigationViewListener() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_home);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        int id = item.getItemId();
        switch (id){
            case R.id.faq:
                Intent intent = new Intent(MainActivityHome.this, MainActivityFAQ.class);
                startActivity(intent);
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id_nav = item.getItemId();
        switch (id_nav){
            case R.id.data:
                Intent intent1 = new Intent(MainActivityHome.this, MainActivityAbout.class);
                startActivity(intent1);
                break;
            case R.id.data1:
                Intent intent = new Intent(MainActivityHome.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    private class onItemSlectedListener implements android.widget.AdapterView.OnItemSelectedListener {
//        @Override
//        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> parent) {
//
//        }
//    }
}
