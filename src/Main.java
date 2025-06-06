import task1.Comment;
import task1.Post;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post(1, 11, "Hello", "Body"));
        posts.add(new Post(2, 22, "Hello1", "Body1"));
        posts.add(new Post(3, 33, "Hello2", "Body2"));
        posts.add(new Post(4, 44, "Hello3", "Body3"));
        posts.add(new Post(5, 55, "Hello4", "Body4"));

        Comment[] comments = new Comment[5];
        comments[0] = new Comment(1, 11, "John", "1fsdas@gmail.com", "1lorem");
        comments[1] = new Comment(2, 22, "John1", "2fsdas@gmail.com", "2lorem");
        comments[2] = new Comment(3, 33, "John2", "3fsdas@gmail.com", "3lorem");
        comments[3] = new Comment(4, 44, "John3", "4fsdas@gmail.com", "4lorem");
        comments[4] = new Comment(5, 55, "John4", "5fsdas@gmail.com", "5lorem");


        for (Post post : posts) {
            System.out.println(post);
        }

        for (int i = 0; i < comments.length; i++) {
            Comment comment = comments[i];
            System.out.println(comment);
        }

    }
}