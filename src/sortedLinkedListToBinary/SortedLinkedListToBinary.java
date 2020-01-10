package sortedLinkedListToBinary;

import Node.LinkedListNode;
import Node.TreeNode;

public class SortedLinkedListToBinary {

  public static void main(String[] args) {
    LinkedListNode node = new LinkedListNode(-10);
    node.next = new LinkedListNode(-3);
    node.next.next = new LinkedListNode(0);
    node.next.next.next = new LinkedListNode(5);
    node.next.next.next.next = new LinkedListNode(9);
    System.out.println(listToBST(node));
  }

  public static TreeNode listToBST(LinkedListNode node) {

    if(node == null) return null;
    return helper(node, null);
  }

  public static TreeNode helper(LinkedListNode head, LinkedListNode tail) {
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    if(head == tail) return null;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    TreeNode root =  new TreeNode(slow.val);
    root.left = helper(head, slow);
    root.right = helper(slow.next, tail);

    return root;
  }
}
