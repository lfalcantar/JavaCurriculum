package com.gm.tutorial.basics;

/**
 * multiple returns
 */
public class FunctionsConditions {
    public static void main(String[] args) {
        int counter = 100;
        boolean valueReturnedFromFunction = functionWithCondition(counter);
        System.out.println(valueReturnedFromFunction);


    }

    private static boolean functionWithCondition(int counter) {
        if (counter == 100) {
            return true;
        } else {
            return false;
        }
    }


    // TODO Create a new function with name isEven that returns a boolean (true| false) if the parameter x is an even number
    // TODO Create a new for loop in main from 1 to 100 and use the isEven method to print only even numbers
}
