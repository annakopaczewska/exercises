package projects.bank;

import java.util.Scanner;

public class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cId) {
        this.customerName = cname;
        this.customerId = cId;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposit: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is: " + customerId);
        System.out.println();
        System.out.println("1. Check balance.");
        System.out.println("2. Deposit.");
        System.out.println("3. Withdraw.");
        System.out.println("4. Previous transaction.");
        System.out.println("5. Exit.");

        do {
            System.out.println("===================");
            System.out.println("Please enter an option");
            System.out.println("===================");
            option = scanner.next().charAt(0);
            System.out.println();

            switch (option) {

                case '1':
                    System.out.println("===================");
                    System.out.println("Balance= " + balance);
                    System.out.println("===================");
                    System.out.println();
                    break;

                case '2':
                    System.out.println("===================");
                    System.out.println("Please enter an amount to deposit");
                    System.out.println("===================");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case '3':
                    System.out.println("===================");
                    System.out.println("Please enter an amount to withdrow");
                    System.out.println("===================");
                    int amound2 = scanner.nextInt();
                    withdraw(amound2);
                    System.out.println();
                    break;
                case '4':
                    System.out.println("===================");
                    getPreviousTransaction();
                    System.out.println("===================");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }
        }
        while (option != '5');
        System.out.println("Thank you for using our services. See you soon!");
    }
}

