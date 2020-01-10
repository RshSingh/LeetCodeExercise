package subTreeBST;

import Node.TreeNode;

public class SubTree {

  public static void main(String[] args) {

    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(3);

    TreeNode root2 = new TreeNode(2);
    root2.left = new TreeNode(1);
    root2.left.left = new TreeNode(1);
//    root2.left.left.left = new TreeNode(1);
//    root2.right = new TreeNode(3);

    System.out.println(isSubtree(root, root2));
  }

  public static boolean isSubtree(TreeNode node1, TreeNode node2) {
    if(node1 == null) return false;
    boolean ans = false;
    if(node1.val == node2.val) {
      return checkTree(node1, node2);
    }
    if(isSubtree(node1, node2.left)) ans = true;
    if(isSubtree(node1, node2.right)) ans = true;
    return ans;
  }

  public static boolean checkTree(TreeNode node1, TreeNode node2) {
    if(node1 == null && node2 == null) return true;
    if((node1 == null && node2 != null) || (node1 != null && node2 == null)
    || (node1.val != node2.val)) return false;

    return checkTree(node1.left, node2.left) && checkTree(node1.right, node2.right);
  }
}
