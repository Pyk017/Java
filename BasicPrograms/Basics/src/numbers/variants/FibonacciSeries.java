package numbers.variants;

public class FibonacciSeries {

    public static boolean fiboSeriesOptimised(String num) {

        try {
             
            int n = Integer.parseInt(num);

            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 0;
            arr[2] = 1;
            arr[3] = 1;
    
            for (int i = 4; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print("Fibonacci Series :- ");
            display(arr);

        } catch (Exception e) {
            System.out.println("Some Error Occured !");
            return false;
        }


        return true;
    }

    public static void display(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
