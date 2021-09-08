class ParentInitial {
    ParentInitial() {
        System.out.println("Parent Class constructor invoked!");
    }
}

class Initial extends ParentInitial {
    public Initial() {
        super();
        System.out.println("Child class constructor invoked!");
    }

    {
        System.out.println("Third Initializer block invoked!");
    }

    {
        System.out.println("First Initializer block invoked!");
    }

    {
        System.out.println("Second Initializer block invoked!");
    }

    public Initial(int a) {
        super();
        System.out.println("Child class constructor invoked! " + a);
    }
}

public class InstanceInitializerBlock {
    public static void main(String[] args) {
        new Initial();
        new Initial(23);
    }
}
