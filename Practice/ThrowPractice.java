import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class UserDefinedException extends Exception {
    UserDefinedException(String str) {
        super(str);
    } 
}


public class ThrowPractice {
    

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is less than 18 years of age!");
        } else {
            System.out.println("Person is eligible to Vote!");
        }
    }

    public static void checkedException() throws FileNotFoundException {
        FileReader file = new FileReader("file.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();

    }

    public static void main(String[] args) {
        try {

            validate(14);

        } catch (Exception e) { 
            System.out.println("ERROR IN THE CODE :- " + e);
        }   
        System.out.println();
        System.out.println("CHECKED EXCEPTION HANDLING!");

        try {
            checkedException();
        } catch (FileNotFoundException fe) {
            System.out.println("FILE NOT FOUND EXCEPTION :- " + fe);
        }

        System.out.println();
        System.out.println("USER DEFINED EXCEPTION HANDLING!");

        try {
            throw new UserDefinedException("This is user defined exception!");
        } catch (UserDefinedException ude) {
            System.out.println(ude.getMessage());
        }

    }

}
