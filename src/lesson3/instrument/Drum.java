package lesson3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        System.out.println("Грає Барабан розміру: " + size);
    }
}
