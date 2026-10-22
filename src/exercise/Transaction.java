package exercise;

import java.time.LocalDateTime;

public class Transaction {
  private String type;
  private double amount;
  private LocalDateTime timestamp;

  // 
  public Transaction(String type, double amount) {
    this.type = type;
    this.amount = amount;
    this.timestamp = LocalDateTime.now();
  }

  public String toString() {
    return String.format("""
        [
          Type: %s
          Amount: %.2f
          Time Stamp: %s
        ]
        """, type, amount, timestamp);
  }

  public String getType() {
    return type;
  }

  public double getAmount() {
    return amount;
  }

  public LocalDateTime getTimeStamp() {
    return timestamp;
  }
}