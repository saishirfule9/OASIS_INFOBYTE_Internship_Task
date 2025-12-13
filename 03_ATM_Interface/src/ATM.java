import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        String userId = "admin";
        String pin = "1234";

        System.out.print("Enter User ID: ");
        String inputUser = sc.next();

        System.out.print("Enter PIN: ");
        String inputPin = sc.next();

        if (userId.equals(inputUser) && pin.equals(inputPin)) {

            int choice;

            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Transaction History");
                System.out.println("5. Balance");
                System.out.println("6. Exit");

                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.print("Enter amount: ");
                        account.transfer(sc.nextDouble());
                        break;

                    case 4:
                        account.showTransactions();
                        break;

                    case 5:
                        account.showBalance();
                        break;

                    case 6:
                        System.out.println("Thank you for using ATM");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 6);

        } else {
            System.out.println("Invalid credentials");
        }

        sc.close();
    }
}
