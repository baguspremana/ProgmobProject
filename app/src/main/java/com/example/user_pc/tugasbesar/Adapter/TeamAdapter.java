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

import com.example.user_pc.tugasbesar.MainActivityDetailTeam;
import com.example.user_pc.tugasbesar.Models.HomeTeam;
import com.example.user_pc.tugasbesar.R;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder>{

    private List<HomeTeam> listitem;
    private Context context;
    private CardView list_item;

    public TeamAdapter(List<HomeTeam> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_team, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HomeTeam list =listitem.get(position);

        holder.logo.setImageResource(list.getLogo());
        holder.name.setText(list.getName());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView logo;
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            logo = (ImageView) itemView.findViewById(R.id.team_logo);
            name = (TextView) itemView.findViewById(R.id.team_name);
            list_item = (CardView) itemView.findViewById(R.id.list_team);
            list_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent = new Intent(context, MainActivityDetailTeam.class);
                    intent.putExtra("position",getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }
}
