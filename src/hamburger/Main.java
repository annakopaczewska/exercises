package hamburger;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.55, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition("Tomato", 0.5);
        hamburger.addHamburgerAddition2("Lettuce", 1.0);
        hamburger.addHamburgerAddition3("Cheese", 1.5);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.55);
        healthyBurger.addHealthAddition("Egg", 1.7);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}
