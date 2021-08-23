import java.util.Scanner;

class Test {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("Enter the value1 :- ");
        String input1 = scanner.nextLine();

        System.out.print("Enter the value2 :- ");
        String input2 = scanner.nextLine();

        sb.append(input1)
            .append(", ")
            .append(input2);

        System.out.println(sb.toString());

        scanner.close();

    }
}