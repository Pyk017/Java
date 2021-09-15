class ParentClass {
    //? defining a method

    void msg () throws ArithmeticException {
        System.out.println("parent method");
    }
}

class ChildClass extends ParentClass{   
    void msg()  {
        super.msg();
        System.out.println("Child Classs msg method");
    }
}

public class ExceptionHandlingMethodOverriding {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.msg();
    }
}
