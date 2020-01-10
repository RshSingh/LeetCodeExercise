package removeNthNode;

import Node.LinkedListNode;

public class RemoveNthNode {

  public static void main(String[] args) {

    LinkedListNode node1 = new LinkedListNode(2);
    node1.next = new LinkedListNode(4);
    node1.next.next = new LinkedListNode(3);

    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    remove(node1, 0);
  }

  public static LinkedListNode remove(LinkedListNode n, int num) {
    LinkedListNode dummy = new LinkedListNode(0);
    dummy.next = n;
    LinkedListNode head = dummy;
    LinkedListNode tail = dummy;

    for(int i = 0; i < num; i++) {
      tail = tail.next;
    }
    while(tail != null) {
      tail = tail.next;
      head = head.next;
    }

    if(head.next != null && head.next.next != null) head.next = head.next.next;

    return n;
  }
}
