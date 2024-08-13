package exersie.src;

public class JavaQuest11 {
  // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

  public static void main(String[] args) {
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    System.out.println("delayed arrival time 1: " + delayedArrivalTime1);
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    System.out.println("delayed arrival time 2: " + delayedArrivalTime2);
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
    System.out.println("delayed arrival time 3: " + delayedArrivalTime3);
  }

  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int delayedArrivalTime = (arrivalTime + delayedTime) % 24;
    return delayedArrivalTime;
  }
}