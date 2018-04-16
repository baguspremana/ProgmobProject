package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView register;
    private TextView forgotPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intent to register layout
        register = (TextView) findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regis = new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(regis);
            }
        });

        //Intent to layout
        forgotPass =(TextView)findViewById(R.id.forgot);

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotPass = new Intent(getApplicationContext(),MainActivityResetPass.class);
                startActivity(forgotPass);
            }
        });
    }
}
