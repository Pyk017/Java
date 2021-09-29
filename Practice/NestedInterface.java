interface Showable {
    void show();
    interface Message {
        void msg();
    }
}

class Aclass {
    interface B {
        void msg1();
    }

    void show1() {
        System.out.println("Nested Interface (class Aclass)");
    }

}


public class NestedInterface extends Aclass implements Showable, Showable.Message, Aclass.B {

    public void show() {
        System.out.println("Nested Interface (interface Showable)");
    }

    public void msg() {
        System.out.println("Nested Interface (interface Message)");
    }

    public static void main(String[] args) {
        Showable.Message obj = new NestedInterface();
        Showable showable = new NestedInterface();
        Aclass.B obj2 = new NestedInterface();
        obj.msg();
        showable.show();
        obj2.msg1();
        new NestedInterface().show1();
    }

    public void msg1() {
        System.out.println("Nested Interface (interface B)");
        
    }
}
 