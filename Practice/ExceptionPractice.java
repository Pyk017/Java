public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            int [] ar = new int[5];
            
            try {
                int data = 100/0;
                System.out.println(data);
            } catch (ArithmeticException ae) {
                System.out.println(ae);
            }



            System.out.println(ar[10]);
            // int data = 100/0;
            // System.out.println(data);
        } catch (ArithmeticException ae) {
            System.err.println("ArithmeticException exception");
            System.out.println(ae);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("ArrayIndexOutOfBoundsException exception");
            System.out.println(ai);
        } catch (Exception e) {
            System.out.println("EXCEPTION exception");
            
        }  finally {
            System.out.println("Finally Block excuted!!!");
        }
    }
}
