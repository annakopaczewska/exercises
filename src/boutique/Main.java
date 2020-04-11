package boutique;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Product> products = Arrays.asList(
//                new Product("White", 30, Category.T_SHIRT),
//                new Product("Pink", 40, Category.SKIRT),
//                new Product("High heels", 150, Category.SHOES)
//        );
////
////        Customer customer = new Customer("Anna", "Kop", 123456789, "annkop@gmail.com");
////        Address address = new Address("Kwiatowa 7", 60_241, "Poznań");
////        Delivery delivery = new Delivery(DeliveryType.COURIER, 13, address);
////        Order order = new Order(products, delivery, customer, address);
//
//        //      int result = order.getTotalProductPrice();
//
//        System.out.println("Ordered Products: " + products);
//        System.out.println("Sum of ordered items: " + order.getAllOrderedItems());
//        System.out.println("Customer details: " + order.getCustomerDetails());
//        System.out.println("Delivery: " + order.getDeliveryType() + ", price: " + order.getDeliveryPrice());
//        System.out.println("Address: " + order.getDeliveryAddress());
//        System.out.println("----------------------------------------");
//        System.out.println("Total product price: " + order.getTotalProductPrice());
//        System.out.println("Total product price with delivery: " + order.getTotalProductsPriceWithDelivery());
//
////
////        System.out.println("---------------------------------------------------------------------------------------");
////        System.out.println("--------------------------------------SHOP---------------------------------------------");
//
        Shop shop = new Shop();
        Product product1 = new Product("prom", 250, Category.DRESS);
        Product product2 = new Product("sport", 80, Category.SHOES);
        Product product3 = new Product("checkered", 48, Category.SKIRT);
        Product product4 = new Product("flowers", 48, Category.SKIRT);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);

        System.out.println(shop.getAllProducts());
        System.out.println("New products of type SKIRT: " + shop.getProductsOfType(Category.SKIRT));
        System.out.println("New products of type DRESS: " + shop.getProductsOfType(Category.DRESS));

        System.out.println("New products of: ");
        List<Category> categories = Arrays.asList(Category.DRESS, Category.SKIRT, Category.SHOES, Category.T_SHIRT);
        System.out.println(shop.getProductsOfType(categories));


        shop.printAllProducts();
        System.out.println("TITLE SEARCH " + shop.search("prom"));


        System.out.println("====================NEW ORDER======================");

        List<Product> products = Arrays.asList(
                new Product("prom", 80, Category.DRESS),
                new Product("high heels", 30, Category.SHOES)
        );

        Customer newCustomer = new Customer("Marta", "Nowak", 987654321, "martan@gmail.com");
        Address newAddress = new Address("Polna 35", 10_014, "Warszawa");
        Delivery newDelivery = new Delivery(DeliveryType.COURIER, 13, newAddress);
        Order newOrdered = new Order(products, newDelivery, newCustomer, newAddress);


        System.out.println("Ordered Products: " + products);
        System.out.println("Sum of ordered items: " + newOrdered.getAllOrderedItems());
        System.out.println("Customer details: " + newOrdered.getCustomerDetails());
        System.out.println("Delivery: " + newOrdered.getDeliveryType() + ", price: " + newOrdered.getDeliveryPrice());
        System.out.println("Address: " + newOrdered.getDeliveryAddress());
        System.out.println("----------------------------------------");
        System.out.println("Total product price: " + newOrdered.getTotalProductPrice());
        System.out.println("Total product price with delivery: " + newOrdered.getTotalProductsPriceWithDelivery());


        System.out.println("-------------------------------------------------------");


        shop.createNewOrder(products, newCustomer, newDelivery, newAddress);
        shop.createNewOrder(products, newCustomer, newDelivery, newAddress);


        System.out.println("All orders: ");
        List<Order> orders = shop.getAllOrder();
        System.out.println(orders);

        shop.markOrderAsPaid(1);
        shop.markOrderAsSent(2);

        List<Order> orders1 = shop.getAllOrder();
        System.out.println(orders1);




    }
}
