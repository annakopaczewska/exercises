package projects.bank;

import projects.bank.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Anna","9506");
        bankAccount.showMenu();
    }
}
