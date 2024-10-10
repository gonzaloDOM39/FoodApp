package com.example.foodapp.fragments;

import static com.example.foodapp.validation.EmailValidation.onInputChanged;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

import com.example.foodapp.R;
import com.example.foodapp.databinding.FragmentLoginBinding;
import com.example.foodapp.databinding.FragmentRegisterBinding;


public class Register extends Fragment {
    private FragmentRegisterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegisterBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // Configura la transición Fade para este fragmento
        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300); // Duración de la animación
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);
        binding.registerEmailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                onInputChanged(s, binding.emailRegister, binding.registerEmailEditText, requireContext());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
             if (s.length()==0) {
                 binding.nameEditText.setError(null);
                 binding.name.setEndIconDrawable(null);
             }else if (!binding.nameEditText.toString().isEmpty()) {
                    binding.name.setEndIconDrawable(R.drawable.check_24);
                    binding.name.setEndIconTintList(ContextCompat.getColorStateList(requireContext(), R.color.red));
                }else{
                    binding.name.setEndIconDrawable(null);
                    binding.nameEditText.setError("name field cannot be null");}

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
    }
}
