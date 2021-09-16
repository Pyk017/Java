package arrays.variants;

public class LeftRotate {
    public static String rotatingLeft(String array, String degree) {
        int[] arr = Helper.stringToIntegerArray(array);

        int deg = Integer.parseInt(degree);

        int[] result = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            result[i] = arr[(i + deg) % arr.length];
        } 

        return Helper.integerArrayToString(result);
    }
}
