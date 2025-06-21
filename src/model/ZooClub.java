package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club =  new HashMap<>();

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void addPetToMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.add(pet);
        } else {
            System.out.println("No members in this zoo club");
        }
    }

    public void removePetFromMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);

        if (pets != null) {
            pets.remove(pet);
        }
    }

    public void removePetFromAll(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.remove(pet);
        }
    }

    public void showClub() {
        if (club.isEmpty()) {
            System.out.println("No members in this zoo club");
            return;
        }

        for (Map.Entry<Person, List<Pet>> personListEntry : club.entrySet()) {
            System.out.println(personListEntry.getKey() + ": " + personListEntry.getValue());
        }
    }
}
