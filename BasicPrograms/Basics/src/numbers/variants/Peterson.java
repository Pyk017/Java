// A number is said to be Peterson number if the sum of factorial of each digit is equal to the sum of the number itself.
// Ex :- 145
//     1! + 4! + 5! 
//     => 1 + 24 + 120 
//     => 145

package numbers.variants;

public class Peterson {
    public static int factorial(int n) {
        if (n <= 2) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean isPeterson(String num) {
        int n = Integer.parseInt(num);

        if (n <= 2) {
            return true;
        } else {

            int temp = n;
            int sum = 0, rem = 0;
            while (n != 0) {
                rem = n % 10;
                sum += factorial(rem);
                n /= 10;
            }

            return (sum == temp) ? true : false;
        }
    }
}
