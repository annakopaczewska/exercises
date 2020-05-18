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
        System.out.println();
        System.out.println("Welcome to Ticket Machine!");
        while (moneyFeeder.isMachineAvailable()) {
            try {
                System.out.println("Choose one option.");
                order.getCard();
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
        scanner.close();
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
        System.out.println("Add ticket type to card: "
                + "\n 1. " + TicketType.NORMAL
                + "\n 2. " + TicketType.DISCOUNT
                + "\n 3. " + TicketType.WEEK
                + "\n 4. " + TicketType.ALL_DAY);

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

    public void pay() {
        double orderGivenMoney = 0;
        double moneyLeftToPay = order.getTotalPriceToPay() - orderGivenMoney;

        while (moneyLeftToPay != 0 && moneyFeeder.isMachineAvailable()) {
            System.out.println("");
            System.out.println("To be paid left: " + moneyLeftToPay + "PLN");

            orderGivenMoney = scanner.nextDouble();
            scanner.nextLine();
            if (checkNominal(orderGivenMoney)) {
                moneyFeeder.putMoney(orderGivenMoney, 1);
                System.out.println("");
                moneyLeftToPay = moneyLeftToPay - orderGivenMoney;
                printMoneyFeeder();
            } else {
                System.out.println("Invalid value ");
            }
        }
    }


    public boolean isServiceMode(boolean ON) {
        return this.serviceMode = ON;
    }

    public void service() {
        isServiceMode(true);
        moneyFeeder.putMoney(0.05, 100);
        moneyFeeder.putMoney(0.10, 50);
        moneyFeeder.putMoney(1, 100);
        moneyFeeder.putMoney(2, 50);
        moneyFeeder.putMoney(5, 20);
        moneyFeeder.putMoney(10, 10);
        moneyFeeder.putMoney(20, 10);
        moneyFeeder.takeMoney(10, 5);
        moneyFeeder.takeMoney(20, 5);
        printMoneyFeeder();
    }

    private void printMoneyFeeder() {
        if (serviceMode) {
            moneyFeeder.checkMoneyAvailability();
        }
    }

    private boolean checkNominal(double orderGivenMoney) {
        return orderGivenMoney == 0.05 || orderGivenMoney == 0.10 || orderGivenMoney == 0.20 || orderGivenMoney == 0.50 ||
                orderGivenMoney == 1 || orderGivenMoney == 2 || orderGivenMoney == 5 || orderGivenMoney == 10 || orderGivenMoney == 20;
    }
}