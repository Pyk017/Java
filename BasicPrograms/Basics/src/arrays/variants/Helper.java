package arrays.variants;

import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static void print(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }

    public static void print(String[] array) {
        for (String string: array) {
            System.out.print(string + " ");
        }
    }

    public static int[] stringToIntegerArray(String array) {

        String[] arr = array.split(" ");

        int[] result = stringArraytoIntegerArray(arr);

        return result;

    }

    public static int[] stringArraytoIntegerArray(String[] array) {

        int[] arr = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        return arr;
    }

    public static String[] integerArrayToStringArray(int[] array) {
        String[] stringArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            stringArray[i] = String.valueOf(array[i]);
        }

        return stringArray;
    } 

    public static String integerArrayToString(int[] array) {
        String[] stringArray = integerArrayToStringArray(array);

        return String.join(" ", stringArray);

    }


    public static void printMap(Map<Integer, Integer> map) {
        System.out.println("Mapping :- ");
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }    
    }

    public static Map<Integer, Integer> giveFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i =0; i<arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        return map;
    }


}
