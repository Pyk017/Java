package numbers.variants;

public class Reverse {

    public static long reverse(String num){
        return Reverse.reverse(Long.parseLong(num));
    }

    public static long reverse(long n) {
        long sum = 0, rem=0;
        while (n > 0) {
            rem = n % 10;
            sum = sum*10 + rem;
            n /= 10;
        }
        return sum;
    }
}
