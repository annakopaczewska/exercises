package hamburger;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon",14.5, "White");
        super.addHamburgerAddition("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
