package ticketmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMachine {

    private Scanner scanner = new Scanner(System.in);
    private MoneyFeeder moneyFeeder = new MoneyFeeder();
    private boolean serviceMode;
    private Order order;

    public void takeTicket() {
        moneyFeeder.isMachineAvailable();
        order = new Order();
        menu();
    }

    private void menu() {
        int exit = 0;
        System.out.println("Welcome to Ticket Machine!");
        while (moneyFeeder.isMachineAvailable()) {
            try {
                System.out.println("Choose one option.");
                order.getPriceToPay();

                int whatDo = scanner.nextInt();
                scanner.nextLine();

                switch (whatDo) {
                    case 1:
                        addTicket();
                        break;

                    case 2:
                        removeTicket();
                        break;

                    case 3:
                        pay();

                    case 4:
                        System.out.println("Thanks for using MJ ticket machine");
                        exit = 4;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Something went wrong. Try again! " + exception);
                break;
            }
        }

    }

    private void pay() {

    }

    private void removeTicket() {
        System.out.println("Remove ticket type from card" + TicketType.NORMAL + TicketType.DISCOUNT + TicketType.WEEK + TicketType.ALL_DAY);

        int removeType = scanner.nextInt();
        scanner.nextLine();
        switch (removeType) {
            case 1:
                order.removeFromCard(TicketType.NORMAL);
                break;
            case 2:
                order.removeFromCard(TicketType.DISCOUNT);
                break;
            case 3:
                order.removeFromCard(TicketType.WEEK);
                break;
            case 4:
                order.removeFromCard(TicketType.ALL_DAY);
                break;
        }
    }

    private void addTicket() {
        System.out.println("Add ticket type to card" + TicketType.NORMAL + TicketType.DISCOUNT + TicketType.WEEK + TicketType.ALL_DAY);

        int addType = scanner.nextInt();
        scanner.nextLine();
        switch (addType) {
            case 1:
                order.addToCard(TicketType.NORMAL);
                break;
            case 2:
                order.addToCard(TicketType.DISCOUNT);
                break;
            case 3:
                order.addToCard(TicketType.WEEK);
                break;
            case 4:
                order.addToCard(TicketType.ALL_DAY);
                break;
        }
    }

    public boolean isServiceMode(boolean ON) {
        return this.serviceMode = ON;
    }

    public void service() {
        isServiceMode(true);
        moneyFeeder.putMoney(10, 5);
        moneyFeeder.putMoney(5, 5);
        moneyFeeder.putMoney(2, 5);
        moneyFeeder.putMoney(1, 5);
        moneyFeeder.putMoney(0.5, 5);
        printMoneyFeeder();
    }

    private void printMoneyFeeder() {
        if (serviceMode) {
            moneyFeeder.checkMoneyAvailability();
        }
    }
}