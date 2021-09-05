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
