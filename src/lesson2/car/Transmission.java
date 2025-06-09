package lesson2.car;

public class Transmission {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public void shift(){
        System.out.println("Shifting " + gears + "-speed " + type + " transmission.");
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                ", gears=" + gears +
                '}';
    }
}
