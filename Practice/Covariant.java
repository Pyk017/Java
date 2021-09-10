class A1 {
    A1 get() {
        return this;
    }

    void print() {
        System.out.println("IN CLASS A!");
    }
}

class B1 extends A1 {
    @Override
    A1 get() {
        return this;
    }

    void print() {
        System.out.println("IN class B!");
    }
}

class C1 extends A1 {
    @Override
    A1 get() {
        return this;
    }

    void print() {
        System.out.println("IN CLASS C!");
    }
}

public class Covariant {
    public static void main(String[] args) {
        A1 a = new A1();
        a.get().print();
        System.out.println(a.get());

        B1 b = new B1();
        b.get().print();
        System.out.println(b.get());

        C1 c = new C1();
        c.get().print();
        System.out.println(c.get());

    }
}
