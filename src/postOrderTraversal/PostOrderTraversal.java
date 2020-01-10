package postOrderTraversal;

import Node.TreeNode;
import java.util.ArrayList;

public class PostOrderTraversal {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(7);
    root.right = new TreeNode(6);

    postOrder(root, list);
    System.out.println(list);
  }

  public static void postOrder(TreeNode root, ArrayList<Integer> list) {
    if(root != null) {
      if (root.left != null) postOrder(root.left, list);
      if (root.right != null) postOrder(root.right, list);
      list.add(root.val);
    }
  }
}
