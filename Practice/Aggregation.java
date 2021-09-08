class Address {
    String city, state, country;
    long zipcode;

    public Address(String city, String state, String country, long zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

}

class Employeee {
    int id;
    String name;
    Address addr;

    public Employeee(int id, String name, Address addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    void display() {
        System.out.println(this.name + " " + this.id);
        System.out.println(this.addr.city + " " + this.addr.country + " " + this.addr.state + " " + this.addr.zipcode);
    }

}

public class Aggregation {
    public static void main(String args[]) {
        Address addr = new Address("Kanpur", "UP", "INDIA", 208013);
        Address addrr = new Address("New Delhi", "DELHI", "INDIA", 208001);

        Employeee emp = new Employeee(101, "Prakhar", addr);
        Employeee emp1 = new Employeee(103, "Yush", addrr);

        emp.display();
        emp1.display();

    }
}
