package inorderTraversal;

import Node.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(7);
    root.right = new TreeNode(6);


    inorderRecursive(root, list);
    System.out.println(list);
  }

  public static void inorderRecursive(TreeNode root, ArrayList<Integer> list) {
    if(root != null) {
      if (root.left != null) inorderRecursive(root.left, list);
      list.add(root.val);
      if (root.right != null) inorderRecursive(root.right, list);
    }
  }

  public static List<Integer> inorderIterative(TreeNode node) {
    List<Integer> result = new ArrayList<Integer>();
    if(node == null) return result;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(node);

    while(!stack.isEmpty()){

      TreeNode temp = stack.peek();
      if(temp.left != null) {
        stack.push(temp.left);
        temp.left = null;
      } else {
        result.add(temp.val);
        stack.pop();
        if(temp.right != null) {
          stack.push(temp.right);
        }
      }

    }
    return result;
  }

}
