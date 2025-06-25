import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = List.of(
                new Student("Ivan", 24, 2),
                new Student("Jake", 15, 1),
                new Student("Vlad", 26, 2),
                new Student("Petro", 31, 3),
                new Student("Alina", 34, 4),
                new Student("Vira", 25, 2)
        );

        StudentFileService studentFileService = new StudentFileService();

        studentFileService.writeStudentsToFile(studentList, "filesForTasks", "task2", "task2.txt");


        Path studentPath = Paths.get("filesForTasks", "task3", "Students.txt");
        Path coursesPath = Paths.get("filesForTasks", "task3", "Courses.txt");
        Path outputPath = Paths.get("filesForTasks", "task3", "output.txt");

        Map<Integer, Student2> students = studentFileService.readStudents(studentPath);
        List<Course> courses = studentFileService.readCourses(coursesPath);

        List<String> output = new ArrayList<>();

        for (Course course : courses) {
            output.add(course.toString());
            for (Integer studentId : course.getStudentIds()) {
                Student2 s = students.get(studentId);
                if (s != null) {
                    output.add("  - " + s);
                }
            }
            output.add("");
        }

        output.forEach(System.out::println);
        studentFileService.writeToFile(outputPath, output);

    }
}