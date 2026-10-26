package exercise.exceptions;

/**
 * Exception thrown when an account is frozen.
 */
public class AccountFrozenException extends Exception {
    private String message;

    public AccountFrozenException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
