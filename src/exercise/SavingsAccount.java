package exercise;

/** Represents a savings account and its owner. */
public class SavingsAccount extends BankAccount {
  private String ownerName;

  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
    System.out.println("Account Owner: " + ownerName);
  }

  public String getOwnerName() {
    return ownerName;
  }

  public String toString() {
    return String.format("""
        [
          Account Name: %s
          Balance: %.2f
        ]
        """, ownerName, getBalance());
  }
}
