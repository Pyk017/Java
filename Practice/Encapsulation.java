class Encap {
    private String name, email;
    private float amount;
    private long accNo;

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name :- " + this.name);
        System.out.println("Email :- " + this.email);
        System.out.println("Account Number :- " + this.accNo);
        System.out.println("Balance :- " + this.amount);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap enc = new Encap();

        enc.setAccNo(8874109902l);
        enc.setAmount(94919);
        enc.setEmail("prakharkumar.kashyap@tcs.com");
        enc.setName("Prakhar Kashyap");

        enc.display();

    }    
}
