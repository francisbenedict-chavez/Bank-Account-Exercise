package exercise;

/**
 * Runs test cases for bank account operations.
 */
public class Main {
  /**
   * Runs test cases for bank account operations.
   */
  public static void main(String[] args) {
    // Exercise 1
    // 1. Create a savings account
    BankAccount acc1 = new SavingsAccount("Test0");
    // 2. Deposit with valid amount
    acc1.deposit(1000.125);
    // 3. Deposit with zero amount
    acc1.deposit(0);
    // 4. Deposit with negative amount
    acc1.deposit(-500);
    // 5. Withdraw with sufficient funds
    acc1.withdraw(500);
    // 6. Withdraw with insufficient funds
    acc1.withdraw(1500);
    // 7. Withdraw with negative amount
    acc1.withdraw(-100);
    // 8. Deposit when account is frozen
    acc1.freezeAccount();
    acc1.deposit(11500);
    // 9. Withdraw when account is frozen
    acc1.withdraw(500);
    // 10. Unfreeze account and withdraw
    acc1.unfreezeAccount();
    acc1.withdraw(100);

    // Exercise 2
    // 1. Display transaction history of acc1.
    acc1.getTransactionHistory();
    // 2. Create a Bank Account Manager
    BankAccountManager accM1 = new BankAccountManager();
    // 3. Add acc1 under the Bank Account Manager
    accM1.addAccount(acc1);
    // 4. Create a new account under Bank Account Manager
    accM1.addAccount(new SavingsAccount("Test1"));
    // 5. List all the created account under Bank Account Manager
    accM1.listAccounts();
  }
}
