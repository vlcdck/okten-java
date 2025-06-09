package lesson2.car;

public class ServiceCenter {
    private String name;

    public ServiceCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ServiceCenter{" +
                "name='" + name + '\'' +
                '}';
    }
}
