package boutique;

import java.util.List;

public class Order {
    private static int i = 0;
    private final int orderId = i++;
    private final List<Product> products;
    private final Delivery delivery;
    private final Customer customerDetails;
    private final Address deliveryAddress;
    private StatusOfOrder status;

    public Order(List<Product> products, Delivery delivery, Customer customerDetails, Address deliveryAddress) {
        this.products = products;
        this.delivery = delivery;
        this.customerDetails = customerDetails;
        this.deliveryAddress = deliveryAddress;
        this.status = StatusOfOrder.NEW;
    }

    public int getTotalProductPrice() {
        int totalPrice = 0;
        for (Product product : products) {
            int price = product.getProductPrice();
            totalPrice += price;
        }
        return totalPrice;
    }

    public int getDeliveryPrice() {
        int totalProductsPrice = getTotalProductPrice();
        boolean coolDelivery = delivery.getDeliveryType().isCoolDelivery();
        int minimalOrderValueWithFreeDelivery = coolDelivery ? 90 : 200;
        return totalProductsPrice > minimalOrderValueWithFreeDelivery ? 0 : delivery.getDeliveryPrice();
    }

    public int getDeliveryPrice(int totalProductsPrice) {
        boolean coolDelivery = delivery.getDeliveryType().isCoolDelivery();
        int minimalOrderValueWithFreeDelivery = coolDelivery ? 90 : 200;
        return totalProductsPrice > minimalOrderValueWithFreeDelivery ? 0 : delivery.getDeliveryPrice();
    }

    public int getTotalProductsPriceWithDelivery() {
        int totalPrice = getTotalProductPrice();
        int deliveryPrice = getDeliveryPrice();
        return totalPrice + deliveryPrice;
    }

    public int getAllOrderedItems() {
        return products.size();
    }

    public DeliveryType getDeliveryType() {

        return delivery.getDeliveryType();
    }

    public Address getDeliveryAddress() {
        return delivery.getDeliveryAddress();
    }

    public Customer getCustomerDetails() {
        return customerDetails;
    }

    @Override
    public String toString() {
        return "Order = " + orderId +
                ", status = " + status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setStatus(StatusOfOrder status) {
        this.status = status;
    }
}
