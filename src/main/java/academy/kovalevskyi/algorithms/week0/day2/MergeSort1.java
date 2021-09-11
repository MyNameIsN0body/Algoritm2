package academy.kovalevskyi.algorithms.week0.day2;

import academy.kovalevskyi.algorithms.week0.day0.Sort;
import java.util.Arrays;
import java.util.Comparator;

public class MergeSort1 implements Sort {

  @Override
  public <T> void sort(T[] target, Comparator<T> comparator) {
    if (comparator == null) {
      return;
    }
    T[] tmp;
    T[] currentSrc = target;
    T[] currentDest = Arrays.copyOf(target, target.length);
    int size = 1;
    while (size < target.length) {
      for (int i = 0; i < target.length; i += 2 * size) {
        merge(currentSrc, i, currentSrc, i + size, currentDest, i, size, comparator);
      }
      tmp = currentSrc;
      currentSrc = currentDest;
      currentDest = tmp;
      size = size * 2;
    }
  }

  private <T> void merge(T[] src1, int src1Start, T[] src2,
                         int src2Start, T[] dest, int destStart,
                         int size, Comparator<T> comparator) {
    int index1 = src1Start;
    int index2 = src2Start;
    int src1End = Math.min(src1Start + size, src1.length);
    int src2End = Math.min(src2Start + size, src2.length);
    int iterationCount = src1End - src1Start + src2End - src2Start;
    for (int i = destStart; i < destStart + iterationCount; i++) {
      if (index1 < src1End && (index2 >= src2End
          || comparator.compare(src1[index1], src2[index2]) < 0)) {
        dest[i] = src1[index1];
        index1++;
      } else {
        dest[i] = src2[index2];
        index2++;
      }
    }
  }


  public <T> T[] createSortedArray(final T[] target, final Comparator<T> comparator) {
    T[] result = Arrays.copyOf(target, target.length);
    sort(result, comparator);
    return  result;
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