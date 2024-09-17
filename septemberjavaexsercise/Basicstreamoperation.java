import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basicstreamoperation{
  public static void main(String[] args) {

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> result = numbers.stream()
        .filter(n -> n % 2 == 0) // filter even numbers
        .map(n -> n * n) // square each number
        .sorted((a, b) -> b.compareTo(a)) // sort in descending order
        .collect(Collectors.toList());

System.out.println(result); // [100, 64, 36, 16, 4]

}
}