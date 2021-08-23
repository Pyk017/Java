import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter Numeric Value :- ");
        // String strValue1 = scanner.nextLine();
        // double a = Double.parseDouble(strValue1);

        // System.out.print("Enter another numeric Value :- ");
        // String strValue2 = scanner.nextLine();
        // double b = Double.parseDouble(strValue2);

        // double c = a + b;

        // System.out.println("Result is :- " + c);

        // String strValue1 = Double.toString(a);
        // String strValue2 = Double.toString(b);

        // BigDecimal bdValue1 = new BigDecimal(strValue1);
        // BigDecimal bdValue2 = new BigDecimal(strValue2);

        // BigDecimal result = bdValue1.add(bdValue2);

        // System.out.println("Answer is :- " +  result.toString());

        String value1 = getInput("Enter Value :- ");
        String value2 = getInput("Enter Value :- ");
        String operator = getInput("Enter Operator (+, -, x, /) :- ");

        // String result = addValues(23, value1, value2, "100.1");
        String result = operation(operator, value1, value2);
        System.out.println(result);
        
        
        // scanner.close();
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String addValues(String... value){
        double result = 0;
        for (String val: value) {
            double d = Double.parseDouble(val);
            result += d;
        }
        return Double.toString(result);
    }

    private static String operation(String op, String... value) {
        double result = 0;
        for (String val: value) {
            double d = Double.parseDouble(val);
            switch (op) {
                case "+":
                    result += d;
                    break;
                case "-":
                    result = (result == 0) ? d: result;
                    result -= d;
                    break;
                case "x":
                    result = (result == 0.0) ? 1: result;
                    result *= d;
                    break;
                case "/":
                    result = (result == 0.0) ? 1: result;
                    result /= d;
                    break;
                default:
                    System.out.println("Invalid Input entered!");
                    break;
            }
        }

        return Double.toString(result);
    }

}