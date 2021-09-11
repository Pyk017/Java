package numbers.variants;

public class Armstrong {

    public static boolean isArmstrong(String num) {
        int n = Integer.parseInt(num);
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
