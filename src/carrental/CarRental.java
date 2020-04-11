package carrental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CarRental {
    private final List<Car> cars;
    private final List<CarRentalAgreement> carRentalAgreements; // list of currently rental cars


    public CarRental() {
        this.cars = new ArrayList<>();
        this.carRentalAgreements = new ArrayList<>();
    }

    public void addCar(Car car) {
        System.out.println("Adding new car " + car.toString());
        this.cars.add(car);
    }

    public List<Car> getAllCar() {
        System.out.println("Get all cars");
        return cars;
    }

    public List<Car> getCarsByType(CarType type) {
        List<Car> filteredCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i); // I pull out the car at the index
            if (car.getCarType() == type) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public List<Car> getCarsByBrand(CarBrand brand) {
        List<Car> filteredCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.getCarBrand() == brand) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public List<Car> getAllAvailableCars() {
        List<Car> filteredCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            boolean rented = car.isRented();
            if (!rented) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public void rentCar(int carId, Person rentingPerson) {
        Car car = findCarWithId(carId);
        if (car.isRented()) { // = car.isRenter() == true
            System.out.println("Car is not available");
            return;
        }

        car.rent();
        CarRentalAgreement agreement = new CarRentalAgreement(carId, rentingPerson);
        carRentalAgreements.add(agreement);
    }

    private Car findCarWithId(int carId) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            int currentCarId = car.getId();
            if (currentCarId == carId) {
                return car;
            }
        }
        throw new IllegalStateException("There is no car with id:  " + carId);
    }

    public void printAllRentAgreements() {
        for (int i = 0; i < carRentalAgreements.size(); i++) {
            CarRentalAgreement agreement = carRentalAgreements.get(i);
            int carId = agreement.getCarId();
            Car car = findCarWithId(carId);
            String name = agreement.getCarRenter().getName();
            boolean returnedCar = agreement.isReturnedCar();
            if (returnedCar == true) {
                System.out.println("Person by name  " + name + " rented car with Id is= " + carId + " by brand= " + car.getCarBrand());

                // LocatDateTime
                LocalDateTime returnDate = agreement.getReturnDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                System.out.println(name + " gave the car in " + returnDate.format(formatter));
            } else {
                System.out.println("Person: " + name + " rent car with Id is=  " + carId + " by brand= " + car.getCarBrand());
            }
        }
    }

    public void returnCar(int carId, Person returnPerson) {
        Car car = findCarWithId(carId);
        car.returned();
        CarRentalAgreement agreement = findAgreementWithCarId(carId, returnPerson);
        agreement.setReturnedCar();
    }

    private CarRentalAgreement findAgreementWithCarId(int carId, Person returnPerson) {
        for (int i = 0; i < carRentalAgreements.size(); i++) {
            CarRentalAgreement agreement = carRentalAgreements.get(i);
            int carId1 = agreement.getCarId();
            Person person1 = agreement.getCarRenter();
            if (carId1 == carId && person1 == returnPerson) {
                return agreement;
            }
        }
        throw new IllegalStateException("There is no contract with Id:  " + carId);
    }
}


