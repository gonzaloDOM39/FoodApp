package com.example.foodapp.fragments;

import static com.example.foodapp.validation.EmailValidation.isValidEmail;
import static com.example.foodapp.validation.EmailValidation.onInputChanged;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import com.example.foodapp.R;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.foodapp.databinding.FragmentLoginBinding;


public class Login extends Fragment {
    private FragmentLoginBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // Configura la transición Fade para este fragmento
        Fade fadeTransition = new Fade();
        fadeTransition.setDuration(300); // Duración de la animación
        setEnterTransition(fadeTransition);
        setExitTransition(fadeTransition);

        // Agregar el TextWatcher al EditText de email
        binding.emailEditTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            onInputChanged(s,binding.emailLayout,binding.emailEditTxt,requireContext());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
 binding.singUp.setOnClickListener(v->{
     NavController navController = Navigation.findNavController(view);
     navController.navigate(R.id.action_login_to_register, null, new NavOptions.Builder()
             .build());
 });
        binding.forgotPassword.setOnClickListener(v->{
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_login_to_forgot_password, null, new NavOptions.Builder()
                    .build());
        });
        binding.singIn.setOnClickListener(v->{
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_login_to_profile, null, new NavOptions.Builder()
                    .build());
        });
        return view;
    }


}


