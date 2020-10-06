package projects.atm;

import java.util.Scanner;

public class ATM_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bank theBank = new Bank("Bank iPKO");

        User user = theBank.addUser("Anna", "Kopa", "1806");

        Account newAccount = new Account("Checking", user, theBank);
        user.addAccount(newAccount);
        theBank.addAccount(newAccount);
    }
}
