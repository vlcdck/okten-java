import lesson3.instrument.Drum;
import lesson3.instrument.Guitar;
import lesson3.instrument.Instrument;
import lesson3.instrument.Trumpet;
import lesson3.printable.Book;
import lesson3.printable.Magazine;
import lesson3.printable.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Hobbit");
        book.print();

        Magazine magazine = new Magazine("PlayBoy");
        magazine.print();

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(book);
        printables.add(magazine);

        System.out.println(printables);

        System.out.println("-------------------------------------------------");

        Drum drum = new Drum(28);
        Guitar guitar = new Guitar(6);
        Trumpet trumpet = new Trumpet(4);

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(drum);
        instruments.add(guitar);
        instruments.add(trumpet);

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }
}