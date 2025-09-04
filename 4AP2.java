import java.util.Random;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // 1. Default constructor → balance = 0
    public BankAccount() {
        this("Unknown", 0.0); // chaining to 2-parameter constructor
    }

    // 2. Constructor with name → assigns random account number
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    // 3. Constructor with name and initial balance
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
    }

    // Generate random account number (6-digit)
    private int generateAccountNumber() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew ₹" + amount + ". New Balance: ₹" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal!");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("\n=== ACCOUNT DETAILS ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("🏦 BANK ACCOUNT SYSTEM 🏦");

        // Account 1: Default constructor
        BankAccount acc1 = new BankAccount();

        // Account 2: Constructor with name
        BankAccount acc2 = new BankAccount("Alice");

        // Account 3: Constructor with name and balance
        BankAccount acc3 = new BankAccount("Bob", 5000.0);

        // Transactions
        acc2.deposit(2000);
        acc2.withdraw(500);

        acc3.withdraw(2000);
        acc3.deposit(1500);

        // Display accounts
        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();
    }
}
