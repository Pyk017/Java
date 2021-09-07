// A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
// Example: 9, 45 etc.

package numbers.variants;

public class Neon {
    public static boolean isNeon(String num) {
        String temp = String.valueOf((int)Math.pow(Integer.parseInt(num), 2));
        
        int s = 0;
        for (String n: temp.split("")) {
            s += Integer.parseInt(n);
        }
        
        return s == Integer.parseInt(num);
    }
}
