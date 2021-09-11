package numbers.variants;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        int midValue = str.length() / 2;

        int i = 0;
        while (i++ <= midValue) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeInteger(int n) {
        int x = n;
        int temp = 0;
        while (n > 0) {
            int r = n % 10;
            temp = temp * 10 + r;
            n /= 10;
        }

        return (temp == x) ? true : false;
    }

}
