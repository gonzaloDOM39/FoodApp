package com.example.foodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;


public class EnterNewPassword extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300); // Duración de la animación
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);
        return inflater.inflate(R.layout.fragment_enter_new_password, container, false);

    }
}