package arrays.variants;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static String countingFrequency(String array) {
        int[] ar = Helper.stringToIntegerArray(array);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<ar.length; i++) {
            
            if (map.get(ar[i]) == null) {
                map.put(ar[i], 1);
            } else {
                map.put(ar[i], map.get(ar[i]) + 1);
            }

        }
        // Helper.printMap(map);
        return map.toString();

    }
}
