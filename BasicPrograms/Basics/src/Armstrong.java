import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to check if it is Armstrong number or not :- ");
        int n = scan.nextInt();

        boolean result = isArmstrong(n);

        if (result) {
            System.out.println("ARMSTRONG NUMBER!");
        } else {
            System.out.println("NOT A ARMSTRONG NUMBER!");
        }
        scan.close();
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += (rem * rem * rem);
            n /= 10;
        }
        return (temp == sum) ? true : false;
    }
}
