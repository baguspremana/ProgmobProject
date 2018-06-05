package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivityAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_about);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("ABOUT | IT-ESEGA");

        TextView about = (TextView) findViewById(R.id.about);
        about.setText("IT-ESEGA merupakan salah satu kegiatan yang dilaksanakan oleh Himpunan Mahasiswa Teknologi Informasi, Fakultas Teknik, Universitas Udayana.\n" +
                "\nTujuan dari kegiatan IT-ESEGA adalah untuk mempertemukan seluruh gamer, khususnya DOTA 2 yang terdapat di Bali dalam suatu kompetisi DOTA serta mengembangkan bakat, minat, serta hobby dalam bermain DOTA.");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Intent intent = new Intent(MainActivityAbout.this, MainActivityHome.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }

    }
}
