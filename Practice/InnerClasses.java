abstract class AnonymousInnerClass {
    abstract void eat();
}

interface AnonymousInnerInterface {
    void eat();
}

class TestamentualClass {
    int x = 10;
}

class LocalOuterClass {
    private int data = 30;
    void display() {
        int data = 50;
        class LocalInnerClass {
            void msg() {
                System.out.println("Local Inner class data :- " + data);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.msg();
        System.out.println("Local Outer class data :- " + this.data);
    }
}


class StaticOuterClass {
    static int data = 30;
    static class Inner {
        void msg() {
            System.out.println("In msg() method of class Inner of StaticOuterClass " + data);
        }
        static void display() {
            System.out.println("In static display() method of class Inner of StaticOuterClass " + data);
        }
    }
}


class OuterClass {
    private int x = 10;
    class MemberInnerClass {
        int inner = 20;
        void msg() {
            System.out.println("data is :- " + x);
        }
    }
}


public class InnerClasses {
    public static void main(String[] args) {

        //? Instantiating MemberInnerClass obj using Outer Class.
        // OuterClass outerClass = new OuterClass();
        // OuterClass.MemberInnerClass in = outerClass.new MemberInnerClass();

        // in.msg();
        // System.out.println(in.inner + "\n");

        //? Instantiating AnonymousInnerClass
        // AnonymousInnerClass aic = new AnonymousInnerClass(){
        //     void eat() {
        //         System.out.println("We should eat food regularly!");
        //     }
        // };
        
        // AnonymousInnerInterface aii = new AnonymousInnerInterface(){
        //     public void eat() {
        //         System.out.println("We definetly should eat full food regularly!");
        //     }
        // };

        // aic.eat();
        // aii.eat();

        // TestamentualClass tc = new TestamentualClass(){};

        // System.out.println(tc.x);


        //? Instantiating Local Inner CLasses
        // LocalOuterClass localOuterClass = new LocalOuterClass();
        // localOuterClass.display();

        //? Instantiating Static Inner Class
        StaticOuterClass.Inner obj = new StaticOuterClass.Inner();
        obj.msg();
        StaticOuterClass.Inner.display();


    }
}
