import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilteringandCollectingtoaSet {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 10, 5);

    Set<Integer> result = numbers.stream()
                                 .filter(n -> n > 10)
                                 .collect(Collectors.toSet());

    System.out.println(result); // Output: [15, 20]
  }
}