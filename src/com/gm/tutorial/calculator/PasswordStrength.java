package com.gm.tutorial.calculator;

import java.util.Base64;

/**
 * final keyword
 */
public class PasswordStrength {

    static String SECURE_PASSWORD = "MTIzNjU4NzQ=";

    public static void main(String[] args) {
        // TODO find the correct password is a number between 0 to 13,000,000

        System.out.println(checkPassword(1));
        System.out.println(checkPassword(2));
        System.out.println(checkPassword(12999999));
        System.out.println(checkPassword(13000000));
    }


    public static boolean checkPassword(int password) {
        String encodedPassword = Base64.getEncoder().encodeToString(String.valueOf(password).getBytes());
        System.out.println("Comparing " + encodedPassword  + " with secure password : " + SECURE_PASSWORD);
        if(encodedPassword.equals(SECURE_PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
