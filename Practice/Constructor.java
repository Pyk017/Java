class Tester {

    int a;
    float b;

    public Tester(int a, float b) {
        this.a = a;
        this.b = b;
    }

    public Tester(Tester tst) { // Copy Constructor.
        this.a = tst.a;
        this.b = tst.b;
    }

    public void display() {
        System.out.println(this.a + " " + this.b);
    }

}

public class Constructor {
    public static void main(String args[]) {

        Tester test1 = new Tester(2, 3.4f);
        Tester test2 = new Tester(test1); // Copying data from object1 to object2 using copy constructor

        test1.display();
        test2.display();

    }
}
