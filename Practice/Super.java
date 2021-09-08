class Animal {
    String color = "WHITE";

    Animal() {
        System.out.println("ANIMAL class object created!");
    }

    void print() {
        System.out.println("IN class A!");
    }
}

class Dog extends Animal {
    String color = "BLACK";

    void print() {
        System.out.println(this);
        System.out.println(this.color);
        System.out.println(super.color);
        super.print();

    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
    }
}
