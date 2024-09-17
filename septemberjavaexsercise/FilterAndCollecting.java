import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollecting {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    List<String> namesStartingWithA = names.stream()
        .filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());
    System.out.println(namesStartingWithA); // Output: [Alice, Annie, Alex]
  }
}