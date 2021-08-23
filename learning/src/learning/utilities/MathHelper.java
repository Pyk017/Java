package learning.utilities;

public class MathHelper {
    public static double addValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 + d2;
    }

    public static double substractValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 - d2;
    }

    public static double multiplyValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 * d2;
    }

    public static double divideValues(String val1, String val2) {
        double d1 = Double.parseDouble(val1);
        double d2 = Double.parseDouble(val2);
        return d1 / d2;
    }
}
