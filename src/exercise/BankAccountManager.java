package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages bank accounts.
 */
public class BankAccountManager implements Bank {
  private Map<Integer, BankAccount> accounts;
  private int id;
  private int maxAccountLimit;

  /**
   * Creates a manager with no accounts and initializes account IDs at zero.
   */
  public BankAccountManager() {
    this.accounts = new HashMap<>();
    this.id = 0;
    this.maxAccountLimit = 100;
  }

  @Override
  public void addAccount(BankAccount account) {
    if (id >= maxAccountLimit) {
      System.out.println(
          "Max account creation reached. Maximum account allowed: "
              + maxAccountLimit);
      return;
    }
    accounts.put(id, account);
    System.out.println("Account added successfully with ID: " + id);
    id++;
  }

  /**
   * Retrieves the account associated with the specified account number.
   */
  public BankAccount getAccount(int accountNumber) {
    if (!accounts.containsKey(accountNumber)) {
      System.out.println("Account doesn't exist.");
      return null;
    }
    return accounts.get(accountNumber);
  }

  /**
   * Prints the IDs and details of all managed accounts.
   */
  public void listAccounts() {
    accounts.forEach((id, account) -> {
      System.out.println("Account ID: " + id);
      System.out.println(account.toString());
    });
  }

  /**
   * Filters transactions in the provided list that are at or above 
   * the specified amount.
   */
  public List<Transaction> filterTransactionsAtOrAbove(
      double amount, List<Transaction> txList) {
    System.out.println("Filtering transactions at or above " + amount + "...");
    return txList.stream()
        .filter(tx -> tx.getAmount() >= amount)
        .collect(java.util.stream.Collectors.toList());
  }

  /**
   * Sorts transactions in the provided list 
   * by their amount in ascending order.
   */
  public List<Transaction> sortTransactionsByAmount(List<Transaction> txList) {
    System.out.println("Sorting transactions by amount...");
    return txList.stream()
        .sorted((tx1, tx2) -> Double.compare(tx1.getAmount(), tx2.getAmount()))
        .collect(java.util.stream.Collectors.toList());
  }
}
