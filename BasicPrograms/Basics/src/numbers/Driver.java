package numbers;

import java.util.Scanner;

import numbers.variants.Reverse;
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
                    + "Enter 7 to check if the number is Fascinating number or not.\n"
                    + "Enter 8 to check if the number is Keith Number or not.\n"
                    + "Enter 9 to check if the number is Neon Number or not.\n"
                    + "Enter 10 to check if the number is Spy Number or not.\n"
                    + "Enter 11 to check if the number is Autobiographical Number or not.\n"
                    + "Enter 12 to check if the number is Emirp Number or not.\n"
                    + "Enter q to find the Reverse of the Number.\n");

            String option = scan.next();

            if (option.charAt(0) == 'q') {
                break;
            } else {
                switch (option) {
                    case "1":
                        String input = getInput("Enter a number to find the reverse :- ");
                        long result = Reverse.reverse(input);
                        output(String.valueOf(result), "REVERSE NUMBER");
                        break;
                    case "2":
                        input = getInput("Enter number to turn it into words :- ");
                        String words = NumtoWord.numToWord(input);
                        output(words, "NUMBER IN WORDS :- ");
                        break;
                    case "3":
                        input = getInput("Enter number to check if it is Automorphic or not :- ");
                        boolean isAuto = Automorphic.isAutomorphic(input);
                        output(String.valueOf(isAuto), "AUTOMORPHIC");
                        break;
                    case "4":
                        input = getInput("Enter number to check if it is Peterson's number or not :- ");
                        boolean isPeterson = Peterson.isPeterson(input);
                        output(String.valueOf(isPeterson), "PETERSON");
                        break;
                    case "5":
                        input = getInput("Enter number to check if it is Sunny's number or not :- ");
                        boolean isSunny = Sunny.isSunny(input);
                        output(String.valueOf(isSunny), "SUNNY");
                        break;
                    case "6":
                        input = getInput("Enter number to check if it is Tech Number or not :- ");
                        boolean isTechNum = TechNumber.isTechNumber(input);
                        output(String.valueOf(isTechNum), "TECH NUMBER");
                        break;
                    case "7":
                        input = getInput("Enter number to check if it is Fascinating number or not :- ");
                        boolean isFascinating = Fascinating.isFascinating(input);
                        output(String.valueOf(isFascinating), "FASCINATING NUMBER");
                        break;
                    case "8":
                        input = getInput("Enter number to check if it is Keith Number or not :- ");
                        boolean isKeith = Keith.isKeith(input);
                        output(String.valueOf(isKeith), "KEITH NUMBER");
                        break;
                    case "9":
                        input = getInput("Enter number to check if it is Neon Number or not :- ");
                        boolean isNeon = Neon.isNeon(input);
                        output(String.valueOf(isNeon), "NEON NUMBER");
                        break;
                    case "10":
                        input = getInput("Enter number to check if it is Spy Number or not :- ");
                        boolean isSpy = Spy.isSpy(input);
                        output(String.valueOf(isSpy), "SPY NUMBER");
                        break;
                    case "11":
                        input = getInput("Enter number to check if it is Autobiographical Number or not :- ");
                        boolean isAutobio = Autobiographical.isAutobiographical(input);
                        output(String.valueOf(isAutobio), "AUTOBIOGRAPHICAL NUMBER");
                        break;
                    case "12":
                        input = getInput("Enter number to check if it is Emirp Number or not :- ");
                        boolean isEmirp = Emirp.isEmirp(input);
                        output(String.valueOf(isEmirp), "EMIRP NUMBER");
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
