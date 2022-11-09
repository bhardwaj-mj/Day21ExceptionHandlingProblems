package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidationTest {
    UserValidation user = new UserValidation();

    @Test
    public void givenInvalidFirstName_ShouldThrowException(){
        boolean result = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            result = user.checkFirstName(null);
            Assert.assertEquals(false,result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void givenInvalidLastName_ShouldThrowException(){
        boolean result = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            result = user.checkLastName(null);
            Assert.assertEquals(false,result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenInvalidEmailId_ShouldThrowException(){
        boolean result = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            result = user.checkEmailId(null);
            Assert.assertEquals(false,result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenInvalidMobileNumber_ShouldThrowException(){
        boolean result = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            result = user.checkMobileNumber(null);
            Assert.assertEquals(false,result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenInvalidPassword_ShouldThrowException(){
        boolean result = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            result = user.checkPassword(null);
            Assert.assertEquals(false,result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }

    }
}
