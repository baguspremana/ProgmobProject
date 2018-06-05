package com.example.user_pc.tugasbesar.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user_pc.tugasbesar.Models.DataTeam;
import com.example.user_pc.tugasbesar.R;

import java.util.ArrayList;
import java.util.List;

public class DataTeamAdapter extends RecyclerView.Adapter<DataTeamAdapter.ViewHolder> {

    List<DataTeam> dataTeams = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_data_tim, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DataTeam dataTeam = dataTeams.get(position);

        holder._namaTeam.setText(dataTeam.getNamaTeam());

        holder._namaAnggotaSatu.setText(dataTeam.getNamaAnggotaSatu());
        holder._posisiAnggotaSatu.setText(dataTeam.getPosisiAnggotaSatu());
        holder._steamAnggotaSatu.setText(dataTeam.getSteamAnggotaSatu());

        holder._namaAnggotaDua.setText(dataTeam.getNamaAnggotaDua());
        holder._posisiAnggotaDua.setText(dataTeam.getPosisiAnggotaDua());
        holder._steamAnggotaDua.setText(dataTeam.getSteamAnggotaDua());

        holder._namaAnggotaTiga.setText(dataTeam.getNamaAnggotaTiga());
        holder._posisiAnggotaTiga.setText(dataTeam.getPosisiAnggotaTiga());
        holder._steamAnggotaTiga.setText(dataTeam.getSteamAnggotaTiga());

        holder._namaAnggotaEmpat.setText(dataTeam.getNamaAnggotaEmpat());
        holder._posisiAnggotaEmpat.setText(dataTeam.getPosisiAnggotaEmpat());
        holder._steamAnggotaEmpat.setText(dataTeam.getSteamAnggotaEmpat());

        holder._namaAnggotaLima.setText(dataTeam.getNamaAnggotaLima());
        holder._posisiAnggotaLima.setText(dataTeam.getPosisiAnggotaLima());
        holder._steamAnggotaLima.setText(dataTeam.getSteamAnggotaLima());

    }

    @Override
    public int getItemCount() {
        return dataTeams.size();
    }

    public void setDataTeams(List<DataTeam> dataTeamsListItem){
        this.dataTeams = dataTeamsListItem;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView _namaTeam;
        ImageView _logoTeam;
        ImageView _fotoTeam;

        ImageView _profileAnggotaSatu;
        TextView _namaAnggotaSatu;
        TextView _posisiAnggotaSatu;
        TextView _steamAnggotaSatu;

        ImageView _profileAnggotaDua;
        TextView _namaAnggotaDua;
        TextView _posisiAnggotaDua;
        TextView _steamAnggotaDua;

        ImageView _profileAnggotaTiga;
        TextView _namaAnggotaTiga;
        TextView _posisiAnggotaTiga;
        TextView _steamAnggotaTiga;

        ImageView _profileAnggotaEmpat;
        TextView _namaAnggotaEmpat;
        TextView _posisiAnggotaEmpat;
        TextView _steamAnggotaEmpat;

        ImageView _profileAnggotaLima;
        TextView _namaAnggotaLima;
        TextView _posisiAnggotaLima;
        TextView _steamAnggotaLima;

        public ViewHolder(View itemView) {
            super(itemView);

            _namaTeam = (TextView) itemView.findViewById(R.id.detail_data_team_name);
            _logoTeam = (ImageView) itemView.findViewById(R.id.logo_data_tim);
            _fotoTeam = (ImageView) itemView.findViewById(R.id.foto_data_tim);

            _profileAnggotaSatu = (ImageView) itemView.findViewById(R.id.gambar_anggota_data_team_1);
            _namaAnggotaSatu = (TextView) itemView.findViewById(R.id.anggota_data_tim_1);
            _posisiAnggotaSatu = (TextView) itemView.findViewById(R.id.posisi_data_team_1);
            _steamAnggotaSatu = (TextView) itemView.findViewById(R.id.id_steam_1);

            _profileAnggotaDua = (ImageView) itemView.findViewById(R.id.gambar_anggota_data_team_2);
            _namaAnggotaDua = (TextView) itemView.findViewById(R.id.anggota_data_tim_2);
            _posisiAnggotaDua = (TextView) itemView.findViewById(R.id.posisi_data_team_2);
            _steamAnggotaDua = (TextView) itemView.findViewById(R.id.id_steam_2);

            _profileAnggotaTiga = (ImageView) itemView.findViewById(R.id.gambar_anggota_data_team_3);
            _namaAnggotaTiga = (TextView) itemView.findViewById(R.id.anggota_data_tim_3);
            _posisiAnggotaTiga = (TextView) itemView.findViewById(R.id.posisi_data_team_3);
            _steamAnggotaTiga = (TextView) itemView.findViewById(R.id.id_steam_3);

            _profileAnggotaEmpat = (ImageView) itemView.findViewById(R.id.gambar_anggota_data_team_4);
            _namaAnggotaEmpat = (TextView) itemView.findViewById(R.id.anggota_data_tim_4);
            _posisiAnggotaEmpat = (TextView) itemView.findViewById(R.id.posisi_data_team_4);
            _steamAnggotaEmpat = (TextView) itemView.findViewById(R.id.id_steam_4);

            _profileAnggotaLima = (ImageView) itemView.findViewById(R.id.gambar_anggota_data_team_5);
            _namaAnggotaLima = (TextView) itemView.findViewById(R.id.anggota_data_tim_5);
            _posisiAnggotaLima = (TextView) itemView.findViewById(R.id.posisi_data_team_5);
            _steamAnggotaLima = (TextView) itemView.findViewById(R.id.id_steam_5);
        }
    }
}
