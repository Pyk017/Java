class Parent {

}

class Temp extends Parent{

}

class temp1 {}

public class ObjectClass {
    public static void main(String[] args) {

        Object obj = new Temp();
        System.out.println(obj);
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(new Temp().hashCode() + " " + new Parent().hashCode());
        System.out.println(new Temp().equals(new Parent()));
        System.err.println(obj.toString());
        
        Object obj2 = obj;

        System.out.println(obj2.hashCode() + " " + obj.hashCode());
        
    }
}
