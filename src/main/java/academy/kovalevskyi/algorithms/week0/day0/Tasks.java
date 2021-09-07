package academy.kovalevskyi.algorithms.week0.day0;

public class Tasks {
  public static void main(String[] args) {
    System.out.println(sameCharactersSorting("Hello", "Hello"));
  }

  public static boolean sameCharactersSorting(String left, String right) {
    if (left.length() != right.length()) {
      return false;
    }
    String[] leftArray = left.split("");
    String[] rightArray = right.split("");
    Sort sort = new Sort() {
    };
    sort.sort(leftArray);
    sort.sort(rightArray);
    return "".formatted(rightArray).equals("".formatted(leftArray));
  }

  public static boolean sameCharactersO1(String left, String right) {
    char[] leftArray = new char[256];
    char[] rightArray = new char[256];
    if (left.length() != right.length()) {
      return false;
    }
    for (int i = 0; i < left.length(); i++) {
      leftArray[left.charAt(i)]++;
      rightArray[right.charAt(i)]++;
    }
    for (int i = 0; i < leftArray.length; i++) {
      if (rightArray[i] != leftArray[i]) {
        return false;
      }
    }
    return true;
  }

}
