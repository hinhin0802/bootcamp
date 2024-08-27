import java.time.LocalDate;
import java.util.Objects;

public class Student {
  private String name;
  private LocalDate birthDate;

  public Student(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  @Override
  public String toString() {
    return "Student(" +
        "name=" + this.name +
        ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Student))
      return false;
    Student student = (Student) obj;
    return Objects.equals(this.name, student.getName())&&Objects.equals(this.birthDate, student.getBirthDate());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.birthDate);
  }

  public static void main(String[] args) {
    System.out.println(new Student("Alice", LocalDate.of(2000, 2, 15)).equals(null));
    System.out.println(new Student("Alice", LocalDate.of(2000, 2, 15)).equals(new Student("Alice", LocalDate.of(2000, 2, 15)))); 
  }
}