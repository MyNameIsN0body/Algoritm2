package academy.kovalevskyi.algorithms.week0.day0;
import java.util.Arrays;
import java.util.Comparator;

public interface Sort {
  default <T extends Comparable<? super T>> void sort(final T[] target) {
    sort(target, T::compareTo);
  }

  default <T> void sort(final T[] target, final Comparator<T> comparator) {
    if (target == null) {
      return;
    }
    boolean flag = true;
    for (int i = 0; flag; i++) {
      flag = false;
      for (int j = 0; j < target.length - 1 - i; j++) {
        if (comparator.compare(target[j], target[j + 1]) > 0) {
          T temp = target[j];
          target[j] = target[j + 1];
          target[j + 1] = temp;
          flag = true;
        }
      }
    }
  }

  default <T> T[] createSortedArray(final T[] target, final Comparator<T> comparator) {
    T[] result = Arrays.copyOf(target, target.length);
    sort(result, comparator);
    return  result;
  }

  default String complexityBest() {
    return "N";
  }

  default String complexityAverage() {
    return "N^2";
  }

  default String complexityWorst() {
    return "N^2";
  }

  default String spaceComplexityWorst() {
    return "N";
  }
}