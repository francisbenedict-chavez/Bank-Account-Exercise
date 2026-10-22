package exercise;

import java.util.HashMap;
import java.util.Map;

/** Manages bank accounts. */
public class BankAccountManager implements Bank {
    private Map<Integer, BankAccount> accounts;
    private int id;

    public BankAccountManager() {
        this.accounts = new HashMap<>();
        this.id = 0;
    }

    public void addAccount(BankAccount account) {
        accounts.put(accounts.size(), account);
    }

    public BankAccount getAccount(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account doesn't exist.");
            return null;
        }
        return accounts.get(accountNumber);
    }

    public void listAccounts() {
        accounts.forEach((id, account) -> {
            System.out.println(id + ": " + account);
        });
    }

}