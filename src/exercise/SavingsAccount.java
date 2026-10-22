package exercise;

/** Represents a savings account and its owner. */
public class SavingsAccount extends BankAccount {
  private String ownerName;

  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
    System.out.println("Account Owner: " + ownerName);
  }

  /** Returns the name of the account owner. */
  public String getOwnerName() {
    return ownerName;
  }
}
