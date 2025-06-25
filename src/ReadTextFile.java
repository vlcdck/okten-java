import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFile {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("filesForTasks", "task1", "task1.txt");
        Files.lines(filePath).forEach(System.out::println);
    }
}
