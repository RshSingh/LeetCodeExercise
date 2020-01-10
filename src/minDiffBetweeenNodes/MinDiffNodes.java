package minDiffBetweeenNodes;

import Node.TreeNode;

public class MinDiffNodes {

  public static int min = Integer.MIN_VALUE;
  public static Integer prev;
  public static void main(String[] args) {


    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(3);

    System.out.println();
  }

  public static int minDiffNodes(TreeNode root) {
    if(root == null) return -1;
    minDiffNodes(root.left);
    if(prev != null) {
      min = Math.min(min, Math.abs(prev-root.val));
    }

    prev = root.val;

    minDiffNodes(root.right);

    return min;
  }
}
