package carrental;

public class Main {
    public static void main(String[] args) {

        CarRental carRental = new CarRental();

        Car car1 = new Car(1, CarBrand.SKODA, CarType.SUV);
        Car car2 = new Car(2, CarBrand.FORD, CarType.SEDAN);
        Car car3 = new Car (3, CarBrand.VOLKSWAGEN, CarType.SPORTSCAR);
        Car car4 = new Car (4, CarBrand.SKODA, CarType.SEDAN);


        carRental.addCar(car1);
        carRental.addCar(car2);
        carRental.addCar(car3);
        carRental.addCar(car4);

        Person person1 = new Person("Anna");
        Person person2 = new Person("Kacper");
        Person person3 = new Person("Max");

        carRental.rentCar(2, person1);
        carRental.rentCar(1, person3);
        carRental.printAllRentAgreements();

        carRental.rentCar(2, person2);

        carRental.returnCar(2,person1);
        carRental.printAllRentAgreements();

        carRental.rentCar(2, person2);
        carRental.printAllRentAgreements();


    }
}
