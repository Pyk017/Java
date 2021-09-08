// An Autobiographical number is a number (N) such that the first digit of N counts how many zeroes are present in N,
// the second digit counts how many ones are presented in N, the third digit counts how many twos are present in N,
// and so on. Sometimes, it is also known as a CURIOUS number.
// Example: 1210, 2120001

package numbers.variants;

public class Autobiographical {
    public static boolean isAutobiographical(String num) {
        int number = Integer.parseInt(num);
        int numb = Math.abs(number);

        int n = numb;

        String str = String.valueOf(numb);

        int[] digitArray = new int[str.length()];

        for (int i = digitArray.length - 1; i >= 0; i--) {
            digitArray[i] = n % 10;
            n /= 10;
        }

        boolean flag = true;

        for (int i=0; i<digitArray.length; i++) {
            int count = 0;
            
            for (int j = 0; j<digitArray.length; j++) {
                if (i == digitArray[j]) count++;
            }
            
            if (count != digitArray[i]) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
