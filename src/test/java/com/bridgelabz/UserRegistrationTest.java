package com.bridgelabz;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

    static UserRegistrationJunit userRegistration = new UserRegistrationJunit();

    @BeforeClass
    public  static void setUp() {
        userRegistration = new UserRegistrationJunit();
    }
    @Test
    public void testUserFirstName_whenValid_ShouldReturnSuccess(){
        try {
            boolean result = userRegistration.isFirstNameValid.validate("Madhu");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserFirstName_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.isLastNameValid.validate("madhu");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserFirstName_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.isFirstNameValid.validate(null);
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserLastName_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.isLastNameValid.validate("Tayade");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserLastName_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.isLastNameValid.validate("tayade");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserLastName_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.isLastNameValid.validate(null);
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserEmailID_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.isEmailValid.validate("devraajmadhuri@gmail.com");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserEmailID_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.isEmailValid.validate("13@gmail");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserEmailID_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.isEmailValid.validate(null);
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserMobileNumber_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.isMobileNumberValid.validate("91 9989492299");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserMobileNumber_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.isMobileNumberValid.validate("181881");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserMobileNumber_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.isMobileNumberValid.validate(null);
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserPassword_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.isPasswordValid.validate("M@dhuri3");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserPassword_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.isPasswordValid.validate("madhuri");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
    @Test
    public void testUserPassword_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.isPasswordValid.validate(null);
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
}