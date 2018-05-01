package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivityTeam extends AppCompatActivity {

    private CardView team1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_team);

        //intent to register layout
        team1 = (CardView) findViewById(R.id.team1);

        team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_detail_team1 = new Intent(getApplicationContext(),MainActivityDetailTeam.class);
                startActivity(view_detail_team1);
            }
        });
    }
}
