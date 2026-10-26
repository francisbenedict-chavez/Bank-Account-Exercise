package exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages bank accounts.
 */
public class BankAccountManager implements Bank {
  private Map<Integer, BankAccount> accounts;
  private int id;

  /**
   * Creates a manager with no accounts and initializes account IDs at zero.
   */
  public BankAccountManager() {
    this.accounts = new HashMap<>();
    this.id = 0;
  }

  @Override
  public void addAccount(BankAccount account) {
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
}
