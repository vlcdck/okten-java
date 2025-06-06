package task1;

public class Car {

    private int carId;
    private String carName;
    private double price;

    public Car() {
    }

    public Car(int carId, String carName, double price) {
        this.carId = carId;
        this.carName = carName;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
