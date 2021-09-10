// A number is called a sunny number if the number next to the given number is a perfect square.
// A number N will be a sunny number is N+1 is a perfect square.

// Ex. 80 (as 81 is a perfect number)

package numbers.variants;

public class Sunny {
    public static boolean isSunny(String num) {
        int n = Integer.parseInt(num);

        int number = n + 1;

        int temp = (int) Math.sqrt(number);

        return Math.pow(temp, 2) == n;

    }
}
