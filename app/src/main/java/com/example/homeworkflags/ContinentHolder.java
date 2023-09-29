package com.example.homeworkflags;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkflags.databinding.ItemContinentsBinding;

public class ContinentHolder extends RecyclerView.ViewHolder {
    private ItemContinentsBinding binding;
    public ContinentHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
    }
    public void bind(Continent continent){
        binding.tvContinent.setText(continent.getName());
    }

}
