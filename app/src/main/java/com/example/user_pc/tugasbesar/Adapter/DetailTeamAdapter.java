package com.example.user_pc.tugasbesar.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user_pc.tugasbesar.Models.DetailTeam;
import com.example.user_pc.tugasbesar.R;

import java.util.List;

public class DetailTeamAdapter extends RecyclerView.Adapter<DetailTeamAdapter.ViewHolder> {

    private List<DetailTeam> listDetail;
    private Context context;
    private CardView list_detail;

    public DetailTeamAdapter(List<DetailTeam> listDetail, Context context) {
        this.listDetail = listDetail;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_team, parent, false);
        return new DetailTeamAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DetailTeam list = listDetail.get(position);

        holder.name_detail.setText(list.getName_detail());
        holder.logo_detail.setImageResource(list.getLogo_detail());
        holder.foto_detail.setImageResource(list.getFoto_detail());

        holder.profile_satu.setImageResource(list.getProfile_satu());
        holder.nama_satu.setText(list.getName_satu());
        holder.posisi_satu.setText(list.getPosisi_satu());

        holder.profile_dua.setImageResource(list.getProfile_dua());
        holder.nama_dua.setText(list.getName_dua());
        holder.posisi_dua.setText(list.getPosisi_dua());

        holder.profile_tiga.setImageResource(list.getProfile_tiga());
        holder.nama_tiga.setText(list.getName_tiga());
        holder.posisi_tiga.setText(list.getPosisi_tiga());

        holder.profile_empat.setImageResource(list.getProfile_empat());
        holder.nama_empat.setText(list.getName_empat());
        holder.posisi_empat.setText(list.getPosisi_empat());

        holder.profile_lima.setImageResource(list.getProfile_lima());
        holder.nama_lima.setText(list.getName_lima());
        holder.posisi_lima.setText(list.getPosisi_lima());
    }

    @Override
    public int getItemCount() {
        return listDetail.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name_detail;
        public ImageView logo_detail;
        public ImageView foto_detail;

        public ImageView profile_satu;
        public TextView nama_satu;
        public TextView posisi_satu;

        public ImageView profile_dua;
        public TextView nama_dua;
        public TextView posisi_dua;

        public ImageView profile_tiga;
        public TextView nama_tiga;
        public TextView posisi_tiga;

        public ImageView profile_empat;
        public TextView nama_empat;
        public TextView posisi_empat;

        public ImageView profile_lima;
        public TextView nama_lima;
        public TextView posisi_lima;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            name_detail = (TextView) itemView.findViewById(R.id.detail_team_name);
            logo_detail = (ImageView) itemView.findViewById(R.id.logo_tim);
            foto_detail = (ImageView) itemView.findViewById(R.id.foto_tim);

            profile_satu = (ImageView) itemView.findViewById(R.id.gambar_anggota_team_1);
            nama_satu = (TextView) itemView.findViewById(R.id.anggota_tim_1);
            posisi_satu = (TextView) itemView.findViewById(R.id.posisi_team_1);

            profile_dua = (ImageView) itemView.findViewById(R.id.gambar_anggota_team_2);
            nama_dua = (TextView) itemView.findViewById(R.id.anggota_tim_2);
            posisi_dua = (TextView) itemView.findViewById(R.id.posisi_team_2);

            profile_tiga = (ImageView) itemView.findViewById(R.id.gambar_anggota_team_3);
            nama_tiga = (TextView) itemView.findViewById(R.id.anggota_tim_3);
            posisi_tiga = (TextView) itemView.findViewById(R.id.posisi_team_3);

            profile_empat = (ImageView) itemView.findViewById(R.id.gambar_anggota_team_4);
            nama_empat = (TextView) itemView.findViewById(R.id.anggota_tim_4);
            posisi_empat = (TextView) itemView.findViewById(R.id.posisi_team_4);

            profile_lima = (ImageView) itemView.findViewById(R.id.gambar_anggota_team_5);
            nama_lima = (TextView) itemView.findViewById(R.id.anggota_tim_5);
            posisi_lima = (TextView) itemView.findViewById(R.id.posisi_team_5);

            list_detail = (CardView) itemView.findViewById(R.id.detail_team);

        }
    }
}
