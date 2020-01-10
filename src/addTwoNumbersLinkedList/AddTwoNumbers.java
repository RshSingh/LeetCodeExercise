package addTwoNumbersLinkedList;

import Node.LinkedListNode;

public class AddTwoNumbers {

  public static void main(String[] args) {

    LinkedListNode node1 = new LinkedListNode(2);
    node1.next = new LinkedListNode(4);
    node1.next.next = new LinkedListNode(3);

    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    addNumber(node1, node2);
  }

  public static LinkedListNode addNumber(LinkedListNode p, LinkedListNode q) {

    LinkedListNode node = new LinkedListNode(0);
    LinkedListNode sumNode = node;
    int carry = 0;

    while(p != null || q != null || carry != 0) {
      int sum = (p != null ? p.val: 0) + (q != null ? q.val: 0) + carry;

      LinkedListNode temp = new LinkedListNode(sum%10);
      node.next = temp;
      node = node.next;

      carry = sum/10;
      if(p != null) p = p.next;
      if(q != null) q = q.next;
    }

    return sumNode.next;
  }
}
