import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;
    private List<String> transactions = new ArrayList<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println("Please collect your cash");
        }
    }

    public void transfer(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            transactions.add("Transferred: " + amount);
            System.out.println("Amount transferred successfully");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
