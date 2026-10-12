# Banking Console Application

## Project Overview

Banking Console Application is a simple Java console-based project that demonstrates basic banking operations and custom exception handling.

Users can check their account balance, deposit money, and withdraw money through a menu-driven interface.

## Features

* Check account balance
* Deposit money
* Withdraw money
* Validate deposit and withdrawal amounts
* Handle insufficient funds using a custom exception
* Handle invalid numeric input
* Continue running after a transaction error

## Technologies Used

* Java
* Eclipse IDE
* Object-Oriented Programming (OOP)

## Concepts Practiced

* Classes and objects
* Encapsulation
* Custom exceptions
* try-catch exception handling
* throw and throws
* Scanner for console input
* Menu-driven programming

## Project Structure

```text
BankingConsoleApp/
└── src/
    └── banking/
        ├── Account.java
        ├── InsufficientFundsException.java
        └── BankingConsoleApp.java
```

## How to Run

1. Open Eclipse IDE.
2. Create or import the BankingConsoleApp Java project.
3. Ensure all three Java files are inside the banking package.
4. Open BankingConsoleApp.java.
5. Run it as Java Application.
6. Follow the menu displayed in the Console.

## Default Account Balance

The application starts with a sample balance of Rs. 1,000.00.

## Example Menu

```text
===== BANKING SYSTEM =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice:
```

## Exception Handling

* InsufficientFundsException: Raised when a withdrawal amount exceeds the available balance.
* IllegalArgumentException: Raised when the deposit or withdrawal amount is zero or negative.
* NumberFormatException: Handled when the user enters a non-numeric amount.

## Note

This is an educational console project. It does not connect to a real bank account or process real transactions.