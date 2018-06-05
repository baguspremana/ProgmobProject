package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivityPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("CARA PEMBAYARAN | IT-ESEGA");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Intent intent = new Intent(MainActivityPayment.this, MainActivityHome.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }

    }
}
