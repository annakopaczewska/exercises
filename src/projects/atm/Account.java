package projects.atm;

import java.util.ArrayList;

public class Account {

    private String name;
    private double balance;
    private String UUID;
    private User owner;
    private ArrayList<Transaction> transactions;

    public Account(String name, User ower, Bank theBank){
        this.name = name;
        this.owner = ower;
        this.UUID = theBank.getNewAccountUUID();
        this.transactions = new ArrayList<Transaction>();
    }

    public String getUUID(){
        return this.UUID;
    }
}
