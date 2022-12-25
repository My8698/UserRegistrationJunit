package com.bridgelabz;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationJunit userRegistration = new UserRegistrationJunit();
    @Test
    public void givenFirstName_WhenProperShouldReturnHappy() {
        assertEquals("Proper First Name", true , userRegistration.isFirstNameValid("Madhuri"));
    }

    @Test
    public void givenFirstName_WhenImProperShouldReturnSad() {
        assertEquals("Improper Name", false, userRegistration.isFirstNameValid("madhuri"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Last Name", true , userRegistration.isLastNameValid("Tayade"));
        assertEquals("Improper Last Name", false, userRegistration.isLastNameValid("tayade"));

    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Email ID", true , userRegistration.isEmailValid("devraajmadhuri@gmail.com"));
        assertEquals("Improper Email ID", false, userRegistration.isEmailValid("@gmail.com"));

    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Mobile Number", true , userRegistration.isMobileNumberValid("91 7787564355"));
        assertEquals("Improper Mobile Number", false, userRegistration.isMobileNumberValid("91 714453"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Password", true , userRegistration.isPasswordValid("Oggyn13@"));
        assertEquals("Improper Password", false, userRegistration.isPasswordValid("google"));
    }
}