package academy.kovalevskyi.algorithms.week1.day0;

public class IntGraphHelper {

  public static GraphBinaryNode<Integer> createNode(Integer value) {
    return new GraphBinaryNode<Integer>(null, null, value);
  }

  public static GraphBinaryNode<Integer> addNode(GraphBinaryNode<Integer> root, Integer value) {
    return null;
  }

  public static boolean contains(GraphBinaryNode<Integer> root, Integer value) {
    if (root == null) {
      return false;
    }
    return findNode(root, value);
  }

  private static boolean findNode(GraphBinaryNode<Integer> root, Integer value) {
    if (root == null || root.value() == null) {
      return false;
    } else if (root.value() < value) {
      return findNode()
    }
  }
}
