package butik1;

public class Delivery {

    private final DeliveryType deliveryType;
    private final int price;
    private final Address address;

    public Delivery(DeliveryType deliveryType, int price, Address address) {
        this.deliveryType = deliveryType;
        this.price = price;
        this.address = address;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public int getPrice() {
        return price;
    }

    public Address getAddress() {
        return address;
    }
}
