package academy.kovalevskyi.algorithms.week0.day2;

import java.util.OptionalInt;

public class Tasks {

  public static OptionalInt findIndex(int[] sortedArray, int target) {
    int startIndex = 0;
    int endIndex = sortedArray.length - 1;
    while (startIndex <= endIndex) {
      int mid = startIndex + (endIndex - startIndex) / 2;
      if (target < sortedArray[mid]) {
        endIndex = mid - 1;
      } else if (target > sortedArray[mid]) {
        startIndex = mid + 1;
      } else {
        return OptionalInt.of(mid);
      }
    }
    return OptionalInt.of(-1);
  }
}