import java.io.IOException;

class TestThrows {
    
    void m() throws IOException  {
        throw new IOException("Some device error occured!"); //? checked exception
    } 

    void n() throws IOException {
        m();
    }

    void p() throws IOException {
        n();
    }

}

public class ThrowsPractice {
    public static void main(String[] args) throws IOException{
        TestThrows tt = new TestThrows();
        try {
            tt.p();
        } catch (IOException ioe) {
            System.out.println("Exception Handled!");
            System.out.println(ioe);
            System.out.println(ioe.getMessage());
        }
    }
}
