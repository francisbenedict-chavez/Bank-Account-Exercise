# Java Exercise 1: Bank Account with OOP Concepts

## Requirements

- Define a parent class that supports deposits, withdrawals, balance retrieval, and freezing or unfreezing an account. Deposits are allowed only when the account is not frozen, and withdrawals must not exceed the balance.
- Define a child class whose constructor initializes the account owner.
- Define a main class that demonstrates polymorphism through upcasting and invokes methods implemented by the parent class.
- Display all monetary amounts and balances to two decimal places.
- Add JavaDoc documentation to all classes and ensure the code passes Checkstyle.
- Test the program thoroughly and verify that it works as expected. Refer to the provided test cases.

## Project structure

- `src/exercise/BankAccount.java` — account balance, transactions, and freeze controls
- `src/exercise/SavingsAccount.java` — savings account with an owner name
- `src/exercise/Main.java` — sample transaction scenarios

## Running

Open the project in Visual Studio Code with the Java extensions installed, then run `exercise.Main` from `src/exercise/Main.java` to see the sample output.
