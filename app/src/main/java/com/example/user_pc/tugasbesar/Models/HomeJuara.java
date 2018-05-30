package com.example.user_pc.tugasbesar.Models;

public class HomeJuara {
    int gambar;
    String juara;
    String nama;

    public HomeJuara(int gambar, String juara, String nama) {
        this.gambar = gambar;
        this.juara = juara;
        this.nama = nama;
    }

    public int getGambar() {
        return gambar;
    }

    public String getJuara() {
        return juara;
    }

    public String getNama() {
        return nama;
    }
}
