import java.util.Scanner;

public class ASCII {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Character to find its ASCII value :- ");
        char ch = scan.next().charAt(0);

        int ascii = ch;

        System.out.println("The ASCII value of character is :- " + ascii);

        scan.close();
    }
}
