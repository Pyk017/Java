import java.util.Scanner;

class AccountHolder {

    String name;
    int acc_no = 0;
    float amount;

    AccountHolder(String name, float amt) {
        this.name = name;
        this.amount = amt;
        this.acc_no += 1;
    }

    void deposit(float amt) {
        this.amount += amt;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdrawl(float amt) {
        if (amt < this.amount) {
            this.amount -= amt;
            System.out.println("Amount Withdrawl Successfully!");
        } else {
            System.out.println("Not Sufficient Balance!");
        }
    }

    void displayTotal() {
        System.out.println("Total Amount in your account is :- " + this.amount);
    }

}

public class Account {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name to open your bank account :- ");
        String name = scan.nextLine();
        System.out.println("Enter Initial amount to be deposited :- ");
        float amt = scan.nextFloat();

        AccountHolder account = new AccountHolder(name, amt);
        account.deposit(amt);

        startMenu(account);
        scan.close();
    }

    private static void startMenu(AccountHolder account) {

        Scanner scan = new Scanner(System.in);

        boolean flag = false;

        while (true) {

            if (!flag) {

                System.out.print(
                        "Press 1 to deposit Money.\nPress 2 to Withdraw money.\nPress 3 to Display Amount.\nPress q to exit.\n");
                char option = scan.next().charAt(0);

                switch (option) {
                    case '1':
                        System.out.print("Enter amount to deposit :- ");
                        account.deposit(scan.nextFloat());
                        break;
                    case '2':
                        System.out.print("Enter amount to be withdrawl :- ");
                        account.withdrawl(scan.nextFloat());
                        break;
                    case '3':
                        account.displayTotal();
                        break;
                    case 'q':
                        flag = true;
                        break;
                    default:
                        System.out.println("Invalid Option!!");
                        break;

                }
            } else {
                break;
            }

        }

        scan.close();
    }

}
