package person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Anna", "Kopaczewska", 24);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        Person person1 = new Person("Kacper", "Koza", 18);
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= "+ person1.isTeen());
    }
}