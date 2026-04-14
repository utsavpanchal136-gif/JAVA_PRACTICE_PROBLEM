import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        System.out.println("Saving Account Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount(double rate, int years) {
        double amount = balance + (balance * rate * years / 100);
        System.out.println("Maturity Amount: " + amount);
    }
}

public class P_14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        FixedDepositAccount fd = new FixedDepositAccount();

        sa.openAccount(101, "Utsav", 5000);
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.checkBalance();
        sa.calculateInterest(5);

        System.out.println();

        fd.openAccount(201, "Rahul", 10000);
        fd.deposit(5000);
        fd.checkBalance();
        fd.maturityAmount(7, 2);
    }
}
