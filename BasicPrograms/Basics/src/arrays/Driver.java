package arrays;
import java.util.Scanner;
import arrays.variants.*;


public class Driver {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nEnter the option to perform the following programs :- \n"
                                + "Press 1 for Program to copy all elements of one array into another array.\n"
                                + "Press 2 for Program to find the frequency of each element in the array.\n"
                                + "Press 3 for Program to left rotate the elements of an array.\n"
                                + "Press 4 for Program to print the duplicate elements of an array.\n"
                                + "Press q to exit!");

            String option = scan.nextLine().trim();

            if (option.charAt(0) == 'q') {
                break;
            } else {
                switch (option) {
                    case "1":
                        String array = getInput("Enter elements (separated by whitespace) :- ");
                        String resultantArray = CopyElements.copyingElements(array);
                        showOutput(resultantArray, "New Array elements are :- ");
                        break;
                    case "2":
                        array = getInput("Enter elements (separated by whitespace) :- ");
                        resultantArray = FrequencyCounter.countingFrequency(array);
                        showOutput(resultantArray, "Frequency of elements are :- ");
                        break;
                    case "3":
                        array = getInput("Enter elements (separated by whitespace) :- ");
                        String degree = getInput("Enter Degree of rotation :- ");
                        resultantArray = LeftRotate.rotatingLeft(array, degree);
                        showOutput(resultantArray, "Rotated Array is :- ");
                        break;
                    case "4":
                        array = getInput("Enter elements (separated by whitespace) :- ");
                        resultantArray = DublicateElements.duplicateElements(array);
                        showOutput(resultantArray, "Dublicate elements are :- ");
                        break;
                    default:
                        System.out.println("Invalid Option!");
                        break;
                }
            }
        }   

    }


    public static String getInput(String prompt) {
        System.out.print(prompt);
        String input = scan.nextLine();
        return input.trim();
    }

    public static void showOutput(String result, String prompt) {
        System.out.println(prompt + result);
    }
}
