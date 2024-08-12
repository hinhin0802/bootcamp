public class JavaQuest8 {
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; 
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; 
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; 
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; 

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int num : nums) {
      if (num > max) {
        secondMax = max;
        max = num;
      } else if (num > secondMax && num != max) {
        secondMax = num;
      }
    }

    System.out.println("Second Max = " + secondMax);
  }
}