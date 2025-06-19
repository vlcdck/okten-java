package util;

import model.Person;

import java.util.Comparator;

public class PersonComparators {
    public static final Comparator<Person> BY_SKILLS_CARS_ID = Comparator
            .comparingInt((Person p) -> p.getSkills().size())
            .thenComparingInt((Person p) -> p.getCars().size())
            .thenComparingInt(Person::getAge);
}
