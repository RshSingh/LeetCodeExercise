package pathSumII;

import Node.TreeNode;
import java.util.ArrayList;

public class PathSumII {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    TreeNode root1 = new TreeNode(2);
    root1.left = new TreeNode(1);
    root1.left.left = new TreeNode(1);
    root1.right = new TreeNode(3);

    pathSumII(root1, 4, new ArrayList<>(), list);
    System.out.println(list);
  }

  public static void pathSumII(TreeNode node, int sum, ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> list) {
    if(node == null) return;
    tempList.add(node.val);
    pathSumII(node.left, sum - node.val, tempList, list);
    pathSumII(node.right, sum - node.val, tempList, list);
    if(node.left == null && node.right == null && sum - node.val == 0) {
      list.add(tempList);
    }
    tempList.remove(tempList.size() - 1);
  }
}
