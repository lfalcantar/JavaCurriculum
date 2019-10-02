package com.gm.tutorial.basics;

/**
 * or and and
 */
public class IfStatementsPart3 {

    public static void main(String[] args) {

        /**
         *  || ->  or
         *  && -> and
         */

        char letter = 'v';

        if(letter == 'b' || letter == 'v') {
            System.out.println("letter b or v");
        } else {
            System.out.println("invalid input");
        }

    }
}
