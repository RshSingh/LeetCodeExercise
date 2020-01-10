package balancedBinaryTree;

import Node.TreeNode;

public class BalancedBinaryTree {

  public static boolean result = true;
  public static void main(String[] args) {

    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
//    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(3);
    balancedTree(root);
    System.out.println(result);
  }

  public static int balancedTree(TreeNode root) {

    if(root == null) return 0;

    int l = balancedTree(root.left);
    int h = balancedTree(root.right);

    if(Math.abs(l-h) > 1) result = false;

    return 1 + Math.max(l, h);
  }

//  public static int balancedTrees(TreeNode root) {
//    if(root == null) return 0;
//
//    int l = balancedTrees(root.left);
//    int h = balancedTrees(root.right);
//
//    if(Math.abs(l-h) > 1) result = false;
//
//    return 1 + Math.max(l, h);
//  }
}
