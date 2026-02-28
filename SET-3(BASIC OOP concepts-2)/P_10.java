package CLG_PRACTICE;

import java.util.Scanner;

class BankAccount {

    private String accountHolderName;
    private double balance;

    private static double interestRate = 5.0;

    // Constructor
    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    public void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println("----------------------------");
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + interestRate + "%");
    }
}

public class P_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Interest Rate: ");
        double newRate = sc.nextDouble();
        BankAccount.updateInterestRate(newRate);

        sc.nextLine(); // clear buffer

        System.out.print("Enter First Account Holder Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter First Account Balance: ");
        double bal1 = sc.nextDouble();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Second Account Holder Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Second Account Balance: ");
        double bal2 = sc.nextDouble();

        BankAccount acc1 = new BankAccount(name1, bal1);
        BankAccount acc2 = new BankAccount(name2, bal2);

        System.out.println("\n--- Account Details ---");
        acc1.displayInterest();
        acc2.displayInterest();

        sc.close();
    }
}