package com.example.user_pc.tugasbesar.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.user_pc.tugasbesar.R;

public class TitleParentViewHolder extends ParentViewHolder {
    public TextView _textView;
    public ImageView _imageButton;

    public TitleParentViewHolder(View itemView) {
        super(itemView);
        _textView = (TextView) itemView.findViewById(R.id.parentTitle);
        _imageButton = (ImageView) itemView.findViewById(R.id.expandArrow);
    }
}
