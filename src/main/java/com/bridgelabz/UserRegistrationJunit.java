package com.bridgelabz;

public class UserRegistrationJunit {
    private static final String FIRST_NAME_PATTERN="[A-Z]{1}[a-z]{2,15}";
    private static final String LAST_NAME_PATTERN="[A-Z]{1}[a-z]{2,15}";
    private static final String EMAIL_ID_PATTERN="^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private static final String MOBILE_NUMBER_PATTERN="^[0-9]{2} [0-9]{10}$";
    private static final String PASSWORD_PATTERN="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";

    UserRegistrationInterface isFirstNameValid=firstName->{
        boolean result=firstName.matches(FIRST_NAME_PATTERN);
        if (result){
            return result;
        }else {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.ENTERED_INVALID,"please provide valid format");

        }
    };
    UserRegistrationInterface isLastNameValid = lastName->{
        boolean result = lastName.matches(LAST_NAME_PATTERN);
        if (result){
            return result;
        } else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
        }
    };

    UserRegistrationInterface isEmailValid = emailId->{
        boolean result = emailId.matches(EMAIL_ID_PATTERN);
        if (result){
            return result;
        } else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
        }
    };

    UserRegistrationInterface isMobileNumberValid = mobileNumber->{
        boolean result = mobileNumber.matches(MOBILE_NUMBER_PATTERN);
        if (result){
            return result;
        } else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
        }
    };

    UserRegistrationInterface isPasswordValid = password->{
        boolean result = password.matches(PASSWORD_PATTERN);
        if (result){
            return result;
        } else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
        }
    };

    //public boolean isEmailValid(String inputEmailId) {
    //};
}