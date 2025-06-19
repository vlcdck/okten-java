package util;

import model.Car;
import model.Gender;
import model.Person;
import model.Skill;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class PersonFactory {

    public static Set<Person> generatePersonSet(int count, Supplier<Set<Person>> setFactory) {
        Set<Person> persons = setFactory.get();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            persons.add(buildPerson(i, random));
        }
        return persons;
    }

    private static Person buildPerson(int id, Random random) {
        Gender gender;
        int skillCount = random.nextInt(5) + 1;
        int carCount = random.nextInt(5) + 1;

        if (id % 2 == 0) {
            gender = Gender.MALE;
        } else {
            gender = Gender.FEMALE;
        }

        ArrayList<Skill> skills = generateSkils(skillCount, 10 + id);
        ArrayList<Car> cars = generateCars(carCount, 2003 + id, 125 + id);
        return new Person(id, "Name" + id, "Surname" + id, "Email" + id, 30 + id, gender, skills, cars);
    }

    private static ArrayList<Skill> generateSkils(int count, int exp) {
        ArrayList<Skill> skills = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            skills.add(new Skill("Skill" + i, exp + i));
        }
        return skills;
    }

    private static ArrayList<Car> generateCars(int count, int year, int power) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            cars.add(new Car("Model" + i, year, power));
        }
        return cars;
    }
}
