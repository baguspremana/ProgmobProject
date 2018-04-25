package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivityHome extends AppCompatActivity {
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mToggle;
    private CardView daftarkanTim;

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

        //Proses Spinner 1
//        posisi1 = (Spinner)findViewById(R.id.spinnerPosisi1);
//        stringposisi1=getResources().getStringArray(R.array.posisi);
//        posisi1.setPrompt("Posisi");
//        posisi1.setOnItemSelectedListener(new onItemSlectedListener(){
//
//        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
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
