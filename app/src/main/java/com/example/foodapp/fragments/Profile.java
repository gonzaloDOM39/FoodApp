package com.example.foodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.databinding.FragmentProfileBinding;

public class Profile extends Fragment {
private FragmentProfileBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Configura la transición Fade para este fragmento
        binding = FragmentProfileBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300); // Duración de la animación
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);

        binding.editIcon.setOnClickListener(v->{
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_profile_to_editProfile, null, new NavOptions.Builder()
                    .build());
        });
        return view;
    }
}