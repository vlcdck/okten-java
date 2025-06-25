import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class StudentFileService {

    public void writeStudentsToFile(List<Student> students, String... pathParts) throws IOException {
        Path path = Paths.get("", pathParts);

        List<String> lines = students.stream()
                .map(student -> student.getName() + ',' + student.getAge() + "," + student.getCourse())
                .collect(Collectors.toList());
        Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public Map<Integer, Student2> readStudents(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        Map<Integer, Student2> students = new HashMap<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] studentLine = lines.get(i).split(",");
            int id = Integer.parseInt(studentLine[0]);
            String name = studentLine[1];
            int age = Integer.parseInt(studentLine[2]);
            students.put(id, new Student2(id, name, age));
        }
        return students;
    }

    public List<Course> readCourses(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        List<Course> courses = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] courseLine = lines.get(i).split(",");
            int id = Integer.parseInt(courseLine[0]);
            String name = courseLine[1];
            List<Integer> studentIds = Arrays.stream(courseLine[2].split(";"))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .toList();

            courses.add(new Course(id, name, studentIds));
        }
        return courses;
    }

    public void writeToFile(Path path, List<String> lines) throws IOException {
        Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
