package intersectionTwolinkedList;

import Node.LinkedListNode;

public class Intersection {

  public static void main(String[] args) {
    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    LinkedListNode node1 = new LinkedListNode(7);
    node1.next = new LinkedListNode(6);
    node1.next.next = new LinkedListNode(4);

    System.out.println(intersection(node1, node2));
  }

  public static LinkedListNode intersection(LinkedListNode headA, LinkedListNode headB) {
    int lenA = length(headA), lenB = length(headB);

    if(lenA > lenB) {
      headA = headA.next;
      lenA--;
    }

    if(lenB > lenA) {
      headB = headB.next;
      lenB--;
    }

    while ( headA!= headB) {
      headA= headA.next;
      headB = headB.next;
    }

    return headA;
  }

  public static int length(LinkedListNode head) {
    int len = 0;
    while(head != null) {
      len++;
      head = head.next;
    }
    return len;
  }
}
