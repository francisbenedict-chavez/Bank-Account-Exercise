package exercise;

import exercise.exceptions.AccountFrozenException;
import exercise.exceptions.InsufficientFundsException;
import exercise.exceptions.InvalidAmountException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bank account supporting deposits, withdrawals, transaction
 * histories, and freezing.
 */
public class BankAccount {
  private double balance;
  private boolean isFrozen;
  private List<Transaction> transactionHistory;

  /**
   * Creates an unfrozen account with a zero balance.
   */
  public BankAccount() {
    this.balance = 0;
    this.isFrozen = false;
    this.transactionHistory = new ArrayList<>();
  }

  /**
   * Deposits a positive amount unless the account is frozen.
   */
  public void deposit(double amount) {
    if (isFrozen()) {
      showAccountFrozenMessage();
      return;
    }

    System.out.printf("Amount deposited: %.2f\n", amount);

    if (isValidAmount(amount)) {
      balance = balance + amount;
      showBalanceMessage();
      transactionHistory.add(new Transaction("Deposit", amount));
    }
  }

  /**
   * Withdraws a positive amount when the account has sufficient funds.
   */
  public void withdraw(double amount) {
    if (isFrozen()) {
      showAccountFrozenMessage();
      return;
    }

    System.out.printf("Amount withdrawn: %.2f\n", amount);

    if (isValidAmount(amount) && hasSufficientBalance(amount)) {
      balance = balance - amount;
      showBalanceMessage();
      transactionHistory.add(new Transaction("Withdraw", amount));
    }
  }

  /**
   * Returns the account's transaction history.
   */
  public List<Transaction> getTransactionHistory() {
    return transactionHistory;
  }

  /**
   * Returns the current account balance.
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Freezes the account to prevent transactions.
   */
  public void freezeAccount() {
    if (isFrozen()) {
      System.out.println("Account is ALREADY FROZEN.");
      return;
    }

    isFrozen = true;
  }

  /**
   * Unfreezes the account to allow transactions.
   */
  public void unfreezeAccount() {
    if (!isFrozen()) {
      System.out.println("Account is ALREADY UNFROZEN.");
      return;
    }

    isFrozen = false;
  }

  /**
   * Returns whether the account is frozen.
   */
  public boolean isFrozen() {
    return isFrozen;
  }

  /**
   * Helper functions.
   */
  private void showAccountFrozenMessage() {
    try {
      throw new AccountFrozenException(
          "Account is FROZEN. Unable to transact.");
    } catch (AccountFrozenException e) {
      System.out.println(e.getMessage());
    }
  }

  private void showBalanceMessage() {
    System.out.printf("Current balance: %.2f\n", balance);
  }

  private boolean isValidAmount(double amount) {
    if (amount <= 0) {
      try {
        throw new InvalidAmountException(
            "Invalid amount. Must be greater than 0.");
      } catch (InvalidAmountException e) {
        System.out.println(e.getMessage());
      }
      return false;
    }
    return true;
  }

  private boolean hasSufficientBalance(double amount) {
    if (amount > balance) {
      try {
        throw new InsufficientFundsException(
            String.format(
                "Insufficient balance.\nCurrent balance: %.2f ", balance));
      } catch (InsufficientFundsException e) {
        System.out.println(e.getMessage());
      }
      return false;
    }
    return true;
  }
}
