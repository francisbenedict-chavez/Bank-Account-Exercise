package exercise_1;

public class SavingsAccount extends BankAccount {
    private String ownerName;

    public SavingsAccount(String ownerName) {
        this.ownerName = ownerName;
        System.out.println("Account Owner: " + ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }
}
