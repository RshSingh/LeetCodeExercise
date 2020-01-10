package pathSumBST;

import Node.TreeNode;

public class PathSumBST {

  public static void main(String[] args) {
    TreeNode root1 = new TreeNode(2);
    root1.left = new TreeNode(1);
    root1.left.left = new TreeNode(1);
    root1.right = new TreeNode(3);

    System.out.println(pathSum(root1, 5));
  }

  public static boolean pathSum(TreeNode root, int sum) {


    return helper(root, sum);
  }

  public static boolean helper(TreeNode p, int sum) {
    if(p == null ) {
      return false;
    }

    if(p.left == null  && p.right == null && sum - p.val == 0) return true;
    return helper(p.left, sum - p.val) || helper(p.right, sum - p.val);
  }
}
