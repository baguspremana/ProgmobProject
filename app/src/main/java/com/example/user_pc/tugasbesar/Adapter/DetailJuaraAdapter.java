package com.example.user_pc.tugasbesar.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user_pc.tugasbesar.Models.DetailJuara;
import com.example.user_pc.tugasbesar.R;

import java.util.List;

public class DetailJuaraAdapter extends RecyclerView.Adapter<DetailJuaraAdapter.ViewHolder> {

    private List<DetailJuara> listJuara;
    private Context context;
    private CardView juara;

    public DetailJuaraAdapter(List<DetailJuara> listJuara, Context context) {
        this.listJuara = listJuara;
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
        DetailJuara list = listJuara.get(position);

        holder.logo_juara.setImageResource(list.getLogo_juara());
        holder.foto_juara.setImageResource(list.getFoto_juara());
        holder.nama_juara.setText(list.getNama_tim());
        holder.judul_juara.setText(list.getJudul_juara());

        holder.nama_satu.setText(list.getNama_satu());
        holder.posisi_satu.setText(list.getPosisi_satu());

        holder.nama_dua.setText(list.getNama_dua());
        holder.posisi_dua.setText(list.getPosisi_dua());

        holder.nama_tiga.setText(list.getNama_tiga());
        holder.posisi_tiga.setText(list.getPosisi_tiga());

        holder.nama_empat.setText(list.getNama_empat());
        holder.posisi_empat.setText(list.getPosisi_empat());

        holder.nama_lima.setText(list.getNama_lima());
        holder.posisi_lima.setText(list.getPosisi_lima());
    }

    @Override
    public int getItemCount() {
        return listJuara.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView logo_juara;
        public ImageView foto_juara;
        public TextView judul_juara;
        public TextView nama_juara;

        public TextView nama_satu;
        public TextView posisi_satu;

        public TextView nama_dua;
        public TextView posisi_dua;

        public TextView nama_tiga;
        public TextView posisi_tiga;

        public TextView nama_empat;
        public TextView posisi_empat;

        public TextView nama_lima;
        public TextView posisi_lima;


        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            logo_juara = (ImageView) itemView.findViewById(R.id.logo_tim);
            foto_juara = (ImageView) itemView.findViewById(R.id.foto_tim);
            judul_juara = (TextView) itemView.findViewById(R.id.detail_team_juara);
            nama_juara = (TextView) itemView.findViewById(R.id.nama_team);

            nama_satu = (TextView) itemView.findViewById(R.id.anggota_juara_1);
            posisi_satu = (TextView) itemView.findViewById(R.id.posisi_juara_1);

            nama_dua = (TextView) itemView.findViewById(R.id.anggota_juara_2);
            posisi_dua = (TextView) itemView.findViewById(R.id.posisi_juara_2);

            nama_tiga = (TextView) itemView.findViewById(R.id.anggota_juara_3);
            posisi_tiga = (TextView) itemView.findViewById(R.id.posisi_juara_3);

            nama_empat = (TextView) itemView.findViewById(R.id.anggota_juara_4);
            posisi_empat = (TextView) itemView.findViewById(R.id.posisi_juara_4);

            nama_lima = (TextView) itemView.findViewById(R.id.anggota_juara_5);
            posisi_lima = (TextView) itemView.findViewById(R.id.posisi_juara_5);

            juara = (CardView) itemView.findViewById(R.id.cv_detail_juara);
        }
    }
}
