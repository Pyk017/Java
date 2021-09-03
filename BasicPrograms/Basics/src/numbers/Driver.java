package numbers;

import java.util.Scanner;
import numbers.variants.*;

public class Driver {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter 1 for REVERSE NUMBER.\n" + "Enter 2 for NUMBER to WORD.\n"
                    + "Enter 3 to find the AUTOMORPHICITY of the Number.\n"
                    + "Enter 4 to check if the number is PETERSON's Number or not.\n"
                    + "Enter 5 to check if the number is SUNNY's number or not.\n"
                    + "Enter 6 to check if the number is Tech number or not.\n"
                    + "Enter q to find the Reverse of the Number.\n");

            char option = scan.next().charAt(0);

            if (option == 'q') {
                break;
            } else {
                switch (option) {
                    case '1':
                        String input = getInput("Enter a number to find the reverse :- ");
                        long result = Reverse.reverse(input);
                        output(String.valueOf(result), "REVERSE NUMBER");
                        break;
                    case '2':
                        input = getInput("Enter number to turn it into words :- ");
                        String words = NumtoWord.numToWord(input);
                        output(words, "NUMBER IN WORDS :- ");
                        break;
                    case '3':
                        input = getInput("Enter number to check if it is Automorphic or not :- ");
                        boolean isAuto = Automorphic.isAutomorphic(input);
                        output(String.valueOf(isAuto), "AUTOMORPHIC");
                        break;
                    case '4':
                        input = getInput("Enter number to check if it is Peterson's number or not :- ");
                        boolean isPeterson = Peterson.isPeterson(input);
                        output(String.valueOf(isPeterson), "PETERSON");
                        break;
                    case '5':
                        input = getInput("Enter number to check if it is Sunny's number or not :- ");
                        boolean isSunny = Sunny.isSunny(input);
                        output(String.valueOf(isSunny), "SUNNY");
                        break;
                    case '6':
                        input = getInput("Enter number to check if it is Tech Number or not :- ");
                        boolean isTechNum = TechNumber.isTechNumber(input);
                        output(String.valueOf(isTechNum), "TECH NUMBER");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
            }
        }

        scan.close();

    }

    public static String getInput(String input) {
        System.out.print(input);
        return scan.next();
    }

    public static void output(String result, String message) {
        if (result != null) {
            System.out.println(message + " :- " + result + "\n");
        }
    }

}
