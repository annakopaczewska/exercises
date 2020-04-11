package boutique;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Product> products;
    private final List<Delivery> deliveryList;
    private final List<Order> orders;

    public Shop() {
        this.orders = new ArrayList<>();
        this.products = new ArrayList<>();
        this.deliveryList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        System.out.println("Adding new product: " + product.toString());
        this.products.add(product);
    }

    public List<Product> getAllProducts() {
        System.out.println("Get all products: ");
        return products;
    }

    public void printAllProducts() {
        System.out.println("Print all products: ");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(product);
        }
    }

    public List<Product> getProductsOfType(Category type) {
        List<Product> productsOfType = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getType() == type) {
                productsOfType.add(product);
            }
        }
        return productsOfType;
    }

    public List<Product> getProductsOfType(List<Category> type) {
        List<Product> productsOfTypes = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            Category types = product.getType();
            if (type.contains(types)) {
                productsOfTypes.add(product);
            }
        }
        return productsOfTypes;
    }

    public List<Product> search(String title) {
        List<Product> productTitle = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            String containWord = product.getTitle();
            boolean contains = containWord.contains(title);
            if (contains) {
                productTitle.add(product);
            }
        }
        return productTitle;
    }

    public void createNewOrder(List<Product> products, Customer customer, Delivery delivery, Address address) {
        Order order = new Order(products, delivery, customer, address);
        System.out.println("New Order: " + order);
        orders.add(order);
    }

    public List<Order> getAllOrder() {
        return orders;
    }

    public void markOrderAsPaid(int paidOrderId) {
        Order searchOrder = findOrderById(paidOrderId);
        checkIfOrderExist(searchOrder, paidOrderId);
        searchOrder.setStatus(StatusOfOrder.PAID);
    }

    public void markOrderAsSent(int sentOrderId) {
        Order searchOrder = findOrderById(sentOrderId);
        checkIfOrderExist(searchOrder, sentOrderId);
        searchOrder.setStatus(StatusOfOrder.SENT);
    }

    private Order findOrderById(int id) {
        Order searchOrder = null;
        for (Order order : orders) {
            int orderId = order.getOrderId();
            if (orderId == id) {
                searchOrder = order;
                break;
            }
        }
        return searchOrder;

    }

    private void checkIfOrderExist(Order order, int searchOrderId) {
        if (order == null) {
            throw new RuntimeException("Order with Id = " + searchOrderId + ", does not exist");
        }
    }
}
