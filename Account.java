package banking;

public class Account {

    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero."
            );
        }

        balance += amount;
        System.out.println("Deposit successful!");
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient funds! Available balance: Rs. "
                + balance
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
    }
}