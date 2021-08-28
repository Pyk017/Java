package numbers;

import java.util.Scanner;
import numbers.variants.Reverse;


public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();
                    
        long result = Reverse.reverse(num);

        System.out.println("Reverse of the Number is :- " + result);
        scan.close();

    }
}
