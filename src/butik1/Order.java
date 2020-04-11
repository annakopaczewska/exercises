package butik1;

import java.util.List;

public class Order {

    private final List<Product> products;
    private final Delivery delivery;
    private final StatusOfOrder status;

    public Order(List<Product> products, Delivery delivery) { // konstruktor inicjuje obiekt
        this.products = products;
        this.delivery = delivery;
        this.status = StatusOfOrder.NEW;
    }

    public int getTotalProductsPriceWithDelivery() {
        int totalPrice = getTotalProductPrice();
        int deliveryPrice = getDeliveryPrice(totalPrice);
        return totalPrice + deliveryPrice;
//        if (totalPrice > 200) {
//            return totalPrice;
//        } else {
//            int deliveryPrice = delivery.getPrice();
//            return totalPrice + deliveryPrice;
//        }
    }

    public int getTotalProductPrice() {
        int totalPrice = 0;
        for (Product product : products) {
            int price = product.getPrice();
            totalPrice += price;
        }
        return totalPrice;
    }

    public int getDeliveryPrice() {
        int totalProductsPrice = getTotalProductPrice();
        boolean coolDelivery = delivery.getDeliveryType().isCoolDelivery();
        int minimalOrderValueWithFreeDelivery = coolDelivery ? 40 : 200;
        return totalProductsPrice > minimalOrderValueWithFreeDelivery ? 0 : delivery.getPrice();
    }

    public int getDeliveryPrice(int totalProductsPrice) {
        boolean coolDelivery = delivery.getDeliveryType().isCoolDelivery();
        int minimalOrderValueWithFreeDelivery = coolDelivery ? 40 : 200;
        return totalProductsPrice > minimalOrderValueWithFreeDelivery ? 0 : delivery.getPrice();
    }

    public DeliveryType getDeliveryType() {
        return delivery.getDeliveryType();
    }

    public Address getDeliveryAddress() {
        return delivery.getAddress();

    }

    // typ nazwa = cos co ma byc przypisane(zmienna, wynik wywyolania funkcji, cokolwiek)
}

