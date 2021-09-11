package arrays;
import java.util.Scanner;

public class Driver {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


    }


    public static String getInput(String prompt) {
        System.out.print(prompt);
        String input = scan.nextLine();
        return input;
    }

    public static void showOutput(String result, String prompt) {
        System.out.println(prompt + result);
    }
}
