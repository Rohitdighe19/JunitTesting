package org.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

class Form_Tests {

    @Test
    public void test_forValidFirstName_true() {
        System.out.println("Positive Testcase to check first name");
        String firstName="Rohit";
        boolean isValid= Form.isValidFirstName(firstName);
        assertTrue(isValid);
    }

    @Test
    public void test_forValidFirstName_false() {
        System.out.println("Negative Testcase to check first name");
        String firstName="rohit";
        boolean isValid= Form.isValidFirstName(firstName);
        assertFalse(isValid);
    }


    @Test
    public void test_forValidFirstName_false_return() {
        System.out.println("Negative Testcase to check first name");
        String lastName="rohit41";
        boolean isValid= Form.isValidLastName(lastName);
        assertFalse(isValid);
    }

    @Test
    public void test_forValidLastName_true() {
        System.out.println("Positive Testcase to check first name");
        String lastName="Dighe";
        boolean isValid= Form.isValidLastName(lastName);
        assertTrue(isValid);
    }

    @Test
    public void test_forValidLastName_false() {
        System.out.println("Negative Testcase to check first name");
        String firstName="dighe";
        boolean isValid= Form.isValidLastName(firstName);
        assertFalse(isValid);
    }


    @Test
    public void test_forValidLasttName_false_return() {
        System.out.println("Negative Testcase to check first name");
        String firstName="Rohit41";
        boolean isValid= Form.isValidFirstName(firstName);
        assertFalse(isValid);
    }


    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object [][] {
                {"rohitdighe47@gmail.com", true},{"dsagf_@.gmail.com",false}});
    }

    private String email;
    private boolean expected;
    public void isValidEmailTest(String email,boolean expected) {
        this.email=email;
        this.expected=expected;
    }

    @Test
    public void testEmailID_shouldReturnAsExpected() {
        boolean isValid=Form.isValidEmailID(email);
        assertEquals(expected, isValid);
    }

    @Test
    public void test_forValidEmailID_true() {
        System.out.println("Positive Testcase to check first name");
        String email="dighe4_kjh@kjh.cvx.in";
        boolean isValid= Form.isValidEmailID(email);
        assertTrue(isValid);
    }

    @Test
    public void test_forValidEmailID_false() {
        System.out.println("Negative Testcase to check first name");
        String email="rohit@.ghas.vb";
        boolean isValid= Form.isValidLastName(email);
        assertFalse(isValid);
    }


    @Test
    public void test_forValidEmailID_false_return() {
        System.out.println("Negative Testcase to check first name");
        String email="@rohit41@vdfbv.sdsa";
        boolean isValid= Form.isValidFirstName(email);
        assertFalse(isValid);
    }


    @Test
    public void test_forValidMobileNumber_true() {
        System.out.println("Positive Testcase to check first name");
        String mobileNumber="+91 7758033848";
        boolean isValid= Form.isValidMobileNumber(mobileNumber);
        assertTrue(isValid);
    }

    @Test
    public void test_forValidMobileNumber_false() {
        System.out.println("Negative Testcase to check first name");
        String mobileNumber="7758057998";
        boolean isValid= Form.isValidMobileNumber(mobileNumber);
        assertFalse(isValid);
    }


    @Test
    public void test_forValidMobileNumber_false_return() {
        System.out.println("Negative Testcase to check first name");
        String mobileNumber="77581122aa";
        boolean isValid= Form.isValidMobileNumber(mobileNumber);
        assertFalse(isValid);
    }

    @Test
    public void test_forValidPassword_true() {
        System.out.println("Positive Testcase to check first name");
        String password="rohit@31cvb";
        boolean isValid= Form.isValidPassword(password);
        assertTrue(isValid);
    }

    @Test
    public void test_forValidPassword_false() {
        System.out.println("Negative Testcase to check first name");
        String password="aaaaa112@";
        boolean isValid= Form.isValidPassword(password);
        assertFalse(isValid);
    }


    @Test
    public void test_forValidPassword_false_return() {
        System.out.println("Negative Testcase to check first name");
        String password="AAaaa112233";
        boolean isValid= Form.isValidPassword(password);
        assertFalse(isValid);
    }



}
	


