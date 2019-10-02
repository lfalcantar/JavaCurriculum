package com.gm.tutorial.basics;

/**
 * function structure
 *  <EncapsulationType> <returnType> <name> ([parameters...]) {}
 */
public class Functions {

    public static void main(String[] args) {
        int number = 71;
        callFunctionWithParameter(71);
    }

    private static void callFunctionWithParameter(int i) {
        System.out.println(i);
    }
}
