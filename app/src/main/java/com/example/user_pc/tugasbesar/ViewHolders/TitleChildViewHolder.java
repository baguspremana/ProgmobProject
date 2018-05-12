package com.example.user_pc.tugasbesar.ViewHolders;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.example.user_pc.tugasbesar.R;

public class TitleChildViewHolder extends ChildViewHolder {
    public TextView option;

    public TitleChildViewHolder(View itemView) {
        super(itemView);
        option = (TextView) itemView.findViewById(R.id.option);
    }
}
