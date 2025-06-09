package lesson2.car;

public class Car {

    private String brand;
    private String model;
    private int year;

    private Engine engine;
    private Transmission transmission;

    private Owner owner;
    private ServiceCenter serviceCenter;

    public Car(String brand, String model, int year, Owner owner, ServiceCenter serviceCenter) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = new Engine("Hybrid", 2.0);
        this.transmission = new Transmission("Automatic", 5);
        this.owner = owner;
        this.serviceCenter = serviceCenter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", owner=" + owner +
                ", serviceCenter=" + serviceCenter +
                '}';
    }
}
