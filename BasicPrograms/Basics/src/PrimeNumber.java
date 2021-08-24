import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to check if the number is Prime or not :- ");
        int n = scan.nextInt();

        boolean result = isPrime(n);

        if (result) {
            System.out.println("Your Number is a Prime Number!");
        } else {
            System.out.println("Your Number is not a Prime Number!");
        }

        System.out.print("Enter the upper bound of Prime Number Series :- ");
        int m = scan.nextInt();

        displaySeries(m);

        scan.close();
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else {

            int SQR = (int) Math.ceil(Math.sqrt(n));

            for (int i = 2; i <= SQR; i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        }
    }

    public static void displaySeries(int m) {
        for (int i = 1; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
