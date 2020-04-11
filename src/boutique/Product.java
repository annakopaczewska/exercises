package boutique;

public class Product {
    private final String title;
    private final int productPrice;
    private final Category type;


    public Product(String title, int price, Category type) {
        this.title = title;
        this.productPrice = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public Category getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n" + "title: " + title +
                "\n" + "type: " + type +
                "\n" + "price: " + productPrice +
                "\n" + "---------------";
    }
}
