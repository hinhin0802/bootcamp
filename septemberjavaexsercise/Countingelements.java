import java.util.Arrays;
import java.util.List;

public class Countingelements {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "world", "java", "steam");
    int count = 0;
    for (String word : words) {
      if (word.length() > 3) {
        count++;
      }
    }
    System.out.println(count); // output: 4
  }
}
