package butik1;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList( // asList - metoda statyczna
                new Product(50, "WHITE", Category.T_SHIRT)
        );

        Address address = new Address("Anna", "Kuźnicza", "Poznań", "Wielkopolskie");
        Delivery delivery = new Delivery(DeliveryType.PARCEL_LOCKER, 30, address);
        Order order = new Order(products, delivery);

        int result = order.getTotalProductsPriceWithDelivery();
        System.out.println("Total Products Price With Delivery " + result);
        System.out.println(
                "Total product price = " + order.getTotalProductPrice());
        System.out.println(
                "Delivery Price = " + order.getDeliveryPrice());

        System.out.println(
                "Delivery Type =" + order.getDeliveryType()
        );
        System.out.println(
                "Delivery Address = " + order.getDeliveryAddress().toString()
        );

        System.out.println("-------------------------------------------------------------------------------------------");

        Shop shop = new Shop();
        Product product1 = new Product(60,"white", Category.SKIRT);
        Product product2 = new Product(100,"red", Category.SHOES);
        Product product3 = new Product(20,"white x", Category.T_SHIRT);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        System.out.println(shop.getAllProducts());
        System.out.println("Print all products");
        shop.printAllProducts();

        System.out.println("Product type: ");
        System.out.println(shop.getProductsOfType(Category.SKIRT));
        System.out.println(shop.getProductsOfType(Category.SHOES));
        System.out.println(shop.getProductsOfType(Category.T_SHIRT));

        System.out.println("Product types: ");
        List<Category> categories = Arrays.asList(Category.T_SHIRT, Category.DRESS, Category.SHOES);
        System.out.println(shop.getProductsOfTypes(categories));

        System.out.println("Product title: ");
        System.out.println(shop.search("white"));

        System.out.println("NEW ORDER");

    }
}
