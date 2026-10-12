package banking;

import java.util.Scanner;

public class BankingConsoleApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account(1000.0);

        while (true) {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine().trim();

            try {
                switch (choice) {

                    case "1":
                        System.out.printf(
                            "Current balance: Rs. %.2f%n",
                            account.getBalance()
                        );
                        break;

                    case "2":
                        System.out.print("Enter deposit amount: ");
                        double depositAmount =
                            Double.parseDouble(sc.nextLine().trim());

                        account.deposit(depositAmount);
                        System.out.printf(
                            "Balance: Rs. %.2f%n",
                            account.getBalance()
                        );
                        break;

                    case "3":
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount =
                            Double.parseDouble(sc.nextLine().trim());

                        account.withdraw(withdrawAmount);
                        System.out.printf(
                            "Balance: Rs. %.2f%n",
                            account.getBalance()
                        );
                        break;

                    case "4":
                        System.out.println("Thank you for using our bank!");
                        sc.close();
                        return;

                    default:
                        System.out.println(
                            "Invalid choice. Please select 1 to 4."
                        );
                }

            } catch (InsufficientFundsException e) {
                System.out.println("Transaction failed: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid numeric amount.");

            } catch (IllegalArgumentException e) {
                System.out.println("Transaction failed: " + e.getMessage());
            }
        }
    }
}