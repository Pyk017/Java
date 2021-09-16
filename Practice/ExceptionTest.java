class TryException extends Exception {
    TryException() {

    }
} 


class CatchException extends Exception {

} 

class FinallyException extends Exception {

} 


class TestExceptionMCQs {
    static void test() throws Exception{
        try {
            throw new TryException();
        } catch (Exception e){
            throw new CatchException();
        } finally {
            throw new FinallyException();
        }
    }
}


public class ExceptionTest {
    public static void main(String[] args) {
        // try {
        //     TestExceptionMCQs.test();

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        try {
            throw new Error();
            
        } catch (Exception ex) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");


    }
}
