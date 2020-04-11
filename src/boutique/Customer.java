package boutique;

public class Customer {
    private final String name;
    private final String surName;
    private final int phoneNumber;
    private final String emial;


    public Customer(String name, String surName, int phoneNumber, String emial) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.emial = emial;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n" + "name: " + name + " " + surName +
                "\n" + "phone number: " + phoneNumber +
                "\n" + "email: " + emial;
    }
}
