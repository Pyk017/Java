// A number is called an EMIRP number if we get another prime number on reversing the number itself. 
// In other words, an emirp number is a number that is prime forwards or backwards. It is also known as Twisted Prime Number.
// Example: 79, 13 199 107 113 1399 1583 1201 3049 etc.

package numbers.variants;

public class Emirp {

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

    public static boolean isEmirp(String num) {
        StringBuffer buffer = new StringBuffer(num);

        int num1 = Integer.parseInt(buffer.toString());
        int num2 = Integer.parseInt(buffer.reverse().toString());

        return isPrime(num1) == isPrime(num2);
    }
}
