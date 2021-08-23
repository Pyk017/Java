import java.util.*;

public class PracticeArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 9, 7, 4};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
