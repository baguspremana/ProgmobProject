package com.example.user_pc.tugasbesar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivityResetPass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
