package doc;

public class Doge {

    public static void main(String[] args) {
        Dogs dogs = new Dogs("Puszek ", "kundel ", 3);
        System.out.println(dogs.getName() + dogs.getBreed() + dogs.getAge());
        dogs.setAge(5);
        dogs.setName(" Pimpek ");
        dogs.setBreed("dalmatyńczyk");
        System.out.println(dogs.getAge() + dogs.getBreed() + dogs.getName());
    }
}