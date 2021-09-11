package numbers.variants;
import java.lang.Math;

public class PrimeNumber {

    public static boolean isPrime(String num) {
        int n = Integer.parseInt(num);
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

    public static void displaySeries(String num) {
        int m = Integer.parseInt(num);
        System.out.print("PRIME NUMBER SERIES :- ");
        for (int i = 1; i <= m; i++) {
            if (isPrime(String.valueOf(i))) {
                System.out.print(i + " ");
            }
        }
    }

}
