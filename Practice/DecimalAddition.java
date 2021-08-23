import java.math.BigDecimal;

public class DecimalAddition {
    public static void main(String args[]) {
        // Scanner inner = new Scanner(System.in);

        double value = .012;

        String strValue = Double.toString(value);

        BigDecimal  bd = new BigDecimal(strValue);

        BigDecimal result = bd.add(bd).add(bd);

        System.out.println(result);
    }
}
