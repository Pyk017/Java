public class WrapperClass {
    public static void main(String[] args) {
        double a = 20.65;
        Integer i = (int)(a);
        Integer j = (int)a;

        int k = j.intValue();
        Double d = Double.valueOf(a);
        

        System.out.println(a);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(d);
        
        

    }        
}
