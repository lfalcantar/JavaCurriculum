package com.gm.tutorial.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
        System.out.println(
            ".___  ___. ____    ____      ______      ___       __        ______  __    __   __           ___      .___________.  ______   .______      \n" +
            "|   \\/   | \\   \\  /   /     /      |    /   \\     |  |      /      ||  |  |  | |  |         /   \\     |           | /  __  \\  |   _  \\     \n" +
            "|  \\  /  |  \\   \\/   /     |  ,----'   /  ^  \\    |  |     |  ,----'|  |  |  | |  |        /  ^  \\    `---|  |----`|  |  |  | |  |_)  |    \n" +
            "|  |\\/|  |   \\_    _/      |  |       /  /_\\  \\   |  |     |  |     |  |  |  | |  |       /  /_\\  \\       |  |     |  |  |  | |      /     \n" +
            "|  |  |  |     |  |        |  `----. /  _____  \\  |  `----.|  `----.|  `--'  | |  `----. /  _____  \\      |  |     |  `--'  | |  |\\  \\----.\n" +
            "|__|  |__|     |__|         \\______|/__/     \\__\\ |_______| \\______| \\______/  |_______|/__/     \\__\\     |__|      \\______/  | _| `._____|\n" +
            "                                                                                                       "
        );
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        String validOptions = "+-/*";
        System.out.println("Please select one of the possible options " + validOptions + ". Or x for exit");
        do {

            System.out.print("-> ");
            // get user input, it can be more than one character
            userInput = scanner.nextLine();

            // make user input lowercase
            userInput = userInput.toLowerCase();

            // CONDITION: if user input size is 1
            if(userInput.length() == 1 && validOptions.contains(userInput)) {
                // Get first character of user input
                char userInputFirstCharacter = userInput.charAt(0);

                int firstNumber;
                int secondNumber;
                String result;
                switch (userInputFirstCharacter) {
                    case '+':
                        System.out.println("**Addition**");
                        System.out.print("First number: ");
                        firstNumber = scanner.nextInt();
                        System.out.print("Second Number: ");
                        secondNumber = scanner.nextInt();
                        scanner.nextLine();
                        result = calculateSum(firstNumber, secondNumber);
                        break;
                    case '-':
                        System.out.println("**Subtraction**");
                        System.out.print("First number: ");
                        firstNumber = scanner.nextInt();
                        System.out.print("Second Number: ");
                        secondNumber = scanner.nextInt();
                        scanner.nextLine();
                        result = calculateSubtraction(firstNumber, secondNumber);
                        break;
                    case '/':
                        System.out.println("**Division**");
                        System.out.print("First number: ");
                        firstNumber = scanner.nextInt();
                        System.out.print("Second Number: ");
                        secondNumber = scanner.nextInt();
                        scanner.nextLine();
                        result = calculateDivision(firstNumber, secondNumber);
                        break;
                    case '*':
                        System.out.println("**Multiplication**");
                        System.out.print("First number: ");
                        firstNumber = scanner.nextInt();
                        System.out.print("Second Number: ");
                        secondNumber = scanner.nextInt();
                        scanner.nextLine();
                        result = calculateMultiplication(firstNumber, secondNumber);
                        break;
                    default:
                        result = "Invalid option";
                }
                System.out.println("Result: " + result);
            }
        } while(!"x".equalsIgnoreCase(userInput));
	}

    /**
     TODO Calculate sum X  AND Y AND RETURN THE VALUE
     */
	public static String calculateSum(int x , int y) {
	    int result = 0;




	    return String.valueOf(result);
    }

    /**
     TODO Calculate sum X  AND Y AND RETURN THE VALUE
     */
    public static String calculateSubtraction(int x , int y) {
        int result = 0;



        return String.valueOf(result);
    }

    /**
        TODO calculate multiplication by a combinations of sums

        For example
        6 * 4  = 24  |  6 + 6 + 6 + 6 =  24 | 4 + 4 + 4 + 4 + 4 + 4 = 24

        while

        constraints
        [ ] cannot accept no negative numbers
    */
    public static String calculateMultiplication(int x , int y) {
	    int result  = 0;



        return String.valueOf(result);
    }

    /**
     TODO calculate division by a combinations of sums

     For example
     24 / 6  =  4 |  6 - 6 - 6 - 6 =  0 | 4 - 4 - 4 - 4 - 4 - 4 = 0

     create variable to store counter

     while X is not equal to 0 subtract Y and increment counter;

     constraints
     [ ] if negative numbers return -1
     [ ] if any number is 0 return -1
     */
    public static String calculateDivision(int x , int y) {
        int result = 0;




        return String.valueOf(result);
    }


}
