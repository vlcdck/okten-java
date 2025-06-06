package task1;

public class Dog {

    private String name;
    private int age;
    private String color;
    private String breed;
    private String owner;

    public Dog() {
    }

    public Dog(String name, int age, String color, String breed, String owner) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
