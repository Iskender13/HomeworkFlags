package com.example.homeworkflags;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homeworkflags.databinding.ItemCountryBinding;

public class CountryHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;
    public CountryHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
    }
    public void bind(Country country){
        Glide.with(binding.imgCountry).load(country.getImg()).into(binding.imgCountry);
    }
}
