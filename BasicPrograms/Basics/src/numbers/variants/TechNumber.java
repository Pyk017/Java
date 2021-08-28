// A number is called as a tech number if the given number has an even number of digits and the number can be divided exactly into two parts
// from the middle. After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square,
// the given number is a tech number, else, not a tech number. 

// Ex:- 3025 is a Tech number.
//     (30) + (25)
//     => 55 => 55^2 
//     => 3025 

//     2025.

package numbers.variants;

public class TechNumber {
    public static boolean isTechNumber(String num) {
        int n = Integer.parseInt(num);

        if (num.length() % 2 != 0) {
            return false;
        } else {

            int midIndex = num.length() / 2;

            String firstNumber = num.substring(0, midIndex);
            String secondNumber = num.substring(midIndex, num.length());

            // System.out.println(firstNumber + " " + secondNumber);

            int temp = (int) Math.pow((Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)), 2);

            return temp == n;

        }
    }
}
