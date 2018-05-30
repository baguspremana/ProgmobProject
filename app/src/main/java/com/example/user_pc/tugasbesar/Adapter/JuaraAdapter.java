package com.example.user_pc.tugasbesar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user_pc.tugasbesar.MainActivityJuaraDetail;
import com.example.user_pc.tugasbesar.Models.HomeJuara;
import com.example.user_pc.tugasbesar.R;

import java.util.List;

public class JuaraAdapter extends RecyclerView.Adapter<JuaraAdapter.ViewHolder> {

    private List<HomeJuara> listjuara;
    private Context context;
    private CardView list_juara;

    public JuaraAdapter(List<HomeJuara> listjuara, Context context) {
        this.listjuara = listjuara;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_juara, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HomeJuara list = listjuara.get(position);

        holder.gambar.setImageResource(list.getGambar());
        holder.nama.setText(list.getNama());
        holder.juara.setText(list.getJuara());

    }

    @Override
    public int getItemCount() {
        return listjuara.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView gambar;
        public TextView juara;
        public TextView nama;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            gambar = (ImageView) itemView.findViewById(R.id.gambar_juara);
            juara = (TextView) itemView.findViewById(R.id.judul_juara);
            nama = (TextView) itemView.findViewById(R.id.nama_juara);
            list_juara = (CardView) itemView.findViewById(R.id.list_juara);
            list_juara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent = new Intent(context, MainActivityJuaraDetail.class);
                    intent.putExtra("position",getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }
}
