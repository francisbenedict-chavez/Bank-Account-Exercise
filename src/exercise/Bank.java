package exercise;

/** Defines operations for managing bank accounts. */
public interface Bank {
  public void addAccount(BankAccount account);

  public BankAccount getAccount(int id);
}
