package removeDuplicatesII;

import Node.LinkedListNode;

public class RemoveDuplicatesII {

  public static void main(String[] args) {

    LinkedListNode node1 = new LinkedListNode(2);
    node1.next = new LinkedListNode(4);
    node1.next.next = new LinkedListNode(3);

    remove(node1);
  }

  public static LinkedListNode remove(LinkedListNode l) {

  LinkedListNode dummy = new LinkedListNode(0), fast = l;
  LinkedListNode slow = dummy;
  slow.next = l;

  while (l != null) {
    while (l.next != null && l.val == l.next.val) {
      fast = fast.next;
    }

    if(fast != slow.next){
      slow.next = fast.next;
      fast = fast.next;
    } else {
      fast = fast.next;
      slow = slow.next;
    }
  }
  return  dummy.next;
  }
}
