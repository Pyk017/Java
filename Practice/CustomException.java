
//? Class representing custom exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {

        //? calling the constructor of parent Exception Class.
        super(message);
    }
}


//? class that uses custom exception InvalidAgeException
class TestCustomException {

    ///? method to check the age
    void validate(int age) throws InvalidAgeException {
        if ( age < 18 ) {

            //? throw an object of user defined exception
            throw new InvalidAgeException("You are less than 18 years old, Hence NOT ELIGIBLE!");
        } else {
            System.out.println("Welcome to Vote, you are eligible!");
        }
    }

}



public class CustomException {
    public static void main(String[] args) {

        TestCustomException testCustomException = new TestCustomException();
        try {

            //? calling the method.
            testCustomException.validate(12);
        } catch (InvalidAgeException iae) {
            System.out.println("Caught the Exception");
            System.out.println(iae);
            System.out.println("Error Message is :- " + iae.getMessage());
        } finally {
            System.out.println("rest of the code ...");
        }
    }
}
