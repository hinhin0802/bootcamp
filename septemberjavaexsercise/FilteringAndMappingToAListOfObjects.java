import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Employee {
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }
}

public class FilteringAndMappingToAListOfObjects {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
      new Employee("John", 65000),
      new Employee("Jane", 55000),
      new Employee("Doe", 40000)
    );

    List<String> employeeNames = employees.stream()
      .filter(employee -> employee.getSalary() >= 50000)
      .map(Employee::getName)
      .collect(Collectors.toList());

    System.out.println(employeeNames); // Output: [John, Jane]
  }
}
