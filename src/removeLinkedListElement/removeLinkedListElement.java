package removeLinkedListElement;

import Node.LinkedListNode;

public class removeLinkedListElement {

  public static void main(String[] args) {

    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    removeElements(node2, 4);
  }

  public static LinkedListNode removeElements(LinkedListNode head, int val) {
    while (head != null && head.val == val) head = head.next;
    LinkedListNode dummy = new LinkedListNode(0);
    dummy.next = head;
    LinkedListNode helper = head;

    while(helper != null && helper.next != null) {
      if(val == helper.next.val) {
        helper.next = helper.next.next;
      } else {
        helper = helper.next;
      }
    }

    return dummy.next;
  }
}
