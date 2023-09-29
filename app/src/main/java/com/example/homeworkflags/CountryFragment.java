package com.example.homeworkflags;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homeworkflags.databinding.FragmentContinentBinding;
import com.example.homeworkflags.databinding.ItemCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {
    private FragmentContinentBinding binding;
    private ArrayList<Country> countryArrayList;
    private  CountryAdapter adapter;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         position=getArguments().getInt("key");
         checkPosition(position);
    }
    public void checkPosition(int position){
        if (position==0){
            loadNorthAmerica();
        } else if (position==1) {
            loadSouthAmerica();

        } else if (position==2) {
            loadEurasia();

        } else if (position==3) {
            loadAfrica();

        }else if (position==4){
            loadAustralia();
        }
    }

    private void loadAustralia() {
        countryArrayList=new ArrayList<>();
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/the-national-flag-of-australia_47243-926.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/vector-flag-of-newzeland-newzeland-waving-flag-background_668389-850.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/free-photo/flag-of-papua-new-guinea_1401-196.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/new-caledonia-flag-with-waving-effect-official-proportion_292608-3107.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/a-flag-of-fiji-with-the-name-fiji-on-it_787540-481.jpg?w=2000"));
    }

    private void loadAfrica() {
        countryArrayList=new ArrayList<>();
        countryArrayList.add(new Country("https://img.freepik.com/free-photo/flag-of-egypt_1401-105.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/vector-democratic-republic-of-the-congo-flag-waved-flag-of-drc-dr-congo-emblem-icon_847658-247.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-photo/flag-of-south-africa-on-wavy-fabric_146714-2432.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/free-photo/flag-of-tanzania_1401-238.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-photo/national-flag-of-namibia-background-with-flag-of-namibia_659987-35008.jpg"));
    }

    private void loadEurasia() {
        countryArrayList=new ArrayList<>();
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/flag-of-france-background_19426-484.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/free-vector/illustration-of-russia-flag_53876-27016.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/free-vector/illustration-of-china-flag_53876-27015.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-photo/flag-of-the-kyrgyzstan_135932-1490.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-photo/waving-flag-of-united-kingdom_97886-4050.jpg"));
    }

    private void loadSouthAmerica() {
        countryArrayList=new ArrayList<>();
        countryArrayList.add(new Country("https://img.freepik.com/premium-photo/brazil-flag_540510-359.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/the-realistic-national-flag-of-argentina_267200-442.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/chile-flag-blowing-in-the-wind_126712-396.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-vector/paraguay-flag-national-paraguayan-symbol-for-illustration-of-travel-election-holidays_554888-346.jpg"));
        countryArrayList.add(new Country("https://img.freepik.com/free-photo/flag-of-colombia_1401-90.jpg?q=10&h=200"));
    }

    private void loadNorthAmerica() {
        countryArrayList=new ArrayList<>();
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/d/de/Flag_of_the_United_States.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countryArrayList.add(new Country("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSo8RMWcObuwiucz0kBVj2tu5_XI7qoAsJhA9FwVjEWMTF07LITJECr6ZnMLrW9W-Cf9ZY&usqp=CAU"));
        countryArrayList.add(new Country("https://img.freepik.com/premium-photo/national-flag-of-cuba-background-with-flag-of-cuba_659987-33112.jpg"));
    }
}