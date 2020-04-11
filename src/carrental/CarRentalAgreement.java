package carrental;

import java.time.LocalDateTime;

public class CarRentalAgreement {
    private final int carId;
    private final Person carRenter;
    private boolean returnedCar = false;
    private LocalDateTime returnDate = null;

    public CarRentalAgreement(int carId, Person carRenter) {
        this.carId = carId;
        this.carRenter = carRenter;
    }

    public int getCarId() {
        return carId;
    }

    public Person getCarRenter() {
        return carRenter;
    }

    public boolean isReturnedCar() {
        return returnedCar;
    }

    public void setReturnedCar() {
        returnedCar = true;
        returnDate = LocalDateTime.now();
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }
}
