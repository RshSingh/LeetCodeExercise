package MaxDepthBst;

import Node.TreeNode;

public class MaxDepthBst {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    System.out.println(maxDepth(root));
  }

  public static Integer maxDepth(TreeNode root) {
    if (root == null) return 0;

    return 1 + Math.max(maxDepth(root.left),  maxDepth(root.right));
  }
}
