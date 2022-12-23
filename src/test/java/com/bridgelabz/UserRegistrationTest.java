package com.bridgelabz;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationJunit userRegistration = new UserRegistrationJunit();
    @Test
    public void givenFirstName_WhenProperShouldReturnHappy() {
        assertEquals("Proper First Name", true , userRegistration.validateFirstName("Madhuri"));
    }

    @Test
    public void givenFirstName_WhenImProperShouldReturnSad() {
        assertEquals("Improper Name", false, userRegistration.validateFirstName("madhuri"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Last Name", true , userRegistration.validateLastName("Tayade"));
        assertEquals("Improper Last Name", false, userRegistration.validateLastName("tayade"));

    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Email ID", true , userRegistration.validateEmailId("devraajmadhuri@gmail.com"));
        assertEquals("Improper Email ID", false, userRegistration.validateEmailId("@gmail.com"));

    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Mobile Number", true , userRegistration.validateMobileNumber("91 7787564355"));
        assertEquals("Improper Mobile Number", false, userRegistration.validateMobileNumber("91 714453"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy_ElseSad() {

        assertEquals("Proper Password", true , userRegistration.validatePassword("Oggyn13@"));
        assertEquals("Improper Password", false, userRegistration.validatePassword("google"));
    }
}