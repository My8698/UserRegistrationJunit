package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJunit {
    private Pattern pattern;
    private Matcher matcher;

    public boolean isFirstNameValid(String firstName){
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean isLastNameValid(String lastName) {
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean isEmailValid(String email) {
        //String regex = "[a-z0-9.]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*";
        String regex = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean isMobileNumberValid(String mobilenumber) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(mobilenumber);
        return matcher.matches();
    }
    public boolean isPasswordValid(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

}