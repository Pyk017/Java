interface Printable1 {
    int MIN = 5;
    void print();
    default void show() {
        System.out.println("Default method");
    } 
    static void calci() {
        System.out.println("IN static method");
    }
}

interface Printable2 {
    void print();
}

class A2 implements Printable1, Printable2 {

    @Override
    public void print() {
        System.out.println("IN class A2! " + MIN);
        show();
        Printable1.calci();
    }

}

public class Interface {
    public static void main(String[] args) {
        Printable1 a = new A2();
        a.print();  
    }
}