package academy.kovalevskyi.algorithms.week0.day1;

import academy.kovalevskyi.algorithms.week0.day0.Sort;
import java.util.Comparator;

public class InsertionSort implements Sort {
  @Override
  public <T> void sort(T[] target, Comparator<T> comparator) {
    int k;
    for (int i = 1; i < target.length; i++) {
      T current = target[i];
      k = i;
      while (k > 0 && comparator.compare(target[k - 1], current) > 0) {
        target[k] = target[k - 1];
        k--;
      }
      target[k] = current;
    }
  }
}
