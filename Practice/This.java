class B {
    int a, b;

    public B() {
        System.out.println("Class B first constructor");
    }

    public B(int a, int b) {
        this();
        this.a = a;
        this.b = b;
    }

    public B substract(B b) {
        int x = this.a - b.a;
        int y = this.b - b.b;
        return new B(x, y);
    }

    public void display() {
        System.out.println(this.a + " " + this.b);
    }

}

public class This {
    public static void main(String args[]) {
        B b1 = new B(2, 3);
        B b2 = new B(6, 7);

        // b1.substract(b2);
        B c = b2.substract(b1);
        c.display();

    }
}
