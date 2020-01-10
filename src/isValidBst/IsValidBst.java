package isValidBst;

import Node.TreeNode;

public class IsValidBst {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.right = new TreeNode(3);
    System.out.println(isValidBst(root));

    TreeNode rootFalse = new TreeNode(2);
    rootFalse.left = new TreeNode(1);
    rootFalse.left.left = new TreeNode(0);
    rootFalse.right = new TreeNode(3);
    System.out.println(isValidBst(rootFalse));

  }

  public static boolean isValidBst(TreeNode root) {
    return isValidBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public static boolean isValidBst(TreeNode root, int low, int high) {
    if(root == null) return true;

    if(root.val <= low || root.val >= high) return false;

    return isValidBst(root.left, low, root.val) && isValidBst(root.right, root.val, high);
  }

}
