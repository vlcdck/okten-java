package lesson3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument{
    private int diameter;

    @Override
    public void play() {
        System.out.println("Грає труба з діаметром: " + diameter);
    }
}
