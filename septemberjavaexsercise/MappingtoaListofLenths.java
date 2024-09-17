import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingtoaListofLenths {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "pear");
    List<Integer> lengths = words.stream()
                                 .map(String::length)
                                 .collect(Collectors.toList());
    System.out.println(lengths); // output: [5, 6, 4]
  }
}