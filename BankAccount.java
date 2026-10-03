public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else System.out.println("Deposit amount must be positive.");
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
