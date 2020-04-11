package doc;

public class HashExample {
    public static void main(String[] args) {
        Product prod1 = new Product("Czekolada", 2.99);
        Product prod2 = new Product("Czekolada", 2.99);
        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.hashCode()); //2018699554
        System.out.println(prod2.hashCode()); //1311053135
    }
}

