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
}
