package exercises;

/**
 * Organise a bank account wit deposit, withdraw and get balance operations.
 *
 * @author PhatNguyen
 * @created 07/09/2025 - 20:21
 * @project learn-java-w3school
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing: " + amount);
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(200.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(150.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1200.0); // Insufficient balance
        System.out.println("Balance after attempted withdrawal: " + account.getBalance());

        account.deposit(-50.0); // Invalid deposit
        account.withdraw(-20.0); // Invalid withdrawal
    }

}
