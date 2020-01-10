package hasCycle;

import Node.LinkedListNode;

public class HasCycle {

  public static void main(String[] args) {

    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    hasCycle(node2);
  }

  public static boolean hasCycle(LinkedListNode node) {

    if(node == null || node.next == null) return false;
    LinkedListNode head = node;
    LinkedListNode tail = node.next;

    while(head != tail) {
      if(tail == null || tail.next == null) return false;

      head = head.next;
      tail = tail.next.next;
    }

    return true;
  }
}
