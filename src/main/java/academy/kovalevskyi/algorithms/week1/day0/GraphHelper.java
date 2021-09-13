package academy.kovalevskyi.algorithms.week1.day0;

public class GraphHelper {
  public static boolean equals(GraphBinaryNode<?> left, GraphBinaryNode<?> right) {
    return left.equals(right);
  }

  public static <T> GraphBinaryNode<T> invertGraph(GraphBinaryNode<T> root) {
    if (root == null) {
      return root;
    }
    return new GraphBinaryNode<T>(invertGraph(root.right()), invertGraph(root.left()), root.value());
  }
}