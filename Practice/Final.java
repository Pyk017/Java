class Bike {
    final int speedLimit;

    Bike() {
        speedLimit = 90;
    }

    final void run() {
        System.out.println("in class Bike");
    }
}

class Yamaha extends Bike {
    void print() {
        super.run();
    }
}

public class Final {
    public static void main(String[] args) {
        Bike bike = new Bike();
        new Yamaha().run();
    }
}
