package oop_exercises.car;

public class Main {
    public static void main(String[] args) {
        Ford ford = new Ford(120, 25000, "Black", 2001, 10);
        Sedan sedan = new Sedan(130, 20000, "Red");
        Car myCar = new Car(160, 16500, "white");

        System.out.println(sedan.getSalePrice());
        System.out.println(ford.getSalePrice());
        System.out.println(myCar.getSalePrice());

    }
}
