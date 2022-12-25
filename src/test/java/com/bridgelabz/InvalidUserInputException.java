package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

/**
 * throws custom exception in case of invalid user details
 */
public class InvalidUserInputException extends Exception{
    UserRegistrationJunit userRegistration = new UserRegistrationJunit();
    @Test
    public void givenValidFirstName_shouldReturnTrue(){
        try {
            boolean result = userRegistration.isFirstNameValid("Madhuri");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println("Catch Block");
        }
    }
    @Test
    public void givenValidFirstName_shouldReturnFalse(){
        try {
            boolean result = userRegistration.isFirstNameValid("madhuri");
            Assert.assertFalse(result);
        }catch (Exception e){
            System.out.println("Catch Block");
        }
    }
    @Test
    public void givenValidLastName_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isLastNameValid("Tayade");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isFirstNameValid("tayade");
            Assert.assertFalse(result);
        } catch (Exception e) {

        }
    }

    @Test
    public void givenValidEmail_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isEmailValid("devraajmadhuri@gmail.com");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isEmailValid("madhu123gmail.com");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenValidMobileNumber_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isMobileNumberValid("91 7350447788");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidMobileNumber_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isMobileNumberValid("73504477");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenValidPassword_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isPasswordValid("M@dhuri123");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidPassword_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isPasswordValid("mad123");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }
}