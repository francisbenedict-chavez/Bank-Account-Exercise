package exercise_1;

public class BankAccount {
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    public void deposit(double amount) {
        if (isFrozen) {
            showAccountFrozenMessage();
            return;
        }

        System.out.printf("Amount deposited:\n%.2f\n", amount);

        if (isValidAmount(amount)) {
            balance = balance + amount;
            showBalanceMessage();
        }
    }

    public void withdraw(double amount) {
        if (isFrozen) {
            showAccountFrozenMessage();
            return;
        }

        System.out.printf("Amount withdrawn:\n%.2f\n", amount);

        if (isValidAmount(amount) && hasSufficientBalance(amount)) {
            balance = balance - amount;
            showBalanceMessage();
        }
    }

    public double getBalance() {
        return balance;
    }

    public void freezeAccount() {
        if(isFrozen) {
           System.out.println("Account is ALREADY FROZEN."); 
           return;
        }

        isFrozen = true;
    }

    public void unfreezeAccount() {
        if(!isFrozen) {
           System.out.println("Account is ALREADY UNFROZEN."); 
           return;
        }

        isFrozen = false;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    // Helper functions
    private void showAccountFrozenMessage() {
        System.out.println("Account is FROZEN.\nUnable to transact.");
    }

    private void showBalanceMessage() {
        System.out.printf("Current balance:\n%.2f\n", balance);
    }

    private boolean isValidAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            return false;
        }
        return true;
    }

    private boolean hasSufficientBalance(double amount) {
        if (amount > balance) {
            System.out.printf("Insufficient balance.\nCurrent balance:\n%.2f\n", balance);
            return false;
        }
        return true;
    }
}
