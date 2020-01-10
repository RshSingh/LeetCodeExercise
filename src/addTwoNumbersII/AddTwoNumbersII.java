package addTwoNumbersII;

import Node.LinkedListNode;
import java.util.Stack;

public class AddTwoNumbersII {

  public static void main(String[] args) {

    LinkedListNode node1 = new LinkedListNode(2);
    node1.next = new LinkedListNode(4);
    node1.next.next = new LinkedListNode(3);

    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    addNumberII(node1, node2);
  }

  public static LinkedListNode addNumberII(LinkedListNode p, LinkedListNode q) {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    while(p != null || q != null) {
      if(p != null) {
        stack1.push(p.val);
        p = p.next;
      }
      if(q != null) {
        stack2.push(q.val);
        q = q.next;}
    }

    LinkedListNode sum = new LinkedListNode(0);
    LinkedListNode node = sum;
    int carry = 0;
    while(!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
      int su = (!stack1.isEmpty() ? stack1.pop(): 0) + (!stack2.isEmpty() ? stack2.pop(): 0) + carry;

      LinkedListNode temp = new LinkedListNode(su%10);
      temp.next = node;
      node = temp;
      carry = su/10;
    }

    return sum.next;
  }

}
