package com.example.primerparcialapp;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderAuto extends RecyclerView.ViewHolder implements View.OnClickListener {
    MainActivity act;
    TextView tvModelo;
    TextView tvMarca;

    public ViewHolderAuto(@NonNull View itemView, MainActivity act) {
        super(itemView);
        itemView.setOnClickListener(this);
        this.act = act;
        this.tvMarca = this.itemView.findViewById(R.id.tvMarca);
        this.tvModelo = this.itemView.findViewById(R.id.tvModelo);
    }

    @Override
    public void onClick(View v) {

    }
}
