package arrays.variants;

public class CopyElements {
    public static String copyingElements(String array) {
        int[] arr = Helper.stringToIntegerArray(array);

        int[] newArray = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            newArray[i] = arr[i];
        }

        return Helper.integerArrayToString(newArray);

    }
}
