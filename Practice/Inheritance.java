class Company {
    String name = "TCS";
}

class Employee extends Company {
    float salary = 90_000;
}

public class Inheritance extends Employee {
    int incentives = 60_000;

    public static void main(String args[]) {

        Inheritance inh = new Inheritance();
        System.out.println(inh.incentives + " " + inh.salary);
        System.out.println(inh.name);
        System.out.println(new Employee().name);

    }
}
