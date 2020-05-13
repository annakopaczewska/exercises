package ticketmachine;

public enum TicketType {
    NORMAL(3, "NORMAL"), ALL_DAY(7.5, "ALL_DAY"), WEEK(24, "WEEK"), DISCOUNT(1.5,"DISCOUNT")
    ;

    private final double ticketPrice;
    private final String ticketType;

    TicketType(double ticketPrice, String ticketType) {
        this.ticketPrice = ticketPrice;
        this.ticketType = ticketType;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }

    public String getTicketType(){
        return ticketType;
    }
}
