package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.data.Country;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    @NonNull
    private final String[] pays = {"France" , "Allemagne" , "Espagne", "Afrique du Sud", "Japon" , "Etats-Unis"};

    private final String[] capital={"Paris", " Berlin", "Madrid", "Pretoria", "Tokyo", "Washington DC"};

    private final int[] images = { R.drawable.flag_of_france , R.drawable.flag_of_germany ,  R.drawable.flag_of_spain,
            R.drawable.flag_of_south_africa , R.drawable.flag_of_japan, R.drawable.flag_of_the_united_states };
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, int position) {
        viewHolder.itemNom.setText(pays[position]);
        viewHolder.itemDescription.setText(capital[position]);
        viewHolder.itemImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return pays.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemNom;
        TextView itemDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemNom = itemView.findViewById(R.id.itemNom);
            itemDescription = itemView.findViewById(R.id.itemDescription);
        }
    }
}
