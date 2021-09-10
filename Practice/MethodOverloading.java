class Overload {
    int add(int a, int b) {
        System.out.println("above one");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("down one");

        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        // Overload over = new Overload();
        // System.out.println(over.add(1, 32));
        // System.out.println(over.add(2, 32));

        System.out.println("In main args[]");
        MethodOverloading.main("Prakhar"); // Overloading main method.
    }

    public static void main(String args) {
        System.out.println("In main args");
    }

    public static void main(int maa) {
        System.out.println("In main maa");

    }

}
