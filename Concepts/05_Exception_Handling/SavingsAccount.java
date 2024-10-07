// Class representing a savings account with basic operations and exception handling.
public class SavingsAccount {
    private double balance;

    public SavingsAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws BankBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 1000) {
            throw new BankBalanceException("Balance cannot drop below 1000 after withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        try {
            SavingsAccount account = new SavingsAccount(1500);
            account.deposit(500);
            account.withdraw(2000); // This will throw BankBalanceException
        } catch (BankBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}