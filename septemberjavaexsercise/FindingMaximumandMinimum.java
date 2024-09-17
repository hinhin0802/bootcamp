import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingMaximumandMinimum {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);

    // Find the maximum value
    Optional<Integer> max = numbers.stream().max((a, b) -> a.compareTo(b));
    if (max.isPresent()) {
      System.out.println("Max: " + max.get());
    } else {
      System.out.println("List is empty");
    }

    // Find the minimum value
    Optional<Integer> min = numbers.stream().min((a, b) -> a.compareTo(b));
    if (min.isPresent()) {
      System.out.println("Min: " + min.get());
    } else {
      System.out.println("List is empty");
    }
  }
}