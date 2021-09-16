package arrays.variants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DublicateElements {
    public static String duplicateElements (String array) {
        int[] arr = Helper.stringToIntegerArray(array);

        Map<Integer, Integer> map = Helper.giveFrequency(arr);

        List<Integer> list = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if ( entry.getValue() > 1 ) {
                list.add(entry.getKey());
            }
        }
        
        StringBuilder builder = new StringBuilder();

        for (Integer ele: list) {
            builder.append(ele + " ");
        }
        

        return builder.toString().trim();
    }
}
