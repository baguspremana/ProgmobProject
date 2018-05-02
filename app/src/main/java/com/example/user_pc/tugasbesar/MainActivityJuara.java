package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityJuara extends AppCompatActivity {

    private Button btn2015,btn2016,btn2017;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juara);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn2015 = (Button) findViewById(R.id.btn2015);
        btn2016 = (Button) findViewById(R.id.btn2016);
        btn2017 = (Button) findViewById(R.id.btn2017);

        btn2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_juara2015 = new Intent(getApplicationContext(),MainActivityJuaraDetail.class);
                startActivity(view_detail_juara2015);
            }
        });
        btn2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_juara2016 = new Intent(getApplicationContext(),MainActivityJuaraDetail.class);
                startActivity(view_detail_juara2016);
            }
        });

        btn2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_juara2017 = new Intent(getApplicationContext(),MainActivityJuaraDetail.class);
                startActivity(view_detail_juara2017);
            }
        });
    }
}
