package com.example.user_pc.tugasbesar.Models;

public class DetailJuara {

    int logo_juara;
    int foto_juara;
    String judul_juara;
    String nama_tim;

    String nama_satu;
    String posisi_satu;

    String nama_dua;
    String posisi_dua;

    String nama_tiga;
    String posisi_tiga;

    String nama_empat;
    String posisi_empat;

    String nama_lima;
    String posisi_lima;

    public DetailJuara(int logo_juara, int foto_juara, String judul_juara, String nama_tim, String nama_satu, String posisi_satu, String nama_dua, String posisi_dua, String nama_tiga, String posisi_tiga, String nama_empat, String posisi_empat, String nama_lima, String posisi_lima) {
        this.logo_juara = logo_juara;
        this.foto_juara = foto_juara;
        this.judul_juara = judul_juara;
        this.nama_tim = nama_tim;
        this.nama_satu = nama_satu;
        this.posisi_satu = posisi_satu;
        this.nama_dua = nama_dua;
        this.posisi_dua = posisi_dua;
        this.nama_tiga = nama_tiga;
        this.posisi_tiga = posisi_tiga;
        this.nama_empat = nama_empat;
        this.posisi_empat = posisi_empat;
        this.nama_lima = nama_lima;
        this.posisi_lima = posisi_lima;
    }

    public int getLogo_juara() {
        return logo_juara;
    }

    public int getFoto_juara() {
        return foto_juara;
    }

    public String getJudul_juara() {
        return judul_juara;
    }

    public String getNama_tim() {
        return nama_tim;
    }

    public String getNama_satu() {
        return nama_satu;
    }

    public String getPosisi_satu() {
        return posisi_satu;
    }

    public String getNama_dua() {
        return nama_dua;
    }

    public String getPosisi_dua() {
        return posisi_dua;
    }

    public String getNama_tiga() {
        return nama_tiga;
    }

    public String getPosisi_tiga() {
        return posisi_tiga;
    }

    public String getNama_empat() {
        return nama_empat;
    }

    public String getPosisi_empat() {
        return posisi_empat;
    }

    public String getNama_lima() {
        return nama_lima;
    }

    public String getPosisi_lima() {
        return posisi_lima;
    }
}
