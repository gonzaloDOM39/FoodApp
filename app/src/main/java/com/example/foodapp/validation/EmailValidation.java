package com.example.foodapp.validation;

import android.content.Context;
import android.widget.EditText;

import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;

import com.example.foodapp.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    // Expresión regular para validar el formato del correo electrónico
    private static final String EMAIL_PATTERN =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    // Método para validar el formato del correo electrónico
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher= pattern.matcher(email);

        return matcher.matches();
    }

    public static void onInputChanged(CharSequence s, TextInputLayout emailLayout, EditText editText, Context context) {

        if (s.length() == 0) {
            editText.setError(null);
            emailLayout.setEndIconDrawable(null);
        } else if (isValidEmail(s.toString())) {
            editText.setError(null);
            emailLayout.setEndIconDrawable(R.drawable.check_24);
            emailLayout.setEndIconTintList(ContextCompat.getColorStateList(context, R.color.red));
        } else {
            editText.setError("invalid email");
            emailLayout.setEndIconDrawable(null);
        }
    }
}
