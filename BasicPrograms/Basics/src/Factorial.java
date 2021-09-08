import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter element to find Factorial :- ");
        int n = scan.nextInt();

        long result = factorial(n);

        System.out.println("Factorial :- " + result);

        scan.close();
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n) * factorial(n - 1);
        }
    }

    public static long factorialNonRecursive(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
