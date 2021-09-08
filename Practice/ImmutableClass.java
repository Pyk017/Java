final class Unchangaeble {  // Cannot be extended
    final String cardNumber; // instance variable of Immutable class cannot be changed.

    public Unchangaeble(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public final String getCardNumber() {  // final in method means it cannot be overriden .
        return this.cardNumber;
    }

    @Override
    public String toString() {
        return "Your card number is :- " + this.cardNumber;
    }
}

public class ImmutableClass{
    public static void main(String[] args) {
        Unchangaeble unchangaeble = new Unchangaeble("1716410178");
        System.out.println(unchangaeble.getCardNumber());
        System.out.println(unchangaeble);
    }
}
