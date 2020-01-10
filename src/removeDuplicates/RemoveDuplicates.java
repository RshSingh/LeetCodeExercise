package removeDuplicates;

import Node.LinkedListNode;

public class RemoveDuplicates {

  public static void main(String[] args) {

    LinkedListNode node1 = new LinkedListNode(2);
    node1.next = new LinkedListNode(4);
    node1.next.next = new LinkedListNode(3);

    remove(node1);
  }

  public static LinkedListNode remove(LinkedListNode l) {

    LinkedListNode head = l;

    while (head != null && head.next != null) {
      if (head.val == head.next.val) {
        head.next = head.next.next;
      } else head = head.next;
    }
//    dum.next = l;
//    LinkedListNode head = l;
//    LinkedListNode tail = dum;
//
//    int lastNum = head.val;
//    head = head.next;
//    while(head != null) {
//      if(head.val == lastNum) {
//        while(head != null && head.val == lastNum){
//          head = head.next;
//        }
//
//      } else {
//
//      }
//    }

    return head;
  }

}
