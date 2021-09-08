import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total numbers of Fibonacci series required :- ");
        int n = scan.nextInt();

        int result = fiboSeries(n);

        System.out.println("Nth Fibonacci number is :- " + result);

        System.out.println("Fibonacci Series is :- ");

        fiboSeriesOptimised(n);

        scan.close();
    }

    public static int fiboSeries(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2 || n == 3) {
            return 1;
        } else {
            return fiboSeries(n - 1) + fiboSeries(n - 2);
        }

    }

    public static void fiboSeriesOptimised(int n) {
        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;

        for (int i = 4; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
