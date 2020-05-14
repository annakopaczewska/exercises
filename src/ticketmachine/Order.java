package ticketmachine;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<TicketType> card = new ArrayList<>();

    public void addToCard(TicketType ticketType) {
        card.add(ticketType);
    }

    public void removeFromCard(TicketType ticketType) {
        card.remove(ticketType);
    }

    public void getTicketsType() {
        for (TicketType ticketType : card) {
            System.out.println("Ticket type: " + ticketType.getTicketType() + "\n" + "price: " + ticketType.getTicketPrice());
        }
    }

    public void getPriceToPay() {
        double totalPrice = 0;
        for (TicketType ticketType : card) {
            System.out.println();
            totalPrice += ticketType.getTicketPrice();
        }
        System.out.println("To pay: " + totalPrice);
    }

    public int cardSize() {
        return card.size();
    }
}



