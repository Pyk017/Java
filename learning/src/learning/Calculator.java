package learning;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        String s1 = getInput("Enter first value :- ");
        String s2 = getInput("Enter second value :- ");
        String op = getInput("Enter the operation to be performed (+, -, *, /) :- ");

        double result = 0;

        try {
            switch(op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = substractValues(s1, s2);
                    break;
                case "*":
                    result = multiplyValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Invalid Operator!");
                    break;
            }

            System.out.println("The answer is :- " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception :- " + e.getMessage());    
        }

    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static double addValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 + d2;
    }

    private static double substractValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 - d2;
    }

    private static double multiplyValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 * d2;
    }

    private static double divideValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 / d2;
    }
}
