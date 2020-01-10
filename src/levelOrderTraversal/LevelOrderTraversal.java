package levelOrderTraversal;

import Node.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
  public static List<List<Integer>> recurList = new ArrayList<>();
  public static void main(String[] args) {


    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(3);

    System.out.println(binaryLevelTraversal(root));
  }

  public static List<List<Integer>> binaryLevelTraversal(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> tempList;
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      tempList = new ArrayList<>();
      for(int i = 0; i < size; i++) {
        TreeNode node = queue.remove();
        tempList.add(node.val);
        if(node.left != null) {
          queue.add(node.left);
        }
        if(node.right != null) {
          queue.add(node.right);
        }
      }

      list.add(tempList);
    }
    return list;
  }


  public static List<List<Integer>> recursive(TreeNode root) {
    if(root == null) return recurList;

    recursive(root, 0);
    return recurList;
  }


  public static void recursive(TreeNode root, int level) {
    if(root == null) return;
    if (level >= recurList.size()) {
      recurList.add(level, new ArrayList<Integer>());
    }
    recurList.get(level).add(root.val);
    recursive(root.left, level + 1);
    recursive(root.right, level + 1);


  }

}
