package ticketmachine;

import java.util.Scanner;

public class TicketMachine {

    private Scanner scanner = new Scanner(System.in);
    private MoneyFeeder moneyFeeder = new MoneyFeeder();
    private boolean serviceMode;
    private Order order;

    public void takeTicket(){
        moneyFeeder.isMachineAvailable();
        order = new Order();
        menu();
    }

    private void menu() {
    }

}