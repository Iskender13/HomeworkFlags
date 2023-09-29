package com.example.homeworkflags;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homeworkflags.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements onClick {
    private FragmentContinentBinding binding;
    private ArrayList<Continent> listContinent;
    private ContinentAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter=new ContinentAdapter(listContinent,this::onClick);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        listContinent=new ArrayList<>();
        listContinent.add(new Continent("North America"));
        listContinent.add(new Continent("South America"));
        listContinent.add(new Continent("Eurasia"));
        listContinent.add(new Continent("Africa"));
        listContinent.add(new Continent("Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle=new Bundle();
        bundle.putInt("key", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).commit();
    }
}