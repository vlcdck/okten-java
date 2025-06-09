package lesson2.car;

public class Engine {
    private String type;
    private double volume;

    public Engine(String type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    public void startEngine() {
        System.out.println("Engine " + type + " " + volume + " started");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}
