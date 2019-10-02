package com.gm.tutorial.basics;

/**
 * multiple returns
 */
public class FunctionsConditions {
    public static void main(String[] args) {
        int counter = 100;
        int valueReturnedFromFunction = fuctionWithCondition(counter);
        System.out.println(valueReturnedFromFunction);
    }

    private static int fuctionWithCondition(int counter) {
        if (counter == 100) {
            return 0;
        } else {
            return -1;
        }
    }
}
