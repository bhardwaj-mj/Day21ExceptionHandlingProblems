package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    static Pattern emailId = Pattern.compile("^([A-Za-z0-9]{3,}+)((?:[\\.\\+\\-][a-zA-Z0-9]+)*)@([a-z0-9]{1,}+)\\.([a-z]{2,}+)((?:\\.[a-zA-Z]+)?)$");

    static Pattern mobileNumber = Pattern.compile("^(91 )[0-9]{10}$");

    static Pattern password = Pattern.compile("^(?=.*[A-z])(?=.*[0-9])(?=.+[~`!@#$%^&*_])[a-zA-Z0-9~`!@#$%^&*_]{8,}$");

    public UserValidation() {
    }

    public UserValidation(String value) {
    }

    public boolean checkFirstName(String testFirstName) throws UserValidationException {
        try {
            Matcher matcher = firstName.matcher(testFirstName);
            return matcher.matches();
        }catch (NullPointerException e){
            throw new UserValidationException("Please enter valid value");
        }

    }

    public boolean checkLastName(String testLastName) throws UserValidationException {
        try {
            Matcher matcher = lastName.matcher(testLastName);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new UserValidationException("Please enter valid value");
        }
    }

    public boolean checkEmailId(String testEmailId) throws UserValidationException {
        try {
            Matcher matcher = emailId.matcher(testEmailId);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new UserValidationException("Please enter valid value");
        }
    }

    public boolean checkMobileNumber(String testMobileNumber) throws UserValidationException {
        try {
            Matcher matcher = mobileNumber.matcher(testMobileNumber);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new UserValidationException("Please enter valid value");
        }
    }

    public boolean checkPassword(String testPassword) throws UserValidationException {
        try {
            Matcher matcher = password.matcher(testPassword);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new UserValidationException("Please enter valid value");
        }
    }

}
