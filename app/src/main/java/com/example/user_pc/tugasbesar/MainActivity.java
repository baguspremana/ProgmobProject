package com.example.user_pc.tugasbesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView register;
    private TextView forgotPass;
    private Button login;
    private EditText eMail;
    private EditText ePassword;
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

        //Intent to layout forgot password
        forgotPass =(TextView)findViewById(R.id.forgot);

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent forgotPass = new Intent(getApplicationContext(),MainActivityResetPass.class);
                startActivity(forgotPass);
            }
        });

        //Intent to login
        login = (Button) findViewById(R.id.signIn);
        eMail = (EditText) findViewById(R.id.eMail);
        ePassword = (EditText) findViewById(R.id.ePassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = eMail.getText().toString();
                String ePass = ePassword.getText().toString();
                if (email.equals("admin")){
                    if (ePass.equals("admin")){
//                        Intent login = new Intent(getApplicationContext(),MainActivity1.class);
                        Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getApplicationContext(),"Password Anda Tidak sesuai",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"email Anda salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
