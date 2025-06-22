import abstractTask.CarOwner;
import abstractTask.CarWithOwners;
import model.*;
import util.PersonComparators;
import util.PersonFactory;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Serj", 22));
        users.add(new User("Vladimir", 20));
        users.add(new User("Nick", 38));
        users.add(new User("Jake", 42));
        users.add(new User("Brandon", 18));
        users.add(new User("James", 23));
        users.add(new User("Mike", 56));
        users.add(new User("John", 34));
        users.add(new User("Elsa", 28));
        users.add(new User("Kim", 37));
        System.out.println("---------------------USERS-----------------------");

        users.forEach(System.out::println);

        System.out.println("----------USERS by age from low to high----------");

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        users.forEach(System.out::println);

        System.out.println("----------USERS by age from high to low----------");

        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        users.forEach(System.out::println);

        System.out.println("------USERS by name length from high to low------");

        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        users.forEach(System.out::println);

        System.out.println("------USERS by name length from low to high------");

        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        users.forEach(System.out::println);

        System.out.println("------------------Words Array--------------------");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Tree",
                "Mountain",
                "River",
                "Sky",
                "Cloud",
                "Stone",
                "Ocean",
                "Forest",
                "Flower",
                "Sunlight",
                "Shadow",
                "Wind",
                "Rain",
                "Thunder",
                "Snow",
                "Bird",
                "Leaf",
                "Grass",
                "Field",
                "Fire"
        ));
        users.forEach(System.out::println);
        System.out.println("----Words Array sorted by alphabetical order-----");
        words.sort(String::compareTo);
        users.forEach(System.out::println);

        System.out.println("---------------Hash Set of Users-----------------");

        Set<Person> persons = PersonFactory.generatePersonSet(10, HashSet::new);
        persons.forEach(System.out::println);

        System.out.println("---------Hash Set of Persons without Males----------");

//        Iterator<model.Person> iterator = persons.iterator();
//        while (iterator.hasNext()) {
//            model.Person person = iterator.next();
//            if (person.getGender() == model.Gender.MALE) {
//                iterator.remove();
//            }
//        }

        // OR

        persons.removeIf(p -> p.getGender() == Gender.MALE);
        persons.forEach(System.out::println);

        System.out.println("---Tree Set of Persons sorted by skills from low to high---");

        // First comparing by skill length, then by car length and finally by id
        Set<Person> person2 = PersonFactory.generatePersonSet(10, () -> new TreeSet<>(PersonComparators.BY_SKILLS_CARS_ID));
        person2.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------ZooClub-----------------------");
        System.out.println("----------------------------------------------------");

        ZooClub zooClub = new ZooClub();
        Person anna = new Person("Anna", 26);
        Person ivan = new Person("Ivan", 31);

        Pet rex = new Pet("Cat", "Rex");
        Pet barsik = new Pet("Dog", "Barsik");
        Pet persik = new Pet("Hamster", "Persik");

        zooClub.addMember(anna);
        zooClub.addMember(ivan);

        zooClub.addPetToMember(anna, rex);
        zooClub.addPetToMember(anna, barsik);
        zooClub.addPetToMember(anna, persik);
        zooClub.addPetToMember(ivan, persik);

        System.out.println("------------------Club after adding-----------------");
        zooClub.showClub();

        System.out.println("-----------------Club after manipulations-----------");
        zooClub.removePetFromMember(anna, persik);
        zooClub.showClub();
        zooClub.removePetFromAll(rex);
        zooClub.showClub();
        zooClub.removeMember(ivan);

        System.out.println("----------------------------------------------------");
        System.out.println("------------------Owners & Cars---------------------");
        System.out.println("----------------------------------------------------");

        ArrayList<CarWithOwners> cars = new ArrayList<>();
        cars.add(new CarWithOwners("BMW", 250, new CarOwner("Андрій", 30, 3), 600_000, 2018));
        cars.add(new CarWithOwners("Audi", 220, new CarOwner("Марина", 28, 6), 550_000, 2019));
        cars.add(new CarWithOwners("Toyota", 180, new CarOwner("Ігор", 26, 2), 400_000, 2020));
        cars.add(new CarWithOwners("Ford", 200, new CarOwner("Олег", 35, 10), 430_000, 2017));
        cars.add(new CarWithOwners("Honda", 190, new CarOwner("Наталя", 32, 4), 410_000, 2018));
        cars.add(new CarWithOwners("Mercedes", 300, new CarOwner("Сергій", 40, 15), 700_000, 2016));
        cars.add(new CarWithOwners("Skoda", 150, new CarOwner("Олена", 27, 3), 380_000, 2021));
        cars.add(new CarWithOwners("Mazda", 170, new CarOwner("Максим", 24, 1), 360_000, 2022));
        cars.add(new CarWithOwners("Nissan", 160, new CarOwner("Інна", 29, 5), 390_000, 2020));
        cars.add(new CarWithOwners("Chevrolet", 145, new CarOwner("Тарас", 33, 2), 350_000, 2019));

        cars.forEach(System.out::println);

        // Service
        IntStream.range(0, cars.size() / 2)
                .forEach(i -> cars.get(i).engineRepair());

        // Driving courses
        cars.stream()
                .map(car -> car.getCarOwner())
                .filter(owner -> owner.getDrivingExp() < 5 && owner.getAge() > 25)
                .forEach(owner -> owner.increaseDrivingExp());

        double totalCoast = cars.stream()
                .mapToDouble(car -> car.getPrice())
                .sum();

        System.out.println("=== Автопарк ===");

        cars.forEach(System.out::println);
        System.out.println("Total Coast: " + totalCoast);

    }
}