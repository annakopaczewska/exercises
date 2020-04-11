package butik1;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Product> products;
    private final List<Delivery> deliveryList;


    public Shop() {
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
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(product);
        }
    }

    public List<Product> getProductsOfType(Category type) {
        List<Product> productsOfType = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) { // pętle for można zapiać --> Product product : products
            Product product = products.get(i);
            if (product.getType() == type) {
                productsOfType.add(product);
            }
        }
        return productsOfType;
    }

    public List<Product> getProductsOfTypes(List<Category> types) {
        List<Product> productsOfTypes = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) { // (Product products : products
            Product product = products.get(i);
            Category types1 = product.getType();
            if (types.contains(types1)) {
                productsOfTypes.add(product);
            }
        }
        return productsOfTypes;
    }

    public List<Product> search(String phrase) {
        List<Product> productTitle = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            String containWord = product.getTitle(); // wydobywam title z kazdego produktu
            boolean contains = containWord.contains(phrase);
            if (contains) {
                productTitle.add(product);
            }
        }
        return productTitle;
    }

}



