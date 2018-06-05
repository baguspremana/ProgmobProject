package com.example.user_pc.tugasbesar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user_pc.tugasbesar.Models.DataTeam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivityRegisterTim extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    List<DataTeam> myTeam = new ArrayList<>();
    Button btnDaftar;
    EditText etNamaTeam;

    EditText etNamaAnggotaSatu;
    EditText etSteamAnggotaSatu;
    private String spinnerPosisiSatu;

    EditText etNamaAnggotaDua;
    EditText etSteamAnggotaDua;
    private String spinnerPosisiDua;

    EditText etNamaAnggotaTiga;
    EditText etSteamAnggotaTiga;
    private String spinnerPosisiTiga;

    EditText etNamaAnggotaEmpat;
    EditText etSteamAnggotaEmpat;
    private String spinnerPosisiEmpat;

    EditText etNamaAnggotaLima;
    EditText etSteamAnggotaLima;
    private String spinnerPosisiLima;

    private static final String ARRAYLIST_MY_TEAM_EXTRA = "ARRAY_MY_TEAM";
    private static final String SAVE_MY_TEAM = "MY_TEAM_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_tim);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("PENDAFTARAN TIM | IT-ESEGA");

        btnDaftar = findViewById(R.id.btnDaftar);
        etNamaTeam = findViewById(R.id.namaTim);

        etNamaAnggotaSatu = findViewById(R.id.namaAnggota1);
        etSteamAnggotaSatu = findViewById(R.id.idSteam1);
        final Spinner spinner1 = findViewById(R.id.spinnerPosisi1);

        etNamaAnggotaDua = findViewById(R.id.namaAnggota2);
        etSteamAnggotaDua = findViewById(R.id.idSteam2);
        Spinner spinner2 = findViewById(R.id.spinnerPosisi2);

        etNamaAnggotaTiga = findViewById(R.id.namaAnggota3);
        etSteamAnggotaTiga = findViewById(R.id.idSteam3);
        Spinner spinner3 = findViewById(R.id.spinnerPosisi3);

        etNamaAnggotaEmpat = findViewById(R.id.namaAnggota4);
        etSteamAnggotaEmpat = findViewById(R.id.idSteam4);
        Spinner spinner4 = findViewById(R.id.spinnerPosisi4);

        etNamaAnggotaLima = findViewById(R.id.namaAnggota5);
        etSteamAnggotaLima = findViewById(R.id.idSteam5);
        Spinner spinner5 = findViewById(R.id.spinnerPosisi5);

        if (spinner1 != null || spinner2 != null || spinner3 != null || spinner4 != null || spinner5 != null){
            spinner1.setOnItemSelectedListener(this);
            spinner2.setOnItemSelectedListener(this);
            spinner3.setOnItemSelectedListener(this);
            spinner4.setOnItemSelectedListener(this);
            spinner5.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.posisi, R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        if (spinner1 != null || spinner2 != null || spinner3 != null || spinner4 != null || spinner5 != null){
            spinner1.setAdapter(adapter);
            spinner2.setAdapter(adapter);
            spinner3.setAdapter(adapter);
            spinner4.setAdapter(adapter);
            spinner5.setAdapter(adapter);
        }


/*
        if (spinner2 != null){
            spinner2.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.posisi, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner2 != null){
            spinner2.setAdapter(adapter1);
        }
*/


/*        if (spinner3 != null){
            spinner3.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.posisi, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner3 != null){
            spinner3.setAdapter(adapter3);
        }*/


/*        if (spinner4 != null){
            spinner4.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.posisi, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner4 != null){
            spinner4.setAdapter(adapter4);
        }*/


/*        if (spinner5 != null){
            spinner5.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.posisi, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner5 != null){
            spinner5.setAdapter(adapter5);
        }*/

        if ((ArrayList<DataTeam>)getIntent().getSerializableExtra(ARRAYLIST_MY_TEAM_EXTRA) != null){
            myTeam = (ArrayList<DataTeam>)getIntent().getSerializableExtra(ARRAYLIST_MY_TEAM_EXTRA);
        }

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaTeam = etNamaTeam.getText().toString();

                String namaAnggotaSatu = etNamaAnggotaSatu.getText().toString();
                String steamAnggotaSatu = etSteamAnggotaSatu.getText().toString();

                String namaAnggotaDua = etNamaAnggotaDua.getText().toString();
                String steamAnggotaDua = etSteamAnggotaDua.getText().toString();

                String namaAnggotaTiga = etNamaAnggotaTiga.getText().toString();
                String steamAnggotaTiga = etSteamAnggotaTiga.getText().toString();

                String namaAnggotaEmpat = etNamaAnggotaEmpat.getText().toString();
                String steamAnggotaEmpat = etSteamAnggotaEmpat.getText().toString();

                String namaAnggotaLima = etNamaAnggotaLima.getText().toString();
                String steamAnggotaLima = etSteamAnggotaLima.getText().toString();

                if (cekInput(namaTeam) || cekInput(namaAnggotaSatu) || cekInput(steamAnggotaSatu) || cekInput(spinnerPosisiSatu) ||
                        cekInput(namaAnggotaDua) || cekInput(steamAnggotaDua) || cekInput(spinnerPosisiDua) ||
                        cekInput(namaAnggotaTiga) || cekInput(steamAnggotaTiga) || cekInput(spinnerPosisiTiga) ||
                        cekInput(namaAnggotaEmpat) || cekInput(steamAnggotaEmpat) || cekInput(spinnerPosisiEmpat) ||
                        cekInput(namaAnggotaLima) || cekInput(steamAnggotaLima) || cekInput(spinnerPosisiLima)){
                    Toast.makeText(getApplicationContext(), "semua kolom harus diisi terlebih dahulu!", Toast.LENGTH_SHORT).show();

                    etNamaTeam.setText(namaTeam);

                    etNamaAnggotaSatu.setText(namaAnggotaSatu);
                    etSteamAnggotaSatu.setText(steamAnggotaSatu);

                    etNamaAnggotaDua.setText(namaAnggotaDua);
                    etSteamAnggotaDua.setText(steamAnggotaDua);

                    etNamaAnggotaTiga.setText(namaAnggotaTiga);
                    etSteamAnggotaTiga.setText(steamAnggotaTiga);

                    etNamaAnggotaEmpat.setText(namaAnggotaEmpat);
                    etSteamAnggotaEmpat.setText(steamAnggotaEmpat);

                    etNamaAnggotaLima.setText(namaAnggotaLima);
                    etSteamAnggotaLima.setText(steamAnggotaLima);
                }else {
                    DataTeam dt = new DataTeam();
                    dt.setNamaTeam(namaTeam);

                    dt.setNamaAnggotaSatu(namaAnggotaSatu);
                    dt.setSteamAnggotaSatu(steamAnggotaSatu);
                    dt.setPosisiAnggotaSatu(spinnerPosisiSatu);

                    dt.setNamaAnggotaDua(namaAnggotaDua);
                    dt.setSteamAnggotaDua(steamAnggotaDua);
                    dt.setPosisiAnggotaDua(spinnerPosisiDua);

                    dt.setNamaAnggotaTiga(namaAnggotaTiga);
                    dt.setSteamAnggotaTiga(steamAnggotaTiga);
                    dt.setPosisiAnggotaTiga(spinnerPosisiTiga);

                    dt.setNamaAnggotaEmpat(namaAnggotaEmpat);
                    dt.setSteamAnggotaEmpat(steamAnggotaEmpat);
                    dt.setPosisiAnggotaEmpat(spinnerPosisiEmpat);

                    dt.setNamaAnggotaLima(namaAnggotaLima);
                    dt.setSteamAnggotaLima(steamAnggotaLima);
                    dt.setPosisiAnggotaLima(spinnerPosisiLima);

                    myTeam.add(dt);

                    etNamaTeam.setText("");

                    etNamaAnggotaSatu.setText("");
                    etSteamAnggotaSatu.setText("");

                    etNamaAnggotaDua.setText("");
                    etSteamAnggotaDua.setText("");

                    etNamaAnggotaTiga.setText("");
                    etSteamAnggotaTiga.setText("");

                    etNamaAnggotaEmpat.setText("");
                    etSteamAnggotaEmpat.setText("");

                    etNamaAnggotaLima.setText("");
                    etSteamAnggotaLima.setText("");

                    Snackbar.make(view, "Berhasil mendaftarkan tim\t" + namaTeam, Snackbar.LENGTH_SHORT).show();
                    /*Intent intent = new Intent(MainActivityRegisterTim.this, MainActivityHome.class);
                    startActivity(intent);*/
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_detail:
                Intent intent = new Intent(MainActivityRegisterTim.this, MainActivityDataTeam.class);
                intent.putExtra(ARRAYLIST_MY_TEAM_EXTRA, (Serializable) myTeam);
                startActivity(intent);
                break;
            case android.R.id.home:
                Intent intent1 = new Intent(MainActivityRegisterTim.this, MainActivityHome.class);
                intent1.putExtra(ARRAYLIST_MY_TEAM_EXTRA, (Serializable) myTeam);
                startActivity(intent1);
                break;
        }
        return true;
    }

