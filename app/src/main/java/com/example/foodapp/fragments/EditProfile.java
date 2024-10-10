package com.example.foodapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.foodapp.R;
import com.example.foodapp.databinding.FragmentEditProfileBinding;

public class EditProfile extends Fragment {
    private FragmentEditProfileBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditProfileBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300); // Duración de la animación
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);

        String[] countries = getResources().getStringArray(R.array.countries);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                R.layout.countries_items,
                countries
        );
        binding.spinner.setAdapter(adapter);
        return view;
    }
}