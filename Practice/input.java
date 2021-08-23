
import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner inner = new Scanner(System.in);

        System.out.println("Enter your First Name :- ");
        String firstName = inner.next();

        System.out.println("Enter your Second Name :- ");
        String secondName = inner.next();

        System.out.println("Your Name is :- " + firstName + " " + secondName);

        inner.close();
    }
}
