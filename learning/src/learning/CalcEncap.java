package learning;

import java.util.Scanner;
import learning.utilities.MathHelper;

public class CalcEncap {
    public static void main(String args[]) {
        CalcEncap calc = new CalcEncap();
        calc.calculate();

    }

    protected void calculate() {

        InputHelper input = new InputHelper();
        
        String s1 = input.getInput("Enter first value :- ");
        String s2 = input.getInput("Enter second value :- ");
        String op = input.getInput("Enter the operation to be performed (+, -, *, /) :- ");

        double result = 0;

        try {
            switch(op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.substractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Invalid Operator!");
                    break;
            }

            System.out.println("The answer is :- " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception :- " + e.getMessage());    
        }
    }

    class InputHelper {
        private String getInput(String prompt) {
            System.out.print(prompt);
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }
    }
}
