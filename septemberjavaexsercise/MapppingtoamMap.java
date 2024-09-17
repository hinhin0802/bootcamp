import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Student {
  private String name;
  private int score;

  public Student(String name, int score) {
      this.name = name;
      this.score = score;
  }

  public String getName() {
      return name;
  }

  public int getScore() {
      return score;
  }
}
public class MapppingtoamMap {
  public static void main(String[] args) {
      List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));

      Map<String, Integer> studentMap = students.stream()
              .collect(Collectors.toMap(Student::getName, Student::getScore));

      System.out.println(studentMap); // Output: {Alice=85, Bob=75}
  }
}