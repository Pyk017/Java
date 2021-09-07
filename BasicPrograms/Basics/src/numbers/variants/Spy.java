// A positive integer is called a spy number if the sum and product of its digits are equal.
// In other words, a number whose sum and product of all digits are equal is called a spy number.
// Example: 1124.

package numbers.variants;

public class Spy {

    public static long product(int[] arr) {
        long result = 1;

        for (int n: arr) {
            result *= n;
        }
        return result;
    }

    public static long addition(int[] arr) {
        long result = 0;

        for (int n: arr) {
            result += n;
        }
        return result;
    }

    public static boolean isSpy(String num) {

        int[] arr = new int[num.length()];

        for (int i=0; i<num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
        }

        return product(arr) == addition(arr);
    }
}
