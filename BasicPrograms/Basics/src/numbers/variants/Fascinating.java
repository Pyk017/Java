// Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called 
// a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

// In other words, we can also say that a number may be fascinating number if it satisfies the following two conditions:
// 1. If the given number is a 3 or more than three-digits.
// 2. If the value getting after concatenation contains all digits from 1 to 9, exactly once.

// For Example: 192, 1920, 2019, 327, etc.



package numbers.variants;

public class Fascinating {

    public static boolean isFascinating(String num) {
        long n = Long.parseLong(num);

        String numByTwo = String.valueOf(n * 2);
        String numByThree = String.valueOf(n* 3);

        String finalNum = num + numByTwo + numByThree;

        int[] arr = new int[10];

        for (char character: finalNum.toCharArray()) {
            int temp = Integer.parseInt(String.valueOf(character));

            if (temp != 0) {

                if (arr[temp] == 0) {
                    arr[temp] += 1;
                } else {
                    return false;
                }
            }
            
        }
        return true;
    }
}
