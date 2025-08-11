import java.util.Scanner;

public class atm {
    int balance = 100000, pin = 1234;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atm op = new atm();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == op.pin) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Balance\n2. Withdraw\n3. Deposit\n4. Change PIN\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) op.checkBalance();
            else if (choice == 2) op.withdraw(sc);
            else if (choice == 3) op.deposit(sc);
            else if (choice == 4) op.changePin(sc);
            else if (choice == 5) System.out.println("Thank you!");
            else System.out.println("Invalid choice");
        } else {
            System.out.println("Incorrect PIN");
        }
    }
    public void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }
    public void withdraw(Scanner sc) {
        System.out.print("Withdraw amount: ");
        int amount = sc.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(Scanner sc) {
        System.out.print("Deposit amount: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Amount deposited.");
    }

    public void changePin(Scanner sc) {
        System.out.print("New PIN: ");
        pin = sc.nextInt();
        System.out.println("PIN changed.");
    }
}
