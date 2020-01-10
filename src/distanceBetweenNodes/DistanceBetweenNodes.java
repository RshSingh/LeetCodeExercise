package distanceBetweenNodes;

import Node.TreeNode;

public class DistanceBetweenNodes {

  public static void main(String[] args) {

    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(7);
    root.right = new TreeNode(6);

    System.out.println(distance(root, 1, 3));
  }

  public static int distance(TreeNode root, int node1, int node2) {
    if(root == null) return -1;
    TreeNode lc = bstDistance(root, node1, node2);
    return getDistance(lc, node1) + getDistance(root, node2);
  }

  public static TreeNode bstDistance(TreeNode root, int node1, int node2) {
    while(true) {
      if(root.val > node1 && root.val > node2) {
        root = root.left;
      } else if (root.val < node1 && root.val < node2) {
        root = root.right;
      } else {
        return root;
      }
    }
  }

  public static int getDistance(TreeNode src, int val) {
    if(src.val == val) return 0;
    TreeNode node = src.left;
    if(src.val < val) {
      node = src.right;
    }
    return 1 + getDistance(node, val);
  }
}
