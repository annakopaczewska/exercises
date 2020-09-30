package projects.email;

import java.util.Scanner;

public class EmailApp {
    private final String firstName;
    private final String lastName;
    private String password;
    private final int defaultPasswordLenght = 6;
    private final String email;
    private final String department;
    private int capacityMailBox = 1000;
    private String otherEmail;
    private String company = "company.com";

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your random password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
        System.out.println("Your email is: " + email);

    }

    private String setDepartment() {
        System.out.println("Department codes: " + '\n' + "1 for Sales" + '\n' + "2 for Development" + '\n' + "3 for Accounting" + '\n' + "0 for none" + '\n' + "enter a code:");
        Scanner scanner = new Scanner(System.in);
        int dep = scanner.nextInt();
        if (dep == 1) {
            return "sales";
        } else if (dep == 2) {
            return "development";
        } else if (dep == 3) {
            return "acct";
        } else {
            return "---";
        }
    }

    private String randomPassword(int lenght) {
        String passwordSet = "Qwerty123";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setCapacityMailBox(int capacity) {
        this.capacityMailBox = capacity;
    }

    public void setOtherEmail(String otherEmail) {
        this.otherEmail = otherEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getCapacityMailBox() {
        return capacityMailBox;
    }

    public String getOtherEmail() {
        return otherEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInformation() {
        return "Display name: " + firstName + " " + lastName +
                "\nComplany email: " + email +
                "\nMail capacity: " + capacityMailBox + "MB";
    }
}
