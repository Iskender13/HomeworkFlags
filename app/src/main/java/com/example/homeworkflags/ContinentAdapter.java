package com.example.homeworkflags;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkflags.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentHolder> {

    private ArrayList<Continent> listContinent;
    private onClick onitemClick;

    public ContinentAdapter(ArrayList<Continent> listContinent, onClick onitemClick) {
        this.listContinent = listContinent;
        this.onitemClick = onitemClick;
    }

    @NonNull
    @Override
    public ContinentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentHolder(ItemContinentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentHolder holder, int position) {
        holder.bind(listContinent.get(position));
        holder.itemView.setOnClickListener(v -> onitemClick.onClick(position));
    }

    @Override
    public int getItemCount() {
        return listContinent.size();
    }
}
