package lesson2.post;

import lombok.Getter;
import java.util.ArrayList;

public class Post {
    private int userId;
    @Getter
    private int id;
    private String title;
    private String body;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        String result = "Post #" + id + ": " + title + "\n" + body + "\n" + "Comments:\n";

        for (Comment c : comments) {
            result += c.toString() + "\n";
        }

        return result;
    }

}
