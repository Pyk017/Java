package arrays.variants;

import java.util.Arrays;
import java.util.Collections;

public class PrintReverse {
    public static String printReverse(String array) {
        int[] arr = Helper.stringToIntegerArray(array);


        Collections.reverse(Arrays.asList(arr));

        return Arrays.asList(arr).toString();

    }
}
