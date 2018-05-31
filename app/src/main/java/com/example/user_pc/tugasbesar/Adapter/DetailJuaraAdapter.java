package com.example.user_pc.tugasbesar.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user_pc.tugasbesar.Models.DetailTeamJuara;
import com.example.user_pc.tugasbesar.R;

import java.util.List;

public class DetailJuaraAdapter extends RecyclerView.Adapter<DetailJuaraAdapter.ViewHolder> {

    private List<DetailTeamJuara> listDetail;
    private Context context;
    private CardView list_detail;

    public DetailJuaraAdapter(List<DetailTeamJuara> listDetail, Context context) {
        this.listDetail = listDetail;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_juara, parent, false);
        return new DetailJuaraAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DetailTeamJuara list  = listDetail.get(position);

        holder.nama_juara.setText(list.getNama_juara());
        holder.judul_juara.setText(list.getJudul_juara());
        holder.logo_juara.setImageResource(list.getLogo_juara());
        holder.foto_juara.setImageResource(list.getFoto_juara());

        holder.profile_juara_satu.setImageResource(list.getProfile_juara_satu());
        holder.nama_juara_satu.setText(list.getNama_juara_satu());
        holder.posisi_juara_satu.setText(list.getPosisi_juara_satu());

        holder.profile_juara_dua.setImageResource(list.getProfile_juara_dua());
        holder.nama_juara_dua.setText(list.getNama_juara_dua());
        holder.posisi_juara_dua.setText(list.getPosisi_juara_dua());

        holder.profile_juara_tiga.setImageResource(list.getProfile_juara_tiga());
        holder.nama_juara_tiga.setText(list.getNama_juara_tiga());
        holder.posisi_juara_tiga.setText(list.getPosisi_juara_tiga());

        holder.profile_juara_empat.setImageResource(list.getProfile_juara_empat());
        holder.nama_juara_empat.setText(list.getNama_juara_empat());
        holder.posisi_juara_empat.setText(list.getPosisi_juara_empat());

        holder.profile_juara_lima.setImageResource(list.getProfile_juara_lima());
        holder.nama_juara_lima.setText(list.getNama_juara_lima());
        holder.posisi_juara_lima.setText(list.getPosisi_juara_lima());

    }

    @Override
    public int getItemCount() {
        return listDetail.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nama_juara;
        public TextView judul_juara;
        public ImageView logo_juara;
        public ImageView foto_juara;

        public ImageView profile_juara_satu;
        public TextView nama_juara_satu;
        public TextView posisi_juara_satu;

        public ImageView profile_juara_dua;
        public TextView nama_juara_dua;
        public TextView posisi_juara_dua;

        public ImageView profile_juara_tiga;
        public TextView nama_juara_tiga;
        public TextView posisi_juara_tiga;

        public ImageView profile_juara_empat;
        public TextView nama_juara_empat;
        public TextView posisi_juara_empat;

        public ImageView profile_juara_lima;
        public TextView nama_juara_lima;
        public TextView posisi_juara_lima;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            nama_juara = (TextView) itemView.findViewById(R.id.nama_team_juara);
            judul_juara = (TextView) itemView.findViewById(R.id.detail_team_juara);
            logo_juara = (ImageView) itemView.findViewById(R.id.logo_tim_juara);
            foto_juara = (ImageView) itemView.findViewById(R.id.foto_tim_juara);

            profile_juara_satu = (ImageView) itemView.findViewById(R.id.gambar_juara_team_1);
            nama_juara_satu = (TextView) itemView.findViewById(R.id.anggota_juara_1);
            posisi_juara_satu = (TextView) itemView.findViewById(R.id.posisi_juara_1);

            profile_juara_dua = (ImageView) itemView.findViewById(R.id.gambar_juara_team_2);
            nama_juara_dua = (TextView) itemView.findViewById(R.id.anggota_juara_2);
            posisi_juara_dua = (TextView) itemView.findViewById(R.id.posisi_juara_2);

            profile_juara_tiga = (ImageView) itemView.findViewById(R.id.gambar_juara_team_3);
            nama_juara_tiga = (TextView) itemView.findViewById(R.id.anggota_juara_3);
            posisi_juara_tiga = (TextView) itemView.findViewById(R.id.posisi_juara_3);

            profile_juara_empat = (ImageView) itemView.findViewById(R.id.gambar_juara_team_4);
            nama_juara_empat = (TextView) itemView.findViewById(R.id.anggota_juara_4);
            posisi_juara_empat = (TextView) itemView.findViewById(R.id.posisi_juara_4);

            profile_juara_lima = (ImageView) itemView.findViewById(R.id.gambar_juara_team_5);
            nama_juara_lima = (TextView) itemView.findViewById(R.id.anggota_juara_5);
            posisi_juara_lima = (TextView) itemView.findViewById(R.id.posisi_juara_5);

            list_detail = (CardView) itemView.findViewById(R.id.cv_detail_juara);
        }
    }
}
