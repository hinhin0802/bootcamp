public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Find the index of the last occurrence of the target character
    int lastIndex = str.lastIndexOf(target);

    // if not found, print "Not Found."
    if (lastIndex == -1) {
      System.out.println("Not Found.");
    } else {
      System.out.println("The index of the last character of " + target + " is " + lastIndex);
    }
  }
}