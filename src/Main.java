import lesson2.car.Car;
import lesson2.car.Owner;
import lesson2.car.ServiceCenter;
import lesson2.person.Gender;
import lesson2.person.Person;
import lesson2.person.Skill;
import lesson2.post.Comment;
import lesson2.post.Post;
import lesson2.user.Address;
import lesson2.user.Company;
import lesson2.user.Geo;
import lesson2.user.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Geo geo = new Geo("-37.3159", "81.1496");
        Address address = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geo);
        Company company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");

        User user = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                address,
                "1-770-736-8031 x56442",
                "hildegard.org",
                company
        );

        System.out.println(user);

        // --------------------------------------------------------

        Owner owner = new Owner("Serj");
        ServiceCenter serviceCenter = new ServiceCenter("MechService");

        Car car = new Car(
                "Toyota",
                "Prius",
                2010,
                owner,
                serviceCenter
        );
        System.out.println(car);

        // --------------------------------------------------------

        Person person = new Person(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10)
                ),
                new lesson2.person.Car("mitsubishi", 2005, 140)
        );
        System.out.println(person);

        // ---------------------------------------------------------

        System.out.println("-------------------------");

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1,1,"First post", "This is the first post"));
        posts.add(new Post(1,2,"Second post", "This is the second post"));

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 101, "Alice", "alice@asd.com", "Great post!"));
        comments.add(new Comment(1, 102, "Bob", "bob@asd.com", "Great post, thanks!"));
        comments.add(new Comment(2, 103, "Charlie", "charlie@asd.com", "Helpful"));
        comments.add(new Comment(2, 104, "David", "david@asd.com", "Helpful, thanks!"));

        for (Comment comment : comments) {
            for (Post post : posts) {
                if (post.getId() == comment.getPostId()) {
                    post.addComment(comment);
                }
            }
        }

        for (Post post : posts) {
            System.out.println(post);
            System.out.println("----------------------------");
        }
    }
}