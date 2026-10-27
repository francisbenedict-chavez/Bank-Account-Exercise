package exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a transaction with a type, amount, and timestamp.
 */
public class Transaction {
  private static final DateTimeFormatter TIMESTAMP_FORMAT =
      DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  private String type;
  private double amount;
  private LocalDateTime timeStamp;

  /**
   * Creates a transaction with the specified type and amount.
   */
  public Transaction(String type, double amount) {
    this.type = type;
    this.amount = amount;
    this.timeStamp = LocalDateTime.now();
  }

  /**
   * Returns a string representation of this transaction.
   */
  public String toString() {
    return String.format("""
        [
          Type: %s
          Amount: %.2f
          Time Stamp: %s
        ]""", getType(), getAmount(), getTimeStamp().format(TIMESTAMP_FORMAT));
  }

  public String getType() {
    return type;
  }

  public double getAmount() {
    return amount;
  }

  public LocalDateTime getTimeStamp() {
    return timeStamp;
  }
}
