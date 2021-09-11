package numbers.variants;
import java.lang.Math;

public class RandomNumber {

    public static String generateRandom(String num) {
        String[] ar = num.trim().split(" ");

        int min = Integer.parseInt(ar[0]);
        int max = Integer.parseInt(ar[1]);

        return String.valueOf((int) (Math.random() * (max - min + 1) + min));
    }

}
