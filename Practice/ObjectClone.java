class Test1 implements Cloneable{
    int roll;
    String name;

    Test1 (int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println(super.toString());
        return super.clone();
    }

}

public class ObjectClone {
    public static void main(String[] args) {

        try {

            Test1 obj = new Test1(7891, "Prakhar");
            Test1 obj2 = (Test1) obj.clone();

            System.out.println(obj.name + " " + obj.roll);
            System.out.println(obj2.name + " " + obj2.roll);
            System.out.println(obj.hashCode() + " " + obj2.hashCode());

        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
