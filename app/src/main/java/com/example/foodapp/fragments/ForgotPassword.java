package com.example.foodapp.fragments;

import static com.example.foodapp.validation.EmailValidation.onInputChanged;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.databinding.FragmentForgotPasswordBinding;


public class ForgotPassword extends Fragment {

    private FragmentForgotPasswordBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentForgotPasswordBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300); // Duración de la animación
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);

        binding.editTextForgotPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                onInputChanged(s,binding.email,binding.editTextForgotPass,requireContext());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.sendEmail.setOnClickListener(v->{
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_forgot_password_to_enter_new_password, null, new NavOptions.Builder()
                    .build());
        });

        binding.backIcon.setOnClickListener(v ->{
            NavController navController = Navigation.findNavController(view);
            navController.navigateUp();
    });
        return view;


    }
}