package projects.atm;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String UUID;
    private byte pinNumber[];
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String userID, String pin, Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;

        try {
            MessageDigest md = MessageDigest.getInstance("MD");
            this.pinNumber = md.digest(pin.getBytes());
            } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.exit(1);
        }
        this.UUID = theBank.getNewUserUUID();

        this.accounts = new ArrayList<Account>();
        System.out.println("New user %s, %s with ID %s created.\n " + lastName + firstName + this.UUID );

    }
}