//    @SuppressLint("ResourceAsColor")
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (adapterView.getId()){
            case R.id.spinnerPosisi1:
                spinnerPosisiSatu = adapterView.getItemAtPosition(i).toString();
                break;
            case R.id.spinnerPosisi2:
                spinnerPosisiDua = adapterView.getItemAtPosition(i).toString();
                break;
            case R.id.spinnerPosisi3:
                spinnerPosisiTiga = adapterView.getItemAtPosition(i).toString();
                break;
            case R.id.spinnerPosisi4:
                spinnerPosisiEmpat = adapterView.getItemAtPosition(i).toString();
                break;
            case R.id.spinnerPosisi5:
                spinnerPosisiLima = adapterView.getItemAtPosition(i).toString();
                break;
        }
        /*spinnerPosisiSatu = adapterView.getItemAtPosition(i).toString();
        spinnerPosisiDua = adapterView.getItemAtPosition(i).toString();
        spinnerPosisiTiga = adapterView.getItemAtPosition(i).toString();
        spinnerPosisiEmpat = adapterView.getItemAtPosition(i).toString();
        spinnerPosisiLima = adapterView.getItemAtPosition(i).toString();*/
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public boolean cekInput(String input){
        if (input.equals("")){
            return true;
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MainActivityRegisterTim.this, MainActivityHome.class);
        intent.putExtra(ARRAYLIST_MY_TEAM_EXTRA, (Serializable) myTeam);
        finish();
    }
}
