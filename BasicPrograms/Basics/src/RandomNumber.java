import java.util.Scanner;
import java.lang.Math;

public class RandomNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper bound and lower bound :- ");
        String[] str = scan.nextLine().split(" ");
        int lb = Integer.parseInt(str[0]);
        int ub = Integer.parseInt(str[1]);

        int result = generateRandom(lb, ub);

        System.out.println("Random Number :- " + result);

        scan.close();
    }

    public static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

}
