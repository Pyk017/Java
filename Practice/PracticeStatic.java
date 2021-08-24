class A {

    int id;
    static String name = "Kumar";

    static void staticMethod() {
        name = "Prakhar";
    }

    void normalMethod() {
        id = 90;
        name = null;
    }

}

public class PracticeStatic {

    static {
        System.out.println("This is Static Block!");
    }

    public static void main(String args[]) {

        A test1 = new A(), test2 = new A();

        System.out.println(A.name);
        A.staticMethod();

        System.out.println(test2.name);

    }

    static {
        System.out.println("This is another one     static block !@");
    }

    static {
        System.out.println("This is another static block !@");
    }

}
