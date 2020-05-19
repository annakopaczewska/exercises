package ticketmachine;

public class Main {
    public static void main(String[] args) {

//        Order order = new Order();
//
//        order.addToCard(TicketType.DISCOUNT);
//        order.addToCard(TicketType.NORMAL);
//        order.addToCard(TicketType.WEEK);
//        System.out.println("Card size: " + order.cardSize());
//
//        order.removeFromCard(TicketType.NORMAL);
//        System.out.println(order.cardSize());
//
//        System.out.println("Ticket type on my card: ");
//        order.getTicketsType();
//
//        order.getTotalPriceToPay();
//
//        TicketMachine ticketMachine = new TicketMachine();
//        ticketMachine.service();
//        ticketMachine.takeTicket();

        MoneyFeeder moneyFeeder = new MoneyFeeder();
        moneyFeeder.putMoney(10,3);

        moneyFeeder.giveChange(6);
    }
}


