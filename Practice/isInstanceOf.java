class Instance {

}

class SubInstance extends Instance{
    static void method(Instance i) {
        if (i instanceof SubInstance) {
            System.out.println("in method 'i' :- " + i);
            SubInstance sub = (SubInstance) i;
            System.out.println("in method 'sub' :- " + sub);
            System.out.println("Downcasting Applied Successfully!");
        }
    }
}

public class isInstanceOf{
    public static void main(String[] args) {

        Instance ins = new SubInstance();

        System.out.println("In main 'ins' :- " + ins);

        SubInstance.method(ins);

    }
}
