package academy.kovalevskyi.algorithms.week0.day1;

public class Tasks {

  public static class Node {
    public Node next;
    public int value;
  }

  public static int findMiddleInOneGo(Node start) {
    if (start == null || start.next == null) {
      return -1;
    }
    Node middle = start;
    Node current = start;
    int length = 0;
    while (current.next != null) {
      length++;
      if (length % 2 == 0) {
        middle = middle.next;
      }
      current = current.next;
    }
    if (length % 2 == 1) {
      middle = middle.next;
    }
    return middle.value;
  }

  public static boolean hasCycle(Node start) {
    Node firstNode = start;
    Node secondNode = start;
    while (firstNode != null && firstNode.next != null) {
      secondNode = secondNode.next;
      firstNode = firstNode.next.next;
      if (secondNode == firstNode) {
        return true;
      }
    }
    return false;
  }
}