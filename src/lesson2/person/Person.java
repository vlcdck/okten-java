package lesson2.person;

import java.util.List;

public class Person {

    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skils;
    private Car car;

    public Person(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skils, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skils = skils;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skils=" + skils +
                ", car=" + car +
                '}';
    }
}
