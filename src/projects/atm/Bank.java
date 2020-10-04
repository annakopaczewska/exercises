package projects.atm;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

    public String getNewUserUUID() {
        StringBuilder UUID;
        Random random = new Random();
        int length = 10;
        boolean noUnique;
        do {
            UUID = new StringBuilder();
            for (int i = 0; i < length; i++) {
                UUID.append(((Integer) random.nextInt(10)).toString());
            }
            noUnique = false;
            for (Account u : this.accounts) {
                if (UUID.toString().compareTo(u.getUUID()) == 0) {
                    noUnique = true;
                    break;
                }
            }
        } while (noUnique);
        return UUID.toString();
    }

    public String getNewAccountUUID() {
        StringBuilder UUID;
        Random random = new Random();
        int length = 5;
        boolean noUnique;
        do {
            UUID = new StringBuilder();
            for (int i = 0; i < length; i++) {
                UUID.append(((Integer) random.nextInt(10)).toString());
            }
            noUnique = false;
            for (User u : this.users) {
                if (UUID.toString().compareTo(u.getUUID()) == 0) {
                    noUnique = true;
                    break;
                }
            }
        } while (noUnique);
        return UUID.toString();
    }

    public void addAccount(Account anAccount) {
        this.accounts.add(anAccount);
    }

    public User addUser(String firstName, String lastName, String pin) {
        User newUser = new User(firstName, lastName, pin, this);
        this.users.add(newUser);

        Account newAccount = new Account("Savings", newUser, this);
        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);

        return newUser;
    }

    public User userLogin(String userID, String pin) {
        for (User u : this.users) {
            if (u.getUUID().compareTo(userID) == 0) &&u.validatePin(pin) {
                return u;
            }
        }
        // jak nie znajdzie użytkownika lub będzie błędny pin
        return null;

    }
}
