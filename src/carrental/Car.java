package carrental;

public class Car {
    private final int id;
    private final CarBrand brand;
    private final CarType type;
    private boolean isRented = false;

    public Car(int id, CarBrand brand, CarType type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public CarBrand getCarBrand() {
        return brand;
    }

    public CarType getCarType() {
        return type;
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", type=" + type +
                ", isRented=" + isRented +
                '}';
    }

    public void returned() {
        isRented = false;
    }

    public void rent() {
        isRented = true;
    }
}
