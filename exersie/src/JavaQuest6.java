public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    System.out.print(first + " " + second + " "); 
    // for loop to print the next 13 numbers in Fibonacci Sequence
    for (int i = 2; i < 15; i++) {
      int nextnumber = first + second;
      System.out.print(nextnumber + " ");
      first = second;
      second = nextnumber;
    }
  } 
}