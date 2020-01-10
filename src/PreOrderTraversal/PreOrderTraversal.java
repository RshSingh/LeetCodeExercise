package PreOrderTraversal;

import Node.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(7);
    root.right = new TreeNode(6);

    preOrder(root, list);
    System.out.println(list);
  }

  public static void preOrder(TreeNode root, ArrayList<Integer> list) {
    if(root != null) {
      list.add(root.val);
      if (root.left != null) preOrder(root.left, list);
      if (root.right != null) preOrder(root.right, list);
    }
  }

  public static List<Integer> preOrderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    if(root == null) return list;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.peek();
      list.add(temp.val);
      if(temp.left != null) {
stack.push(temp.right);
      } else {
        stack.push(temp.right);
      }
    }
    return list;
  }
  }
