package abstractTask;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarWithOwners {
    private String brand;
    private double power;
    private CarOwner carOwner;
    private int price;
    private int year;

    public void engineRepair(){
        this.power *= 1.10;
    }
}
