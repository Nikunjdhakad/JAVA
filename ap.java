import java.util.Scanner;

class BankAccount {

    // Static variable (shared)
    static String bankName = "State Bank AI";
    static int totalAccounts = 0;

    // Instance variables
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // arithmetic + assignment
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        // logical + relational
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method overloading (transfer)
    void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed!");
        }
    }

    // Getter
    double getBalance() {
        return balance;
    }

    // Display details
    void display() {
        System.out.println("\nBank: " + bankName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Utility class
class BankUtils {

    // Static method
    static void showWelcome() {
        System.out.println("===== Welcome to Smart Banking System =====");
    }

    // Bitwise operator example
    static void checkSecurity(int pin) {
        int mask = 1234;

        // bitwise AND
        if ((pin & mask) == mask) {
            System.out.println("Security Check Passed");
        } else {
            System.out.println("Security Check Failed");
        }
    }
}

public class ap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankUtils.showWelcome();

        // Creating accounts
        BankAccount acc1 = new BankAccount(101, "Nikunj", 5000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 3000);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Security Check");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc1.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wd = sc.nextDouble();
                    acc1.withdraw(wd);
                    break;

                case 3:
                    System.out.print("Enter transfer amount: ");
                    double tr = sc.nextDouble();
                    acc1.transfer(acc2, tr);
                    break;

                case 4:
                    acc1.display();
                    break;

                case 5:
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    BankUtils.checkSecurity(pin);
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();

        // Ternary operator example
        String status = (acc1.getBalance() > 1000) ? "Healthy Account" : "Low Balance";
        System.out.println("Final Status: " + status);
    }
}