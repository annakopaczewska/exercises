package ticketmachine;


public class TicketMachine {
    private TicketType ticketType;
    private int price;
    private int balance;
    private int totalPrice;

    public TicketMachine(int ticketPrice) {
        this.price = ticketPrice;
        this.balance = 0;
        this.totalPrice = 0;
    }

    public int getPrice() {
        return price;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Use different amount: " + amount);
        }
    }


    public void printTicket() {
        if (balance >= price) {
            System.out.println("##################");
            System.out.println("# The BulueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            totalPrice += balance;
            balance -= price;
        } else {
            System.out.println("The full amount is missing: " + (price - balance) + " zł");
        }
    }

    public double refundBalance() {
        double amountRefund;
        amountRefund = balance;
        balance = 0;
        return amountRefund;
    }
}