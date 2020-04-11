package boutique;

public class Delivery {
    private final DeliveryType deliveryType;
    private final int deliveryPrice;
    private final Address deliveryAddress;

    public Delivery(DeliveryType deliveryType, int deliveryPrice, Address deliveryAddress) {
        this.deliveryType = deliveryType;
        this.deliveryPrice = deliveryPrice;
        this.deliveryAddress = deliveryAddress;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String toString() {
        return "\n" + "type: " + deliveryType +
                "\n" + "price: " + deliveryPrice +
                "\n" + "address: " + deliveryAddress;
    }
}
