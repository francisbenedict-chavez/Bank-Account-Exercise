package exercise_1;


public class BankAccount {
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    // private void setToTwoDecimal(double value) {
    //     if ceil
    // }

    public void deposit(double amount) {
        if(isFrozen) {
            System.out.println("Account is FROZEN.\nUnable to transact.");
        } else {
            balance = balance + amount;
            System.out.println("Amount deposited:\n" + amount);
            System.out.println("Current balance:\n" + balance);
        }
    }

    public void withdraw(double amount) {
        if(isFrozen) {
            System.out.println("Account is FROZEN.\nUnable to transact.");
        } else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
    }

    public void unfreezeAccount() {
        isFrozen = false;
    }

    public boolean isFrozen() {
        return isFrozen;
    }
}
