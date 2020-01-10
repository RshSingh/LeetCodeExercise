package minimumDepthBinaryTree;

import Node.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree {

  public static Integer result = Integer.MAX_VALUE;
  public static void main(String[] args) {
    TreeNode root1 = new TreeNode(2);
    root1.left = new TreeNode(1);
    root1.left.left = new TreeNode(1);
    root1.right = new TreeNode(3);

    System.out.println(minimumDepthTree(root1));
    System.out.println(mininumDepth(root1));
  }

  public static int minimumDepthTree(TreeNode root) {
    if(root == null) return 0;
    helper(root, 1);
    return result;
  }

  public static void helper(TreeNode root, int level) {
    if(root.left == null && root.right == null) {
      result = Math.min(result, level);
    }

    if(root.left != null) helper(root.left, level + 1);
    if(root.right != null) helper(root.right, level + 1);
  }

  public static int mininumDepth(TreeNode root) {
    if(root == null) return 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int minDepth = -1;

    while(!queue.isEmpty()) {
      TreeNode node = queue.remove();
      minDepth++;
      for(int i = 0; i < queue.size(); i++) {
        if(node.left == null && node.right == null) return minDepth;
        if(node.left != null) queue.add(node.left);
        if(node.right != null) queue.add(node.right);
      }
    }
    return minDepth;
  }
}
