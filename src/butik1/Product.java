package butik1;

public class Product {
    private final int price;
    private final String title;
    private final Category type;


    public Product(int price, String title, Category type) {
        this.price = price;
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Category getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", type=" + type;
    }

}
