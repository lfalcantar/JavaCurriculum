package com.gm.tutorial.basics;

import java.time.chrono.MinguoChronology;

/**
 * return statements
 */
public class FunctionsReturn {
    public static void main(String[] args) {
        int valueReturnedFromMethod = functionThatReturnsANumber();

        System.out.println(valueReturnedFromMethod);
    }

    private static int functionThatReturnsANumber() {
        return 21;
    }

    // TODO Create a new function with name getCharacterValue that returns a char and print the char to the console
    // TODO Create a new function with name getBooleanValue that returns a boolean and print the boolean to the console
}
