// A number is called an automorphic number if and only if the square of the given number ends with the same number itsef.
// Ex: 25 => 625 (ends with 25)
//     76 => 5776 (ends with 76)
//     36, 890625.

package numbers.variants;

public class Automorphic {
    public static boolean isAutomorphic(String num) {
        int n = Integer.parseInt(num);
        long sqr = n * n;

        String sqrNumber = String.valueOf(sqr);

        int i = num.length() - 1;
        int j = sqrNumber.length() - 1;
        System.out.println(sqrNumber);
        while (i >= 0) {
            if (sqrNumber.charAt(j) != num.charAt(i)) {
                System.out.println(sqrNumber.charAt(j) + " " + num.charAt(i));
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
