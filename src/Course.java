import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    List<Integer> studentIds;
}
