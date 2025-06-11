package lesson3.printable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Printable {
    private String title;

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}
