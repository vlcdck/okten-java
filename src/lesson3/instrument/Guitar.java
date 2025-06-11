package lesson3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument{

    private int numOfStrings;

    @Override
    public void play() {
        System.out.println("Грає Гітара з " +  numOfStrings + " струнами");
    }
}
