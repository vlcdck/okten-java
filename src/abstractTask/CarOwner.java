package abstractTask;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarOwner {
    private String name;
    private int age;
    private int drivingExp;

    public void increaseDrivingExp(){
        this.drivingExp++;
    }
}
