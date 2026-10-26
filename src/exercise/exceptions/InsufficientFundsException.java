package exercise.exceptions;

/**
 * Exception thrown when an account has insufficient funds for a withdrawal.
 */
public class InsufficientFundsException extends Exception {
    private String message;
    
    public InsufficientFundsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
