class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 4;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class MethodOveriding {
    public static void main(String args[]) {
        System.out.println(new Bank().getRateOfInterest());
        System.out.println(new SBI().getRateOfInterest());
        System.out.println(new ICICI().getRateOfInterest());
        System.out.println(new AXIS().getRateOfInterest());
    }
}
