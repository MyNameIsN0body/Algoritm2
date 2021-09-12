package academy.kovalevskyi.algorithms.week0.day2;

import academy.kovalevskyi.algorithms.week0.day0.Sort;
import java.util.Comparator;

public class MergeSort implements Sort {
  @Override
  public <T> void sort(T[] target, Comparator<T> comparator) {
    if (target == null || comparator == null) {
      return;
    }
    doSort(target, 0, target.length - 1, comparator);
  }

  private <T> void doSort(T[] arr, int left, int right, Comparator<T> comparator) {
    if (left < right) {
      int mid = (left + right) / 2;
      doSort(arr, left, mid, comparator);
      doSort(arr, mid + 1, right, comparator);
      merge(arr, left, mid, right, comparator);
    }
  }

  private <T> void merge(T[] arr, int left, int mid, int right, Comparator<T> comparator) {
    int length = right - left + 1;
    T[] temp = (T[]) new Object[length];
    int i = left;
    int j = mid + 1;
    int r = 0;
    while (i <= mid && j <= right) {
      if (comparator.compare(arr[i], arr[j]) >= 0) {
        temp[r++] = arr[j++];
      } else {
        temp[r++] = arr[i++];
      }
    }
    while (i <= mid) {
      temp[r++] = arr[i++];
    }
    while (j <= right) {
      temp[r++] = arr[j++];
    }
    System.arraycopy(temp, 0, arr, left, length);
  }

  @Override
  public String complexityBest() {
    return "N*log(N)";
  }

  @Override
  public String complexityAverage() {
    return "N*log(N)";
  }

  @Override
  public String complexityWorst() {
    return "N*log(N)";
  }

  @Override
  public String spaceComplexityWorst() {
    return "N";
  }
}