package isPalindrome;

import Node.LinkedListNode;
import java.util.ArrayList;
import sun.awt.image.ImageWatched;

public class IsPalindrome {

  public static void main(String[] args) {

    LinkedListNode node2 = new LinkedListNode(5);
    node2.next = new LinkedListNode(6);
    node2.next.next = new LinkedListNode(4);

    System.out.println(isPalindrome(node2));

    println(reverse(node2));
  }

  public static boolean isPalindrome(LinkedListNode head) {
    ArrayList<Integer> deque = new ArrayList<>();
    LinkedListNode help = head;
    while(help != null){
      deque.add(help.val);
      help = help.next;
    }
    int i = 0, j = deque.size() -1;
    if(j == 0) return true;
    while(i <= j) {
      System.out.println(deque.get(i) +","+deque.get(j));
      System.out.println((deque.get(i)).equals(deque.get(j)));
      if(!(deque.get(i)).equals(deque.get(j))){
        return false;
      }
      i++;
      j--;
    }

    return true;
  }

  public static LinkedListNode reverse(LinkedListNode p) {
    LinkedListNode pre = null;
    while(p != null) {
      LinkedListNode temp = new LinkedListNode(p.val);
      temp.next = pre;
      pre = temp;
      p = p.next;
    }

    return pre;
  }

  public static void println(LinkedListNode head) {
    while(head != null) {
      System.out.println(head.val);
      head = head.next;
    }
  }
}
