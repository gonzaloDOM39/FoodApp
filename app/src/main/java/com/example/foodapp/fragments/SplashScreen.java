package com.example.foodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.MainActivity;
import com.example.foodapp.R;
import com.google.android.material.transition.MaterialContainerTransform;


public class SplashScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_splash_screen, container, false);
        // Configura la transición Fade para este fragmento
        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300);
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_splashScreen_to_login, null, new NavOptions.Builder()
                        .setPopUpTo(R.id.splashScreen, true)

                        .build());




            }
        }, 3000);

        return view;
    }
}