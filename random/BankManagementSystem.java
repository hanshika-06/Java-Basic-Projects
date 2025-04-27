import java.util.Scanner;

class BankAccount {
    private double balance;

    public void initializeAccount(int accountNumber, double balance, String accountHolderName) {

        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful\nNew balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!\nNew balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String args[]) {
        int accountNumber;
        String accountHolderName;
        double balance;
        double amount;
        int option;

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("\nWelcome to Bank Management System");
            System.out.println("Select an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter your Account Number:");
                    accountNumber = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter Account Holder Name:");
                    accountHolderName = sc.nextLine();
                    System.out.println("Enter your initial Deposit amount:");
                    balance = sc.nextDouble();
                    account = new BankAccount();
                    account.initializeAccount(accountNumber, balance, accountHolderName);
                    System.out.println("Account created Successfully");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }
                    System.out.println("Enter the amount you want to deposit:");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }
                    System.out.println("Enter the amount you want to withdraw:");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }
                    account.checkBalance();
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
