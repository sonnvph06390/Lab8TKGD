package com.example.son.lab8tkgd;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class MyHolder extends RecyclerView.ViewHolder {
    ImageView background;
    ImageView iconheart;
    ImageView iconshare;
    public MyHolder(View itemView) {
        super(itemView);
        background=itemView.findViewById(R.id.imagebackground);
        iconheart=itemView.findViewById(R.id.iconheart);
        iconshare=itemView.findViewById(R.id.iconshare);
    }
}
